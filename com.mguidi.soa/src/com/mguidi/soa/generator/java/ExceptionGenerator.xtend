package com.mguidi.soa.generator.java

import com.google.inject.Inject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider

class ExceptionGenerator {
	
	@Inject extension Utils utils
	@Inject extension QualifiedNameProvider provider
	
	def generateException(com.mguidi.soa.soa.Exception exception) '''
		package «exception.packageName»;
		
		/**
		*
		* «exception.className»
		*
		*/
		public class «exception.className» extends Exception implements com.mguidi.soa.commons.service.ServiceException {
			
			private static final long serialVersionUID = 1L;
			
			public «exception.className»() {
				super("«exception.msg»");
			}
			
			@Override
			public String getException() {
				return «exception.fullyQualifiedName»;
			}
			
			@Override
			public String getMsg() {
				return "«exception.msg»";
			}
			
		}
	'''
	
}
