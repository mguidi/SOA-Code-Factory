package com.mguidi.soa.generator.java.webservice.json

import com.google.inject.Inject
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils

class ServletJsonGenerator {
	
	@Inject extension JsonUtils utils
	
	def generateServlet(Service service) '''
		package «service.packageNameServlet»;
		
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.net.HttpURLConnection;
		
		import javax.servlet.ServletException;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		
		import com.google.gson.stream.JsonReader;
		import com.google.gson.stream.JsonWriter;
		import com.mguidi.soa.commons.service.ServiceException;
		import com.mguidi.soa.commons.service.ServiceExceptionHelper;
		
		/**
		*
		* «service.classNameServlet»
		*
		*/
		public abstract class «service.classNameServlet»  extends HttpServlet implements «service.qualifiedClassName» {
			
			private static final long serialVersionUID = 1L;
			public static final String NAME = "/«service.moduleName»/«service.version»/*";

			private static final String ENCODING = "UTF-8";
			private static final String CONTENT_TYPE = "application/json";
			
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				String contentType = req.getContentType().split(";")[0];
				String characterEncoding = req.getCharacterEncoding();
				if (contentType == null || characterEncoding == null || !contentType.equals(CONTENT_TYPE) || !characterEncoding.equals(ENCODING)) {
					resp.sendError(HttpURLConnection.HTTP_BAD_REQUEST);
					return;
				}

				resp.setCharacterEncoding(ENCODING);
				resp.setContentType(CONTENT_TYPE);
				
				String operation = req.getPathInfo();
				«FOR Operation operation: service.operations»
				«IF operation == service.operations.get(0)»
				if (operation.equals("/«operation.name»")) {
				«ELSE»
				else if (operation.equals("/«operation.name»")) {
				«ENDIF»
					_«operation.signature»(req, resp);
				}
				«ENDFOR»
				else {
					resp.sendError(HttpURLConnection.HTTP_BAD_REQUEST);
				}
			}
			
			«FOR Operation operation: service.operations»
				private void _«operation.signature»(HttpServletRequest req, HttpServletResponse resp) throws IOException {
					«IF operation.featuresInput.size > 0»
					«operation.qualifiedClassNameInput» input;
					
					JsonReader reader = new JsonReader(new InputStreamReader(req.getInputStream(), ENCODING));
					try {
						input = «operation.qualifiedClassNameInputHelper».fromJson(reader);
					} finally {
						reader.close();
					}
					«ENDIF»
					
					«IF operation.featuresOutput.size > 0»
					«operation.qualifiedClassNameOutput» output;
					«IF operation.exceptionts.size == 0»
					output = «operation.signature»(«operation.inputValue»);
					«ELSE»
					try {
						output = «operation.signature»(«operation.inputValue»);
						
					}
					«FOR exceptiont: operation.exceptionts» 
					catch («exceptiont.qualifiedClassName» e) {
						_exception(e, resp);
						return;
					}
					«ENDFOR»
					«ENDIF»
					
					JsonWriter writer = new JsonWriter(new OutputStreamWriter(resp.getOutputStream(), ENCODING));
					try {
						«operation.qualifiedClassNameOutputHelper».writeJson(output, writer);
					} finally {
						writer.close();
					}
					«ELSE»
					«IF operation.exceptionts.size == 0»
					«operation.signature»(«operation.inputValue»);
					«ELSE»
					try {
						«operation.signature»(«operation.inputValue»);
						
					}
					«FOR exceptiont: operation.exceptionts» 
					catch («exceptiont.qualifiedClassName» e) {
						_exception(e, resp);
						return;
					}
					«ENDFOR»
					«ENDIF»
					«ENDIF»
				}
				
			«ENDFOR»
			
			private static void _exception(ServiceException e, HttpServletResponse resp) throws IOException {
				resp.setStatus(ServiceException.STATUS_CODE);
				JsonWriter writer =  new JsonWriter(new OutputStreamWriter(resp.getOutputStream(), ENCODING));
				try {
					ServiceExceptionHelper.writeJson(e, writer);
					
				} finally {
					writer.close();
				}
			}
		}
	'''
	
}
