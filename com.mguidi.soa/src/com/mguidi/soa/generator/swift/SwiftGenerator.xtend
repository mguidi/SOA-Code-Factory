package com.mguidi.soa.generator.swift

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.generator.swift.ModelGenerator
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation

class SwiftGenerator {
	
	@Inject extension Utils utils
	@Inject extension ModelGenerator modelGenerator
	@Inject extension ServiceGenerator serviceGenerator
	@Inject extension OperationOutputGenerator operationOutputGenerator
	@Inject extension OperationInputGenerator operationInputGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e: resource.allContents.toIterable.filter(typeof(Entity))) {
			fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/model/" + e.className + ".swift", modelGenerator.generateEntity(e))
		}
		
		for (e: resource.allContents.toIterable.filter(typeof(com.mguidi.soa.soa.Enum))) {
			fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/model/" + e.className + ".swift", modelGenerator.generateEnum(e))
		}
		
		for (e: resource.allContents.toIterable.filter(typeof(Service))) {
			fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/service/" + e.className + ".swift", serviceGenerator.generateService(e))
		}
		
		for (e: resource.allContents.toIterable.filter(typeof(Operation))) {
			if (e.featuresOutput.size > 0) {
				fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/service/operation/" + e.classNameOutput + ".swift", operationOutputGenerator.generateOperationOutput(e))
			}
			if (e.featuresInput.size > 0) {
				fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/service/operation/" + e.classNameInput + ".swift", operationInputGenerator.generateOperationInput(e))
			}
		}
		
	}
}
