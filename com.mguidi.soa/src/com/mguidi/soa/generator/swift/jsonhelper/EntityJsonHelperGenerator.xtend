package com.mguidi.soa.generator.swift.jsonhelper

import com.google.inject.Inject
import com.mguidi.soa.soa.Entity
import com.mguidi.soa.soa.EntitiesFeature
import com.mguidi.soa.soa.PrimitiveFeature
import com.mguidi.soa.soa.PrimitiveType
import java.util.List
import com.mguidi.soa.soa.Feature
import com.mguidi.soa.soa.GenericListFeature

class EntityJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	
	def generateJsonHelper(Entity entity) '''
		import Foundation
		
		/**
		 *
		 * «entity.classNameHelper»
		 *
		 */
		public class «entity.classNameHelper» {
			
			class func fromJson(json: Dictionary<String, AnyObject>) -> («entity.className»)
			{
				var obj = «entity.className»()
				
				«readFeatures(entity.className, entity.features)»
				
				return obj
			}
			
			class func toJson(obj: «entity.className») -> (Dictionary<String, AnyObject>)
			{
				var json = Dictionary<String, AnyObject>()
				
				«writeFeatures(entity.className, entity.features)»
				
				return json;
			}
		}
	'''
	
	def readFeatures(String className, List<Feature> features) '''
		«FOR feature: features»
		«IF feature.type instanceof EntitiesFeature»
		«IF (feature.type as EntitiesFeature).type instanceof Entity»
		if let «feature.name»Value = json[«className».«feature.key»] as? Dictionary<String, AnyObject> {
			obj.«feature.name» = «(feature.type as EntitiesFeature).type.classNameHelper».fromJson(«feature.name»Value)
		}
		«ELSEIF (feature.type as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
		if let «feature.name»Value = json[«className».«feature.key»] as? String {
			obj.«feature.name» = «feature.type.declaration»(rawValue: «feature.name»Value)
			if (obj.«feature.name» == nil) {
				obj.«feature.name» = «feature.type.declaration»._UNDEFINED_
			}
		}
		«ENDIF»
		«ELSEIF feature.type instanceof PrimitiveFeature»
		«IF (feature.type as PrimitiveFeature).type == PrimitiveType::DECIMAL»
		if let «feature.name»Value = json[«className».«feature.key»] as? String {
			obj.«feature.name» = NSDecimalNumber(string: «feature.name»Value)
		}
		«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATE»
		if let «feature.name»Value = json[«className».«feature.key»] as? String {
			let formatter = NSDateFormatter()
			formatter.dateFormat = "yyyy-MM-dd"
			obj.«feature.name» = formatter.dateFromString(«feature.name»Value)
		}
		«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATETIME»
		if let «feature.name»Value = json[«className».«feature.key»] as? String {
			let formatter = NSDateFormatter()
			formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS"
			obj.«feature.name» = formatter.dateFromString(«feature.name»Value)
		}
		«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
		if let «feature.name»Value = json[«className».«feature.key»] as? String {
			let formatter = NSDateFormatter()
			formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
			obj.«feature.name» = formatter.dateFromString(«feature.name»Value)
		}
		«ELSE»
		if let «feature.name»Value = json[«className».«feature.key»] as? «feature.type.declaration» {
			obj.«feature.name» = «feature.name»Value
		}
		«ENDIF»
		«ELSEIF feature.type instanceof GenericListFeature»
		«IF (feature.type as GenericListFeature).baseType instanceof EntitiesFeature»
		«IF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof Entity»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseDictionary» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				if let «feature.name»Value = «((feature.type as GenericListFeature).baseType as EntitiesFeature).type.classNameHelper».fromJson(obj) as «((feature.type as GenericListFeature).baseType as EntitiesFeature).type.className»?
				{
					list0.append(«feature.name»Value)
				}
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ELSEIF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseString» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				var «feature.name»Value = «((feature.type as GenericListFeature).baseType as EntitiesFeature).type.className»(rawValue: obj)
				if («feature.name»Value == nil) {
					«feature.name»Value = «((feature.type as GenericListFeature).baseType as EntitiesFeature).type.className»._UNDEFINED_
				}
			
				list0.append(«feature.name»Value!)
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ENDIF»
		«ELSEIF (feature.type as GenericListFeature).baseType instanceof PrimitiveFeature»
		«IF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DECIMAL»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseString» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				if let «feature.name»Value = NSDecimalNumber(string: obj) as NSDecimalNumber?
				{
					list0.append(«feature.name»Value)
				}
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATE»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseString» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd"
				if let «feature.name»Value = formatter.dateFromString(obj) as NSDate?
				{
					list0.append(«feature.name»Value)
				}
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATETIME»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseString» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS"
				if let «feature.name»Value = formatter.dateFromString(obj) as NSDate?
				{
					list0.append(«feature.name»Value)
				}
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
		if let array«(feature.type as GenericListFeature).depthToBaseType-1» = json[«className».«feature.key»] as? «(feature.type as GenericListFeature).listBaseString» {
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
			var list«index» = «(feature.type as GenericListFeature).declarationAtDepth(i)»()
			«IF index == 0»
			for obj in array0
			«ELSE»
			for array«index-1» in array«index»
			«ENDIF»
			{
			«ENDFOR»
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
				if let «feature.name»Value = formatter.dateFromString(obj) as NSDate?
				{
					list0.append(«feature.name»Value)
				}
			«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
			«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
			obj.«feature.name» = list«i»
			«ELSE»
			list«i+1».append(list«i»)
			«ENDIF»
			«ENDFOR»
		}
		«ELSE»
		if let «feature.name»Value = json[«className».«feature.key»] as? «feature.type.declaration» {
			obj.«feature.name» = «feature.name»Value
		}
		«ENDIF»
		«ENDIF»
		«ENDIF»
		«ENDFOR»
	'''
	
	def String listBaseString(GenericListFeature generic) {
		if (generic.type instanceof GenericListFeature) {
			"Array<" + listBaseString((generic.type as GenericListFeature)) +">"
		} else {
			"Array<String>"
		}
	}
	
	def String listBaseDictionary(GenericListFeature generic) {
		if (generic.type instanceof GenericListFeature) {
			"Array<" + listBaseDictionary((generic.type as GenericListFeature)) +">"
		} else {
			"Array<Dictionary<String, AnyObject>>"
		}
	}
	
	
	def String listBaseDictionaryAtDepth(GenericListFeature generic, int i) {
		if (i==0) {
			generic.listBaseDictionary
		} else {
			if (generic.type instanceof GenericListFeature) {
				listBaseDictionaryAtDepth((generic.type as GenericListFeature), i-1)
				
			} else {
				generic.listBaseDictionary
			}
		}
	}
	
	def String listBaseStringAtDepth(GenericListFeature generic, int i) {
		if (i==0) {
			generic.listBaseString
		} else {
			if (generic.type instanceof GenericListFeature) {
				listBaseStringAtDepth((generic.type as GenericListFeature), i-1)
				
			} else {
				generic.listBaseString
			}
		}
	}
	
	def writeFeatures(String className, List<Feature> features) '''
		«FOR feature: features»
			«IF feature.type instanceof EntitiesFeature»
			«IF (feature.type as EntitiesFeature).type instanceof Entity»
			if let «feature.name»Value = obj.«feature.name»
			{
				json[«className».«feature.key»] = «(feature.type as EntitiesFeature).type.classNameHelper».toJson(«feature.name»Value)
			}
			«ELSEIF (feature.type as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
			if let «feature.name»Value = obj.«feature.name»
			{
				json[«className».«feature.key»] = «feature.name»Value.rawValue
			}
			«ENDIF»
			«ELSEIF feature.type instanceof PrimitiveFeature»
			«IF (feature.type as PrimitiveFeature).type == PrimitiveType::DECIMAL»
			if let «feature.name»Value = obj.«feature.name»
			{
				json[«className».«feature.key»] = «feature.name»Value.stringValue
			}
			«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATE»
			if let «feature.name»Value = obj.«feature.name»
			{
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd"
				json[«className».«feature.key»] = formatter.stringFromDate(«feature.name»Value)
			}
			«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATETIME»
			if let «feature.name»Value = obj.«feature.name»
			{
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS"
				json[«className».«feature.key»] = formatter.stringFromDate(«feature.name»Value)
			}
			«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
			if let «feature.name»Value = obj.«feature.name»
			{
				let formatter = NSDateFormatter()
				formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
				json[«className».«feature.key»] = formatter.stringFromDate(«feature.name»Value)
			}
			«ELSE»
			if let «feature.name»Value = obj.«feature.name»
			{
				json[«className».«feature.key»] = «feature.name»Value
			}
			«ENDIF»
			«ELSEIF feature.type instanceof GenericListFeature»
			«IF (feature.type as GenericListFeature).baseType instanceof EntitiesFeature»
			«IF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof Entity»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseDictionaryAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					list0.append(«((feature.type as GenericListFeature).baseType as EntitiesFeature).type.classNameHelper».toJson(obj0))
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ELSEIF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseStringAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					list0.append(obj0.rawValue)
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ENDIF»
			«ELSEIF (feature.type as GenericListFeature).baseType instanceof PrimitiveFeature»
			«IF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DECIMAL»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseStringAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					list0.append(obj0.stringValue)
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATE»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseStringAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					let formatter = NSDateFormatter()
					formatter.dateFormat = "yyyy-MM-dd"
					list0.append(formatter.stringFromDate(obj0))
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATETIME»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseStringAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					let formatter = NSDateFormatter()
					formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS"
					list0.append(formatter.stringFromDate(obj0))
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
			if let array«(feature.type as GenericListFeature).depthToBaseType-1» = obj.«feature.name» {
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				var list«index» = «(feature.type as GenericListFeature).listBaseStringAtDepth(i)»()
				«IF index == 0»
				for obj0 in array0
				«ELSE»
				for array«index-1» in array«index»
				«ENDIF»
				{
				«ENDFOR»
					let formatter = NSDateFormatter()
					formatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
					list0.append(formatter.stringFromDate(obj0))
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				}
				«IF i == (feature.type as GenericListFeature).depthToBaseType-1»
				json[«className».«feature.key»] = list«i»
				«ELSE»
				list«i+1».append(list«i»)
				«ENDIF»
				«ENDFOR»
			}
			«ELSE»
			if let «feature.name»Value = obj.«feature.name»
			{
				json[«className».«feature.key»] = «feature.name»Value
			}
			«ENDIF»
			«ENDIF»
			«ENDIF»
		«ENDFOR»
	'''
	
}
