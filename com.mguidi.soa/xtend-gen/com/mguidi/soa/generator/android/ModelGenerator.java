package com.mguidi.soa.generator.android;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
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
    _builder.append("/**");
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.append("* ");
    String _className = this.utils.className(entity);
    _builder.append(_className, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _className_1 = this.utils.className(entity);
    _builder.append(_className_1, "");
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
        {
          EList<Comment> _featureComment = feature_1.getFeatureComment();
          int _size = _featureComment.size();
          boolean _equals = (_size == 1);
          if (_equals) {
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("// ");
            EList<Comment> _featureComment_1 = feature_1.getFeatureComment();
            Comment _get = _featureComment_1.get(0);
            String _clean = this.utils.clean(_get);
            _builder.append(_clean, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            EList<Comment> _featureComment_2 = feature_1.getFeatureComment();
            int _size_1 = _featureComment_2.size();
            boolean _greaterThan = (_size_1 > 1);
            if (_greaterThan) {
              _builder.append("\t");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("/*");
              _builder.newLine();
              {
                EList<Comment> _featureComment_3 = feature_1.getFeatureComment();
                for(final Comment comment : _featureComment_3) {
                  _builder.append("\t");
                  _builder.append("* ");
                  String _clean_1 = this.utils.clean(comment);
                  _builder.append(_clean_1, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t");
              _builder.append("*/");
              _builder.newLine();
            }
          }
        }
        _builder.append("\t");
        _builder.append("public ");
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
    String _className_2 = this.utils.className(entity);
    _builder.append(_className_2, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
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
    {
      EList<Feature> _features_2 = entity.getFeatures();
      for(final Feature feature_2 : _features_2) {
        {
          FeatureType _type_1 = feature_2.getType();
          if ((_type_1 instanceof GenericListFeature)) {
            {
              FeatureType _type_2 = feature_2.getType();
              int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_2));
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType, true);
              for(final Integer i : _doubleDotLessThan) {
                _builder.append("\t\t");
                FeatureType _type_3 = feature_2.getType();
                int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_3));
                int _minus = (_depthToBaseType_1 - (i).intValue());
                int index = (_minus - 1);
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("int ");
                String _featureName_1 = this.utils.featureName(feature_2);
                _builder.append(_featureName_1, "\t\t");
                _builder.append("Count");
                _builder.append(index, "\t\t");
                _builder.append(" = in.readInt();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("if (");
                String _featureName_2 = this.utils.featureName(feature_2);
                _builder.append(_featureName_2, "\t\t");
                _builder.append("Count");
                _builder.append(index, "\t\t");
                _builder.append(" >= 0) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                FeatureType _type_4 = feature_2.getType();
                String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_4), (i).intValue());
                _builder.append(_declarationAtDepth, "\t\t\t");
                _builder.append(" ");
                String _featureName_3 = this.utils.featureName(feature_2);
                _builder.append(_featureName_3, "\t\t\t");
                _builder.append(index, "\t\t\t");
                _builder.append(" = ");
                FeatureType _type_5 = feature_2.getType();
                String _createAtDepth = this.utils.createAtDepth(((GenericListFeature) _type_5), (i).intValue());
                _builder.append(_createAtDepth, "\t\t\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                {
                  if (((i).intValue() == 0)) {
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _featureName_4 = this.utils.featureName(feature_2);
                    _builder.append(_featureName_4, "\t\t\t");
                    _builder.append(" = ");
                    String _featureName_5 = this.utils.featureName(feature_2);
                    _builder.append(_featureName_5, "\t\t\t");
                    _builder.append(index, "\t\t\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _featureName_6 = this.utils.featureName(feature_2);
                    _builder.append(_featureName_6, "\t\t\t");
                    _builder.append((index + 1), "\t\t\t");
                    _builder.append(".add(");
                    String _featureName_7 = this.utils.featureName(feature_2);
                    _builder.append(_featureName_7, "\t\t\t");
                    _builder.append(index, "\t\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("for (int i");
                _builder.append(index, "\t\t\t");
                _builder.append("=0; i");
                _builder.append(index, "\t\t\t");
                _builder.append(" < ");
                String _featureName_8 = this.utils.featureName(feature_2);
                _builder.append(_featureName_8, "\t\t\t");
                _builder.append("Count");
                _builder.append(index, "\t\t\t");
                _builder.append("; i");
                _builder.append(index, "\t\t\t");
                _builder.append("++) {");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            String _featureName_9 = this.utils.featureName(feature_2);
            _builder.append(_featureName_9, "\t\t\t\t");
            _builder.append("0.add((");
            FeatureType _type_6 = feature_2.getType();
            FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_6));
            String _declaration_1 = this.utils.declaration(_baseType);
            _builder.append(_declaration_1, "\t\t\t\t");
            _builder.append(") in.readValue(");
            FeatureType _type_7 = feature_2.getType();
            FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_7));
            String _declaration_2 = this.utils.declaration(_baseType_1);
            _builder.append(_declaration_2, "\t\t\t\t");
            _builder.append(".class.getClassLoader()));");
            _builder.newLineIfNotEmpty();
            {
              FeatureType _type_8 = feature_2.getType();
              int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_8));
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_2, true);
              for(final Integer i_1 : _doubleDotLessThan_1) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          } else {
            _builder.append("\t\t");
            String _featureName_10 = this.utils.featureName(feature_2);
            _builder.append(_featureName_10, "\t\t");
            _builder.append(" = (");
            FeatureType _type_9 = feature_2.getType();
            String _declaration_3 = this.utils.declaration(_type_9);
            _builder.append(_declaration_3, "\t\t");
            _builder.append(") in.readValue(");
            FeatureType _type_10 = feature_2.getType();
            String _declaration_4 = this.utils.declaration(_type_10);
            _builder.append(_declaration_4, "\t\t");
            _builder.append(".class.getClassLoader());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
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
    {
      EList<Feature> _features_3 = entity.getFeatures();
      for(final Feature feature_3 : _features_3) {
        {
          FeatureType _type_11 = feature_3.getType();
          if ((_type_11 instanceof GenericListFeature)) {
            _builder.append("\t\t");
            _builder.newLine();
            {
              FeatureType _type_12 = feature_3.getType();
              int _depthToBaseType_3 = this.utils.depthToBaseType(((GenericListFeature) _type_12));
              ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _depthToBaseType_3, true);
              for(final Integer i_2 : _doubleDotLessThan_2) {
                _builder.append("\t\t");
                FeatureType _type_13 = feature_3.getType();
                int _depthToBaseType_4 = this.utils.depthToBaseType(((GenericListFeature) _type_13));
                int _minus_1 = (_depthToBaseType_4 - (i_2).intValue());
                int index_1 = (_minus_1 - 1);
                _builder.newLineIfNotEmpty();
                {
                  if (((i_2).intValue() == 0)) {
                    _builder.append("\t\t");
                    FeatureType _type_14 = feature_3.getType();
                    String _declarationAtDepth_1 = this.utils.declarationAtDepth(((GenericListFeature) _type_14), (i_2).intValue());
                    _builder.append(_declarationAtDepth_1, "\t\t");
                    _builder.append(" ");
                    String _featureName_11 = this.utils.featureName(feature_3);
                    _builder.append(_featureName_11, "\t\t");
                    _builder.append(index_1, "\t\t");
                    _builder.append(" = ");
                    String _featureName_12 = this.utils.featureName(feature_3);
                    _builder.append(_featureName_12, "\t\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    FeatureType _type_15 = feature_3.getType();
                    String _declarationAtDepth_2 = this.utils.declarationAtDepth(((GenericListFeature) _type_15), (i_2).intValue());
                    _builder.append(_declarationAtDepth_2, "\t\t");
                    _builder.append(" ");
                    String _featureName_13 = this.utils.featureName(feature_3);
                    _builder.append(_featureName_13, "\t\t");
                    _builder.append(index_1, "\t\t");
                    _builder.append(" = ");
                    String _featureName_14 = this.utils.featureName(feature_3);
                    _builder.append(_featureName_14, "\t\t");
                    _builder.append((index_1 + 1), "\t\t");
                    _builder.append(".get(i");
                    _builder.append((index_1 + 1), "\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t\t");
                _builder.append("if (");
                String _featureName_15 = this.utils.featureName(feature_3);
                _builder.append(_featureName_15, "\t\t");
                _builder.append(index_1, "\t\t");
                _builder.append(" != null) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("int ");
                String _featureName_16 = this.utils.featureName(feature_3);
                _builder.append(_featureName_16, "\t\t\t");
                _builder.append("Count");
                _builder.append(index_1, "\t\t\t");
                _builder.append(" = ");
                String _featureName_17 = this.utils.featureName(feature_3);
                _builder.append(_featureName_17, "\t\t\t");
                _builder.append(index_1, "\t\t\t");
                _builder.append(".size();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("dest.writeInt(");
                String _featureName_18 = this.utils.featureName(feature_3);
                _builder.append(_featureName_18, "\t\t\t");
                _builder.append("Count");
                _builder.append(index_1, "\t\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("for (int i");
                _builder.append(index_1, "\t\t\t");
                _builder.append("=0; i");
                _builder.append(index_1, "\t\t\t");
                _builder.append(" < ");
                String _featureName_19 = this.utils.featureName(feature_3);
                _builder.append(_featureName_19, "\t\t\t");
                _builder.append("Count");
                _builder.append(index_1, "\t\t\t");
                _builder.append("; i");
                _builder.append(index_1, "\t\t\t");
                _builder.append("++) {");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("dest.writeValue(");
            String _featureName_20 = this.utils.featureName(feature_3);
            _builder.append(_featureName_20, "\t\t\t\t");
            _builder.append("0.get(i0));");
            _builder.newLineIfNotEmpty();
            {
              FeatureType _type_16 = feature_3.getType();
              int _depthToBaseType_5 = this.utils.depthToBaseType(((GenericListFeature) _type_16));
              ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _depthToBaseType_5, true);
              for(final Integer i_3 : _doubleDotLessThan_3) {
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("} else {");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("dest.writeInt(-1);");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          } else {
            _builder.append("\t\t");
            _builder.append("dest.writeValue(");
            String _featureName_21 = this.utils.featureName(feature_3);
            _builder.append(_featureName_21, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
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
}
