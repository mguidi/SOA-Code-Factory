package com.mguidi.soa.generator.java;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ServiceGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateService(final Service service) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = this.utils.packageName(service);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.append("* ");
    String _className = this.utils.className(service);
    _builder.append(_className, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public interface ");
    String _className_1 = this.utils.className(service);
    _builder.append(_className_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Operation> _operations = service.getOperations();
      for(final Operation operation : _operations) {
        _builder.append("\t");
        _builder.append("public ");
        {
          EList<Feature> _featuresOutput = operation.getFeaturesOutput();
          int _size = _featuresOutput.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            String _qualifiedClassNameOutput = this.utils.qualifiedClassNameOutput(operation);
            _builder.append(_qualifiedClassNameOutput, "\t");
          } else {
            _builder.append("void");
          }
        }
        _builder.append(" ");
        String _signature = this.utils.signature(operation);
        _builder.append(_signature, "\t");
        _builder.append("(");
        {
          EList<Feature> _featuresInput = operation.getFeaturesInput();
          int _size_1 = _featuresInput.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          if (_greaterThan_1) {
            String _classNameInput = this.utils.classNameInput(operation);
            _builder.append(_classNameInput, "\t");
            _builder.append(" input");
          }
        }
        _builder.append(") throws IOException");
        String _throwsException = this.utils.throwsException(operation);
        _builder.append(_throwsException, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
