package com.mguidi.soa.generator.java

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
import com.mguidi.soa.soa.Module
import java.util.HashSet
import com.mguidi.soa.soa.Entity

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
	def packageName(Entities entity) {
		(entity.eContainer.eContainer.eContainer as Architecture).name + "." +
		(entity.eContainer.eContainer as Module).name + ".model"
	}

	def className(Entities entity) {
		entity.name.toFirstUpper
	}
	
	def qualifiedClassName(Entities entity) {
		entity.packageName + "." + entity.className
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
	def packageName(Service service) {
		(service.eContainer.eContainer as Architecture).name + "." +
		(service.eContainer as Module).name + ".service"
	}

	def className(Service service) {
		service.name.toFirstUpper
	}
	
	def qualifiedClassName(Service service) {
		service.packageName + "." + service.className
	}
	
	def applicationId(Service service) {
		(service.eContainer.eContainer as Architecture).applicationId
	}
	
	def moduleName(Service service) {
		(service.eContainer.eContainer as Architecture).moduleName
	}
	
	def version(Service service) {
		(service.eContainer.eContainer as Architecture).version
	}
	
	def packageNameServlet(Service service) {
		(service.eContainer.eContainer as Architecture).name + "." +
		(service.eContainer as Module).name + ".servlet"
	}

	def classNameServlet(Service service) {
		service.name+"Servlet"
	}
	
	def qualifiedClassNameServlet(Service service) {
		service.packageNameServlet + "." + service.classNameServlet
	}
	
	def packageNameClient(Service service) {
		(service.eContainer.eContainer as Architecture).name + "." +
		(service.eContainer as Module).name + ".client"
	}

	def classNameClient(Service service) {
		service.name+"Client"
	}
	
	def qualifiedClassNameClient(Service service) {
		service.packageNameClient + "." + service.classNameClient
	}
	
	/******************************** Operation  ********************************/
	def signature(Operation operation) {
		operation.name.toFirstLower
	}
	
	def throwsException(Operation operation) {
		var text = ""
		for (com.mguidi.soa.soa.Exception e: operation.exceptionts) {
			text += ", " + e.qualifiedClassName
		}
		return text
	}
	
	def packageNameOutput(Operation operation) {
		(operation.eContainer as Service).qualifiedClassName.toLowerCase + ".output"
	}

	def classNameOutput(Operation operation) {
		operation.name.toFirstUpper + "Output"
	}
	
	def qualifiedClassNameOutput(Operation operation) {
		operation.packageNameOutput + "." + operation.classNameOutput
	}
	
	def packageNameInput(Operation operation) {
		(operation.eContainer as Service).qualifiedClassName.toLowerCase + ".input"
	}

	def classNameInput(Operation operation) {
		operation.name.toFirstUpper + "Input"
	}
	
	def qualifiedClassNameInput(Operation operation) {
		operation.packageNameInput + "." + operation.classNameInput
	}
	
	def moduleName(Operation operation) {
		(operation.eContainer as Service).moduleName
	}
	
	def version(Operation operation) {
		(operation.eContainer as Service).version
	}

	/******************************** Exception  ********************************/	
	def packageName(com.mguidi.soa.soa.Exception exception) {
		(exception.eContainer as Service).qualifiedClassName.toLowerCase + ".exception"
	}

	def className(com.mguidi.soa.soa.Exception exception) {
		exception.name.toFirstUpper
	}
	
	def qualifiedClassName(com.mguidi.soa.soa.Exception exception) {
		exception.packageName + "." + exception.className
	}
	
	def moduleName(com.mguidi.soa.soa.Exception exception) {
		(exception.eContainer as Service).moduleName
	}
	
	def version(com.mguidi.soa.soa.Exception exception) {
		(exception.eContainer as Service).version
	}
	
	/******************************** PrimitiveType  ********************************/
	def packageName(PrimitiveType type) {
		switch (type) {
			case PrimitiveType::DATE : "java.util"
			case PrimitiveType::DATETIME : "java.util"
			case PrimitiveType::TIMESTAMP : "java.util"
			case PrimitiveType::DECIMAL : "java.math"
			default : "java.lang"
		}
	}

	def className(PrimitiveType type) {
		switch (type) {
			case PrimitiveType::BOOLEAN : "Boolean"
			case PrimitiveType::BYTE : "Byte"
			case PrimitiveType::DATE : "Date"
			case PrimitiveType::DATETIME : "Date"
			case PrimitiveType::DECIMAL : "BigDecimal"
			case PrimitiveType::DOUBLE : "Double"
			case PrimitiveType::FLOAT : "Float"
			case PrimitiveType::INTEGER : "Integer"
			case PrimitiveType::LONG : "Long"
			case PrimitiveType::SHORT : "Short"
			case PrimitiveType::STRING : "String"
			case PrimitiveType::TIMESTAMP : "Date"
		}
	}
	
	def qualifiedClassName(PrimitiveType type) {
		type.packageName + "." + type.className
	}

	/******************************** Feature ********************************/
	def String key(Feature feature) {
		feature.name.toUpperCase
	}

	/******************************** FeatureType  ********************************/
	def String applicationId(FeatureType featureType) {
		switch (featureType) {
			EntitiesFeature: (featureType as EntitiesFeature).type.applicationId
			GenericListFeature: (featureType as GenericListFeature).baseType.applicationId
		}
	}
	
	def String moduleName(FeatureType featureType) {
		switch (featureType) {
			EntitiesFeature: (featureType as EntitiesFeature).type.moduleName
			GenericListFeature: (featureType as GenericListFeature).baseType.moduleName
		}
	}
	
	def String version(FeatureType featureType) {
		switch (featureType) {
			EntitiesFeature: (featureType as EntitiesFeature).type.version
			GenericListFeature: (featureType as GenericListFeature).baseType.version
		}
	}
		
	def String declaration(FeatureType featureType) {
		switch (featureType) {
			EntitiesFeature: (featureType as EntitiesFeature).type.qualifiedClassName
			PrimitiveFeature: (featureType as PrimitiveFeature).type.qualifiedClassName
			GenericListFeature: "java.util.List<"+(featureType as GenericListFeature).type.declaration+">"
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
	
	def String createAtDepth(GenericListFeature generic, int i) {
		if (i==0) {
			"new java.util.LinkedList<"+generic.type.declaration+">()" 
		} else {
			createAtDepth((generic.type as GenericListFeature), i-1)
		}
	}
	
	
	def dependencies(Architecture architecture, Iterable<Feature> features) {
		var dependencies = new HashSet<Dependency>()
		for (Feature f: features) {
			if (f.type.applicationId != null && f.type.moduleName !=null && (!f.type.applicationId.equals(architecture.applicationId) || !f.type.moduleName.equals(architecture.moduleName))) {
				var dependency = new Dependency()
				dependency.applicationId = f.type.applicationId
				dependency.moduleName = f.type.moduleName
				dependency.version = f.type.version 
				
				dependencies.add(dependency)
			}
		}
		return dependencies
	}
	
	def dependenciesEntity(Architecture architecture, Iterable<Feature> features) {
		var dependencies = new HashSet<Dependency>()
		for (Feature f: features) {
			if (f.type instanceof EntitiesFeature && (f.type as EntitiesFeature).type instanceof Entity) {
				if (f.type.applicationId != null && f.type.moduleName !=null && (!f.type.applicationId.equals(architecture.applicationId) || !f.type.moduleName.equals(architecture.moduleName))) {
					var dependency = new Dependency()
					dependency.applicationId = f.type.applicationId
					dependency.moduleName = f.type.moduleName
					dependency.version = f.type.version 
					
					dependencies.add(dependency)
				}
			} else if (f.type instanceof GenericListFeature && (f.type as GenericListFeature).baseType instanceof EntitiesFeature && ((f.type as GenericListFeature).baseType as EntitiesFeature).type instanceof Entity) {
				if (f.type.applicationId != null && f.type.moduleName !=null && (!f.type.applicationId.equals(architecture.applicationId) || !f.type.moduleName.equals(architecture.moduleName))) {
					var dependency = new Dependency()
					dependency.applicationId = f.type.applicationId
					dependency.moduleName = f.type.moduleName
					dependency.version = f.type.version 
					
					dependencies.add(dependency)
				}
			}
		}
		return dependencies
	}
	
	static class Dependency {
		public String applicationId
		public String moduleName
		public String version
		
		override equals(Object obj) {
			var tmp = (obj as Dependency)
			return 
				tmp.applicationId.equals(applicationId) &&
				tmp.moduleName.equals(moduleName) &&
				tmp.version.equals(version)
 		}
 		
			override hashCode() {
				(applicationId + moduleName + version).hashCode 
			}
			
	}
	
}
