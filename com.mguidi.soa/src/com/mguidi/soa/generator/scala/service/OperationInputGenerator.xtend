package com.mguidi.soa.generator.scala.service

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.scala.Utils
import com.mguidi.soa.soa.Feature

class OperationInputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationInput(Operation operation) '''
		package «operation.packageNameInput»
		
		case class «operation.classNameInput»(
			«operation.featuresInput.map[Feature f | f.featureName + ": " + f.type.declaration].makeString("", ",\n", "")»
		)
	'''
}
