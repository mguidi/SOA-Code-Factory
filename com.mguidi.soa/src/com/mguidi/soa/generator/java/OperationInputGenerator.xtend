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
				public static final String «feature.key» = "«feature.keyValue»";
			«ENDFOR»
			
			«FOR feature: operation.featuresInput»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			«FOR feature: operation.featuresInput»
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»;
				}
				
				public «operation.classNameInput» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
			«ENDFOR»
			
		}
	'''
	
}
