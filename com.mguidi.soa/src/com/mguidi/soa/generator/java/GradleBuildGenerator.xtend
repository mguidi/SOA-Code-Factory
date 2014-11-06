package com.mguidi.soa.generator.java

import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import com.mguidi.soa.soa.Feature

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildModel(Architecture architecture, Resource resource) '''
		apply plugin: 'java'
		
		sourceCompatibility = 1.6
		
		repositories {
			mavenLocal()
			mavenCentral()
		}
		
		dependencies {
		    compile 'com.google.code.gson:gson:2.3'
		    «FOR dependency: dependencies(architecture, resource.allContents.toIterable.filter(typeof(Feature)))»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:"+dependency.version»'
		    «ENDFOR»
		}
		
		apply plugin: 'maven'

		uploadArchives {
		    repositories {
		        mavenDeployer {
		            repository(url: mavenLocal().url)
		            
		            pom.groupId = '«architecture.applicationId»'
					pom.artifactId = '«architecture.moduleName»-model'
					pom.version = '«architecture.version»'
		        }
		    }
		}
	'''
	
	def generateBuildService(Architecture architecture, Resource resource) '''
		apply plugin: 'java'
		
		sourceCompatibility = 1.6
		
		repositories {
			mavenLocal()
		    mavenCentral()
		}
		
		dependencies {
		    compile 'com.mguidi.soa:commons-service:1.0.0'
		    compile '«architecture.applicationId»:«architecture.moduleName»-model:«architecture.version»'
		    «FOR dependency: dependencies(architecture, resource.allContents.toIterable.filter(typeof(Feature)))»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:"+dependency.version»'
		    «ENDFOR»
		}
		
		apply plugin: 'maven'

		uploadArchives {
		    repositories {
		        mavenDeployer {
		            repository(url: mavenLocal().url)
		            
		            pom.groupId = '«architecture.applicationId»'
					pom.artifactId = '«architecture.moduleName»-service'
					pom.version = '«architecture.version»'
		        }
		    }
		}
	'''
	
}
