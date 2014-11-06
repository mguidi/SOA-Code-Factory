package com.mguidi.soa.generator.swift

import com.google.inject.Inject
import com.mguidi.soa.soa.Service
import com.mguidi.soa.soa.Operation

class ServiceGenerator {
	
	@Inject extension Utils utils
	
	def generateService(Service service) '''
		import Foundation
		
		/**
		*
		* «service.className»
		*
		*/
		public protocol «service.className» 
		{
			«FOR Operation operation: service.operations»
				func «operation.signature»(«operation.input»error: NSError) -> («IF operation.featuresOutput.size>0»«operation.classNameOutput»«ENDIF»)
			«ENDFOR»
		}
	'''
}
