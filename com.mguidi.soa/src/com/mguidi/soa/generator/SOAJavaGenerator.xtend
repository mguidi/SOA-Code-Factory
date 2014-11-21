package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.java.jsonhelper.JavaJsonHelperGenerator
import com.mguidi.soa.generator.java.JavaGenerator
import com.mguidi.soa.generator.java.webservice.json.JavaWebServiceJsonGenerator

class SOAJavaGenerator implements IGenerator {
	
	@Inject extension JavaGenerator javaGenerator
	@Inject extension JavaJsonHelperGenerator javaJsonHelperGenerator
	@Inject extension JavaWebServiceJsonGenerator javaWebServiceJsonGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// java
		javaGenerator.doGenerate(resource, fsa)
		javaJsonHelperGenerator.doGenerate(resource, fsa)
		javaWebServiceJsonGenerator.doGenerate(resource, fsa)
	}
}
