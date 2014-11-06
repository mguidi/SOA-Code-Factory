package com.mguidi.soa.generator.java

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation

class OperationInputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationInput(Operation operation) '''
		package «operation.packageNameInput»;
		
		/**
		*
		* «operation.classNameInput»
		*
		*/
		public class «operation.classNameInput» {
			
			«FOR feature: operation.featuresInput»
				public static final String «feature.key» = "«feature.name»";
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
				public «feature.type.declaration» «feature.name»;
			«ENDFOR»
			
		}
	'''
	
}
