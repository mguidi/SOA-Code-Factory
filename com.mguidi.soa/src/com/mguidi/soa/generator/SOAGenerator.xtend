package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.swift.SwiftGenerator
import com.mguidi.soa.generator.swift.jsonhelper.SwiftJsonHelperGenerator
import com.mguidi.soa.generator.java.jsonhelper.JavaJsonHelperGenerator
import com.mguidi.soa.generator.java.JavaGenerator
import com.mguidi.soa.generator.java.webservice.json.JavaWebServiceJsonGenerator
import com.mguidi.soa.generator.android.webservice.json.AndroidWebServiceJsonGenerator
import com.mguidi.soa.generator.android.jsonhelper.AndroidJsonHelperGenerator
import com.mguidi.soa.generator.android.AndroidGenerator

class SOAGenerator implements IGenerator {
	
	// java
	@Inject extension JavaGenerator javaGenerator
	@Inject extension JavaJsonHelperGenerator javaJsonHelperGenerator
	@Inject extension JavaWebServiceJsonGenerator javaWebServiceJsonGenerator
	
	// android
	@Inject extension AndroidGenerator androidGenerator
	@Inject extension AndroidJsonHelperGenerator androidJsonHelperGenerator
	@Inject extension AndroidWebServiceJsonGenerator androidWebServiceJsonGenerator
	
	// swift
	@Inject extension SwiftGenerator swiftGenerator
	@Inject extension SwiftJsonHelperGenerator swiftJsonHelperGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		// java
		javaGenerator.doGenerate(resource, fsa)
		javaJsonHelperGenerator.doGenerate(resource, fsa)
		javaWebServiceJsonGenerator.doGenerate(resource, fsa)
		
		// android
		androidGenerator.doGenerate(resource, fsa)
		androidJsonHelperGenerator.doGenerate(resource, fsa)
		androidWebServiceJsonGenerator.doGenerate(resource, fsa)
		
		// swift
		swiftGenerator.doGenerate(resource, fsa)
		swiftJsonHelperGenerator.doGenerate(resource, fsa)
		
	}
}
