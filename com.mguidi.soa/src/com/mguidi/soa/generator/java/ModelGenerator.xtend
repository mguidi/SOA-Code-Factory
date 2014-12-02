package com.mguidi.soa.generator.java

import com.mguidi.soa.soa.Entity
import com.google.inject.Inject

class ModelGenerator {
	
	@Inject extension Utils utils
	
	def generateEnum(com.mguidi.soa.soa.Enum entity) '''
		package «entity.packageName»;
		
		public class «entity.className» {
			«FOR feature: entity.features»
			public static «entity.className» _«feature» = new «entity.className»("«feature»");
			«ENDFOR»
			public static «entity.className» _UNDEFINED_ = new «entity.className»("_UNDEFINED_");
			
			private final String mValue;

			private «entity.className»(String value) {
				mValue = value;
			}
			
			@Override
			public int hashCode() {
				return mValue.hashCode();
			}
			
			@Override
			public boolean equals(Object o) {
				if (o instanceof  «entity.className») {
					return mValue.equals(((«entity.className») o).mValue);
					
				} else {
					return false;
				}
			}
			
			@Override
		    public String toString() {
		        return mValue;
		    }
			
			public static «entity.className» valueOf(String value) {
				if (value == null) {
					return null;
				}
				
				«FOR feature: entity.features»
				«IF feature == entity.features.get(0)»
				if (value.equals("«feature»")) {
				«ELSE»
				} else if (value.equals("«feature»")) {
				«ENDIF»
					return _«feature»;
				«ENDFOR»
				} else {
					return _UNDEFINED_;
				}
			}
		}
	'''
	
	def generateEntity(Entity entity) '''
		package «entity.packageName»;
		
		public class «entity.className» {
			
			«FOR feature: entity.features»
				public static final String «feature.key» = "«feature.keyValue»";
			«ENDFOR»
			
			«FOR feature: entity.features»
				protected «feature.type.declaration» «feature.featureName»;
			«ENDFOR»
			
			«FOR feature: entity.features»
				public «feature.type.declaration» «feature.featureGetterName»() {
					return «feature.featureName»;
				}
				
				public «entity.className» «feature.featureSetterName»(«feature.type.declaration» value) {
					«feature.featureName» = value;
					return this;
				}
				
			«ENDFOR»
			
		}
	'''
	
}
