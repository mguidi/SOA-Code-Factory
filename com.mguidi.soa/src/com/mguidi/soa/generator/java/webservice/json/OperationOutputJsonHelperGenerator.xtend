package com.mguidi.soa.generator.java.webservice.json

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator

class OperationOutputJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension EntityJsonHelperGenerator entityHelper
	
	def generateJsonHelper(Operation operation) '''
		package «operation.packageNameOutputHelper»;
		
		import com.google.gson.stream.JsonReader;
		import com.google.gson.stream.JsonToken;
		import com.google.gson.stream.JsonWriter;
		
		import java.io.IOException;
		
		import «operation.qualifiedClassNameOutput»;
		
		public class «operation.classNameOutputHelper» {
			
			public static «operation.qualifiedClassNameOutput» fromJson(JsonReader reader) throws IOException {
				
				String key;
				«operation.classNameOutput» obj = new «operation.classNameOutput»(); 
				
				reader.beginObject();
				«entityHelper.readFeatures(operation.classNameOutput, operation.featuresOutput)»
				reader.endObject();
				
				return obj;
			}
			
			
			public static void writeJson(«operation.qualifiedClassNameOutput» obj, JsonWriter writer) throws IOException {
				
				writer.beginObject();
				«entityHelper.writeFeatures(operation.classNameOutput, operation.featuresOutput)»
				writer.endObject();
			}
		}
	'''
}
