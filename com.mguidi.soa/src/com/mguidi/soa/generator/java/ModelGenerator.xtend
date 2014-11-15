package com.mguidi.soa.generator.java

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject

class ModelGenerator {
	
	@Inject extension Utils utils
	
	def generateEnum(com.mguidi.soa.soa.Enum entity) '''
		package «entity.packageName»;
		
		/**
		*
		* «entity.className»
		*
		*/
		public enum «entity.className» {
			«FOR feature: entity.features»
			«feature»,
			«ENDFOR»
			_UNDEFINED_
		}
	'''
	
	def generateEntity(Entity entity) '''
		package «entity.packageName»;
		
		/**
		*
		* «entity.className»
		*
		*/
		public class «entity.className» {
			
			«FOR feature: entity.features»
				public static final String «feature.key» = "«feature.keyValue»";
			«ENDFOR»
			
			«FOR feature: entity.features»
				«IF feature.featureComment.size == 1»
				
				// «feature.featureComment.get(0).clean»
				«ELSEIF feature.featureComment.size > 1»
				
				/*
				«FOR comment: feature.featureComment»
				* «comment.clean»
				«ENDFOR»
				*/
				«ENDIF»
				public «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
		}
	'''
	
}
