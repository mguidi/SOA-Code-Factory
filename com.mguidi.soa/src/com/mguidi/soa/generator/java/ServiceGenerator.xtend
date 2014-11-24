package com.mguidi.soa.generator.java

import com.google.inject.Inject
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation

class ServiceGenerator {
	
	@Inject extension Utils utils
	
	def generateService(Service service) '''
		package «service.packageName»;
		
		import java.io.IOException;
		
		/**
		*
		* «service.className»
		*
		*/
		public interface «service.className» {
			«FOR Operation operation: service.operations»
				public «IF operation.featuresOutput.size>0»«operation.qualifiedClassNameOutput»«ELSE»void«ENDIF» «operation.signature»(«IF operation.featuresInput.size>0»«operation.qualifiedClassNameInput» input«ENDIF») throws IOException«operation.throwsException»;
			«ENDFOR»
		}
	'''
	
	def generateServiceInterface(Service service) '''
		package «service.packageNameInterface»;
		
		import java.io.IOException;
		
		/**
		*
		* «service.classNameInterface»
		*
		*/
		public interface «service.classNameInterface» extends «service.qualifiedClassName» {
			«FOR Operation operation: service.operations»
				public «IF operation.featuresOutput.size>0»«operation.qualifiedClassNameOutput»«ELSE»void«ENDIF» «operation.signature»(«IF operation.featuresInput.size>0»«operation.qualifiedClassNameInput» input, «ENDIF»int maxRetries) throws IOException«operation.throwsException»;
			«ENDFOR»
		}
	'''
}
