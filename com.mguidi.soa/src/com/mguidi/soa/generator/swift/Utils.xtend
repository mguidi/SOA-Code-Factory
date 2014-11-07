package com.mguidi.soa.generator.swift

import com.mguidi.soa.soa.FeatureType
import com.mguidi.soa.soa.PrimitiveFeature
import com.mguidi.soa.soa.PrimitiveType
import com.mguidi.soa.soa.GenericListFeature
import com.mguidi.soa.soa.Comment
import com.mguidi.soa.soa.Feature
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.soa.Entities
import com.mguidi.soa.soa.EntitiesFeature
import com.mguidi.soa.soa.Architecture

class Utils {
	
	def applicationId(Architecture architecture) {
		architecture.name
	}
	
	def moduleName(Architecture architecture) {
		architecture.module.name
	}
	
	def version(Architecture architecture) {
		architecture.module.version
	}
	
	/******************************** Entities  ********************************/
	def className(Entities entity) {
		entity.moduleName.toFirstUpper + entity.name.toFirstUpper
	}
	
	def applicationId(Entities entity) {
		(entity.eContainer.eContainer.eContainer as Architecture).applicationId
	}
	
	def moduleName(Entities entity) {
		(entity.eContainer.eContainer.eContainer as Architecture).moduleName
	}
	
	def version(Entities entity) {
		(entity.eContainer.eContainer.eContainer as Architecture).version
	}
	
	/******************************** Service  ********************************/
	def className(Service service) {
		service.moduleName.toFirstUpper + service.name.toFirstUpper
	}
	
	def moduleName(Service service) {
		(service.eContainer.eContainer as Architecture).moduleName
	}
	
	def version(Service service) {
		(service.eContainer.eContainer as Architecture).version
	}
	
	def classNameClient(Service service) {
		service.moduleName.toFirstUpper + service.name.toFirstUpper + "Client"
	}
	
	/******************************** Operation  ********************************/
	def signature(Operation operation) {
		operation.name.toFirstLower
	}
	
	def input(Operation operation) {
		var text = ""
		for (Feature f: operation.featuresInput) {
			text += f.name +" : " +f.type.declaration + ", "
		}
		return text
	}
	
	def classNameOutput(Operation operation) {
		operation.moduleName.toFirstUpper + (operation.eContainer as Service).name.toFirstUpper + operation.name.toFirstUpper + "Output"
	}
	
	def classNameInput(Operation operation) {
		operation.moduleName.toFirstUpper + (operation.eContainer as Service).name.toFirstUpper + operation.name.toFirstUpper + "Input"
	}
	
	def moduleName(Operation operation) {
		(operation.eContainer as Service).moduleName
	}
	
	def version(Operation operation) {
		(operation.eContainer as Service).version
	}

	/******************************** Exception  ********************************/	
//	def packageName(com.mguidi.soa.soa.Exception exception) {
//		(exception.eContainer as Service).packageName + ".exception"
//	}
//
//	def className(com.mguidi.soa.soa.Exception exception) {
//		exception.name
//	}
//	
//	def qualifiedClassName(com.mguidi.soa.soa.Exception exception) {
//		exception.packageName + "." + exception.className
//	}
//	
//	def moduleName(com.mguidi.soa.soa.Exception exception) {
//		(exception.eContainer as Service).moduleName
//	}
//	
//	def version(com.mguidi.soa.soa.Exception exception) {
//		(exception.eContainer as Service).version
//	}
	
	/******************************** PrimitiveType  ********************************/
	def className(PrimitiveType type) {
		switch (type) {
			case PrimitiveType::BOOLEAN : "Bool"
			case PrimitiveType::BYTE : "Byte"
			case PrimitiveType::DATE : "NSDate"
			case PrimitiveType::DATETIME : "NSDate"
			case PrimitiveType::DECIMAL : "NSDecimalNumber"
			case PrimitiveType::DOUBLE : "Double"
			case PrimitiveType::FLOAT : "Float"
			case PrimitiveType::INTEGER : "Int"
			case PrimitiveType::LONG : "CLong"
			case PrimitiveType::SHORT : "CShort"
			case PrimitiveType::STRING : "String"
			case PrimitiveType::TIMESTAMP : "NSDate"
		}
	}
	
	/******************************** Feature ********************************/
	def String key(Feature feature) {
		feature.name.toUpperCase
	}

	/******************************** FeatureType  ********************************/
	def String declaration(FeatureType featureType) {
		switch (featureType) {
			EntitiesFeature: (featureType as EntitiesFeature).type.className
			PrimitiveFeature: (featureType as PrimitiveFeature).type.className
			GenericListFeature: "Array<"+(featureType as GenericListFeature).type.declaration+">"
		}
	}
	
	/******************************** Comment  ********************************/
	def clean(Comment comment) {
		comment.value.replace("# ","").replace("#","")
	}
	
	/******************************** GenericListFeature  ********************************/
	def int depthToBaseType(GenericListFeature generic) {
		if (generic.type instanceof GenericListFeature) {
			1 + depthToBaseType((generic.type as GenericListFeature))
		} else {
			1
		}
	}
	
	def FeatureType baseType(GenericListFeature generic) {
		if (generic.type instanceof GenericListFeature) {
			baseType((generic.type as GenericListFeature))
		} else {
			generic.type
		}
	}
	
	def String declarationAtDepth(GenericListFeature generic, int i) {
		if (i==0) {
			generic.declaration
		} else {
			if (generic.type instanceof GenericListFeature) {
				declarationAtDepth((generic.type as GenericListFeature), i-1)
				
			} else {
				generic.type.declaration	
			}
		}
	}
	
}
