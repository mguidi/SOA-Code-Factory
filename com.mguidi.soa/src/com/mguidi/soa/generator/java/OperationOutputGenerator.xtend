package com.mguidi.soa.generator.java

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation

class OperationOutputGenerator {
	
	@Inject extension Utils utils
	
	def generateOperationOutput(Operation operation) '''
		package «operation.packageNameOutput»;
		
		/**
		*
		* «operation.classNameOutput»
		*
		*/
		public class «operation.classNameOutput» {
			
			«FOR feature: operation.featuresOutput»
				public static final String «feature.key» = "«feature.name»";
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
				public «feature.type.declaration» «feature.name»;
			«ENDFOR»
			
		}
	'''
	
}
