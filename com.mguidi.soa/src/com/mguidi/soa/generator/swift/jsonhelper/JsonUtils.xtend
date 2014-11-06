package com.mguidi.soa.generator.swift.jsonhelper

import com.mguidi.soa.soa.Operation
import com.mguidi.soa.soa.Entities
import com.mguidi.soa.generator.swift.Utils

class JsonUtils extends Utils {

	/******************************** Entity Json Helper  ********************************/
	def classNameHelper(Entities entity) {
		entity.className + "Helper"
	}
	
	def classNameOutputHelper(Operation operation) {
		operation.classNameOutput + "Helper"
	}
	
	def classNameInputHelper(Operation operation) {
		operation.classNameInput + "Helper"
	}
		
}
