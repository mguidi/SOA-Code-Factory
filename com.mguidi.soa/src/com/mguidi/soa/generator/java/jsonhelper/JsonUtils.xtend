package com.mguidi.soa.generator.java.jsonhelper

import com.mguidi.soa.soa.Operation
import com.mguidi.soa.generator.java.Utils
import com.mguidi.soa.soa.Entities

class JsonUtils extends Utils {

	/******************************** Entity Json Helper  ********************************/
	def packageNameHelper(Entities entity) {
		entity.packageName + ".helper.json"
	}

	def classNameHelper(Entities entity) {
		entity.className + "Helper"
	}
	
	def qualifiedClassNameHelper(Entities entity) {
		entity.packageNameHelper + "." + entity.classNameHelper
	}
	
	def packageNameOutputHelper(Operation operation) {
		operation.packageNameOutput + ".helper.json"
	}

	def classNameOutputHelper(Operation operation) {
		operation.classNameOutput + "Helper"
	}
	
	def qualifiedClassNameOutputHelper(Operation operation) {
		operation.packageNameOutputHelper + "." + operation.classNameOutputHelper
	}
	
	def packageNameInputHelper(Operation operation) {
		operation.packageNameInput + ".helper.json"
	}

	def classNameInputHelper(Operation operation) {
		operation.classNameInput + "Helper"
	}
	
	def qualifiedClassNameInputHelper(Operation operation) {
		operation.packageNameInputHelper + "." + operation.classNameInputHelper
	}
	
}
