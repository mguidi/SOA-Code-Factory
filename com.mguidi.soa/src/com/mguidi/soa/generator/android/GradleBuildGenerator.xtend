package com.mguidi.soa.generator.android

import com.mguidi.soa.soa.Architecture
import com.mguidi.soa.generator.java.Utils
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildModel(Architecture architecture, Resource resource) '''
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
		«IF architecture.modelDependencies.size > 0»
		
		dependencies {
		    «FOR dependency: architecture.modelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:android_"+dependency.version»'
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
					pom.version = 'android_«architecture.version»'
		        }
		    }
		}
		
	'''
	
	def generateBuildService(Architecture architecture, Resource resource) '''
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
		    compile 'com.mguidi.soa:commons-service:1.0.0'
		    compile '«architecture.applicationId»:«architecture.moduleName»-model:android_«architecture.version»'
		    «FOR dependency: architecture.serviceModelDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-model:android_"+dependency.version»'
		    «ENDFOR»
		    «FOR dependency: architecture.serviceExceptionDependencies»
		    compile '«dependency.applicationId+":"+dependency.moduleName+"-service:android_"+dependency.version»'
		    «ENDFOR»
		}
		
		apply plugin: 'maven'
		
		uploadArchives {
		    repositories {
		        mavenDeployer {
		            repository(url: mavenLocal().url)
		            
		            pom.groupId = '«architecture.applicationId»'
					pom.artifactId = '«architecture.moduleName»-service'
					pom.version = 'android_«architecture.version»'
		        }
		    }
		}
	'''
	
}
