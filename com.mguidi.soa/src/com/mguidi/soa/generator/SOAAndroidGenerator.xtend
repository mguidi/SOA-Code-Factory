package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.android.webservice.json.AndroidWebServiceJsonGenerator
import com.mguidi.soa.generator.android.jsonhelper.AndroidJsonHelperGenerator
import com.mguidi.soa.generator.android.AndroidGenerator

class SOAAndroidGenerator implements IGenerator {
	
	@Inject extension AndroidGenerator androidGenerator
	@Inject extension AndroidJsonHelperGenerator androidJsonHelperGenerator
	@Inject extension AndroidWebServiceJsonGenerator androidWebServiceJsonGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		androidGenerator.doGenerate(resource, fsa)
		androidJsonHelperGenerator.doGenerate(resource, fsa)
		androidWebServiceJsonGenerator.doGenerate(resource, fsa)
	}
}
