package com.mguidi.soa.generator.android;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModelGenerator extends com.mguidi.soa.generator.java.ModelGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = this.utils.packageName(entity);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.os.Parcel;");
    _builder.newLine();
    _builder.append("import android.os.Parcelable;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.utils.className(entity);
    _builder.append(_className, "");
    _builder.append(" implements Parcelable {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Feature> _features = entity.getFeatures();
      for(final Feature feature : _features) {
        _builder.append("\t");
        _builder.append("public static final String ");
        String _key = this.utils.key(feature);
        _builder.append(_key, "\t");
        _builder.append(" = \"");
        String _keyValue = this.utils.keyValue(feature);
        _builder.append(_keyValue, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Feature> _features_1 = entity.getFeatures();
      for(final Feature feature_1 : _features_1) {
        _builder.append("\t");
        _builder.append("protected ");
        FeatureType _type = feature_1.getType();
        String _declaration = this.utils.declaration(_type);
        _builder.append(_declaration, "\t");
        _builder.append(" ");
        String _featureName = this.utils.featureName(feature_1);
        _builder.append(_featureName, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _className_1 = this.utils.className(entity);
    _builder.append(_className_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Feature> _features_2 = entity.getFeatures();
      for(final Feature feature_2 : _features_2) {
        _builder.append("\t");
        _builder.append("public ");
        FeatureType _type_1 = feature_2.getType();
        String _declaration_1 = this.utils.declaration(_type_1);
        _builder.append(_declaration_1, "\t");
        _builder.append(" ");
        String _featureGetterName = this.utils.featureGetterName(feature_2);
        _builder.append(_featureGetterName, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _featureName_1 = this.utils.featureName(feature_2);
        _builder.append(_featureName_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _className_2 = this.utils.className(entity);
        _builder.append(_className_2, "\t");
        _builder.append(" ");
        String _featureSetterName = this.utils.featureSetterName(feature_2);
        _builder.append(_featureSetterName, "\t");
        _builder.append("(");
        FeatureType _type_2 = feature_2.getType();
        String _declaration_2 = this.utils.declaration(_type_2);
        _builder.append(_declaration_2, "\t");
        _builder.append(" value) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        String _featureName_2 = this.utils.featureName(feature_2);
        _builder.append(_featureName_2, "\t\t");
        _builder.append(" = value;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/************************ Parcel Serialization ************************/ ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final Creator<");
    String _className_3 = this.utils.className(entity);
    _builder.append(_className_3, "\t");
    _builder.append("> CREATOR = new Creator<");
    String _className_4 = this.utils.className(entity);
    _builder.append(_className_4, "\t");
    _builder.append(">() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("public ");
    String _className_5 = this.utils.className(entity);
    _builder.append(_className_5, "\t\t");
    _builder.append(" createFromParcel(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return new ");
    String _className_6 = this.utils.className(entity);
    _builder.append(_className_6, "\t\t\t");
    _builder.append("(in);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    String _className_7 = this.utils.className(entity);
    _builder.append(_className_7, "\t\t");
    _builder.append("[] newArray(int size) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return new ");
    String _className_8 = this.utils.className(entity);
    _builder.append(_className_8, "\t\t\t");
    _builder.append("[size];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _className_9 = this.utils.className(entity);
    _builder.append(_className_9, "\t");
    _builder.append("(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    EList<Feature> _features_3 = entity.getFeatures();
    CharSequence _readParcel = this.readParcel(_features_3);
    _builder.append(_readParcel, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void writeToParcel(Parcel dest, int flags) {");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Feature> _features_4 = entity.getFeatures();
    CharSequence _writeParcel = this.writeParcel(_features_4);
    _builder.append(_writeParcel, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int describeContents() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence readParcel(final List<Feature> features) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Feature feature : features) {
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof GenericListFeature)) {
            {
              FeatureType _type_1 = feature.getType();
              int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_1));
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType, true);
              for(final Integer i : _doubleDotLessThan) {
                FeatureType _type_2 = feature.getType();
                int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_2));
                int _minus = (_depthToBaseType_1 - (i).intValue());
                int index = (_minus - 1);
                _builder.newLineIfNotEmpty();
                _builder.append("int ");
                String _featureName = this.utils.featureName(feature);
                _builder.append(_featureName, "");
                _builder.append("Count");
                _builder.append(index, "");
                _builder.append(" = in.readInt();");
                _builder.newLineIfNotEmpty();
                _builder.append("if (");
                String _featureName_1 = this.utils.featureName(feature);
                _builder.append(_featureName_1, "");
                _builder.append("Count");
                _builder.append(index, "");
                _builder.append(" >= 0) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                FeatureType _type_3 = feature.getType();
                String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_3), (i).intValue());
                _builder.append(_declarationAtDepth, "\t");
                _builder.append(" ");
                String _featureName_2 = this.utils.featureName(feature);
                _builder.append(_featureName_2, "\t");
                _builder.append(index, "\t");
                _builder.append(" = ");
                FeatureType _type_4 = feature.getType();
                String _createAtDepth = this.utils.createAtDepth(((GenericListFeature) _type_4), (i).intValue());
                _builder.append(_createAtDepth, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                {
                  if (((i).intValue() == 0)) {
                    _builder.append("\t");
                    String _featureName_3 = this.utils.featureName(feature);
                    _builder.append(_featureName_3, "\t");
                    _builder.append(" = ");
                    String _featureName_4 = this.utils.featureName(feature);
                    _builder.append(_featureName_4, "\t");
                    _builder.append(index, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    String _featureName_5 = this.utils.featureName(feature);
                    _builder.append(_featureName_5, "\t");
                    _builder.append((index + 1), "\t");
                    _builder.append(".add(");
                    String _featureName_6 = this.utils.featureName(feature);
                    _builder.append(_featureName_6, "\t");
                    _builder.append(index, "\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("for (int i");
                _builder.append(index, "\t");
                _builder.append("=0; i");
                _builder.append(index, "\t");
                _builder.append(" < ");
                String _featureName_7 = this.utils.featureName(feature);
                _builder.append(_featureName_7, "\t");
                _builder.append("Count");
                _builder.append(index, "\t");
                _builder.append("; i");
                _builder.append(index, "\t");
                _builder.append("++) {");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            String _featureName_8 = this.utils.featureName(feature);
            _builder.append(_featureName_8, "\t\t");
            _builder.append("0.add((");
            FeatureType _type_5 = feature.getType();
            FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_5));
            String _declaration = this.utils.declaration(_baseType);
            _builder.append(_declaration, "\t\t");
            _builder.append(") in.readValue(");
            FeatureType _type_6 = feature.getType();
            FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_6));
            String _declaration_1 = this.utils.declaration(_baseType_1);
            _builder.append(_declaration_1, "\t\t");
            _builder.append(".class.getClassLoader()));");
            _builder.newLineIfNotEmpty();
            {
              FeatureType _type_7 = feature.getType();
              int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_7));
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_2, true);
              for(final Integer i_1 : _doubleDotLessThan_1) {
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
          } else {
            String _featureName_9 = this.utils.featureName(feature);
            _builder.append(_featureName_9, "");
            _builder.append(" = (");
            FeatureType _type_8 = feature.getType();
            String _declaration_2 = this.utils.declaration(_type_8);
            _builder.append(_declaration_2, "");
            _builder.append(") in.readValue(");
            FeatureType _type_9 = feature.getType();
            String _declaration_3 = this.utils.declaration(_type_9);
            _builder.append(_declaration_3, "");
            _builder.append(".class.getClassLoader());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence writeParcel(final List<Feature> features) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Feature feature : features) {
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof GenericListFeature)) {
            _builder.newLine();
            {
              FeatureType _type_1 = feature.getType();
              int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_1));
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType, true);
              for(final Integer i : _doubleDotLessThan) {
                FeatureType _type_2 = feature.getType();
                int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_2));
                int _minus = (_depthToBaseType_1 - (i).intValue());
                int index = (_minus - 1);
                _builder.newLineIfNotEmpty();
                {
                  if (((i).intValue() == 0)) {
                    FeatureType _type_3 = feature.getType();
                    String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_3), (i).intValue());
                    _builder.append(_declarationAtDepth, "");
                    _builder.append(" ");
                    String _featureName = this.utils.featureName(feature);
                    _builder.append(_featureName, "");
                    _builder.append(index, "");
                    _builder.append(" = ");
                    String _featureName_1 = this.utils.featureName(feature);
                    _builder.append(_featureName_1, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    FeatureType _type_4 = feature.getType();
                    String _declarationAtDepth_1 = this.utils.declarationAtDepth(((GenericListFeature) _type_4), (i).intValue());
                    _builder.append(_declarationAtDepth_1, "");
                    _builder.append(" ");
                    String _featureName_2 = this.utils.featureName(feature);
                    _builder.append(_featureName_2, "");
                    _builder.append(index, "");
                    _builder.append(" = ");
                    String _featureName_3 = this.utils.featureName(feature);
                    _builder.append(_featureName_3, "");
                    _builder.append((index + 1), "");
                    _builder.append(".get(i");
                    _builder.append((index + 1), "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("if (");
                String _featureName_4 = this.utils.featureName(feature);
                _builder.append(_featureName_4, "");
                _builder.append(index, "");
                _builder.append(" != null) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("int ");
                String _featureName_5 = this.utils.featureName(feature);
                _builder.append(_featureName_5, "\t");
                _builder.append("Count");
                _builder.append(index, "\t");
                _builder.append(" = ");
                String _featureName_6 = this.utils.featureName(feature);
                _builder.append(_featureName_6, "\t");
                _builder.append(index, "\t");
                _builder.append(".size();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("dest.writeInt(");
                String _featureName_7 = this.utils.featureName(feature);
                _builder.append(_featureName_7, "\t");
                _builder.append("Count");
                _builder.append(index, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("for (int i");
                _builder.append(index, "\t");
                _builder.append("=0; i");
                _builder.append(index, "\t");
                _builder.append(" < ");
                String _featureName_8 = this.utils.featureName(feature);
                _builder.append(_featureName_8, "\t");
                _builder.append("Count");
                _builder.append(index, "\t");
                _builder.append("; i");
                _builder.append(index, "\t");
                _builder.append("++) {");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("dest.writeValue(");
            String _featureName_9 = this.utils.featureName(feature);
            _builder.append(_featureName_9, "\t\t");
            _builder.append("0.get(i0));");
            _builder.newLineIfNotEmpty();
            {
              FeatureType _type_5 = feature.getType();
              int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_5));
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_2, true);
              for(final Integer i_1 : _doubleDotLessThan_1) {
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("dest.writeInt(-1);");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
          } else {
            _builder.append("dest.writeValue(");
            String _featureName_10 = this.utils.featureName(feature);
            _builder.append(_featureName_10, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
