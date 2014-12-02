package com.mguidi.soa.generator.java.jsonhelper;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.EntitiesFeature;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.GenericListFeature;
import com.mguidi.soa.soa.PrimitiveFeature;
import com.mguidi.soa.soa.PrimitiveType;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EntityJsonHelperGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  public CharSequence generateJsonHelper(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameHelper = this.utils.packageNameHelper(entity);
    _builder.append(_packageNameHelper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.gson.stream.JsonReader;");
    _builder.newLine();
    _builder.append("import com.google.gson.stream.JsonToken;");
    _builder.newLine();
    _builder.append("import com.google.gson.stream.JsonWriter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedClassName = this.utils.qualifiedClassName(entity);
    _builder.append(_qualifiedClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _classNameHelper = this.utils.classNameHelper(entity);
    _builder.append(_classNameHelper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _qualifiedClassName_1 = this.utils.qualifiedClassName(entity);
    _builder.append(_qualifiedClassName_1, "\t");
    _builder.append(" fromJson(JsonReader reader) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String key;");
    _builder.newLine();
    _builder.append("\t\t");
    String _className = this.utils.className(entity);
    _builder.append(_className, "\t\t");
    _builder.append(" obj = new ");
    String _className_1 = this.utils.className(entity);
    _builder.append(_className_1, "\t\t");
    _builder.append("(); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("reader.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _className_2 = this.utils.className(entity);
    EList<Feature> _features = entity.getFeatures();
    CharSequence _readFeatures = this.readFeatures(_className_2, _features);
    _builder.append(_readFeatures, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("reader.endObject();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return obj;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void writeJson(");
    String _qualifiedClassName_2 = this.utils.qualifiedClassName(entity);
    _builder.append(_qualifiedClassName_2, "\t");
    _builder.append(" obj, JsonWriter writer) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("writer.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _className_3 = this.utils.className(entity);
    EList<Feature> _features_1 = entity.getFeatures();
    CharSequence _writeFeatures = this.writeFeatures(_className_3, _features_1);
    _builder.append(_writeFeatures, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("writer.endObject();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence readFeatures(final String className, final List<Feature> features) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while (reader.hasNext()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("key = reader.nextName();");
    _builder.newLine();
    {
      for(final Feature feature : features) {
        {
          Feature _get = features.get(0);
          boolean _equals = Objects.equal(feature, _get);
          if (_equals) {
            _builder.append("\t");
            _builder.append("if (key.equals(");
            _builder.append(className, "\t");
            _builder.append(".");
            String _key = this.utils.key(feature);
            _builder.append(_key, "\t");
            _builder.append(")) {");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("else if (key.equals(");
            _builder.append(className, "\t");
            _builder.append(".");
            String _key_1 = this.utils.key(feature);
            _builder.append(_key_1, "\t");
            _builder.append(")) {");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (reader.peek() == JsonToken.NULL) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("reader.skipValue();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof EntitiesFeature)) {
            {
              FeatureType _type_1 = feature.getType();
              Entities _type_2 = ((EntitiesFeature) _type_1).getType();
              if ((_type_2 instanceof Entity)) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("obj.");
                String _featureSetterName = this.utils.featureSetterName(feature);
                _builder.append(_featureSetterName, "\t\t\t");
                _builder.append("(");
                FeatureType _type_3 = feature.getType();
                Entities _type_4 = ((EntitiesFeature) _type_3).getType();
                String _qualifiedClassNameHelper = this.utils.qualifiedClassNameHelper(_type_4);
                _builder.append(_qualifiedClassNameHelper, "\t\t\t");
                _builder.append(".fromJson(reader));");
                _builder.newLineIfNotEmpty();
              } else {
                FeatureType _type_5 = feature.getType();
                Entities _type_6 = ((EntitiesFeature) _type_5).getType();
                if ((_type_6 instanceof com.mguidi.soa.soa.Enum)) {
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("obj.");
                  String _featureSetterName_1 = this.utils.featureSetterName(feature);
                  _builder.append(_featureSetterName_1, "\t\t\t\t");
                  _builder.append("(");
                  FeatureType _type_7 = feature.getType();
                  Entities _type_8 = ((EntitiesFeature) _type_7).getType();
                  String _nextValue = this.nextValue(((com.mguidi.soa.soa.Enum) _type_8));
                  _builder.append(_nextValue, "\t\t\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("} catch (java.lang.IllegalArgumentException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("obj.");
                  String _featureSetterName_2 = this.utils.featureSetterName(feature);
                  _builder.append(_featureSetterName_2, "\t\t\t\t");
                  _builder.append("(");
                  FeatureType _type_9 = feature.getType();
                  Entities _type_10 = ((EntitiesFeature) _type_9).getType();
                  String _qualifiedClassName = this.utils.qualifiedClassName(_type_10);
                  _builder.append(_qualifiedClassName, "\t\t\t\t");
                  _builder.append("._UNDEFINED_);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          } else {
            FeatureType _type_11 = feature.getType();
            if ((_type_11 instanceof PrimitiveFeature)) {
              {
                FeatureType _type_12 = feature.getType();
                PrimitiveType _type_13 = ((PrimitiveFeature) _type_12).getType();
                boolean _equals_1 = Objects.equal(_type_13, PrimitiveType.DECIMAL);
                if (_equals_1) {
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("try {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("obj.");
                  String _featureSetterName_3 = this.utils.featureSetterName(feature);
                  _builder.append(_featureSetterName_3, "\t\t\t\t");
                  _builder.append("(");
                  FeatureType _type_14 = feature.getType();
                  PrimitiveType _type_15 = ((PrimitiveFeature) _type_14).getType();
                  String _nextValue_1 = this.nextValue(_type_15);
                  _builder.append(_nextValue_1, "\t\t\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("} catch (java.lang.NumberFormatException e) {");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  FeatureType _type_16 = feature.getType();
                  PrimitiveType _type_17 = ((PrimitiveFeature) _type_16).getType();
                  boolean _equals_2 = Objects.equal(_type_17, PrimitiveType.DATE);
                  if (_equals_2) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("try {");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("obj.");
                    String _featureSetterName_4 = this.utils.featureSetterName(feature);
                    _builder.append(_featureSetterName_4, "\t\t\t\t");
                    _builder.append("(");
                    FeatureType _type_18 = feature.getType();
                    PrimitiveType _type_19 = ((PrimitiveFeature) _type_18).getType();
                    String _nextValue_2 = this.nextValue(_type_19);
                    _builder.append(_nextValue_2, "\t\t\t\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("} catch (java.text.ParseException e) {");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    FeatureType _type_20 = feature.getType();
                    PrimitiveType _type_21 = ((PrimitiveFeature) _type_20).getType();
                    boolean _equals_3 = Objects.equal(_type_21, PrimitiveType.DATETIME);
                    if (_equals_3) {
                      _builder.append("\t");
                      _builder.append("\t\t");
                      _builder.append("try {");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      _builder.append("\t");
                      _builder.append("obj.");
                      String _featureSetterName_5 = this.utils.featureSetterName(feature);
                      _builder.append(_featureSetterName_5, "\t\t\t\t");
                      _builder.append("(");
                      FeatureType _type_22 = feature.getType();
                      PrimitiveType _type_23 = ((PrimitiveFeature) _type_22).getType();
                      String _nextValue_3 = this.nextValue(_type_23);
                      _builder.append(_nextValue_3, "\t\t\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      _builder.append("} catch (java.text.ParseException e) {");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("\t\t");
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      FeatureType _type_24 = feature.getType();
                      PrimitiveType _type_25 = ((PrimitiveFeature) _type_24).getType();
                      boolean _equals_4 = Objects.equal(_type_25, PrimitiveType.TIMESTAMP);
                      if (_equals_4) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("try {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("obj.");
                        String _featureSetterName_6 = this.utils.featureSetterName(feature);
                        _builder.append(_featureSetterName_6, "\t\t\t\t");
                        _builder.append("(");
                        FeatureType _type_26 = feature.getType();
                        PrimitiveType _type_27 = ((PrimitiveFeature) _type_26).getType();
                        String _nextValue_4 = this.nextValue(_type_27);
                        _builder.append(_nextValue_4, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("} catch (java.text.ParseException e) {");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("obj.");
                        String _featureSetterName_7 = this.utils.featureSetterName(feature);
                        _builder.append(_featureSetterName_7, "\t\t\t");
                        _builder.append("(");
                        FeatureType _type_28 = feature.getType();
                        PrimitiveType _type_29 = ((PrimitiveFeature) _type_28).getType();
                        String _nextValue_5 = this.nextValue(_type_29);
                        _builder.append(_nextValue_5, "\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            } else {
              FeatureType _type_30 = feature.getType();
              if ((_type_30 instanceof GenericListFeature)) {
                {
                  FeatureType _type_31 = feature.getType();
                  int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_31));
                  ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType, true);
                  for(final Integer i : _doubleDotLessThan) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    FeatureType _type_32 = feature.getType();
                    int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_32));
                    int _minus = (_depthToBaseType_1 - (i).intValue());
                    int index = (_minus - 1);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t");
                    FeatureType _type_33 = feature.getType();
                    String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_33), (i).intValue());
                    _builder.append(_declarationAtDepth, "\t\t\t\t");
                    _builder.append(" list");
                    _builder.append(index, "\t\t\t\t");
                    _builder.append(" = ");
                    FeatureType _type_34 = feature.getType();
                    String _createAtDepth = this.utils.createAtDepth(((GenericListFeature) _type_34), (i).intValue());
                    _builder.append(_createAtDepth, "\t\t\t\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    {
                      if (((i).intValue() > 0)) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("list");
                        _builder.append((index + 1), "\t\t\t\t");
                        _builder.append(".add(list");
                        _builder.append(index, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("\t");
                        _builder.append("obj.");
                        String _featureSetterName_8 = this.utils.featureSetterName(feature);
                        _builder.append(_featureSetterName_8, "\t\t\t\t");
                        _builder.append("(list");
                        _builder.append(index, "\t\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("reader.beginArray();");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t");
                    _builder.append("while (reader.hasNext()) {");
                    _builder.newLine();
                  }
                }
                {
                  FeatureType _type_35 = feature.getType();
                  FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_35));
                  if ((_baseType instanceof EntitiesFeature)) {
                    {
                      FeatureType _type_36 = feature.getType();
                      FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_36));
                      Entities _type_37 = ((EntitiesFeature) _baseType_1).getType();
                      if ((_type_37 instanceof Entity)) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append("list0.add(");
                        FeatureType _type_38 = feature.getType();
                        FeatureType _baseType_2 = this.utils.baseType(((GenericListFeature) _type_38));
                        Entities _type_39 = ((EntitiesFeature) _baseType_2).getType();
                        String _qualifiedClassNameHelper_1 = this.utils.qualifiedClassNameHelper(_type_39);
                        _builder.append(_qualifiedClassNameHelper_1, "\t\t\t");
                        _builder.append(".fromJson(reader));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        FeatureType _type_40 = feature.getType();
                        FeatureType _baseType_3 = this.utils.baseType(((GenericListFeature) _type_40));
                        Entities _type_41 = ((EntitiesFeature) _baseType_3).getType();
                        if ((_type_41 instanceof com.mguidi.soa.soa.Enum)) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("list0.add(");
                          FeatureType _type_42 = feature.getType();
                          FeatureType _baseType_4 = this.utils.baseType(((GenericListFeature) _type_42));
                          Entities _type_43 = ((EntitiesFeature) _baseType_4).getType();
                          String _nextValue_6 = this.nextValue(((com.mguidi.soa.soa.Enum) _type_43));
                          _builder.append(_nextValue_6, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("} catch (java.lang.IllegalArgumentException e) {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("list0.add(");
                          FeatureType _type_44 = feature.getType();
                          FeatureType _baseType_5 = this.utils.baseType(((GenericListFeature) _type_44));
                          Entities _type_45 = ((EntitiesFeature) _baseType_5).getType();
                          String _qualifiedClassName_1 = this.utils.qualifiedClassName(_type_45);
                          _builder.append(_qualifiedClassName_1, "\t\t\t\t");
                          _builder.append("._UNDEFINED_);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("} ");
                          _builder.newLine();
                        }
                      }
                    }
                  } else {
                    FeatureType _type_46 = feature.getType();
                    FeatureType _baseType_6 = this.utils.baseType(((GenericListFeature) _type_46));
                    if ((_baseType_6 instanceof PrimitiveFeature)) {
                      {
                        FeatureType _type_47 = feature.getType();
                        FeatureType _baseType_7 = this.utils.baseType(((GenericListFeature) _type_47));
                        PrimitiveType _type_48 = ((PrimitiveFeature) _baseType_7).getType();
                        boolean _equals_5 = Objects.equal(_type_48, PrimitiveType.DECIMAL);
                        if (_equals_5) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("try {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("\t");
                          _builder.append("list0.add(");
                          FeatureType _type_49 = feature.getType();
                          FeatureType _baseType_8 = this.utils.baseType(((GenericListFeature) _type_49));
                          PrimitiveType _type_50 = ((PrimitiveFeature) _baseType_8).getType();
                          String _nextValue_7 = this.nextValue(_type_50);
                          _builder.append(_nextValue_7, "\t\t\t\t");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("} catch (java.lang.NumberFormatException e) {");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          FeatureType _type_51 = feature.getType();
                          FeatureType _baseType_9 = this.utils.baseType(((GenericListFeature) _type_51));
                          PrimitiveType _type_52 = ((PrimitiveFeature) _baseType_9).getType();
                          boolean _equals_6 = Objects.equal(_type_52, PrimitiveType.DATE);
                          if (_equals_6) {
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append("try {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append("\t");
                            _builder.append("list0.add(");
                            FeatureType _type_53 = feature.getType();
                            FeatureType _baseType_10 = this.utils.baseType(((GenericListFeature) _type_53));
                            PrimitiveType _type_54 = ((PrimitiveFeature) _baseType_10).getType();
                            String _nextValue_8 = this.nextValue(_type_54);
                            _builder.append(_nextValue_8, "\t\t\t\t");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append("} catch (java.text.ParseException e) {");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            FeatureType _type_55 = feature.getType();
                            FeatureType _baseType_11 = this.utils.baseType(((GenericListFeature) _type_55));
                            PrimitiveType _type_56 = ((PrimitiveFeature) _baseType_11).getType();
                            boolean _equals_7 = Objects.equal(_type_56, PrimitiveType.DATETIME);
                            if (_equals_7) {
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append("try {");
                              _builder.newLine();
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append("\t");
                              _builder.append("list0.add(");
                              FeatureType _type_57 = feature.getType();
                              FeatureType _baseType_12 = this.utils.baseType(((GenericListFeature) _type_57));
                              PrimitiveType _type_58 = ((PrimitiveFeature) _baseType_12).getType();
                              String _nextValue_9 = this.nextValue(_type_58);
                              _builder.append(_nextValue_9, "\t\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append("} catch (java.text.ParseException e) {");
                              _builder.newLine();
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              FeatureType _type_59 = feature.getType();
                              FeatureType _baseType_13 = this.utils.baseType(((GenericListFeature) _type_59));
                              PrimitiveType _type_60 = ((PrimitiveFeature) _baseType_13).getType();
                              boolean _equals_8 = Objects.equal(_type_60, PrimitiveType.TIMESTAMP);
                              if (_equals_8) {
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append("try {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append("\t");
                                _builder.append("list0.add(");
                                FeatureType _type_61 = feature.getType();
                                FeatureType _baseType_14 = this.utils.baseType(((GenericListFeature) _type_61));
                                PrimitiveType _type_62 = ((PrimitiveFeature) _baseType_14).getType();
                                String _nextValue_10 = this.nextValue(_type_62);
                                _builder.append(_nextValue_10, "\t\t\t\t");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append("} catch (java.text.ParseException e) {");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append("list0.add(");
                                FeatureType _type_63 = feature.getType();
                                FeatureType _baseType_15 = this.utils.baseType(((GenericListFeature) _type_63));
                                PrimitiveType _type_64 = ((PrimitiveFeature) _baseType_15).getType();
                                String _nextValue_11 = this.nextValue(_type_64);
                                _builder.append(_nextValue_11, "\t\t\t");
                                _builder.append(");");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                {
                  FeatureType _type_65 = feature.getType();
                  int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_65));
                  ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_2, true);
                  for(final Integer i_1 : _doubleDotLessThan_1) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("reader.endArray();");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      int _size = features.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("reader.skipValue();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence writeFeatures(final String className, final List<Feature> features) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Feature feature : features) {
        _builder.append("if (obj.");
        String _featureGetterName = this.utils.featureGetterName(feature);
        _builder.append(_featureGetterName, "");
        _builder.append("() != null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("writer.name(");
        _builder.append(className, "\t");
        _builder.append(".");
        String _key = this.utils.key(feature);
        _builder.append(_key, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof EntitiesFeature)) {
            {
              FeatureType _type_1 = feature.getType();
              Entities _type_2 = ((EntitiesFeature) _type_1).getType();
              if ((_type_2 instanceof Entity)) {
                _builder.append("\t");
                FeatureType _type_3 = feature.getType();
                Entities _type_4 = ((EntitiesFeature) _type_3).getType();
                String _qualifiedClassNameHelper = this.utils.qualifiedClassNameHelper(_type_4);
                _builder.append(_qualifiedClassNameHelper, "\t");
                _builder.append(".writeJson(obj.");
                String _featureGetterName_1 = this.utils.featureGetterName(feature);
                _builder.append(_featureGetterName_1, "\t");
                _builder.append("(), writer);");
                _builder.newLineIfNotEmpty();
              } else {
                FeatureType _type_5 = feature.getType();
                Entities _type_6 = ((EntitiesFeature) _type_5).getType();
                if ((_type_6 instanceof com.mguidi.soa.soa.Enum)) {
                  _builder.append("\t");
                  FeatureType _type_7 = feature.getType();
                  Entities _type_8 = ((EntitiesFeature) _type_7).getType();
                  String _featureGetterName_2 = this.utils.featureGetterName(feature);
                  String _plus = ("obj." + _featureGetterName_2);
                  String _plus_1 = (_plus + "()");
                  String _writeValue = this.writeValue(((com.mguidi.soa.soa.Enum) _type_8), _plus_1);
                  _builder.append(_writeValue, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          } else {
            FeatureType _type_9 = feature.getType();
            if ((_type_9 instanceof PrimitiveFeature)) {
              _builder.append("\t");
              FeatureType _type_10 = feature.getType();
              PrimitiveType _type_11 = ((PrimitiveFeature) _type_10).getType();
              String _featureGetterName_3 = this.utils.featureGetterName(feature);
              String _plus_2 = ("obj." + _featureGetterName_3);
              String _plus_3 = (_plus_2 + "()");
              String _writeValue_1 = this.writeValue(_type_11, _plus_3);
              _builder.append(_writeValue_1, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            } else {
              FeatureType _type_12 = feature.getType();
              if ((_type_12 instanceof GenericListFeature)) {
                {
                  FeatureType _type_13 = feature.getType();
                  int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_13));
                  ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType, true);
                  for(final Integer i : _doubleDotLessThan) {
                    _builder.append("\t");
                    FeatureType _type_14 = feature.getType();
                    int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_14));
                    int _minus = (_depthToBaseType_1 - (i).intValue());
                    int index = (_minus - 1);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("writer.beginArray();");
                    _builder.newLine();
                    {
                      if (((i).intValue() == 0)) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("for (");
                        FeatureType _type_15 = feature.getType();
                        String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_15), ((i).intValue() + 1));
                        _builder.append(_declarationAtDepth, "\t\t");
                        _builder.append(" list");
                        _builder.append(index, "\t\t");
                        _builder.append(" : obj.");
                        String _featureGetterName_4 = this.utils.featureGetterName(feature);
                        _builder.append(_featureGetterName_4, "\t\t");
                        _builder.append("()) {");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("for (");
                        FeatureType _type_16 = feature.getType();
                        String _declarationAtDepth_1 = this.utils.declarationAtDepth(((GenericListFeature) _type_16), ((i).intValue() + 1));
                        _builder.append(_declarationAtDepth_1, "\t\t");
                        _builder.append(" list");
                        _builder.append(index, "\t\t");
                        _builder.append(" : list");
                        _builder.append((index + 1), "\t\t");
                        _builder.append(") {");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                {
                  FeatureType _type_17 = feature.getType();
                  FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_17));
                  if ((_baseType instanceof EntitiesFeature)) {
                    {
                      FeatureType _type_18 = feature.getType();
                      FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_18));
                      Entities _type_19 = ((EntitiesFeature) _baseType_1).getType();
                      if ((_type_19 instanceof Entity)) {
                        _builder.append("\t");
                        FeatureType _type_20 = feature.getType();
                        FeatureType _baseType_2 = this.utils.baseType(((GenericListFeature) _type_20));
                        Entities _type_21 = ((EntitiesFeature) _baseType_2).getType();
                        String _qualifiedClassNameHelper_1 = this.utils.qualifiedClassNameHelper(_type_21);
                        _builder.append(_qualifiedClassNameHelper_1, "\t");
                        _builder.append(".writeJson(list0, writer);");
                        _builder.newLineIfNotEmpty();
                      } else {
                        FeatureType _type_22 = feature.getType();
                        FeatureType _baseType_3 = this.utils.baseType(((GenericListFeature) _type_22));
                        Entities _type_23 = ((EntitiesFeature) _baseType_3).getType();
                        if ((_type_23 instanceof com.mguidi.soa.soa.Enum)) {
                          _builder.append("\t");
                          FeatureType _type_24 = feature.getType();
                          FeatureType _baseType_4 = this.utils.baseType(((GenericListFeature) _type_24));
                          Entities _type_25 = ((EntitiesFeature) _baseType_4).getType();
                          String _writeValue_2 = this.writeValue(((com.mguidi.soa.soa.Enum) _type_25), "list0");
                          _builder.append(_writeValue_2, "\t");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  } else {
                    FeatureType _type_26 = feature.getType();
                    FeatureType _baseType_5 = this.utils.baseType(((GenericListFeature) _type_26));
                    if ((_baseType_5 instanceof PrimitiveFeature)) {
                      _builder.append("\t");
                      FeatureType _type_27 = feature.getType();
                      FeatureType _baseType_6 = this.utils.baseType(((GenericListFeature) _type_27));
                      PrimitiveType _type_28 = ((PrimitiveFeature) _baseType_6).getType();
                      String _writeValue_3 = this.writeValue(_type_28, "list0");
                      _builder.append(_writeValue_3, "\t");
                      _builder.append(";");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
                {
                  FeatureType _type_29 = feature.getType();
                  int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_29));
                  ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_2, true);
                  for(final Integer i_1 : _doubleDotLessThan_1) {
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("writer.endArray();");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public String nextValue(final PrimitiveType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = "reader.nextBoolean()";
          break;
        case BYTE:
          _switchResult = "(byte) reader.nextInt()";
          break;
        case DOUBLE:
          _switchResult = "reader.nextDouble()";
          break;
        case FLOAT:
          _switchResult = "(float) reader.nextDouble()";
          break;
        case INTEGER:
          _switchResult = "reader.nextInt()";
          break;
        case LONG:
          _switchResult = "reader.nextLong()";
          break;
        case SHORT:
          _switchResult = "(short) reader.nextInt()";
          break;
        case STRING:
          _switchResult = "reader.nextString()";
          break;
        case DATE:
          _switchResult = "new java.text.SimpleDateFormat(\"yyyy-MM-dd\").parse(reader.nextString())";
          break;
        case DATETIME:
          _switchResult = "new java.text.SimpleDateFormat(\"yyyy-MM-dd\'T\'HH:mm:ss.SSS\").parse(reader.nextString())";
          break;
        case TIMESTAMP:
          _switchResult = "new java.text.SimpleDateFormat(\"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\").parse(reader.nextString())";
          break;
        case DECIMAL:
          _switchResult = "new java.math.BigDecimal(reader.nextString())";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public String writeValue(final PrimitiveType type, final String obj) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case BYTE:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case DOUBLE:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case FLOAT:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case INTEGER:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case LONG:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case SHORT:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case STRING:
          _switchResult = (("writer.value(" + obj) + ");");
          break;
        case DATE:
          _switchResult = (("writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd\").format(" + obj) + "))");
          break;
        case DATETIME:
          _switchResult = (("writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd\'T\'HH:mm:ss.SSS\").format(" + obj) + "))");
          break;
        case TIMESTAMP:
          _switchResult = (("writer.value(new java.text.SimpleDateFormat(\"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\").format(" + obj) + "))");
          break;
        case DECIMAL:
          _switchResult = (("writer.value(" + obj) + ".toPlainString())");
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public String nextValue(final com.mguidi.soa.soa.Enum type) {
    String _qualifiedClassName = this.utils.qualifiedClassName(type);
    return (_qualifiedClassName + ".valueOf(reader.nextString())");
  }
  
  public String writeValue(final com.mguidi.soa.soa.Enum type, final String obj) {
    return (("writer.value(" + obj) + ".toString());");
  }
}
