package com.mguidi.soa.generator.swift

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation

class OperationOutputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationOutput(Operation operation) '''
		import Foundation
		
		/**
		*
		* «operation.classNameOutput»
		*
		*/
		public class «operation.classNameOutput» 
		{
			
			«FOR feature: operation.featuresOutput»
				class var «feature.key» : String { return "«feature.name»" }
			«ENDFOR»
			
			«FOR feature: operation.featuresOutput»
				«IF feature.featureComment.size == 1»
				
				// «feature.featureComment.get(0).clean»
				«ELSEIF feature.featureComment.size > 1»
				
				/*
				«FOR comment: feature.featureComment»
				* «comment.clean»
				«ENDFOR»
				*/
				«ENDIF»
				public var «feature.name» : «feature.type.declaration»?
			«ENDFOR»
			
			init() {}
			
		}
	'''
	
}
