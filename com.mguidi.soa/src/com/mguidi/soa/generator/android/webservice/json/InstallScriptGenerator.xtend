package com.mguidi.soa.generator.android.webservice.json

import java.util.List
import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Utils

class InstallScriptGenerator {
	
	@Inject extension Utils utils
	
	def generateInstallScriptServiceJson(List<Architecture> architectures) '''
		«FOR e: architectures»
		«IF e.module.services.size > 0»
		gradle -b «e.applicationId»/«e.moduleName»/«e.version»/service-json/build.gradle build uploadArchives
		«ENDIF»
		«ENDFOR»
	'''
	
}
