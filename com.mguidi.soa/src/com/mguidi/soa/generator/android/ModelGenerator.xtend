package com.mguidi.soa.generator.android

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.soa.GenericListFeature
import com.mguidi.soa.generator.java.Utils
import java.util.List
import com.mguidi.soa.soa.Feature

class ModelGenerator extends com.mguidi.soa.generator.java.ModelGenerator {
	
	@Inject extension Utils utils
	
	override generateEntity(Entity entity) '''
		package «entity.packageName»;
		
		import android.os.Parcel;
		import android.os.Parcelable;
		
		/**
		*
		* «entity.className»
		*
		*/
		public class «entity.className» implements Parcelable {
			
			«FOR feature: entity.features»
				public static final String «feature.key» = "«feature.keyValue»";
			«ENDFOR»
			
			«FOR feature: entity.features»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			public «entity.className»() {
			}
			
			«FOR feature: entity.features»
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»;
				}
				
				public «entity.className» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
			«ENDFOR»
			
			/************************ Parcel Serialization ************************/ 
			public static final Creator<«entity.className»> CREATOR = new Creator<«entity.className»>() {
				public «entity.className» createFromParcel(Parcel in) {
					return new «entity.className»(in);
				}
		
				public «entity.className»[] newArray(int size) {
					return new «entity.className»[size];
				}
			};
			
			private «entity.className»(Parcel in) {
				«readParcel(entity.features)»
			}
			
			@Override
			public void writeToParcel(Parcel dest, int flags) {
				«writeParcel(entity.features)»
			}
			
			@Override
			public int describeContents() {
				return 0;
			}
			
		}
	'''
	
	def readParcel(List<Feature> features) '''
		«FOR feature: features»
		«IF feature.type instanceof GenericListFeature»
		«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
		«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
		int «feature.featureName»Count«index» = in.readInt();
		if («feature.featureName»Count«index» >= 0) {
			«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.featureName»«index» = «(feature.type as GenericListFeature).createAtDepth(i)»;
			«IF i==0»
			«feature.featureName» = «feature.featureName»«index»;
			«ELSE»
			«feature.featureName»«index+1».add(«feature.featureName»«index»);
			«ENDIF»
			for (int i«index»=0; i«index» < «feature.featureName»Count«index»; i«index»++) {
		«ENDFOR»
				«feature.featureName»0.add((«(feature.type as GenericListFeature).baseType.declaration») in.readValue(«(feature.type as GenericListFeature).baseType.declaration».class.getClassLoader()));
		«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
		}
		«ENDFOR»
		«ELSE»
		«feature.featureName» = («feature.type.declaration») in.readValue(«feature.type.declaration».class.getClassLoader());
		«ENDIF»
		«ENDFOR»
	'''
	
	def writeParcel(List<Feature> features) '''
		«FOR feature: features»
		«IF feature.type instanceof GenericListFeature»
		
		«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
		«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
		«IF i==0»
		«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.featureName»«index» = «feature.featureName»;
		«ELSE»
		«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.featureName»«index» = «feature.featureName»«index+1».get(i«index+1»);
		«ENDIF»
		if («feature.featureName»«index» != null) {
			int «feature.featureName»Count«index» = «feature.featureName»«index».size();
			dest.writeInt(«feature.featureName»Count«index»);
			for (int i«index»=0; i«index» < «feature.featureName»Count«index»; i«index»++) {
		«ENDFOR»	
				dest.writeValue(«feature.featureName»0.get(i0));
		«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
			}
		} else {
			dest.writeInt(-1);
		}
		«ENDFOR»	
		«ELSE»
		dest.writeValue(«feature.featureName»);
		«ENDIF»
		«ENDFOR»
	'''
	
}
