package com.mguidi.soa.generator.java;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModelGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateEnum(final com.mguidi.soa.soa.Enum entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = this.utils.packageName(entity);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.utils.className(entity);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _features = entity.getFeatures();
      for(final String feature : _features) {
        _builder.append("\t");
        _builder.append("public static ");
        String _className_1 = this.utils.className(entity);
        _builder.append(_className_1, "\t");
        _builder.append(" _");
        _builder.append(feature, "\t");
        _builder.append(" = new ");
        String _className_2 = this.utils.className(entity);
        _builder.append(_className_2, "\t");
        _builder.append("(\"");
        _builder.append(feature, "\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("public static ");
    String _className_3 = this.utils.className(entity);
    _builder.append(_className_3, "\t");
    _builder.append(" _UNDEFINED_ = new ");
    String _className_4 = this.utils.className(entity);
    _builder.append(_className_4, "\t");
    _builder.append("(\"_UNDEFINED_\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String mValue;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _className_5 = this.utils.className(entity);
    _builder.append(_className_5, "\t");
    _builder.append("(String value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("mValue = value;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return mValue.hashCode();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean equals(Object o) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (o instanceof  ");
    String _className_6 = this.utils.className(entity);
    _builder.append(_className_6, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return mValue.equals(((");
    String _className_7 = this.utils.className(entity);
    _builder.append(_className_7, "\t\t\t");
    _builder.append(") o).mValue);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return mValue;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _className_8 = this.utils.className(entity);
    _builder.append(_className_8, "\t");
    _builder.append(" valueOf(String value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (value == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<String> _features_1 = entity.getFeatures();
      for(final String feature_1 : _features_1) {
        {
          EList<String> _features_2 = entity.getFeatures();
          String _get = _features_2.get(0);
          boolean _equals = Objects.equal(feature_1, _get);
          if (_equals) {
            _builder.append("\t\t");
            _builder.append("if (value.equals(\"");
            _builder.append(feature_1, "\t\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("} else if (value.equals(\"");
            _builder.append(feature_1, "\t\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return _");
        _builder.append(feature_1, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return _UNDEFINED_;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = this.utils.packageName(entity);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.utils.className(entity);
    _builder.append(_className, "");
    _builder.append(" {");
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
        String _className_1 = this.utils.className(entity);
        _builder.append(_className_1, "\t");
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
