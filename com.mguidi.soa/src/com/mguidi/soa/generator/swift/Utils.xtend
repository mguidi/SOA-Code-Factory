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
		entity.name
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
		service.name.toFirstUpper
	}
	
	def moduleName(Service service) {
		(service.eContainer.eContainer as Architecture).moduleName
	}
	
	def version(Service service) {
		(service.eContainer.eContainer as Architecture).version
	}
//	
//	def packageNameServlet(Service service) {
//		(service.eContainer.eContainer as Architecture).name + "." +
//		(service.eContainer as Module).name + ".servlet"
//	}
//
//	def classNameServlet(Service service) {
//		service.moduleName.toFirstUpper+"Servlet"
//	}
//	
//	def qualifiedClassNameServlet(Service service) {
//		service.packageNameServlet + "." + service.classNameServlet
//	}
//	
//	def packageNameClient(Service service) {
//		(service.eContainer.eContainer as Architecture).name + "." +
//		(service.eContainer as Module).name + ".client"
//	}
//
//	def classNameClient(Service service) {
//		service.moduleName.toFirstUpper+"Client"
//	}
//	
//	def qualifiedClassNameClient(Service service) {
//		service.packageNameClient + "." + service.classNameClient
//	}
	
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
//	
//	def inputValue(Operation operation) {
//		var text = ""
//		var i=0
//		for (Feature f: operation.featuresInput) {
//			if (i>0) {
//				text += ", "
//			}
//			text += "input." + f.name
//			i++ 
//		}
//		return text
//	}
//	
//	def throwsException(Operation operation) {
//		var text = ""
//		for (com.mguidi.soa.soa.Exception e: operation.exceptionts) {
//			text += ", " + e.qualifiedClassName
//		}
//		return text
//	}
//	
	def classNameOutput(Operation operation) {
		operation.name.toFirstUpper + "Output"
	}
//	
//	def qualifiedClassNameOutput(Operation operation) {
//		operation.packageNameOutput + "." + operation.classNameOutput
//	}
//	
//	def packageNameInput(Operation operation) {
//		(operation.eContainer as Service).packageName + ".input"
//	}
//
	def classNameInput(Operation operation) {
		operation.name.toFirstUpper + "Input"
	}
//	
//	def qualifiedClassNameInput(Operation operation) {
//		operation.packageNameInput + "." + operation.classNameInput
//	}
//	
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
//	def String applicationId(FeatureType featureType) {
//		switch (featureType) {
//			EntitiesFeature: (featureType as EntitiesFeature).type.applicationId
//			GenericListFeature: (featureType as GenericListFeature).baseType.applicationId
//		}
//	}
//	
//	def String moduleName(FeatureType featureType) {
//		switch (featureType) {
//			EntitiesFeature: (featureType as EntitiesFeature).type.moduleName
//			GenericListFeature: (featureType as GenericListFeature).baseType.moduleName
//		}
//	}
//	
//	def String version(FeatureType featureType) {
//		switch (featureType) {
//			EntitiesFeature: (featureType as EntitiesFeature).type.version
//			GenericListFeature: (featureType as GenericListFeature).baseType.version
//		}
//	}
		
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
//	
//	def String createAtDepth(GenericListFeature generic, int i) {
//		if (i==0) {
//			"new java.util.LinkedList<"+generic.type.declaration+">()" 
//		} else {
//			createAtDepth((generic.type as GenericListFeature), i-1)
//		}
//	}
//	
//	
//	def dependencies(Architecture architecture, Iterable<Feature> features) {
//		var dependencies = new HashSet<Dependency>()
//		for (Feature f: features) {
//			if (f.type.applicationId != null && f.type.moduleName !=null && (!f.type.applicationId.equals(architecture.applicationId) || !f.type.moduleName.equals(architecture.moduleName))) {
//				var dependency = new Dependency()
//				dependency.applicationId = f.type.applicationId
//				dependency.moduleName = f.type.moduleName
//				dependency.version = f.type.version 
//				
//				dependencies.add(dependency)
//			}
//		}
//		return dependencies
//	}
//	
//	static class Dependency {
//		public String applicationId
//		public String moduleName
//		public String version
//		
//		override equals(Object obj) {
//			var tmp = (obj as Dependency)
//			return 
//				tmp.applicationId.equals(applicationId) &&
//				tmp.moduleName.equals(moduleName) &&
//				tmp.version.equals(version)
// 		}
// 		
//			override hashCode() {
//				(applicationId + moduleName + version).hashCode 
//			}
//			
//	}
	
}
