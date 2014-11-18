package com.mguidi.soa.generator.java;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.FeatureType;
import com.mguidi.soa.soa.Operation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OperationInputGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateOperationInput(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameInput = this.utils.packageNameInput(operation);
    _builder.append(_packageNameInput, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.append("* ");
    String _classNameInput = this.utils.classNameInput(operation);
    _builder.append(_classNameInput, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _classNameInput_1 = this.utils.classNameInput(operation);
    _builder.append(_classNameInput_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Feature> _featuresInput = operation.getFeaturesInput();
      for(final Feature feature : _featuresInput) {
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
      EList<Feature> _featuresInput_1 = operation.getFeaturesInput();
      for(final Feature feature_1 : _featuresInput_1) {
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
