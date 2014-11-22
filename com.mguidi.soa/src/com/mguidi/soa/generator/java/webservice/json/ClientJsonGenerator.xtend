package com.mguidi.soa.generator.java.webservice.json

import com.google.inject.Inject
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider

class ClientJsonGenerator {
	
	@Inject extension JsonUtils utils
	@Inject extension QualifiedNameProvider provider
	
	def generateClient(Service service) '''
		package «service.packageNameClient»;
		
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.net.HttpURLConnection;
		import java.net.URL;
		
		import com.google.gson.stream.JsonReader;
		import com.google.gson.stream.JsonWriter;
		import com.mguidi.soa.commons.service.BaseClient;
		import com.mguidi.soa.commons.service.ServiceException;
		import com.mguidi.soa.commons.service.ServiceExceptionHelper;
		
		/**
		*
		* «service.classNameClient»
		*
		*/
		public class «service.classNameClient» extends BaseClient implements «service.qualifiedClassName» {
			
			public static final String NAME = "/«service.moduleName»/«service.version»/«service.serviceName»";

			private static final String ENCODING = "UTF-8";

			private String mServiceAddress;
			
			public «service.classNameClient»(String baseAddress) {
				mServiceAddress = baseAddress + NAME;
			}
			
			«FOR Operation operation: service.operations»
				@Override
				public «IF operation.featuresOutput.size>0»«operation.qualifiedClassNameOutput»«ELSE»void«ENDIF» «operation.signature»(«IF operation.featuresInput.size>0»«operation.qualifiedClassNameInput» input«ENDIF») throws IOException«operation.throwsException» {
					«IF operation.featuresOutput.size>0»return «ENDIF»«operation.signature»(«IF operation.featuresInput.size>0»input, «ENDIF»1);
				}
				
				@Override
				public «IF operation.featuresOutput.size>0»«operation.qualifiedClassNameOutput»«ELSE»void«ENDIF» «operation.signature»(«IF operation.featuresInput.size>0»«operation.qualifiedClassNameInput» input, «ENDIF»int maxRetries) throws IOException«operation.throwsException» {
					URL url = new URL(mServiceAddress+"/«operation.name»");

					int numTries = 0;
					long startTime = System.currentTimeMillis();
					boolean isConnected = false;
					
					while (numTries < maxRetries) {
						HttpURLConnection conn = null;
						
						try {
							conn = (HttpURLConnection) url.openConnection();
							conn.setConnectTimeout(getNextTimeout(numTries));
							
							conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
							conn.setRequestMethod("POST");
							conn.setDoInput(true);
							conn.setDoOutput(true);
							conn.setChunkedStreamingMode(0);
							
							conn.connect();
							isConnected = true;
							
							«IF operation.featuresInput.size>0»
							// write parameters
							JsonWriter writer = new JsonWriter(new OutputStreamWriter(conn.getOutputStream(), ENCODING));
							try {
								«operation.qualifiedClassNameInputHelper».writeJson(input, writer);
							
							} finally {
								writer.close();
							}
							«ENDIF»
							
							// read response code
							int response = conn.getResponseCode();
							switch (response) {
								case HttpURLConnection.HTTP_OK: {
									«IF operation.featuresOutput.size>0»
									// read response
									JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));
									try {
										«operation.qualifiedClassNameOutput» output = «operation.qualifiedClassNameOutputHelper».fromJson(reader);
										
										return output;
										
									} finally {
										reader.close();
									}
									«ELSE»
									break;
									«ENDIF»
								}
								«IF operation.exceptionts.size > 0»
								case ServiceException.STATUS_CODE: {
									// read exception
									JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));
									try {
										ServiceException exception = ServiceExceptionHelper.fromJson(reader);
										«FOR exception: operation.exceptionts»
										«IF exception == operation.exceptionts.get(0)»
										if (exception.getException().equals("«exception.fullyQualifiedName»")) {
										«ELSE»
										else if (exception.getException().equals("«exception.fullyQualifiedName»")) {
										«ENDIF»
											throw new «exception.qualifiedClassName»();
										}
										«ENDFOR»
										else {
											throw new IOException();
										}
										
									} finally {
										reader.close();
									}
								}
								«ENDIF»
								default:
									throw new IOException();
							}
							
						} catch (IOException e) {
							if (isTimeoutException(startTime, isConnected, conn.getReadTimeout(), conn.getConnectTimeout()) && numTries < (maxRetries - 1)) {
								// Fall through loop, retry
								// On last attempt, throw the exception regardless
								
							} else {
								throw e;
							}
						} finally {
							if (conn != null) {
								conn.disconnect();
							}
						}
						
						numTries++;
					}
					
					throw new UnsupportedOperationException();
				}
			«ENDFOR»
		}
	'''
	
}
