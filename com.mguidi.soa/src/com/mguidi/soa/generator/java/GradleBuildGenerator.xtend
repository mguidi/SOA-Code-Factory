package com.mguidi.soa.generator.java

import com.mguidi.soa.soa.Architecture
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildModel(Architecture architecture, Resource resource) '''
		apply plugin: 'java'
		
		sourceCompatibility = 1.6
		
		repositories {
			mavenLocal()
			mavenCentral()
		}
		«IF architecture.modelDependencies.size > 0»
		
		dependencies {
		    «FOR dependency: architecture.modelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:"+dependency.version»'
		    «ENDFOR»
		}
		«ENDIF»
		
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
		    «IF architecture.module.model != null»
		    compile '«architecture.applicationId»:«architecture.moduleName»-model:«architecture.version»'
		    «ENDIF»
		    «FOR dependency: architecture.serviceModelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:"+dependency.version»'
		    «ENDFOR»
		    «FOR dependency: architecture.serviceExceptionDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-service:"+dependency.version»'
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
