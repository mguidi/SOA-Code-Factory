package com.mguidi.soa.generator.android.webservice.json

import com.mguidi.soa.soa.Architecture
import com.mguidi.soa.generator.java.Utils
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import com.mguidi.soa.soa.Entity

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildServiceJson(Architecture architecture, Resource resource) '''
		apply plugin: 'com.android.library'
		
		buildscript {
		    repositories {
		        jcenter()
		    }
		    dependencies {
		        classpath 'com.android.tools.build:gradle:0.13.2'
		    }
		}
		
		android {
		    compileSdkVersion 21
		    buildToolsVersion "21.0.0"
		    
		    defaultConfig {
		        minSdkVersion 5
		    }
		}
		
		task androidSourcesJar(type: Jar) {
			classifier = 'sources'
			from android.sourceSets.main.java.srcDirs
		}

		artifacts {
			archives androidSourcesJar
		}
		
		repositories {
			mavenLocal()
			mavenCentral()
		}
		
		dependencies {
		    compile 'com.google.code.gson:gson:2.3'
		    compile '«architecture.applicationId+":"+architecture.moduleName+"-service:android_"+architecture.version»'
		    «IF architecture.module.model != null && architecture.module.model.entities.filter(typeof(Entity)).size > 0»
		    compile '«architecture.applicationId+":"+architecture.moduleName+"-model-json:android_"+architecture.version»'
		    «ENDIF»
		    «FOR dependency: architecture.serviceModelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model-json:android_"+dependency.version»'
		    «ENDFOR»
		}
		
		apply plugin: 'maven'
		
		uploadArchives {
		    repositories {
		        mavenDeployer {
		            repository(url: mavenLocal().url)
		            
		            pom.groupId = '«architecture.applicationId»'
					pom.artifactId = '«architecture.moduleName»-service-json'
					pom.version = 'android_«architecture.version»'
		        }
		    }
		}
		
	'''
	
}
