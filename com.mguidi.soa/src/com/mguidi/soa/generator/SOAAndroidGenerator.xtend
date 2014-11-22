package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.android.webservice.json.AndroidWebServiceJsonGenerator
import com.mguidi.soa.generator.android.jsonhelper.AndroidJsonHelperGenerator
import com.mguidi.soa.generator.android.AndroidGenerator
import java.util.Set

class SOAAndroidGenerator {
	
	@Inject extension AndroidGenerator androidGenerator
	@Inject extension AndroidJsonHelperGenerator androidJsonHelperGenerator
	@Inject extension AndroidWebServiceJsonGenerator androidWebServiceJsonGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		androidGenerator.doGenerate(resource, fsa)
		androidJsonHelperGenerator.doGenerate(resource, fsa)
		androidWebServiceJsonGenerator.doGenerate(resource, fsa)
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		fsa.generateFile("android/install_all.sh", installAll)
		
		androidGenerator.doGenerate(resources, fsa)
		androidJsonHelperGenerator.doGenerate(resources, fsa)
		androidWebServiceJsonGenerator.doGenerate(resources, fsa)
	}
	
	
	def installAll() '''
	sh install_model_script.sh
	sh install_service_script.sh
	sh install_model_json_script.sh
	sh install_service_json_script.sh
	'''
	
}