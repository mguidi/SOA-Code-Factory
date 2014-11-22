package com.mguidi.soa.generator.java.jsonhelper

import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import com.mguidi.soa.generator.java.Utils

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildModelJson(Architecture architecture, Resource resource) '''
		apply plugin: 'java'
		
		sourceCompatibility = 1.6
		
		repositories {
			mavenLocal()
			mavenCentral()
		}
		
		dependencies {
		    compile 'com.google.code.gson:gson:2.3'
		    compile '«architecture.applicationId+":"+architecture.moduleName+"-model:"+architecture.version»'
		    «FOR dependency: architecture.modelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model-json:"+dependency.version»'
		    «ENDFOR»
		}
		
		apply plugin: 'maven'

		uploadArchives {
		    repositories {
		        mavenDeployer {
		            repository(url: mavenLocal().url)
		            
		            pom.groupId = '«architecture.applicationId»'
					pom.artifactId = '«architecture.moduleName»-model-json'
					pom.version = '«architecture.version»'
		        }
		    }
		}
	'''
	
}
