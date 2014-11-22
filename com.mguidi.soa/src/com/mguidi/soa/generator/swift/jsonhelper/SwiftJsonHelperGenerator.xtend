package com.mguidi.soa.generator.swift.jsonhelper

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.generator.swift.jsonhelper.JsonUtils
import com.mguidi.soa.generator.swift.jsonhelper.EntityJsonHelperGenerator

class SwiftJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension EntityJsonHelperGenerator entityJsonHelperGenerator
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e: resource.allContents.toIterable.filter(typeof(Entity))) {
			fsa.generateFile("swift/"+e.version+"/commons/"+e.moduleName+"/src/model/helper/json/" + e.classNameHelper + ".swift", entityJsonHelperGenerator.generateJsonHelper(e))
		}
	}
}
