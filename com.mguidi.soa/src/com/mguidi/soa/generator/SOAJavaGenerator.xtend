package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.java.jsonhelper.JavaJsonHelperGenerator
import com.mguidi.soa.generator.java.JavaGenerator
import com.mguidi.soa.generator.java.webservice.json.JavaWebServiceJsonGenerator
import java.util.Set

class SOAJavaGenerator {
	
	@Inject extension JavaGenerator javaGenerator
	@Inject extension JavaJsonHelperGenerator javaJsonHelperGenerator
	@Inject extension JavaWebServiceJsonGenerator javaWebServiceJsonGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		javaGenerator.doGenerate(resource, fsa)
		javaJsonHelperGenerator.doGenerate(resource, fsa)
		javaWebServiceJsonGenerator.doGenerate(resource, fsa)
	}
	
	def doGenerate(Set<Resource> resources, IFileSystemAccess fsa) {
		fsa.generateFile("java/install_all.sh", installAll)
		
		javaGenerator.doGenerate(resources, fsa)
		javaJsonHelperGenerator.doGenerate(resources, fsa)
		javaWebServiceJsonGenerator.doGenerate(resources, fsa)
	}
	
	def installAll() '''
	sh install_model_script.sh
	sh install_service_script.sh
	sh install_model_json_script.sh
	sh install_service_json_script.sh
	sh install_servlet_json_script.sh
	'''
}
