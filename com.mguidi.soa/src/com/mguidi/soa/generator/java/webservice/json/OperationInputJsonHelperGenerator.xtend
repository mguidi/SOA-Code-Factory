package com.mguidi.soa.generator.java.webservice.json

import com.google.inject.Inject
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator

class OperationInputJsonHelperGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension EntityJsonHelperGenerator entityHelper
	
	def generateJsonHelper(Operation operation) '''
		package «operation.packageNameInputHelper»;
		
		import com.google.gson.stream.JsonReader;
		import com.google.gson.stream.JsonToken;
		import com.google.gson.stream.JsonWriter;
		
		import java.io.IOException;
		
		import «operation.qualifiedClassNameInput»;
		
		public class «operation.classNameInputHelper» {
			
			public static «operation.qualifiedClassNameInput» fromJson(JsonReader reader) throws IOException {
				
				String key;
				«operation.classNameInput» obj = new «operation.classNameInput»(); 
				
				reader.beginObject();
				«entityHelper.readFeatures(operation.classNameInput, operation.featuresInput)»
				reader.endObject();
				
				return obj;
			}
			
			
			public static void writeJson(«operation.qualifiedClassNameInput» obj, JsonWriter writer) throws IOException {
				
				writer.beginObject();
				«entityHelper.writeFeatures(operation.classNameInput, operation.featuresInput)»
				writer.endObject();
			}
		}
	'''
}
