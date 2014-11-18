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
				public static final String «feature.key» = "«feature.keyValue»";
			«ENDFOR»
			
			«FOR feature: operation.featuresOutput»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			«FOR feature: operation.featuresOutput»
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»;
				}
				
				public «operation.classNameOutput» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
			«ENDFOR»
			
		}
	'''
	
}
