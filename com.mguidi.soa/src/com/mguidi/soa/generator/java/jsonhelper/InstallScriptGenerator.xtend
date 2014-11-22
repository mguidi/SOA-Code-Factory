package com.mguidi.soa.generator.java.jsonhelper

import java.util.List
import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Utils

class InstallScriptGenerator {
	
	@Inject extension Utils utils
	
	def generateInstallScriptModelJson(List<Architecture> architectures) '''
		«FOR e: architectures»
		«IF e.module.model != null && e.module.model.entities.size > 0»
		gradle -b «e.applicationId»/«e.moduleName»/«e.version»/model-json/build.gradle build uploadArchives
		«ENDIF»
		«ENDFOR»
	'''
	
}
