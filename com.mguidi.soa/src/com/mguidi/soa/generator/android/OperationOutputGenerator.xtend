package com.mguidi.soa.generator.android

import com.google.inject.Inject
import com.mguidi.soa.generator.java.Utils
import com.mguidi.soa.soa.Operation

/**
 * 
 * @author Marco Guidi
 * 
 */
class OperationOutputGenerator {
	
	@Inject extension Utils utils
	@Inject extension ModelGenerator modelGenerator
	
	def generateOperationOutput(Operation operation) '''
		package «operation.packageNameOutput»;
		
		import android.os.Parcel;
		import android.os.Parcelable;
		
		public class «operation.classNameOutput» implements Parcelable {
			
			«FOR feature: operation.featuresOutput»
				public static final String «feature.key» = "«feature.name»";
			«ENDFOR»
			
			«FOR feature: operation.featuresOutput»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			public «operation.classNameOutput»() {
			}
			
			«FOR feature: operation.featuresOutput»
				public «operation.classNameOutput» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»; 
				}
				
			«ENDFOR»
			
			/************************ Parcel Serialization ************************/ 
			public static final Creator<«operation.classNameOutput»> CREATOR = new Creator<«operation.classNameOutput»>() {
				public «operation.classNameOutput» createFromParcel(Parcel in) {
					return new «operation.classNameOutput»(in);
				}
		
				public «operation.classNameOutput»[] newArray(int size) {
					return new «operation.classNameOutput»[size];
				}
			};
			
			private «operation.classNameOutput»(Parcel in) {
				«readParcel(operation.featuresOutput)»
			}
			
			@Override
			public void writeToParcel(Parcel dest, int flags) {
				«writeParcel(operation.featuresOutput)»
			}
			
			@Override
			public int describeContents() {
				return 0;
			}
			
		}
	'''
	
}
