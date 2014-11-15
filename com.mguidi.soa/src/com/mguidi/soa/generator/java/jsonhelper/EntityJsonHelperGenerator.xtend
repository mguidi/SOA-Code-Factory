package com.mguidi.soa.generator.java.jsonhelper

import com.google.inject.Inject
import com.mguidi.soa.soa.Entity
import com.mguidi.soa.soa.EntitiesFeature
import com.mguidi.soa.soa.PrimitiveFeature
import com.mguidi.soa.soa.PrimitiveType
import com.mguidi.soa.soa.GenericListFeature
import java.util.List
import com.mguidi.soa.soa.Feature

class EntityJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	
	def generateJsonHelper(Entity entity) '''
		package «entity.packageNameHelper»;
		
		import com.google.gson.stream.JsonReader;
		import com.google.gson.stream.JsonToken;
		import com.google.gson.stream.JsonWriter;
		
		import java.io.IOException;
		
		import «entity.qualifiedClassName»;
		
		/**
		 *
		 * «entity.classNameHelper»
		 *
		 */
		public class «entity.classNameHelper» {
			
			public static «entity.qualifiedClassName» fromJson(JsonReader reader) throws IOException {
				
				String key;
				«entity.className» obj = new «entity.className»(); 
				
				reader.beginObject();
				«readFeatures(entity.className, entity.features)»
				reader.endObject();
				
				return obj;
			}
			
			
			public static void writeJson(«entity.qualifiedClassName» obj, JsonWriter writer) throws IOException {
				
				writer.beginObject();
				«writeFeatures(entity.className, entity.features)»
				writer.endObject();
			}
		}
	'''
	
	def readFeatures(String className, List<Feature> features) '''
		while (reader.hasNext()) {
			key = reader.nextName();
			«FOR feature: features»
				«IF feature == features.get(0)»
				if (key.equals(«className».«feature.key»)) {
				«ELSE»
				else if (key.equals(«className».«feature.key»)) {
				«ENDIF»
					if (reader.peek() == JsonToken.NULL) {
						reader.skipValue();
					} else {
						«IF feature.type instanceof EntitiesFeature»
						«IF (feature.type as EntitiesFeature).type instanceof Entity»
						obj.«feature.featureName» = «(feature.type as EntitiesFeature).type.qualifiedClassNameHelper».fromJson(reader);
						«ELSEIF (feature.type as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
						try {
							obj.«feature.featureName» = «((feature.type as EntitiesFeature).type as com.mguidi.soa.soa.Enum).nextValue»;
						} catch (java.lang.IllegalArgumentException e) {
							obj.«feature.featureName» = «(feature.type as EntitiesFeature).type.qualifiedClassName»._UNDEFINED_;
						}
						«ENDIF»
						«ELSEIF feature.type instanceof PrimitiveFeature»
							«IF (feature.type as PrimitiveFeature).type == PrimitiveType::DECIMAL»
							try {
								obj.«feature.featureName» = «(feature.type as PrimitiveFeature).type.nextValue»;
							} catch (java.lang.NumberFormatException e) {
							}
							«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATE»
							try {
								obj.«feature.featureName» = «(feature.type as PrimitiveFeature).type.nextValue»;
							} catch (java.text.ParseException e) {
							}
							«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::DATETIME»
							try {
								obj.«feature.featureName» = «(feature.type as PrimitiveFeature).type.nextValue»;
							} catch (java.text.ParseException e) {
							}
							«ELSEIF (feature.type as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
							try {
								obj.«feature.featureName» = «(feature.type as PrimitiveFeature).type.nextValue»;
							} catch (java.text.ParseException e) {
							}
							«ELSE»
							obj.«feature.featureName» = «(feature.type as PrimitiveFeature).type.nextValue»;
							«ENDIF»
						«ELSEIF feature.type instanceof GenericListFeature»
						«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
						«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
							«(feature.type as GenericListFeature).declarationAtDepth(i)» list«index» = «(feature.type as GenericListFeature).createAtDepth(i)»;
							«IF i>0»
							list«index+1».add(list«index»);
							«ELSE»
							obj.«feature.featureName» = list«index»;
							«ENDIF»
							reader.beginArray();
							while (reader.hasNext()) {
						«ENDFOR»
						«IF (feature.type as GenericListFeature).baseType instanceof EntitiesFeature»
						«IF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof Entity»
						list0.add(«((feature.type as GenericListFeature).baseType as EntitiesFeature).type.qualifiedClassNameHelper».fromJson(reader));
						«ELSEIF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
						try {
							list0.add(«(((feature.type as GenericListFeature).baseType as EntitiesFeature).type as com.mguidi.soa.soa.Enum).nextValue»);
						} catch (java.lang.IllegalArgumentException e) {
							list0.add(«((feature.type as GenericListFeature).baseType as EntitiesFeature).type.qualifiedClassName»._UNDEFINED_);
						} 
						«ENDIF»
						«ELSEIF (feature.type as GenericListFeature).baseType instanceof PrimitiveFeature»
							«IF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DECIMAL»
							try {
								list0.add(«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.nextValue»);
							} catch (java.lang.NumberFormatException e) {
							}
							«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATE»
							try {
								list0.add(«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.nextValue»);
							} catch (java.text.ParseException e) {
							}
							«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::DATETIME»
							try {
								list0.add(«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.nextValue»);
							} catch (java.text.ParseException e) {
							}
							«ELSEIF ((feature.type as GenericListFeature).baseType as PrimitiveFeature).type == PrimitiveType::TIMESTAMP»
							try {
								list0.add(«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.nextValue»);
							} catch (java.text.ParseException e) {
							}
							«ELSE»
							list0.add(«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.nextValue»);
							«ENDIF»
						«ENDIF»
						«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
							}
							reader.endArray();
						«ENDFOR»
						«ENDIF»
					}
				}
			«ENDFOR»
			«IF features.size > 0» 
				else {
					reader.skipValue();
				}
			«ENDIF»
		}
	'''
	
	
	def writeFeatures(String className, List<Feature> features) '''
		«FOR feature: features»
			if (obj.«feature.featureName» != null) {
				writer.name(«className».«feature.key»);
				«IF feature.type instanceof EntitiesFeature»
				«IF (feature.type as EntitiesFeature).type instanceof Entity»
				«(feature.type as EntitiesFeature).type.qualifiedClassNameHelper».writeJson(obj.«feature.featureName», writer);
				«ELSEIF (feature.type as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
				«((feature.type as EntitiesFeature).type as com.mguidi.soa.soa.Enum).writeValue("obj."+feature.featureName)»
				«ENDIF»
				«ELSEIF feature.type instanceof PrimitiveFeature»
				«(feature.type as PrimitiveFeature).type.writeValue("obj."+feature.featureName)»;
				«ELSEIF feature.type instanceof GenericListFeature»
					«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
					«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
						writer.beginArray();
						«IF i==0»
						for («(feature.type as GenericListFeature).declarationAtDepth(i+1)» list«index» : obj.«feature.featureName») {
						«ELSE»
						for («(feature.type as GenericListFeature).declarationAtDepth(i+1)» list«index» : list«index+1») {
						«ENDIF»
					«ENDFOR»
					«IF (feature.type as GenericListFeature).baseType instanceof EntitiesFeature»
					«IF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof Entity»
					«((feature.type as GenericListFeature).baseType as EntitiesFeature).type.qualifiedClassNameHelper».writeJson(list0, writer);
					«ELSEIF ((feature.type as GenericListFeature).baseType as EntitiesFeature).type instanceof com.mguidi.soa.soa.Enum»
					«(((feature.type as GenericListFeature).baseType as EntitiesFeature).type as com.mguidi.soa.soa.Enum).writeValue("list0")»
					«ENDIF»
					«ELSEIF (feature.type as GenericListFeature).baseType instanceof PrimitiveFeature»
						«((feature.type as GenericListFeature).baseType as PrimitiveFeature).type.writeValue("list0")»;
					«ENDIF»
					«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
						}
						writer.endArray();
					«ENDFOR»
				«ENDIF»
			}
		«ENDFOR»
	'''
	
	def nextValue(PrimitiveType type) {
		switch (type) {
			case PrimitiveType::BOOLEAN : "reader.nextBoolean()"
			case PrimitiveType::BYTE : "(byte) reader.nextInt()"
			case PrimitiveType::DOUBLE : "reader.nextDouble()"
			case PrimitiveType::FLOAT : "(float) reader.nextDouble()"
			case PrimitiveType::INTEGER : "reader.nextInt()"
			case PrimitiveType::LONG : "reader.nextLong()"
			case PrimitiveType::SHORT : "(short) reader.nextInt()"
			case PrimitiveType::STRING : "reader.nextString()"
			case PrimitiveType::DATE : "new java.text.SimpleDateFormat(\"yyyy-MM-dd\").parse(reader.nextString())"
			case PrimitiveType::DATETIME : "new java.text.SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss.SSS\").parse(reader.nextString())"
			case PrimitiveType::TIMESTAMP : "new java.text.SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\").parse(reader.nextString())"
			case PrimitiveType::DECIMAL : "new java.math.BigDecimal(reader.nextString())"
		}
	}
	
	def writeValue(PrimitiveType type, String obj) {
		switch (type) {
			case PrimitiveType::BOOLEAN : "writer.value("+obj+");"
			case PrimitiveType::BYTE : "writer.value("+obj+");"
			case PrimitiveType::DOUBLE : "writer.value("+obj+");"
			case PrimitiveType::FLOAT : "writer.value("+obj+");"
			case PrimitiveType::INTEGER : "writer.value("+obj+");"
			case PrimitiveType::LONG : "writer.value("+obj+");"
			case PrimitiveType::SHORT : "writer.value("+obj+");"
			case PrimitiveType::STRING : "writer.value("+obj+");"
			case PrimitiveType::DATE : "writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd\").format("+obj+"))"
			case PrimitiveType::DATETIME : "writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss.SSS\").format("+obj+"))"
			case PrimitiveType::TIMESTAMP : "writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\").format("+obj+"))"
			case PrimitiveType::DECIMAL : "writer.value("+obj+".toPlainString())"
		}
	}
	
	def nextValue(com.mguidi.soa.soa.Enum type) {
		type.qualifiedClassName + ".valueOf(reader.nextString())"
	}
	
	def writeValue(com.mguidi.soa.soa.Enum type, String obj) {
		"writer.value("+obj+".toString());"
	}
	
}
