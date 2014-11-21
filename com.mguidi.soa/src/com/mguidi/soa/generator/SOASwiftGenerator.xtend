package com.mguidi.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.mguidi.soa.generator.swift.SwiftGenerator
import com.mguidi.soa.generator.swift.jsonhelper.SwiftJsonHelperGenerator

class SOASwiftGenerator implements IGenerator {
	
	@Inject extension SwiftGenerator swiftGenerator
	@Inject extension SwiftJsonHelperGenerator swiftJsonHelperGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		swiftGenerator.doGenerate(resource, fsa)
		swiftJsonHelperGenerator.doGenerate(resource, fsa)
	}
}
