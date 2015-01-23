package com.mguidi.soa.generator.android.jsonhelper

import com.mguidi.soa.soa.Architecture
import com.mguidi.soa.generator.java.Utils
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import com.mguidi.soa.generator.Libraries

class GradleBuildGenerator {
	
	@Inject extension Utils utils
	
	def generateBuildModelJson(Architecture architecture, Resource resource) '''
		apply plugin: 'com.android.library'
		
		buildscript {
		    repositories {
		        jcenter()
		    }
		    dependencies {
		        classpath '«Libraries.GRADLE»'
		    }
		}
		
		android {
		    compileSdkVersion «Libraries.COMPILE_SDK_VERSION»
		    buildToolsVersion "«Libraries.BUILD_TOOLS_VERSIONE»"
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
			jcenter()
		}
		
		dependencies {
		    compile '«Libraries.GSON»'
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
