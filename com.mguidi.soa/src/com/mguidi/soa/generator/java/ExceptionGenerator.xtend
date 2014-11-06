package com.mguidi.soa.generator.java

import com.google.inject.Inject

class ExceptionGenerator {
	
	@Inject extension Utils utils
	
	def generateException(com.mguidi.soa.soa.Exception exception) '''
		package «exception.packageName»;
		
		/**
		*
		* «exception.className»
		*
		*/
		public class «exception.className» extends Exception implements com.mguidi.soa.commons.service.ServiceException {
			
			private static final long serialVersionUID = 1L;
			
			@Override
			public int getCode() {
				return «exception.code»;
			}
			
			@Override
			public String getMsg() {
				return "«exception.msg»";
			}
			
		}
	'''
	
}
