package com.mguidi.soa.generator.java;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Comment;
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
    _builder.append("public enum ");
    String _className_1 = this.utils.className(entity);
    _builder.append(_className_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _features = entity.getFeatures();
      for(final String feature : _features) {
        _builder.append("\t");
        _builder.append(feature, "\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("_UNDEFINED_");
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
