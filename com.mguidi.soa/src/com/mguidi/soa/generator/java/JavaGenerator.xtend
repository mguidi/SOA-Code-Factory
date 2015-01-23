package com.mguidi.soa.generator.java

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Entity
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Beautifier
import com.mguidi.soa.generator.java.ModelGenerator
import com.mguidi.soa.generator.java.ServiceGenerator
import com.mguidi.soa.generator.java.ExceptionGenerator
import com.mguidi.soa.generator.java.OperationOutputGenerator
import com.mguidi.soa.generator.java.OperationInputGenerator
import com.mguidi.soa.generator.java.GradleBuildGenerator
import com.mguidi.soa.soa.Architecture
import java.util.Set

class JavaGenerator {
	
	@Inject extension Utils utils
	@Inject extension GradleBuildGenerator gradleBuildGenerator
	@Inject extension ModelGenerator modelGenerator
	@Inject extension ServiceGenerator serviceGenerator
	@Inject extension OperationOutputGenerator operationOutputGenerator
	@Inject extension OperationInputGenerator operationInputGenerator
	@Inject extension ExceptionGenerator exceptionGenerator
	@Inject extension InstallScriptGenerator installScriptGenerator
	@Inject extension Beautifier beautifier
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		var entities = resource.allContents.toIterable.filter(typeof(Entity)).toList
		var enumerations = resource.allContents.toIterable.filter(typeof(com.mguidi.soa.soa.Enum)).toList
		var services = resource.allContents.toIterable.filter(typeof(Service)).toList
		var exceptions = resource.allContents.toIterable.filter(typeof(com.mguidi.soa.soa.Exception)).toList
		
		for (e: resource.allContents.toIterable.filter(typeof(Architecture))) {
			if (enumerations.size > 0 || entities.size > 0) {
				// gradle build generation
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model/build.gradle", gradleBuildGenerator.generateBuildModel(e, resource))
			}
			
			if (services.size > 0 || exceptions.size > 0) {
				// gradle build generation
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/build.gradle", gradleBuildGenerator.generateBuildService(e, resource))
			}
		}
		
		for (e: entities) {
			fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model/src/main/java/" + e.qualifiedClassName.replace(".", "/") + ".java", beautifier.format(modelGenerator.generateEntity(e)))
		}
		
		for (e: enumerations) {
			fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model/src/main/java/" + e.qualifiedClassName.replace(".", "/") + ".java", beautifier.format(modelGenerator.generateEnum(e)))
		}
		
		for (e: services) {
			if (e.operations.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/src/main/java/" + e.qualifiedClassName.replace(".", "/") + ".java", beautifier.format(serviceGenerator.generateService(e)))
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/src/main/java/" + e.qualifiedClassNameInterface.replace(".", "/") + ".java", beautifier.format(serviceGenerator.generateServiceInterface(e)))
			}
		}
		
		for (e: resource.allContents.toIterable.filter(typeof(Operation))) {
			if (e.featuresOutput.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/src/main/java/" + e.qualifiedClassNameOutput.replace(".", "/") + ".java", beautifier.format(operationOutputGenerator.generateOperationOutput(e)))
			}
			if (e.featuresInput.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/src/main/java/" + e.qualifiedClassNameInput.replace(".", "/") + ".java", beautifier.format(operationInputGenerator.generateOperationInput(e)))
			}
		}
		
		for (e: exceptions) {
			fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service/src/main/java/" + e.qualifiedClassName.replace(".", "/") + ".java", beautifier.format(exceptionGenerator.generateException(e)))
		}
		
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		var architectures = resources.architectureOrder
		fsa.generateFile("java/install_model_script.sh", installScriptGenerator.generateInstallScriptModel(architectures))
		fsa.generateFile("java/install_service_script.sh", installScriptGenerator.generateInstallScriptService(architectures))
	}
}
