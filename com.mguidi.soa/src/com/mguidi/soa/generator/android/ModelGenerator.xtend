package com.mguidi.soa.generator.android

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject
import com.mguidi.soa.soa.GenericListFeature
import com.mguidi.soa.generator.java.Utils

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
				public static final String «feature.key» = "«feature.name»";
			«ENDFOR»
			
			«FOR feature: entity.features»
				«IF feature.featureComment.size == 1»
				
				// «feature.featureComment.get(0).clean»
				«ELSEIF feature.featureComment.size > 1»
				
				/*
				«FOR comment: feature.featureComment»
				* «comment.clean»
				«ENDFOR»
				*/
				«ENDIF»
				public «feature.type.declaration» «feature.name»;
			«ENDFOR»
			
			public «entity.className»() {
			}
			
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
				«FOR feature: entity.features»
				«IF feature.type instanceof GenericListFeature»
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				int «feature.name»Count«index» = in.readInt();
				if («feature.name»Count«index» >= 0) {
					«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.name»«index» = «(feature.type as GenericListFeature).createAtDepth(i)»;
					«IF i==0»
					«feature.name» = «feature.name»«index»;
					«ELSE»
					«feature.name»«index+1».add(«feature.name»«index»);
					«ENDIF»
					for (int i«index»=0; i«index» < «feature.name»Count«index»; i«index»++) {
				«ENDFOR»
						«feature.name»0.add((«(feature.type as GenericListFeature).baseType.declaration») in.readValue(«(feature.type as GenericListFeature).baseType.declaration».class.getClassLoader()));
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
					}
				}
				«ENDFOR»
				«ELSE»
				«feature.name» = («feature.type.declaration») in.readValue(«feature.type.declaration».class.getClassLoader());
				«ENDIF»
				«ENDFOR»
			}
			
			@Override
			public void writeToParcel(Parcel dest, int flags) {
				«FOR feature: entity.features»
				«IF feature.type instanceof GenericListFeature»
				
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
				«var index = (feature.type as GenericListFeature).depthToBaseType - i - 1»
				«IF i==0»
				«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.name»«index» = «feature.name»;
				«ELSE»
				«(feature.type as GenericListFeature).declarationAtDepth(i)» «feature.name»«index» = «feature.name»«index+1».get(i«index+1»);
				«ENDIF»
				if («feature.name»«index» != null) {
					int «feature.name»Count«index» = «feature.name»«index».size();
					dest.writeInt(«feature.name»Count«index»);
					for (int i«index»=0; i«index» < «feature.name»Count«index»; i«index»++) {
				«ENDFOR»	
						dest.writeValue(«feature.name»0.get(i0));
				«FOR i: 0 ..<(feature.type as GenericListFeature).depthToBaseType»
					}
				} else {
					dest.writeInt(-1);
				}
				«ENDFOR»	
				«ELSE»
				dest.writeValue(«feature.name»);
				«ENDIF»
				«ENDFOR»
			}
			
			@Override
			public int describeContents() {
				return 0;
			}
			
		}
	'''
	
}
