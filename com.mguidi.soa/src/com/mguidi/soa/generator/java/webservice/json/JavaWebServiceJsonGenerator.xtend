package com.mguidi.soa.generator.java.webservice.json

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Beautifier
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.soa.Architecture
import java.util.Set

class JavaWebServiceJsonGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension ServletJsonGenerator servletJsonGenerator
	@Inject extension ClientJsonGenerator clientJsonGenerator
	@Inject extension OperationOutputJsonHelperGenerator operationOutputJsonHelperGenerator
	@Inject extension OperationInputJsonHelperGenerator operationInputJsonHelperGenerator
	@Inject extension Beautifier beautifier
	@Inject extension GradleBuildGenerator gradleBuildGenerator
	@Inject extension InstallScriptGenerator installScriptGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		var services = resource.allContents.toIterable.filter(typeof(Service)).toList
		var operations = resource.allContents.toIterable.filter(typeof(Operation)).toList
		
		for (e: resource.allContents.toIterable.filter(typeof(Architecture))) {
			if (services.size > 0 || operations.size > 0) {
				// gradle build generation
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service-json/build.gradle", gradleBuildGenerator.generateBuildServiceJson(e, resource))
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/servlet-json/build.gradle", gradleBuildGenerator.generateBuildServletJson(e, resource))
			}
		}
		
		for (e: services) {
			if (e.operations.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service-json/src/main/java/" + e.qualifiedClassNameClient.replace(".", "/") + ".java", beautifier.format(clientJsonGenerator.generateClient(e)))
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/servlet-json/src/main/java/" + e.qualifiedClassNameServlet.replace(".", "/") + ".java", beautifier.format(servletJsonGenerator.generateServlet(e)))
			}
		}
		
		for (e: operations) {
			if (e.featuresOutput.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service-json/src/main/java/" + e.qualifiedClassNameOutputHelper.replace(".", "/") + ".java", beautifier.format(operationOutputJsonHelperGenerator.generateJsonHelper(e)))
			}
			if (e.featuresInput.size > 0) {
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/service-json/src/main/java/" + e.qualifiedClassNameInputHelper.replace(".", "/") + ".java", beautifier.format(operationInputJsonHelperGenerator.generateJsonHelper(e)))
			}
		}
		
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		var architectures = resources.architectureOrder
		fsa.generateFile("java/install_service_json_script.sh", installScriptGenerator.generateInstallScriptServiceJson(architectures))
		fsa.generateFile("java/install_servlet_json_script.sh", installScriptGenerator.generateInstallScriptServletJson(architectures))
	}
}
