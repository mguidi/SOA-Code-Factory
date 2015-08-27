package com.mguidi.soa.generator.scala.model

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.generator.scala.Utils
import com.mguidi.soa.soa.Feature

class ModelGenerator {
	
	@Inject extension Utils utils
	
	def generateEnum(com.mguidi.soa.soa.Enum entity) '''
		package «entity.packageName»
		
		sealed trait «entity.className»
		
		object «entity.className» {
			«FOR feature: entity.features»
				case object «feature.toUpperCase» extends «entity.className»
			«ENDFOR»
		}
	'''
	
	def generateEntity(Entity entity) '''
		package «entity.packageName»
		
		case class «entity.className»(
			«entity.features.map[Feature f | f.featureName + ": " + f.type.declaration].makeString("", ",\n", "")»
		)
		
		object «entity.className» {
			«FOR feature: entity.features»
				val «feature.key» = "«feature.keyValue»";
			«ENDFOR»
		}
	'''
	
}
