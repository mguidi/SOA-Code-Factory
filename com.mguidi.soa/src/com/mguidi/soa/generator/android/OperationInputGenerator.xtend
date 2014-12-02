package com.mguidi.soa.generator.android

import com.google.inject.Inject
import com.mguidi.soa.generator.java.Utils
import com.mguidi.soa.soa.Operation

/**
 * 
 * @author Marco Guidi
 * 
 */
class OperationInputGenerator {
	
	@Inject extension Utils utils
	@Inject extension ModelGenerator modelGenerator
	
	def generateOperationInput(Operation operation) '''
		package «operation.packageNameInput»;
		
		import android.os.Parcel;
		import android.os.Parcelable;
		
		public class «operation.classNameInput» implements Parcelable {
			
			«FOR feature: operation.featuresInput»
				public static final String «feature.key» = "«feature.name»";
			«ENDFOR»
			
			«FOR feature: operation.featuresInput»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			public «operation.classNameInput»() {
			}
			
			«FOR feature: operation.featuresInput»
				public «operation.classNameInput» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»; 
				}
				
			«ENDFOR»
			
			/************************ Parcel Serialization ************************/ 
			public static final Creator<«operation.classNameInput»> CREATOR = new Creator<«operation.classNameInput»>() {
				public «operation.classNameInput» createFromParcel(Parcel in) {
					return new «operation.classNameInput»(in);
				}
		
				public «operation.classNameInput»[] newArray(int size) {
					return new «operation.classNameInput»[size];
				}
			};
			
			private «operation.classNameInput»(Parcel in) {
				«readParcel(operation.featuresInput)»
			}
			
			@Override
			public void writeToParcel(Parcel dest, int flags) {
				«writeParcel(operation.featuresInput)»
			}
			
			@Override
			public int describeContents() {
				return 0;
			}
			
		}
	'''
	
}
