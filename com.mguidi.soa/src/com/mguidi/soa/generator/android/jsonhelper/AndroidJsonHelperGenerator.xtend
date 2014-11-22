package com.mguidi.soa.generator.android.jsonhelper

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Beautifier
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator
import com.mguidi.soa.soa.Architecture
import java.util.Set

class AndroidJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension EntityJsonHelperGenerator entityJsonHelperGenerator
	@Inject extension Beautifier beautifier
	@Inject extension GradleBuildGenerator gradleBuildGenerator
	@Inject extension ManifestGenerator manifestGenerator
	@Inject extension InstallScriptGenerator installScriptGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		var entities = resource.allContents.toIterable.filter(typeof(Entity)).toList
		
		for (e: resource.allContents.toIterable.filter(typeof(Architecture))) {
			if (entities.size > 0) {
				// gradle build generation
				fsa.generateFile("android/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model-json/build.gradle", gradleBuildGenerator.generateBuildModelJson(e, resource))
				// android manifest
				fsa.generateFile("android/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model-json/src/main/AndroidManifest.xml", manifestGenerator.generateManifestModelJson(e))
			}
		}
		
		for (e: entities) {
			fsa.generateFile("android/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model-json/src/main/java/" + e.qualifiedClassNameHelper.replace(".", "/") + ".java", beautifier.format(entityJsonHelperGenerator.generateJsonHelper(e)))
		}
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		fsa.generateFile("android/install_model_json_script.sh", installScriptGenerator.generateInstallScriptModelJson(resources.architectureOrder))
	}
}
