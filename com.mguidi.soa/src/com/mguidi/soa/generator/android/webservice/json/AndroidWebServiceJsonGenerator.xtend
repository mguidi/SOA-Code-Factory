package com.mguidi.soa.generator.android.webservice.json

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Beautifier
import com.mguidi.soa.generator.java.webservice.json.OperationOutputJsonHelperGenerator
import com.mguidi.soa.generator.java.webservice.json.OperationInputJsonHelperGenerator
import com.mguidi.soa.generator.java.webservice.json.ClientJsonGenerator
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.soa.Architecture

class AndroidWebServiceJsonGenerator implements IGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension ClientJsonGenerator clientJsonGenerator
	@Inject extension OperationOutputJsonHelperGenerator operationOutputJsonHelperGenerator
	@Inject extension OperationInputJsonHelperGenerator operationInputJsonHelperGenerator
	@Inject extension Beautifier beautifier
	@Inject GradleBuildGenerator gradleBuildGenerator
	@Inject extension ManifestGenerator manifestGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var services = resource.allContents.toIterable.filter(typeof(Service)).toList
		var operations = resource.allContents.toIterable.filter(typeof(Operation)).toList
		
		for (e: resource.allContents.toIterable.filter(typeof(Architecture))) {
			if (services.size > 0 || operations.size > 0) {
				// gradle build generation
				fsa.generateFile("android/service-json/"+e.moduleName+"/"+e.version+"/build.gradle", gradleBuildGenerator.generateBuildServiceJson(e, resource))
				// android manifest
				fsa.generateFile("android/service-json/"+e.moduleName+"/"+e.version+"/src/main/AndroidManifest.xml", manifestGenerator.generateManifestServiceJson(e))
			}
		}
		
		for (e: services) {
			fsa.generateFile("android/service-json/"+e.moduleName+"/"+e.version+"/src/main/java/" + e.qualifiedClassNameClient.replace(".", "/") + ".java", beautifier.format(clientJsonGenerator.generateClient(e)))
		}
		
		for (e: operations) {
			if (e.featuresOutput.size > 0) {
				fsa.generateFile("android/service-json/"+e.moduleName+"/"+e.version+"/src/main/java/" + e.qualifiedClassNameOutputHelper.replace(".", "/") + ".java", beautifier.format(operationOutputJsonHelperGenerator.generateJsonHelper(e)))
			}
			if (e.featuresInput.size > 0) {
				fsa.generateFile("android/service-json/"+e.moduleName+"/"+e.version+"/src/main/java/" + e.qualifiedClassNameInputHelper.replace(".", "/") + ".java", beautifier.format(operationInputJsonHelperGenerator.generateJsonHelper(e)))
			}
		}
		
	}
}
