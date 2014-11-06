package com.mguidi.soa.generator.swift

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation

class OperationInputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationInput(Operation operation) '''
		import Foundation
		
		/**
		*
		* «operation.classNameInput»
		*
		*/
		public class «operation.classNameInput» 
		{
			
			«FOR feature: operation.featuresInput»
				class var «feature.key» : String { return "«feature.name»" }
			«ENDFOR»
			
			«FOR feature: operation.featuresInput»
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
