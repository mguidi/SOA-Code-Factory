package com.mguidi.soa.generator.android.webservice.json

import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import com.mguidi.soa.generator.java.Utils

class ManifestGenerator {
	
	@Inject extension Utils utils
	
	def generateManifestServiceJson(Architecture architecture) '''
		<?xml version="1.0" encoding="utf-8"?>
		<manifest xmlns:android="http://schemas.android.com/apk/res/android"
			package="«architecture.applicationId».«architecture.moduleName».service.json"
			android:versionCode="1"
			android:versionName="«architecture.version»">

		</manifest>
	'''
	
}
