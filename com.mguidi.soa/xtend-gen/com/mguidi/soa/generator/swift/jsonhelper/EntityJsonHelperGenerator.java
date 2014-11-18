package com.mguidi.soa.generator.swift.jsonhelper;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mguidi.soa.generator.swift.jsonhelper.JsonUtils;
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
    _builder.append("import Foundation");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    String _classNameHelper = this.utils.classNameHelper(entity);
    _builder.append(_classNameHelper, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _classNameHelper_1 = this.utils.classNameHelper(entity);
    _builder.append(_classNameHelper_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class func fromJson(json: Dictionary<String, AnyObject>) -> (");
    String _className = this.utils.className(entity);
    _builder.append(_className, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var obj = ");
    String _className_1 = this.utils.className(entity);
    _builder.append(_className_1, "\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _className_2 = this.utils.className(entity);
    EList<Feature> _features = entity.getFeatures();
    CharSequence _readFeatures = this.readFeatures(_className_2, _features);
    _builder.append(_readFeatures, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return obj");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class func toJson(obj: ");
    String _className_3 = this.utils.className(entity);
    _builder.append(_className_3, "\t");
    _builder.append(") -> (Dictionary<String, AnyObject>)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var json = Dictionary<String, AnyObject>()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _className_4 = this.utils.className(entity);
    EList<Feature> _features_1 = entity.getFeatures();
    CharSequence _writeFeatures = this.writeFeatures(_className_4, _features_1);
    _builder.append(_writeFeatures, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return json;");
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
    {
      for(final Feature feature : features) {
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof EntitiesFeature)) {
            {
              FeatureType _type_1 = feature.getType();
              Entities _type_2 = ((EntitiesFeature) _type_1).getType();
              if ((_type_2 instanceof Entity)) {
                _builder.append("if let ");
                String _name = feature.getName();
                _builder.append(_name, "");
                _builder.append("Value = json[");
                _builder.append(className, "");
                _builder.append(".");
                String _key = this.utils.key(feature);
                _builder.append(_key, "");
                _builder.append("] as? Dictionary<String, AnyObject> {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("obj.");
                String _name_1 = feature.getName();
                _builder.append(_name_1, "\t");
                _builder.append(" = ");
                FeatureType _type_3 = feature.getType();
                Entities _type_4 = ((EntitiesFeature) _type_3).getType();
                String _classNameHelper = this.utils.classNameHelper(_type_4);
                _builder.append(_classNameHelper, "\t");
                _builder.append(".fromJson(");
                String _name_2 = feature.getName();
                _builder.append(_name_2, "\t");
                _builder.append("Value)");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              } else {
                FeatureType _type_5 = feature.getType();
                Entities _type_6 = ((EntitiesFeature) _type_5).getType();
                if ((_type_6 instanceof com.mguidi.soa.soa.Enum)) {
                  _builder.append("if let ");
                  String _name_3 = feature.getName();
                  _builder.append(_name_3, "");
                  _builder.append("Value = json[");
                  _builder.append(className, "");
                  _builder.append(".");
                  String _key_1 = this.utils.key(feature);
                  _builder.append(_key_1, "");
                  _builder.append("] as? String {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("obj.");
                  String _name_4 = feature.getName();
                  _builder.append(_name_4, "\t");
                  _builder.append(" = ");
                  FeatureType _type_7 = feature.getType();
                  String _declaration = this.utils.declaration(_type_7);
                  _builder.append(_declaration, "\t");
                  _builder.append("(rawValue: ");
                  String _name_5 = feature.getName();
                  _builder.append(_name_5, "\t");
                  _builder.append("Value)");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("if (obj.");
                  String _name_6 = feature.getName();
                  _builder.append(_name_6, "\t");
                  _builder.append(" == nil) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("obj.");
                  String _name_7 = feature.getName();
                  _builder.append(_name_7, "\t\t");
                  _builder.append(" = ");
                  FeatureType _type_8 = feature.getType();
                  String _declaration_1 = this.utils.declaration(_type_8);
                  _builder.append(_declaration_1, "\t\t");
                  _builder.append("._UNDEFINED_");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          } else {
            FeatureType _type_9 = feature.getType();
            if ((_type_9 instanceof PrimitiveFeature)) {
              {
                FeatureType _type_10 = feature.getType();
                PrimitiveType _type_11 = ((PrimitiveFeature) _type_10).getType();
                boolean _equals = Objects.equal(_type_11, PrimitiveType.DECIMAL);
                if (_equals) {
                  _builder.append("if let ");
                  String _name_8 = feature.getName();
                  _builder.append(_name_8, "");
                  _builder.append("Value = json[");
                  _builder.append(className, "");
                  _builder.append(".");
                  String _key_2 = this.utils.key(feature);
                  _builder.append(_key_2, "");
                  _builder.append("] as? String {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("obj.");
                  String _name_9 = feature.getName();
                  _builder.append(_name_9, "\t");
                  _builder.append(" = NSDecimalNumber(string: ");
                  String _name_10 = feature.getName();
                  _builder.append(_name_10, "\t");
                  _builder.append("Value)");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  FeatureType _type_12 = feature.getType();
                  PrimitiveType _type_13 = ((PrimitiveFeature) _type_12).getType();
                  boolean _equals_1 = Objects.equal(_type_13, PrimitiveType.DATE);
                  if (_equals_1) {
                    _builder.append("if let ");
                    String _name_11 = feature.getName();
                    _builder.append(_name_11, "");
                    _builder.append("Value = json[");
                    _builder.append(className, "");
                    _builder.append(".");
                    String _key_3 = this.utils.key(feature);
                    _builder.append(_key_3, "");
                    _builder.append("] as? String {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("let formatter = NSDateFormatter()");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("formatter.dateFormat = \"yyyy-MM-dd\"");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("obj.");
                    String _name_12 = feature.getName();
                    _builder.append(_name_12, "\t");
                    _builder.append(" = formatter.dateFromString(");
                    String _name_13 = feature.getName();
                    _builder.append(_name_13, "\t");
                    _builder.append("Value)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    FeatureType _type_14 = feature.getType();
                    PrimitiveType _type_15 = ((PrimitiveFeature) _type_14).getType();
                    boolean _equals_2 = Objects.equal(_type_15, PrimitiveType.DATETIME);
                    if (_equals_2) {
                      _builder.append("if let ");
                      String _name_14 = feature.getName();
                      _builder.append(_name_14, "");
                      _builder.append("Value = json[");
                      _builder.append(className, "");
                      _builder.append(".");
                      String _key_4 = this.utils.key(feature);
                      _builder.append(_key_4, "");
                      _builder.append("] as? String {");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("let formatter = NSDateFormatter()");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSS\"");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("obj.");
                      String _name_15 = feature.getName();
                      _builder.append(_name_15, "\t");
                      _builder.append(" = formatter.dateFromString(");
                      String _name_16 = feature.getName();
                      _builder.append(_name_16, "\t");
                      _builder.append("Value)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      FeatureType _type_16 = feature.getType();
                      PrimitiveType _type_17 = ((PrimitiveFeature) _type_16).getType();
                      boolean _equals_3 = Objects.equal(_type_17, PrimitiveType.TIMESTAMP);
                      if (_equals_3) {
                        _builder.append("if let ");
                        String _name_17 = feature.getName();
                        _builder.append(_name_17, "");
                        _builder.append("Value = json[");
                        _builder.append(className, "");
                        _builder.append(".");
                        String _key_5 = this.utils.key(feature);
                        _builder.append(_key_5, "");
                        _builder.append("] as? String {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("let formatter = NSDateFormatter()");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\"");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("obj.");
                        String _name_18 = feature.getName();
                        _builder.append(_name_18, "\t");
                        _builder.append(" = formatter.dateFromString(");
                        String _name_19 = feature.getName();
                        _builder.append(_name_19, "\t");
                        _builder.append("Value)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        _builder.append("if let ");
                        String _name_20 = feature.getName();
                        _builder.append(_name_20, "");
                        _builder.append("Value = json[");
                        _builder.append(className, "");
                        _builder.append(".");
                        String _key_6 = this.utils.key(feature);
                        _builder.append(_key_6, "");
                        _builder.append("] as? ");
                        FeatureType _type_18 = feature.getType();
                        String _declaration_2 = this.utils.declaration(_type_18);
                        _builder.append(_declaration_2, "");
                        _builder.append(" {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("obj.");
                        String _name_21 = feature.getName();
                        _builder.append(_name_21, "\t");
                        _builder.append(" = ");
                        String _name_22 = feature.getName();
                        _builder.append(_name_22, "\t");
                        _builder.append("Value");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            } else {
              FeatureType _type_19 = feature.getType();
              if ((_type_19 instanceof GenericListFeature)) {
                {
                  FeatureType _type_20 = feature.getType();
                  FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_20));
                  if ((_baseType instanceof EntitiesFeature)) {
                    {
                      FeatureType _type_21 = feature.getType();
                      FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_21));
                      Entities _type_22 = ((EntitiesFeature) _baseType_1).getType();
                      if ((_type_22 instanceof Entity)) {
                        _builder.append("if let array");
                        FeatureType _type_23 = feature.getType();
                        int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_23));
                        int _minus = (_depthToBaseType - 1);
                        _builder.append(_minus, "");
                        _builder.append(" = json[");
                        _builder.append(className, "");
                        _builder.append(".");
                        String _key_7 = this.utils.key(feature);
                        _builder.append(_key_7, "");
                        _builder.append("] as? ");
                        FeatureType _type_24 = feature.getType();
                        String _listBaseDictionary = this.listBaseDictionary(((GenericListFeature) _type_24));
                        _builder.append(_listBaseDictionary, "");
                        _builder.append(" {");
                        _builder.newLineIfNotEmpty();
                        {
                          FeatureType _type_25 = feature.getType();
                          int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_25));
                          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType_1, true);
                          for(final Integer i : _doubleDotLessThan) {
                            _builder.append("\t");
                            FeatureType _type_26 = feature.getType();
                            int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_26));
                            int _minus_1 = (_depthToBaseType_2 - (i).intValue());
                            int index = (_minus_1 - 1);
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("var list");
                            _builder.append(index, "\t");
                            _builder.append(" = ");
                            FeatureType _type_27 = feature.getType();
                            String _declarationAtDepth = this.utils.declarationAtDepth(((GenericListFeature) _type_27), (i).intValue());
                            _builder.append(_declarationAtDepth, "\t");
                            _builder.append("()");
                            _builder.newLineIfNotEmpty();
                            {
                              if ((index == 0)) {
                                _builder.append("\t");
                                _builder.append("for obj in array0");
                                _builder.newLine();
                              } else {
                                _builder.append("\t");
                                _builder.append("for array");
                                _builder.append((index - 1), "\t");
                                _builder.append(" in array");
                                _builder.append(index, "\t");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("\t");
                            _builder.append("{");
                            _builder.newLine();
                          }
                        }
                        _builder.append("\t\t");
                        _builder.append("if let ");
                        String _name_23 = feature.getName();
                        _builder.append(_name_23, "\t\t");
                        _builder.append("Value = ");
                        FeatureType _type_28 = feature.getType();
                        FeatureType _baseType_2 = this.utils.baseType(((GenericListFeature) _type_28));
                        Entities _type_29 = ((EntitiesFeature) _baseType_2).getType();
                        String _classNameHelper_1 = this.utils.classNameHelper(_type_29);
                        _builder.append(_classNameHelper_1, "\t\t");
                        _builder.append(".fromJson(obj) as ");
                        FeatureType _type_30 = feature.getType();
                        FeatureType _baseType_3 = this.utils.baseType(((GenericListFeature) _type_30));
                        Entities _type_31 = ((EntitiesFeature) _baseType_3).getType();
                        String _className = this.utils.className(_type_31);
                        _builder.append(_className, "\t\t");
                        _builder.append("?");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("list0.append(");
                        String _name_24 = feature.getName();
                        _builder.append(_name_24, "\t\t\t");
                        _builder.append("Value)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("}");
                        _builder.newLine();
                        {
                          FeatureType _type_32 = feature.getType();
                          int _depthToBaseType_3 = this.utils.depthToBaseType(((GenericListFeature) _type_32));
                          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_3, true);
                          for(final Integer i_1 : _doubleDotLessThan_1) {
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            {
                              FeatureType _type_33 = feature.getType();
                              int _depthToBaseType_4 = this.utils.depthToBaseType(((GenericListFeature) _type_33));
                              int _minus_2 = (_depthToBaseType_4 - 1);
                              boolean _equals_4 = ((i_1).intValue() == _minus_2);
                              if (_equals_4) {
                                _builder.append("\t");
                                _builder.append("obj.");
                                String _name_25 = feature.getName();
                                _builder.append(_name_25, "\t");
                                _builder.append(" = list");
                                _builder.append(i_1, "\t");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("list");
                                _builder.append(((i_1).intValue() + 1), "\t");
                                _builder.append(".append(list");
                                _builder.append(i_1, "\t");
                                _builder.append(")");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        FeatureType _type_34 = feature.getType();
                        FeatureType _baseType_4 = this.utils.baseType(((GenericListFeature) _type_34));
                        Entities _type_35 = ((EntitiesFeature) _baseType_4).getType();
                        if ((_type_35 instanceof com.mguidi.soa.soa.Enum)) {
                          _builder.append("if let array");
                          FeatureType _type_36 = feature.getType();
                          int _depthToBaseType_5 = this.utils.depthToBaseType(((GenericListFeature) _type_36));
                          int _minus_3 = (_depthToBaseType_5 - 1);
                          _builder.append(_minus_3, "");
                          _builder.append(" = json[");
                          _builder.append(className, "");
                          _builder.append(".");
                          String _key_8 = this.utils.key(feature);
                          _builder.append(_key_8, "");
                          _builder.append("] as? ");
                          FeatureType _type_37 = feature.getType();
                          String _listBaseString = this.listBaseString(((GenericListFeature) _type_37));
                          _builder.append(_listBaseString, "");
                          _builder.append(" {");
                          _builder.newLineIfNotEmpty();
                          {
                            FeatureType _type_38 = feature.getType();
                            int _depthToBaseType_6 = this.utils.depthToBaseType(((GenericListFeature) _type_38));
                            ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _depthToBaseType_6, true);
                            for(final Integer i_2 : _doubleDotLessThan_2) {
                              _builder.append("\t");
                              FeatureType _type_39 = feature.getType();
                              int _depthToBaseType_7 = this.utils.depthToBaseType(((GenericListFeature) _type_39));
                              int _minus_4 = (_depthToBaseType_7 - (i_2).intValue());
                              int index_1 = (_minus_4 - 1);
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("var list");
                              _builder.append(index_1, "\t");
                              _builder.append(" = ");
                              FeatureType _type_40 = feature.getType();
                              String _declarationAtDepth_1 = this.utils.declarationAtDepth(((GenericListFeature) _type_40), (i_2).intValue());
                              _builder.append(_declarationAtDepth_1, "\t");
                              _builder.append("()");
                              _builder.newLineIfNotEmpty();
                              {
                                if ((index_1 == 0)) {
                                  _builder.append("\t");
                                  _builder.append("for obj in array0");
                                  _builder.newLine();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("for array");
                                  _builder.append((index_1 - 1), "\t");
                                  _builder.append(" in array");
                                  _builder.append(index_1, "\t");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                              _builder.append("\t");
                              _builder.append("{");
                              _builder.newLine();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("var ");
                          String _name_26 = feature.getName();
                          _builder.append(_name_26, "\t\t");
                          _builder.append("Value = ");
                          FeatureType _type_41 = feature.getType();
                          FeatureType _baseType_5 = this.utils.baseType(((GenericListFeature) _type_41));
                          Entities _type_42 = ((EntitiesFeature) _baseType_5).getType();
                          String _className_1 = this.utils.className(_type_42);
                          _builder.append(_className_1, "\t\t");
                          _builder.append("(rawValue: obj)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("if (");
                          String _name_27 = feature.getName();
                          _builder.append(_name_27, "\t\t");
                          _builder.append("Value == nil) {");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          String _name_28 = feature.getName();
                          _builder.append(_name_28, "\t\t\t");
                          _builder.append("Value = ");
                          FeatureType _type_43 = feature.getType();
                          FeatureType _baseType_6 = this.utils.baseType(((GenericListFeature) _type_43));
                          Entities _type_44 = ((EntitiesFeature) _baseType_6).getType();
                          String _className_2 = this.utils.className(_type_44);
                          _builder.append(_className_2, "\t\t\t");
                          _builder.append("._UNDEFINED_");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          _builder.append("\t");
                          _builder.newLine();
                          _builder.append("\t\t");
                          _builder.append("list0.append(");
                          String _name_29 = feature.getName();
                          _builder.append(_name_29, "\t\t");
                          _builder.append("Value!)");
                          _builder.newLineIfNotEmpty();
                          {
                            FeatureType _type_45 = feature.getType();
                            int _depthToBaseType_8 = this.utils.depthToBaseType(((GenericListFeature) _type_45));
                            ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _depthToBaseType_8, true);
                            for(final Integer i_3 : _doubleDotLessThan_3) {
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              {
                                FeatureType _type_46 = feature.getType();
                                int _depthToBaseType_9 = this.utils.depthToBaseType(((GenericListFeature) _type_46));
                                int _minus_5 = (_depthToBaseType_9 - 1);
                                boolean _equals_5 = ((i_3).intValue() == _minus_5);
                                if (_equals_5) {
                                  _builder.append("\t");
                                  _builder.append("obj.");
                                  String _name_30 = feature.getName();
                                  _builder.append(_name_30, "\t");
                                  _builder.append(" = list");
                                  _builder.append(i_3, "\t");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("list");
                                  _builder.append(((i_3).intValue() + 1), "\t");
                                  _builder.append(".append(list");
                                  _builder.append(i_3, "\t");
                                  _builder.append(")");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                    }
                  } else {
                    FeatureType _type_47 = feature.getType();
                    FeatureType _baseType_7 = this.utils.baseType(((GenericListFeature) _type_47));
                    if ((_baseType_7 instanceof PrimitiveFeature)) {
                      {
                        FeatureType _type_48 = feature.getType();
                        FeatureType _baseType_8 = this.utils.baseType(((GenericListFeature) _type_48));
                        PrimitiveType _type_49 = ((PrimitiveFeature) _baseType_8).getType();
                        boolean _equals_6 = Objects.equal(_type_49, PrimitiveType.DECIMAL);
                        if (_equals_6) {
                          _builder.append("if let array");
                          FeatureType _type_50 = feature.getType();
                          int _depthToBaseType_10 = this.utils.depthToBaseType(((GenericListFeature) _type_50));
                          int _minus_6 = (_depthToBaseType_10 - 1);
                          _builder.append(_minus_6, "");
                          _builder.append(" = json[");
                          _builder.append(className, "");
                          _builder.append(".");
                          String _key_9 = this.utils.key(feature);
                          _builder.append(_key_9, "");
                          _builder.append("] as? ");
                          FeatureType _type_51 = feature.getType();
                          String _listBaseString_1 = this.listBaseString(((GenericListFeature) _type_51));
                          _builder.append(_listBaseString_1, "");
                          _builder.append(" {");
                          _builder.newLineIfNotEmpty();
                          {
                            FeatureType _type_52 = feature.getType();
                            int _depthToBaseType_11 = this.utils.depthToBaseType(((GenericListFeature) _type_52));
                            ExclusiveRange _doubleDotLessThan_4 = new ExclusiveRange(0, _depthToBaseType_11, true);
                            for(final Integer i_4 : _doubleDotLessThan_4) {
                              _builder.append("\t");
                              FeatureType _type_53 = feature.getType();
                              int _depthToBaseType_12 = this.utils.depthToBaseType(((GenericListFeature) _type_53));
                              int _minus_7 = (_depthToBaseType_12 - (i_4).intValue());
                              int index_2 = (_minus_7 - 1);
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("var list");
                              _builder.append(index_2, "\t");
                              _builder.append(" = ");
                              FeatureType _type_54 = feature.getType();
                              String _declarationAtDepth_2 = this.utils.declarationAtDepth(((GenericListFeature) _type_54), (i_4).intValue());
                              _builder.append(_declarationAtDepth_2, "\t");
                              _builder.append("()");
                              _builder.newLineIfNotEmpty();
                              {
                                if ((index_2 == 0)) {
                                  _builder.append("\t");
                                  _builder.append("for obj in array0");
                                  _builder.newLine();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("for array");
                                  _builder.append((index_2 - 1), "\t");
                                  _builder.append(" in array");
                                  _builder.append(index_2, "\t");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                              _builder.append("\t");
                              _builder.append("{");
                              _builder.newLine();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("if let ");
                          String _name_31 = feature.getName();
                          _builder.append(_name_31, "\t\t");
                          _builder.append("Value = NSDecimalNumber(string: obj) as NSDecimalNumber?");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("list0.append(");
                          String _name_32 = feature.getName();
                          _builder.append(_name_32, "\t\t\t");
                          _builder.append("Value)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          _builder.append("}");
                          _builder.newLine();
                          {
                            FeatureType _type_55 = feature.getType();
                            int _depthToBaseType_13 = this.utils.depthToBaseType(((GenericListFeature) _type_55));
                            ExclusiveRange _doubleDotLessThan_5 = new ExclusiveRange(0, _depthToBaseType_13, true);
                            for(final Integer i_5 : _doubleDotLessThan_5) {
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              {
                                FeatureType _type_56 = feature.getType();
                                int _depthToBaseType_14 = this.utils.depthToBaseType(((GenericListFeature) _type_56));
                                int _minus_8 = (_depthToBaseType_14 - 1);
                                boolean _equals_7 = ((i_5).intValue() == _minus_8);
                                if (_equals_7) {
                                  _builder.append("\t");
                                  _builder.append("obj.");
                                  String _name_33 = feature.getName();
                                  _builder.append(_name_33, "\t");
                                  _builder.append(" = list");
                                  _builder.append(i_5, "\t");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("list");
                                  _builder.append(((i_5).intValue() + 1), "\t");
                                  _builder.append(".append(list");
                                  _builder.append(i_5, "\t");
                                  _builder.append(")");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          FeatureType _type_57 = feature.getType();
                          FeatureType _baseType_9 = this.utils.baseType(((GenericListFeature) _type_57));
                          PrimitiveType _type_58 = ((PrimitiveFeature) _baseType_9).getType();
                          boolean _equals_8 = Objects.equal(_type_58, PrimitiveType.DATE);
                          if (_equals_8) {
                            _builder.append("if let array");
                            FeatureType _type_59 = feature.getType();
                            int _depthToBaseType_15 = this.utils.depthToBaseType(((GenericListFeature) _type_59));
                            int _minus_9 = (_depthToBaseType_15 - 1);
                            _builder.append(_minus_9, "");
                            _builder.append(" = json[");
                            _builder.append(className, "");
                            _builder.append(".");
                            String _key_10 = this.utils.key(feature);
                            _builder.append(_key_10, "");
                            _builder.append("] as? ");
                            FeatureType _type_60 = feature.getType();
                            String _listBaseString_2 = this.listBaseString(((GenericListFeature) _type_60));
                            _builder.append(_listBaseString_2, "");
                            _builder.append(" {");
                            _builder.newLineIfNotEmpty();
                            {
                              FeatureType _type_61 = feature.getType();
                              int _depthToBaseType_16 = this.utils.depthToBaseType(((GenericListFeature) _type_61));
                              ExclusiveRange _doubleDotLessThan_6 = new ExclusiveRange(0, _depthToBaseType_16, true);
                              for(final Integer i_6 : _doubleDotLessThan_6) {
                                _builder.append("\t");
                                FeatureType _type_62 = feature.getType();
                                int _depthToBaseType_17 = this.utils.depthToBaseType(((GenericListFeature) _type_62));
                                int _minus_10 = (_depthToBaseType_17 - (i_6).intValue());
                                int index_3 = (_minus_10 - 1);
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("var list");
                                _builder.append(index_3, "\t");
                                _builder.append(" = ");
                                FeatureType _type_63 = feature.getType();
                                String _declarationAtDepth_3 = this.utils.declarationAtDepth(((GenericListFeature) _type_63), (i_6).intValue());
                                _builder.append(_declarationAtDepth_3, "\t");
                                _builder.append("()");
                                _builder.newLineIfNotEmpty();
                                {
                                  if ((index_3 == 0)) {
                                    _builder.append("\t");
                                    _builder.append("for obj in array0");
                                    _builder.newLine();
                                  } else {
                                    _builder.append("\t");
                                    _builder.append("for array");
                                    _builder.append((index_3 - 1), "\t");
                                    _builder.append(" in array");
                                    _builder.append(index_3, "\t");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                                _builder.append("\t");
                                _builder.append("{");
                                _builder.newLine();
                              }
                            }
                            _builder.append("\t\t");
                            _builder.append("let formatter = NSDateFormatter()");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("formatter.dateFormat = \"yyyy-MM-dd\"");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("if let ");
                            String _name_34 = feature.getName();
                            _builder.append(_name_34, "\t\t");
                            _builder.append("Value = formatter.dateFromString(obj) as NSDate?");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("{");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("list0.append(");
                            String _name_35 = feature.getName();
                            _builder.append(_name_35, "\t\t\t");
                            _builder.append("Value)");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t");
                            _builder.append("}");
                            _builder.newLine();
                            {
                              FeatureType _type_64 = feature.getType();
                              int _depthToBaseType_18 = this.utils.depthToBaseType(((GenericListFeature) _type_64));
                              ExclusiveRange _doubleDotLessThan_7 = new ExclusiveRange(0, _depthToBaseType_18, true);
                              for(final Integer i_7 : _doubleDotLessThan_7) {
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                                {
                                  FeatureType _type_65 = feature.getType();
                                  int _depthToBaseType_19 = this.utils.depthToBaseType(((GenericListFeature) _type_65));
                                  int _minus_11 = (_depthToBaseType_19 - 1);
                                  boolean _equals_9 = ((i_7).intValue() == _minus_11);
                                  if (_equals_9) {
                                    _builder.append("\t");
                                    _builder.append("obj.");
                                    String _name_36 = feature.getName();
                                    _builder.append(_name_36, "\t");
                                    _builder.append(" = list");
                                    _builder.append(i_7, "\t");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("\t");
                                    _builder.append("list");
                                    _builder.append(((i_7).intValue() + 1), "\t");
                                    _builder.append(".append(list");
                                    _builder.append(i_7, "\t");
                                    _builder.append(")");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            FeatureType _type_66 = feature.getType();
                            FeatureType _baseType_10 = this.utils.baseType(((GenericListFeature) _type_66));
                            PrimitiveType _type_67 = ((PrimitiveFeature) _baseType_10).getType();
                            boolean _equals_10 = Objects.equal(_type_67, PrimitiveType.DATETIME);
                            if (_equals_10) {
                              _builder.append("if let array");
                              FeatureType _type_68 = feature.getType();
                              int _depthToBaseType_20 = this.utils.depthToBaseType(((GenericListFeature) _type_68));
                              int _minus_12 = (_depthToBaseType_20 - 1);
                              _builder.append(_minus_12, "");
                              _builder.append(" = json[");
                              _builder.append(className, "");
                              _builder.append(".");
                              String _key_11 = this.utils.key(feature);
                              _builder.append(_key_11, "");
                              _builder.append("] as? ");
                              FeatureType _type_69 = feature.getType();
                              String _listBaseString_3 = this.listBaseString(((GenericListFeature) _type_69));
                              _builder.append(_listBaseString_3, "");
                              _builder.append(" {");
                              _builder.newLineIfNotEmpty();
                              {
                                FeatureType _type_70 = feature.getType();
                                int _depthToBaseType_21 = this.utils.depthToBaseType(((GenericListFeature) _type_70));
                                ExclusiveRange _doubleDotLessThan_8 = new ExclusiveRange(0, _depthToBaseType_21, true);
                                for(final Integer i_8 : _doubleDotLessThan_8) {
                                  _builder.append("\t");
                                  FeatureType _type_71 = feature.getType();
                                  int _depthToBaseType_22 = this.utils.depthToBaseType(((GenericListFeature) _type_71));
                                  int _minus_13 = (_depthToBaseType_22 - (i_8).intValue());
                                  int index_4 = (_minus_13 - 1);
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t");
                                  _builder.append("var list");
                                  _builder.append(index_4, "\t");
                                  _builder.append(" = ");
                                  FeatureType _type_72 = feature.getType();
                                  String _declarationAtDepth_4 = this.utils.declarationAtDepth(((GenericListFeature) _type_72), (i_8).intValue());
                                  _builder.append(_declarationAtDepth_4, "\t");
                                  _builder.append("()");
                                  _builder.newLineIfNotEmpty();
                                  {
                                    if ((index_4 == 0)) {
                                      _builder.append("\t");
                                      _builder.append("for obj in array0");
                                      _builder.newLine();
                                    } else {
                                      _builder.append("\t");
                                      _builder.append("for array");
                                      _builder.append((index_4 - 1), "\t");
                                      _builder.append(" in array");
                                      _builder.append(index_4, "\t");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                  _builder.append("\t");
                                  _builder.append("{");
                                  _builder.newLine();
                                }
                              }
                              _builder.append("\t\t");
                              _builder.append("let formatter = NSDateFormatter()");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSS\"");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("if let ");
                              String _name_37 = feature.getName();
                              _builder.append(_name_37, "\t\t");
                              _builder.append("Value = formatter.dateFromString(obj) as NSDate?");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("{");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              _builder.append("list0.append(");
                              String _name_38 = feature.getName();
                              _builder.append(_name_38, "\t\t\t");
                              _builder.append("Value)");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t");
                              _builder.append("}");
                              _builder.newLine();
                              {
                                FeatureType _type_73 = feature.getType();
                                int _depthToBaseType_23 = this.utils.depthToBaseType(((GenericListFeature) _type_73));
                                ExclusiveRange _doubleDotLessThan_9 = new ExclusiveRange(0, _depthToBaseType_23, true);
                                for(final Integer i_9 : _doubleDotLessThan_9) {
                                  _builder.append("\t");
                                  _builder.append("}");
                                  _builder.newLine();
                                  {
                                    FeatureType _type_74 = feature.getType();
                                    int _depthToBaseType_24 = this.utils.depthToBaseType(((GenericListFeature) _type_74));
                                    int _minus_14 = (_depthToBaseType_24 - 1);
                                    boolean _equals_11 = ((i_9).intValue() == _minus_14);
                                    if (_equals_11) {
                                      _builder.append("\t");
                                      _builder.append("obj.");
                                      String _name_39 = feature.getName();
                                      _builder.append(_name_39, "\t");
                                      _builder.append(" = list");
                                      _builder.append(i_9, "\t");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("\t");
                                      _builder.append("list");
                                      _builder.append(((i_9).intValue() + 1), "\t");
                                      _builder.append(".append(list");
                                      _builder.append(i_9, "\t");
                                      _builder.append(")");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              FeatureType _type_75 = feature.getType();
                              FeatureType _baseType_11 = this.utils.baseType(((GenericListFeature) _type_75));
                              PrimitiveType _type_76 = ((PrimitiveFeature) _baseType_11).getType();
                              boolean _equals_12 = Objects.equal(_type_76, PrimitiveType.TIMESTAMP);
                              if (_equals_12) {
                                _builder.append("if let array");
                                FeatureType _type_77 = feature.getType();
                                int _depthToBaseType_25 = this.utils.depthToBaseType(((GenericListFeature) _type_77));
                                int _minus_15 = (_depthToBaseType_25 - 1);
                                _builder.append(_minus_15, "");
                                _builder.append(" = json[");
                                _builder.append(className, "");
                                _builder.append(".");
                                String _key_12 = this.utils.key(feature);
                                _builder.append(_key_12, "");
                                _builder.append("] as? ");
                                FeatureType _type_78 = feature.getType();
                                String _listBaseString_4 = this.listBaseString(((GenericListFeature) _type_78));
                                _builder.append(_listBaseString_4, "");
                                _builder.append(" {");
                                _builder.newLineIfNotEmpty();
                                {
                                  FeatureType _type_79 = feature.getType();
                                  int _depthToBaseType_26 = this.utils.depthToBaseType(((GenericListFeature) _type_79));
                                  ExclusiveRange _doubleDotLessThan_10 = new ExclusiveRange(0, _depthToBaseType_26, true);
                                  for(final Integer i_10 : _doubleDotLessThan_10) {
                                    _builder.append("\t");
                                    FeatureType _type_80 = feature.getType();
                                    int _depthToBaseType_27 = this.utils.depthToBaseType(((GenericListFeature) _type_80));
                                    int _minus_16 = (_depthToBaseType_27 - (i_10).intValue());
                                    int index_5 = (_minus_16 - 1);
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t");
                                    _builder.append("var list");
                                    _builder.append(index_5, "\t");
                                    _builder.append(" = ");
                                    FeatureType _type_81 = feature.getType();
                                    String _declarationAtDepth_5 = this.utils.declarationAtDepth(((GenericListFeature) _type_81), (i_10).intValue());
                                    _builder.append(_declarationAtDepth_5, "\t");
                                    _builder.append("()");
                                    _builder.newLineIfNotEmpty();
                                    {
                                      if ((index_5 == 0)) {
                                        _builder.append("\t");
                                        _builder.append("for obj in array0");
                                        _builder.newLine();
                                      } else {
                                        _builder.append("\t");
                                        _builder.append("for array");
                                        _builder.append((index_5 - 1), "\t");
                                        _builder.append(" in array");
                                        _builder.append(index_5, "\t");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                    _builder.append("\t");
                                    _builder.append("{");
                                    _builder.newLine();
                                  }
                                }
                                _builder.append("\t\t");
                                _builder.append("let formatter = NSDateFormatter()");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\"");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.append("if let ");
                                String _name_40 = feature.getName();
                                _builder.append(_name_40, "\t\t");
                                _builder.append("Value = formatter.dateFromString(obj) as NSDate?");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                _builder.append("{");
                                _builder.newLine();
                                _builder.append("\t\t\t");
                                _builder.append("list0.append(");
                                String _name_41 = feature.getName();
                                _builder.append(_name_41, "\t\t\t");
                                _builder.append("Value)");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                _builder.append("}");
                                _builder.newLine();
                                {
                                  FeatureType _type_82 = feature.getType();
                                  int _depthToBaseType_28 = this.utils.depthToBaseType(((GenericListFeature) _type_82));
                                  ExclusiveRange _doubleDotLessThan_11 = new ExclusiveRange(0, _depthToBaseType_28, true);
                                  for(final Integer i_11 : _doubleDotLessThan_11) {
                                    _builder.append("\t");
                                    _builder.append("}");
                                    _builder.newLine();
                                    {
                                      FeatureType _type_83 = feature.getType();
                                      int _depthToBaseType_29 = this.utils.depthToBaseType(((GenericListFeature) _type_83));
                                      int _minus_17 = (_depthToBaseType_29 - 1);
                                      boolean _equals_13 = ((i_11).intValue() == _minus_17);
                                      if (_equals_13) {
                                        _builder.append("\t");
                                        _builder.append("obj.");
                                        String _name_42 = feature.getName();
                                        _builder.append(_name_42, "\t");
                                        _builder.append(" = list");
                                        _builder.append(i_11, "\t");
                                        _builder.newLineIfNotEmpty();
                                      } else {
                                        _builder.append("\t");
                                        _builder.append("list");
                                        _builder.append(((i_11).intValue() + 1), "\t");
                                        _builder.append(".append(list");
                                        _builder.append(i_11, "\t");
                                        _builder.append(")");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                  }
                                }
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                _builder.append("if let ");
                                String _name_43 = feature.getName();
                                _builder.append(_name_43, "");
                                _builder.append("Value = json[");
                                _builder.append(className, "");
                                _builder.append(".");
                                String _key_13 = this.utils.key(feature);
                                _builder.append(_key_13, "");
                                _builder.append("] as? ");
                                FeatureType _type_84 = feature.getType();
                                String _declaration_3 = this.utils.declaration(_type_84);
                                _builder.append(_declaration_3, "");
                                _builder.append(" {");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("obj.");
                                String _name_44 = feature.getName();
                                _builder.append(_name_44, "\t");
                                _builder.append(" = ");
                                String _name_45 = feature.getName();
                                _builder.append(_name_45, "\t");
                                _builder.append("Value");
                                _builder.newLineIfNotEmpty();
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String listBaseString(final GenericListFeature generic) {
    String _xifexpression = null;
    FeatureType _type = generic.getType();
    if ((_type instanceof GenericListFeature)) {
      FeatureType _type_1 = generic.getType();
      String _listBaseString = this.listBaseString(((GenericListFeature) _type_1));
      String _plus = ("Array<" + _listBaseString);
      _xifexpression = (_plus + ">");
    } else {
      _xifexpression = "Array<String>";
    }
    return _xifexpression;
  }
  
  public String listBaseDictionary(final GenericListFeature generic) {
    String _xifexpression = null;
    FeatureType _type = generic.getType();
    if ((_type instanceof GenericListFeature)) {
      FeatureType _type_1 = generic.getType();
      String _listBaseDictionary = this.listBaseDictionary(((GenericListFeature) _type_1));
      String _plus = ("Array<" + _listBaseDictionary);
      _xifexpression = (_plus + ">");
    } else {
      _xifexpression = "Array<Dictionary<String, AnyObject>>";
    }
    return _xifexpression;
  }
  
  public String listBaseDictionaryAtDepth(final GenericListFeature generic, final int i) {
    String _xifexpression = null;
    if ((i == 0)) {
      _xifexpression = this.listBaseDictionary(generic);
    } else {
      String _xifexpression_1 = null;
      FeatureType _type = generic.getType();
      if ((_type instanceof GenericListFeature)) {
        FeatureType _type_1 = generic.getType();
        _xifexpression_1 = this.listBaseDictionaryAtDepth(((GenericListFeature) _type_1), (i - 1));
      } else {
        _xifexpression_1 = this.listBaseDictionary(generic);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String listBaseStringAtDepth(final GenericListFeature generic, final int i) {
    String _xifexpression = null;
    if ((i == 0)) {
      _xifexpression = this.listBaseString(generic);
    } else {
      String _xifexpression_1 = null;
      FeatureType _type = generic.getType();
      if ((_type instanceof GenericListFeature)) {
        FeatureType _type_1 = generic.getType();
        _xifexpression_1 = this.listBaseStringAtDepth(((GenericListFeature) _type_1), (i - 1));
      } else {
        _xifexpression_1 = this.listBaseString(generic);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence writeFeatures(final String className, final List<Feature> features) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Feature feature : features) {
        {
          FeatureType _type = feature.getType();
          if ((_type instanceof EntitiesFeature)) {
            {
              FeatureType _type_1 = feature.getType();
              Entities _type_2 = ((EntitiesFeature) _type_1).getType();
              if ((_type_2 instanceof Entity)) {
                _builder.append("if let ");
                String _name = feature.getName();
                _builder.append(_name, "");
                _builder.append("Value = obj.");
                String _name_1 = feature.getName();
                _builder.append(_name_1, "");
                _builder.newLineIfNotEmpty();
                _builder.append("{");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("json[");
                _builder.append(className, "\t");
                _builder.append(".");
                String _key = this.utils.key(feature);
                _builder.append(_key, "\t");
                _builder.append("] = ");
                FeatureType _type_3 = feature.getType();
                Entities _type_4 = ((EntitiesFeature) _type_3).getType();
                String _classNameHelper = this.utils.classNameHelper(_type_4);
                _builder.append(_classNameHelper, "\t");
                _builder.append(".toJson(");
                String _name_2 = feature.getName();
                _builder.append(_name_2, "\t");
                _builder.append("Value)");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              } else {
                FeatureType _type_5 = feature.getType();
                Entities _type_6 = ((EntitiesFeature) _type_5).getType();
                if ((_type_6 instanceof com.mguidi.soa.soa.Enum)) {
                  _builder.append("if let ");
                  String _name_3 = feature.getName();
                  _builder.append(_name_3, "");
                  _builder.append("Value = obj.");
                  String _name_4 = feature.getName();
                  _builder.append(_name_4, "");
                  _builder.newLineIfNotEmpty();
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("json[");
                  _builder.append(className, "\t");
                  _builder.append(".");
                  String _key_1 = this.utils.key(feature);
                  _builder.append(_key_1, "\t");
                  _builder.append("] = ");
                  String _name_5 = feature.getName();
                  _builder.append(_name_5, "\t");
                  _builder.append("Value.rawValue");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                }
              }
            }
          } else {
            FeatureType _type_7 = feature.getType();
            if ((_type_7 instanceof PrimitiveFeature)) {
              {
                FeatureType _type_8 = feature.getType();
                PrimitiveType _type_9 = ((PrimitiveFeature) _type_8).getType();
                boolean _equals = Objects.equal(_type_9, PrimitiveType.DECIMAL);
                if (_equals) {
                  _builder.append("if let ");
                  String _name_6 = feature.getName();
                  _builder.append(_name_6, "");
                  _builder.append("Value = obj.");
                  String _name_7 = feature.getName();
                  _builder.append(_name_7, "");
                  _builder.newLineIfNotEmpty();
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("json[");
                  _builder.append(className, "\t");
                  _builder.append(".");
                  String _key_2 = this.utils.key(feature);
                  _builder.append(_key_2, "\t");
                  _builder.append("] = ");
                  String _name_8 = feature.getName();
                  _builder.append(_name_8, "\t");
                  _builder.append("Value.stringValue");
                  _builder.newLineIfNotEmpty();
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  FeatureType _type_10 = feature.getType();
                  PrimitiveType _type_11 = ((PrimitiveFeature) _type_10).getType();
                  boolean _equals_1 = Objects.equal(_type_11, PrimitiveType.DATE);
                  if (_equals_1) {
                    _builder.append("if let ");
                    String _name_9 = feature.getName();
                    _builder.append(_name_9, "");
                    _builder.append("Value = obj.");
                    String _name_10 = feature.getName();
                    _builder.append(_name_10, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("let formatter = NSDateFormatter()");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("formatter.dateFormat = \"yyyy-MM-dd\"");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("json[");
                    _builder.append(className, "\t");
                    _builder.append(".");
                    String _key_3 = this.utils.key(feature);
                    _builder.append(_key_3, "\t");
                    _builder.append("] = formatter.stringFromDate(");
                    String _name_11 = feature.getName();
                    _builder.append(_name_11, "\t");
                    _builder.append("Value)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    FeatureType _type_12 = feature.getType();
                    PrimitiveType _type_13 = ((PrimitiveFeature) _type_12).getType();
                    boolean _equals_2 = Objects.equal(_type_13, PrimitiveType.DATETIME);
                    if (_equals_2) {
                      _builder.append("if let ");
                      String _name_12 = feature.getName();
                      _builder.append(_name_12, "");
                      _builder.append("Value = obj.");
                      String _name_13 = feature.getName();
                      _builder.append(_name_13, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append("{");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("let formatter = NSDateFormatter()");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSS\"");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("json[");
                      _builder.append(className, "\t");
                      _builder.append(".");
                      String _key_4 = this.utils.key(feature);
                      _builder.append(_key_4, "\t");
                      _builder.append("] = formatter.stringFromDate(");
                      String _name_14 = feature.getName();
                      _builder.append(_name_14, "\t");
                      _builder.append("Value)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      FeatureType _type_14 = feature.getType();
                      PrimitiveType _type_15 = ((PrimitiveFeature) _type_14).getType();
                      boolean _equals_3 = Objects.equal(_type_15, PrimitiveType.TIMESTAMP);
                      if (_equals_3) {
                        _builder.append("if let ");
                        String _name_15 = feature.getName();
                        _builder.append(_name_15, "");
                        _builder.append("Value = obj.");
                        String _name_16 = feature.getName();
                        _builder.append(_name_16, "");
                        _builder.newLineIfNotEmpty();
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("let formatter = NSDateFormatter()");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\"");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("json[");
                        _builder.append(className, "\t");
                        _builder.append(".");
                        String _key_5 = this.utils.key(feature);
                        _builder.append(_key_5, "\t");
                        _builder.append("] = formatter.stringFromDate(");
                        String _name_17 = feature.getName();
                        _builder.append(_name_17, "\t");
                        _builder.append("Value)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        _builder.append("if let ");
                        String _name_18 = feature.getName();
                        _builder.append(_name_18, "");
                        _builder.append("Value = obj.");
                        String _name_19 = feature.getName();
                        _builder.append(_name_19, "");
                        _builder.newLineIfNotEmpty();
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("json[");
                        _builder.append(className, "\t");
                        _builder.append(".");
                        String _key_6 = this.utils.key(feature);
                        _builder.append(_key_6, "\t");
                        _builder.append("] = ");
                        String _name_20 = feature.getName();
                        _builder.append(_name_20, "\t");
                        _builder.append("Value");
                        _builder.newLineIfNotEmpty();
                        _builder.append("}");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            } else {
              FeatureType _type_16 = feature.getType();
              if ((_type_16 instanceof GenericListFeature)) {
                {
                  FeatureType _type_17 = feature.getType();
                  FeatureType _baseType = this.utils.baseType(((GenericListFeature) _type_17));
                  if ((_baseType instanceof EntitiesFeature)) {
                    {
                      FeatureType _type_18 = feature.getType();
                      FeatureType _baseType_1 = this.utils.baseType(((GenericListFeature) _type_18));
                      Entities _type_19 = ((EntitiesFeature) _baseType_1).getType();
                      if ((_type_19 instanceof Entity)) {
                        _builder.append("if let array");
                        FeatureType _type_20 = feature.getType();
                        int _depthToBaseType = this.utils.depthToBaseType(((GenericListFeature) _type_20));
                        int _minus = (_depthToBaseType - 1);
                        _builder.append(_minus, "");
                        _builder.append(" = obj.");
                        String _name_21 = feature.getName();
                        _builder.append(_name_21, "");
                        _builder.append(" {");
                        _builder.newLineIfNotEmpty();
                        {
                          FeatureType _type_21 = feature.getType();
                          int _depthToBaseType_1 = this.utils.depthToBaseType(((GenericListFeature) _type_21));
                          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _depthToBaseType_1, true);
                          for(final Integer i : _doubleDotLessThan) {
                            _builder.append("\t");
                            FeatureType _type_22 = feature.getType();
                            int _depthToBaseType_2 = this.utils.depthToBaseType(((GenericListFeature) _type_22));
                            int _minus_1 = (_depthToBaseType_2 - (i).intValue());
                            int index = (_minus_1 - 1);
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append("var list");
                            _builder.append(index, "\t");
                            _builder.append(" = ");
                            FeatureType _type_23 = feature.getType();
                            String _listBaseDictionaryAtDepth = this.listBaseDictionaryAtDepth(((GenericListFeature) _type_23), (i).intValue());
                            _builder.append(_listBaseDictionaryAtDepth, "\t");
                            _builder.append("()");
                            _builder.newLineIfNotEmpty();
                            {
                              if ((index == 0)) {
                                _builder.append("\t");
                                _builder.append("for obj0 in array0");
                                _builder.newLine();
                              } else {
                                _builder.append("\t");
                                _builder.append("for array");
                                _builder.append((index - 1), "\t");
                                _builder.append(" in array");
                                _builder.append(index, "\t");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                            _builder.append("\t");
                            _builder.append("{");
                            _builder.newLine();
                          }
                        }
                        _builder.append("\t\t");
                        _builder.append("list0.append(");
                        FeatureType _type_24 = feature.getType();
                        FeatureType _baseType_2 = this.utils.baseType(((GenericListFeature) _type_24));
                        Entities _type_25 = ((EntitiesFeature) _baseType_2).getType();
                        String _classNameHelper_1 = this.utils.classNameHelper(_type_25);
                        _builder.append(_classNameHelper_1, "\t\t");
                        _builder.append(".toJson(obj0))");
                        _builder.newLineIfNotEmpty();
                        {
                          FeatureType _type_26 = feature.getType();
                          int _depthToBaseType_3 = this.utils.depthToBaseType(((GenericListFeature) _type_26));
                          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _depthToBaseType_3, true);
                          for(final Integer i_1 : _doubleDotLessThan_1) {
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                            {
                              FeatureType _type_27 = feature.getType();
                              int _depthToBaseType_4 = this.utils.depthToBaseType(((GenericListFeature) _type_27));
                              int _minus_2 = (_depthToBaseType_4 - 1);
                              boolean _equals_4 = ((i_1).intValue() == _minus_2);
                              if (_equals_4) {
                                _builder.append("\t");
                                _builder.append("json[");
                                _builder.append(className, "\t");
                                _builder.append(".");
                                String _key_7 = this.utils.key(feature);
                                _builder.append(_key_7, "\t");
                                _builder.append("] = list");
                                _builder.append(i_1, "\t");
                                _builder.newLineIfNotEmpty();
                              } else {
                                _builder.append("\t");
                                _builder.append("list");
                                _builder.append(((i_1).intValue() + 1), "\t");
                                _builder.append(".append(list");
                                _builder.append(i_1, "\t");
                                _builder.append(")");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        FeatureType _type_28 = feature.getType();
                        FeatureType _baseType_3 = this.utils.baseType(((GenericListFeature) _type_28));
                        Entities _type_29 = ((EntitiesFeature) _baseType_3).getType();
                        if ((_type_29 instanceof com.mguidi.soa.soa.Enum)) {
                          _builder.append("if let array");
                          FeatureType _type_30 = feature.getType();
                          int _depthToBaseType_5 = this.utils.depthToBaseType(((GenericListFeature) _type_30));
                          int _minus_3 = (_depthToBaseType_5 - 1);
                          _builder.append(_minus_3, "");
                          _builder.append(" = obj.");
                          String _name_22 = feature.getName();
                          _builder.append(_name_22, "");
                          _builder.append(" {");
                          _builder.newLineIfNotEmpty();
                          {
                            FeatureType _type_31 = feature.getType();
                            int _depthToBaseType_6 = this.utils.depthToBaseType(((GenericListFeature) _type_31));
                            ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _depthToBaseType_6, true);
                            for(final Integer i_2 : _doubleDotLessThan_2) {
                              _builder.append("\t");
                              FeatureType _type_32 = feature.getType();
                              int _depthToBaseType_7 = this.utils.depthToBaseType(((GenericListFeature) _type_32));
                              int _minus_4 = (_depthToBaseType_7 - (i_2).intValue());
                              int index_1 = (_minus_4 - 1);
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("var list");
                              _builder.append(index_1, "\t");
                              _builder.append(" = ");
                              FeatureType _type_33 = feature.getType();
                              String _listBaseStringAtDepth = this.listBaseStringAtDepth(((GenericListFeature) _type_33), (i_2).intValue());
                              _builder.append(_listBaseStringAtDepth, "\t");
                              _builder.append("()");
                              _builder.newLineIfNotEmpty();
                              {
                                if ((index_1 == 0)) {
                                  _builder.append("\t");
                                  _builder.append("for obj0 in array0");
                                  _builder.newLine();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("for array");
                                  _builder.append((index_1 - 1), "\t");
                                  _builder.append(" in array");
                                  _builder.append(index_1, "\t");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                              _builder.append("\t");
                              _builder.append("{");
                              _builder.newLine();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("list0.append(obj0.rawValue)");
                          _builder.newLine();
                          {
                            FeatureType _type_34 = feature.getType();
                            int _depthToBaseType_8 = this.utils.depthToBaseType(((GenericListFeature) _type_34));
                            ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _depthToBaseType_8, true);
                            for(final Integer i_3 : _doubleDotLessThan_3) {
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              {
                                FeatureType _type_35 = feature.getType();
                                int _depthToBaseType_9 = this.utils.depthToBaseType(((GenericListFeature) _type_35));
                                int _minus_5 = (_depthToBaseType_9 - 1);
                                boolean _equals_5 = ((i_3).intValue() == _minus_5);
                                if (_equals_5) {
                                  _builder.append("\t");
                                  _builder.append("json[");
                                  _builder.append(className, "\t");
                                  _builder.append(".");
                                  String _key_8 = this.utils.key(feature);
                                  _builder.append(_key_8, "\t");
                                  _builder.append("] = list");
                                  _builder.append(i_3, "\t");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("list");
                                  _builder.append(((i_3).intValue() + 1), "\t");
                                  _builder.append(".append(list");
                                  _builder.append(i_3, "\t");
                                  _builder.append(")");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                          _builder.append("}");
                          _builder.newLine();
                        }
                      }
                    }
                  } else {
                    FeatureType _type_36 = feature.getType();
                    FeatureType _baseType_4 = this.utils.baseType(((GenericListFeature) _type_36));
                    if ((_baseType_4 instanceof PrimitiveFeature)) {
                      {
                        FeatureType _type_37 = feature.getType();
                        FeatureType _baseType_5 = this.utils.baseType(((GenericListFeature) _type_37));
                        PrimitiveType _type_38 = ((PrimitiveFeature) _baseType_5).getType();
                        boolean _equals_6 = Objects.equal(_type_38, PrimitiveType.DECIMAL);
                        if (_equals_6) {
                          _builder.append("if let array");
                          FeatureType _type_39 = feature.getType();
                          int _depthToBaseType_10 = this.utils.depthToBaseType(((GenericListFeature) _type_39));
                          int _minus_6 = (_depthToBaseType_10 - 1);
                          _builder.append(_minus_6, "");
                          _builder.append(" = obj.");
                          String _name_23 = feature.getName();
                          _builder.append(_name_23, "");
                          _builder.append(" {");
                          _builder.newLineIfNotEmpty();
                          {
                            FeatureType _type_40 = feature.getType();
                            int _depthToBaseType_11 = this.utils.depthToBaseType(((GenericListFeature) _type_40));
                            ExclusiveRange _doubleDotLessThan_4 = new ExclusiveRange(0, _depthToBaseType_11, true);
                            for(final Integer i_4 : _doubleDotLessThan_4) {
                              _builder.append("\t");
                              FeatureType _type_41 = feature.getType();
                              int _depthToBaseType_12 = this.utils.depthToBaseType(((GenericListFeature) _type_41));
                              int _minus_7 = (_depthToBaseType_12 - (i_4).intValue());
                              int index_2 = (_minus_7 - 1);
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append("var list");
                              _builder.append(index_2, "\t");
                              _builder.append(" = ");
                              FeatureType _type_42 = feature.getType();
                              String _listBaseStringAtDepth_1 = this.listBaseStringAtDepth(((GenericListFeature) _type_42), (i_4).intValue());
                              _builder.append(_listBaseStringAtDepth_1, "\t");
                              _builder.append("()");
                              _builder.newLineIfNotEmpty();
                              {
                                if ((index_2 == 0)) {
                                  _builder.append("\t");
                                  _builder.append("for obj0 in array0");
                                  _builder.newLine();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("for array");
                                  _builder.append((index_2 - 1), "\t");
                                  _builder.append(" in array");
                                  _builder.append(index_2, "\t");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                              _builder.append("\t");
                              _builder.append("{");
                              _builder.newLine();
                            }
                          }
                          _builder.append("\t\t");
                          _builder.append("list0.append(obj0.stringValue)");
                          _builder.newLine();
                          {
                            FeatureType _type_43 = feature.getType();
                            int _depthToBaseType_13 = this.utils.depthToBaseType(((GenericListFeature) _type_43));
                            ExclusiveRange _doubleDotLessThan_5 = new ExclusiveRange(0, _depthToBaseType_13, true);
                            for(final Integer i_5 : _doubleDotLessThan_5) {
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                              {
                                FeatureType _type_44 = feature.getType();
                                int _depthToBaseType_14 = this.utils.depthToBaseType(((GenericListFeature) _type_44));
                                int _minus_8 = (_depthToBaseType_14 - 1);
                                boolean _equals_7 = ((i_5).intValue() == _minus_8);
                                if (_equals_7) {
                                  _builder.append("\t");
                                  _builder.append("json[");
                                  _builder.append(className, "\t");
                                  _builder.append(".");
                                  String _key_9 = this.utils.key(feature);
                                  _builder.append(_key_9, "\t");
                                  _builder.append("] = list");
                                  _builder.append(i_5, "\t");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  _builder.append("\t");
                                  _builder.append("list");
                                  _builder.append(((i_5).intValue() + 1), "\t");
                                  _builder.append(".append(list");
                                  _builder.append(i_5, "\t");
                                  _builder.append(")");
                                  _builder.newLineIfNotEmpty();
                                }
                              }
                            }
                          }
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          FeatureType _type_45 = feature.getType();
                          FeatureType _baseType_6 = this.utils.baseType(((GenericListFeature) _type_45));
                          PrimitiveType _type_46 = ((PrimitiveFeature) _baseType_6).getType();
                          boolean _equals_8 = Objects.equal(_type_46, PrimitiveType.DATE);
                          if (_equals_8) {
                            _builder.append("if let array");
                            FeatureType _type_47 = feature.getType();
                            int _depthToBaseType_15 = this.utils.depthToBaseType(((GenericListFeature) _type_47));
                            int _minus_9 = (_depthToBaseType_15 - 1);
                            _builder.append(_minus_9, "");
                            _builder.append(" = obj.");
                            String _name_24 = feature.getName();
                            _builder.append(_name_24, "");
                            _builder.append(" {");
                            _builder.newLineIfNotEmpty();
                            {
                              FeatureType _type_48 = feature.getType();
                              int _depthToBaseType_16 = this.utils.depthToBaseType(((GenericListFeature) _type_48));
                              ExclusiveRange _doubleDotLessThan_6 = new ExclusiveRange(0, _depthToBaseType_16, true);
                              for(final Integer i_6 : _doubleDotLessThan_6) {
                                _builder.append("\t");
                                FeatureType _type_49 = feature.getType();
                                int _depthToBaseType_17 = this.utils.depthToBaseType(((GenericListFeature) _type_49));
                                int _minus_10 = (_depthToBaseType_17 - (i_6).intValue());
                                int index_3 = (_minus_10 - 1);
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("var list");
                                _builder.append(index_3, "\t");
                                _builder.append(" = ");
                                FeatureType _type_50 = feature.getType();
                                String _listBaseStringAtDepth_2 = this.listBaseStringAtDepth(((GenericListFeature) _type_50), (i_6).intValue());
                                _builder.append(_listBaseStringAtDepth_2, "\t");
                                _builder.append("()");
                                _builder.newLineIfNotEmpty();
                                {
                                  if ((index_3 == 0)) {
                                    _builder.append("\t");
                                    _builder.append("for obj0 in array0");
                                    _builder.newLine();
                                  } else {
                                    _builder.append("\t");
                                    _builder.append("for array");
                                    _builder.append((index_3 - 1), "\t");
                                    _builder.append(" in array");
                                    _builder.append(index_3, "\t");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                                _builder.append("\t");
                                _builder.append("{");
                                _builder.newLine();
                              }
                            }
                            _builder.append("\t\t");
                            _builder.append("let formatter = NSDateFormatter()");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("formatter.dateFormat = \"yyyy-MM-dd\"");
                            _builder.newLine();
                            _builder.append("\t\t");
                            _builder.append("list0.append(formatter.stringFromDate(obj0))");
                            _builder.newLine();
                            {
                              FeatureType _type_51 = feature.getType();
                              int _depthToBaseType_18 = this.utils.depthToBaseType(((GenericListFeature) _type_51));
                              ExclusiveRange _doubleDotLessThan_7 = new ExclusiveRange(0, _depthToBaseType_18, true);
                              for(final Integer i_7 : _doubleDotLessThan_7) {
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                                {
                                  FeatureType _type_52 = feature.getType();
                                  int _depthToBaseType_19 = this.utils.depthToBaseType(((GenericListFeature) _type_52));
                                  int _minus_11 = (_depthToBaseType_19 - 1);
                                  boolean _equals_9 = ((i_7).intValue() == _minus_11);
                                  if (_equals_9) {
                                    _builder.append("\t");
                                    _builder.append("json[");
                                    _builder.append(className, "\t");
                                    _builder.append(".");
                                    String _key_10 = this.utils.key(feature);
                                    _builder.append(_key_10, "\t");
                                    _builder.append("] = list");
                                    _builder.append(i_7, "\t");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("\t");
                                    _builder.append("list");
                                    _builder.append(((i_7).intValue() + 1), "\t");
                                    _builder.append(".append(list");
                                    _builder.append(i_7, "\t");
                                    _builder.append(")");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              }
                            }
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            FeatureType _type_53 = feature.getType();
                            FeatureType _baseType_7 = this.utils.baseType(((GenericListFeature) _type_53));
                            PrimitiveType _type_54 = ((PrimitiveFeature) _baseType_7).getType();
                            boolean _equals_10 = Objects.equal(_type_54, PrimitiveType.DATETIME);
                            if (_equals_10) {
                              _builder.append("if let array");
                              FeatureType _type_55 = feature.getType();
                              int _depthToBaseType_20 = this.utils.depthToBaseType(((GenericListFeature) _type_55));
                              int _minus_12 = (_depthToBaseType_20 - 1);
                              _builder.append(_minus_12, "");
                              _builder.append(" = obj.");
                              String _name_25 = feature.getName();
                              _builder.append(_name_25, "");
                              _builder.append(" {");
                              _builder.newLineIfNotEmpty();
                              {
                                FeatureType _type_56 = feature.getType();
                                int _depthToBaseType_21 = this.utils.depthToBaseType(((GenericListFeature) _type_56));
                                ExclusiveRange _doubleDotLessThan_8 = new ExclusiveRange(0, _depthToBaseType_21, true);
                                for(final Integer i_8 : _doubleDotLessThan_8) {
                                  _builder.append("\t");
                                  FeatureType _type_57 = feature.getType();
                                  int _depthToBaseType_22 = this.utils.depthToBaseType(((GenericListFeature) _type_57));
                                  int _minus_13 = (_depthToBaseType_22 - (i_8).intValue());
                                  int index_4 = (_minus_13 - 1);
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t");
                                  _builder.append("var list");
                                  _builder.append(index_4, "\t");
                                  _builder.append(" = ");
                                  FeatureType _type_58 = feature.getType();
                                  String _listBaseStringAtDepth_3 = this.listBaseStringAtDepth(((GenericListFeature) _type_58), (i_8).intValue());
                                  _builder.append(_listBaseStringAtDepth_3, "\t");
                                  _builder.append("()");
                                  _builder.newLineIfNotEmpty();
                                  {
                                    if ((index_4 == 0)) {
                                      _builder.append("\t");
                                      _builder.append("for obj0 in array0");
                                      _builder.newLine();
                                    } else {
                                      _builder.append("\t");
                                      _builder.append("for array");
                                      _builder.append((index_4 - 1), "\t");
                                      _builder.append(" in array");
                                      _builder.append(index_4, "\t");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                  _builder.append("\t");
                                  _builder.append("{");
                                  _builder.newLine();
                                }
                              }
                              _builder.append("\t\t");
                              _builder.append("let formatter = NSDateFormatter()");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSS\"");
                              _builder.newLine();
                              _builder.append("\t\t");
                              _builder.append("list0.append(formatter.stringFromDate(obj0))");
                              _builder.newLine();
                              {
                                FeatureType _type_59 = feature.getType();
                                int _depthToBaseType_23 = this.utils.depthToBaseType(((GenericListFeature) _type_59));
                                ExclusiveRange _doubleDotLessThan_9 = new ExclusiveRange(0, _depthToBaseType_23, true);
                                for(final Integer i_9 : _doubleDotLessThan_9) {
                                  _builder.append("\t");
                                  _builder.append("}");
                                  _builder.newLine();
                                  {
                                    FeatureType _type_60 = feature.getType();
                                    int _depthToBaseType_24 = this.utils.depthToBaseType(((GenericListFeature) _type_60));
                                    int _minus_14 = (_depthToBaseType_24 - 1);
                                    boolean _equals_11 = ((i_9).intValue() == _minus_14);
                                    if (_equals_11) {
                                      _builder.append("\t");
                                      _builder.append("json[");
                                      _builder.append(className, "\t");
                                      _builder.append(".");
                                      String _key_11 = this.utils.key(feature);
                                      _builder.append(_key_11, "\t");
                                      _builder.append("] = list");
                                      _builder.append(i_9, "\t");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("\t");
                                      _builder.append("list");
                                      _builder.append(((i_9).intValue() + 1), "\t");
                                      _builder.append(".append(list");
                                      _builder.append(i_9, "\t");
                                      _builder.append(")");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              FeatureType _type_61 = feature.getType();
                              FeatureType _baseType_8 = this.utils.baseType(((GenericListFeature) _type_61));
                              PrimitiveType _type_62 = ((PrimitiveFeature) _baseType_8).getType();
                              boolean _equals_12 = Objects.equal(_type_62, PrimitiveType.TIMESTAMP);
                              if (_equals_12) {
                                _builder.append("if let array");
                                FeatureType _type_63 = feature.getType();
                                int _depthToBaseType_25 = this.utils.depthToBaseType(((GenericListFeature) _type_63));
                                int _minus_15 = (_depthToBaseType_25 - 1);
                                _builder.append(_minus_15, "");
                                _builder.append(" = obj.");
                                String _name_26 = feature.getName();
                                _builder.append(_name_26, "");
                                _builder.append(" {");
                                _builder.newLineIfNotEmpty();
                                {
                                  FeatureType _type_64 = feature.getType();
                                  int _depthToBaseType_26 = this.utils.depthToBaseType(((GenericListFeature) _type_64));
                                  ExclusiveRange _doubleDotLessThan_10 = new ExclusiveRange(0, _depthToBaseType_26, true);
                                  for(final Integer i_10 : _doubleDotLessThan_10) {
                                    _builder.append("\t");
                                    FeatureType _type_65 = feature.getType();
                                    int _depthToBaseType_27 = this.utils.depthToBaseType(((GenericListFeature) _type_65));
                                    int _minus_16 = (_depthToBaseType_27 - (i_10).intValue());
                                    int index_5 = (_minus_16 - 1);
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t");
                                    _builder.append("var list");
                                    _builder.append(index_5, "\t");
                                    _builder.append(" = ");
                                    FeatureType _type_66 = feature.getType();
                                    String _listBaseStringAtDepth_4 = this.listBaseStringAtDepth(((GenericListFeature) _type_66), (i_10).intValue());
                                    _builder.append(_listBaseStringAtDepth_4, "\t");
                                    _builder.append("()");
                                    _builder.newLineIfNotEmpty();
                                    {
                                      if ((index_5 == 0)) {
                                        _builder.append("\t");
                                        _builder.append("for obj0 in array0");
                                        _builder.newLine();
                                      } else {
                                        _builder.append("\t");
                                        _builder.append("for array");
                                        _builder.append((index_5 - 1), "\t");
                                        _builder.append(" in array");
                                        _builder.append(index_5, "\t");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                    _builder.append("\t");
                                    _builder.append("{");
                                    _builder.newLine();
                                  }
                                }
                                _builder.append("\t\t");
                                _builder.append("let formatter = NSDateFormatter()");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.append("formatter.dateFormat = \"yyyy-MM-dd\'T\'HH:mm:ss.SSSZ\"");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.append("list0.append(formatter.stringFromDate(obj0))");
                                _builder.newLine();
                                {
                                  FeatureType _type_67 = feature.getType();
                                  int _depthToBaseType_28 = this.utils.depthToBaseType(((GenericListFeature) _type_67));
                                  ExclusiveRange _doubleDotLessThan_11 = new ExclusiveRange(0, _depthToBaseType_28, true);
                                  for(final Integer i_11 : _doubleDotLessThan_11) {
                                    _builder.append("\t");
                                    _builder.append("}");
                                    _builder.newLine();
                                    {
                                      FeatureType _type_68 = feature.getType();
                                      int _depthToBaseType_29 = this.utils.depthToBaseType(((GenericListFeature) _type_68));
                                      int _minus_17 = (_depthToBaseType_29 - 1);
                                      boolean _equals_13 = ((i_11).intValue() == _minus_17);
                                      if (_equals_13) {
                                        _builder.append("\t");
                                        _builder.append("json[");
                                        _builder.append(className, "\t");
                                        _builder.append(".");
                                        String _key_12 = this.utils.key(feature);
                                        _builder.append(_key_12, "\t");
                                        _builder.append("] = list");
                                        _builder.append(i_11, "\t");
                                        _builder.newLineIfNotEmpty();
                                      } else {
                                        _builder.append("\t");
                                        _builder.append("list");
                                        _builder.append(((i_11).intValue() + 1), "\t");
                                        _builder.append(".append(list");
                                        _builder.append(i_11, "\t");
                                        _builder.append(")");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                  }
                                }
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                _builder.append("if let ");
                                String _name_27 = feature.getName();
                                _builder.append(_name_27, "");
                                _builder.append("Value = obj.");
                                String _name_28 = feature.getName();
                                _builder.append(_name_28, "");
                                _builder.newLineIfNotEmpty();
                                _builder.append("{");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("json[");
                                _builder.append(className, "\t");
                                _builder.append(".");
                                String _key_13 = this.utils.key(feature);
                                _builder.append(_key_13, "\t");
                                _builder.append("] = ");
                                String _name_29 = feature.getName();
                                _builder.append(_name_29, "\t");
                                _builder.append("Value");
                                _builder.newLineIfNotEmpty();
                                _builder.append("}");
                                _builder.newLine();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
}
