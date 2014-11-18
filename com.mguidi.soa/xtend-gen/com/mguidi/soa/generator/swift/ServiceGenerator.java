package com.mguidi.soa.generator.swift;

import com.google.inject.Inject;
import com.mguidi.soa.generator.swift.Utils;
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
    _builder.append("import Foundation");
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
    _builder.append("public protocol ");
    String _className_1 = this.utils.className(service);
    _builder.append(_className_1, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Operation> _operations = service.getOperations();
      for(final Operation operation : _operations) {
        _builder.append("\t");
        _builder.append("func ");
        String _signature = this.utils.signature(operation);
        _builder.append(_signature, "\t");
        _builder.append("(");
        String _input = this.utils.input(operation);
        _builder.append(_input, "\t");
        _builder.append("error: NSError) -> (");
        {
          EList<Feature> _featuresOutput = operation.getFeaturesOutput();
          int _size = _featuresOutput.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            String _classNameOutput = this.utils.classNameOutput(operation);
            _builder.append(_classNameOutput, "\t");
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
