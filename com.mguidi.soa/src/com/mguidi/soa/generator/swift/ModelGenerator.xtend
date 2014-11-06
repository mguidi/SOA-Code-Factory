package com.mguidi.soa.generator.swift

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject

class ModelGenerator {
	
	@Inject extension Utils utils
	
	def generateEnum(com.mguidi.soa.soa.Enum entity) '''
		import Foundation
		
		/**
		*
		* «entity.className»
		*
		*/
		public enum «entity.className» : String 
		{
			case
			«FOR feature: entity.features»
			«feature» = "«feature»",
			«ENDFOR»
			_UNDEFINED_ = "_UNDEFINED_"
		}
	'''
	
	def generateEntity(Entity entity) '''
		import Foundation
		
		/**
		*
		* «entity.className»
		*
		*/
		public class «entity.className» 
		{
			
			«FOR feature: entity.features»
				class var «feature.key» : String { return "«feature.name»" }
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
				public var «feature.name» : «feature.type.declaration»?
			«ENDFOR»
			
			init() {}
			
		}
	'''
	
}
