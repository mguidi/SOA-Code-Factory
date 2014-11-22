package com.mguidi.soa.generator.java.jsonhelper

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Beautifier
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator
import com.mguidi.soa.soa.Architecture
import java.util.Set

class JavaJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension EntityJsonHelperGenerator entityJsonHelperGenerator
	@Inject extension Beautifier beautifier
	@Inject extension GradleBuildGenerator gradleBuildGenerator
	@Inject extension InstallScriptGenerator installScriptGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		var entities = resource.allContents.toIterable.filter(typeof(Entity)).toList
		
		for (e: resource.allContents.toIterable.filter(typeof(Architecture))) {
			if (entities.size > 0) {
				// gradle build generation
				fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model-json/build.gradle", gradleBuildGenerator.generateBuildModelJson(e, resource))
			}
		}
		
		for (e: entities) {
			fsa.generateFile("java/"+e.applicationId+"/"+e.moduleName+"/"+e.version+"/model-json/src/main/java/" + e.qualifiedClassNameHelper.replace(".", "/") + ".java", beautifier.format(entityJsonHelperGenerator.generateJsonHelper(e)))
		}
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		fsa.generateFile("java/install_model_json_script.sh", installScriptGenerator.generateInstallScriptModelJson(resources.architectureOrder))
	}
}
