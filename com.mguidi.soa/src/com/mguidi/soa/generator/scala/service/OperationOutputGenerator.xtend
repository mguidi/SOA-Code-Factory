package com.mguidi.soa.generator.scala.service

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.scala.Utils
import com.mguidi.soa.soa.Feature

class OperationOutputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationOutput(Operation operation) '''
		package «operation.packageNameOutput»
		
		case class «operation.classNameOutput»(
			«operation.featuresOutput.map[Feature f | f.featureName + ": " + f.type.declaration].makeString("", ",\n", "")»
		)
	'''
	
}
