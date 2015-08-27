package com.mguidi.soa.generator.scala.service

import com.google.inject.Inject
import com.mguidi.soa.soa.Service
import com.mguidi.soa.generator.scala.Utils
import com.mguidi.soa.soa.Operation

class ControllerGenerator {
	
	@Inject extension Utils utils
	
	def generateController(Service service) '''
		package «service.packageNameController»
		
		import play.api.libs.json.{JsError, Json}
		import play.api.mvc.Controller
		
		import security.AuthenticatedAction
		
		import scala.concurrent.ExecutionContext.Implicits.global
		import scala.concurrent.Future
		
		trait «service.classNameController» extends Controller {
			«FOR Operation operation: service.operations»
			
			def «operation.handler»(«IF operation.featuresInput.size > 0»input: «operation.qualifiedClassNameInput»«ENDIF») : Future[«IF operation.featuresOutput.size > 0»«operation.qualifiedClassNameOutput»«ELSE»Unit«ENDIF»]
			
			def «operation.signature» = AuthenticatedAction.async(parse.json) { request =>
			«IF operation.featuresInput.size > 0»
				val inputJsResult = request.body.validate[«operation.qualifiedClassNameInput»]
				inputJsResult.fold(
					error => {
						Future.successful(BadRequest(JsError.toFlatJson(error)))
					},
					input => {
						«operation.handler»(input)
						«IF operation.featuresOutput.size > 0»
							.map(output => Ok(Json.toJson(output)))
							.fallbackTo(Future.successful(ServiceUnavailable))
						«ELSE»
							.map(_ => Ok)
							.fallbackTo(Future.successful(ServiceUnavailable))
						«ENDIF»
					}
				)
			«ELSE»
				«operation.handler»()
					«IF operation.featuresOutput.size > 0»
						.map(output => Ok(Json.toJson(output)))
						.fallbackTo(Future.successful(ServiceUnavailable))
					«ELSE»
						.map(_ => Ok()
						.fallbackTo(Future.successful(ServiceUnavailable))
					«ENDIF»
			«ENDIF»
			}
			«ENDFOR»
		}
		
	'''
	
}
