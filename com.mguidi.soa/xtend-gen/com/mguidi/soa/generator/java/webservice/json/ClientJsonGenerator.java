package com.mguidi.soa.generator.java.webservice.json;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ClientJsonGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private QualifiedNameProvider provider;
  
  public CharSequence generateClient(final Service service) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameClient = this.utils.packageNameClient(service);
    _builder.append(_packageNameClient, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.io.InputStreamReader;");
    _builder.newLine();
    _builder.append("import java.io.OutputStreamWriter;");
    _builder.newLine();
    _builder.append("import java.net.HttpURLConnection;");
    _builder.newLine();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.gson.stream.JsonReader;");
    _builder.newLine();
    _builder.append("import com.google.gson.stream.JsonWriter;");
    _builder.newLine();
    _builder.append("import com.mguidi.soa.commons.service.ServiceException;");
    _builder.newLine();
    _builder.append("import com.mguidi.soa.commons.service.ServiceExceptionHelper;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.append("* ");
    String _classNameClient = this.utils.classNameClient(service);
    _builder.append(_classNameClient, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _classNameClient_1 = this.utils.classNameClient(service);
    _builder.append(_classNameClient_1, "");
    _builder.append(" implements ");
    String _qualifiedClassName = this.utils.qualifiedClassName(service);
    _builder.append(_qualifiedClassName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String NAME = \"/");
    String _moduleName = this.utils.moduleName(service);
    _builder.append(_moduleName, "\t");
    _builder.append("/");
    String _version = this.utils.version(service);
    _builder.append(_version, "\t");
    _builder.append("/");
    String _serviceName = this.utils.serviceName(service);
    _builder.append(_serviceName, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String ENCODING = \"UTF-8\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String mServiceAddress;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _classNameClient_2 = this.utils.classNameClient(service);
    _builder.append(_classNameClient_2, "\t");
    _builder.append("(String baseAddress) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("mServiceAddress = baseAddress + NAME;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Operation> _operations = service.getOperations();
      for(final Operation operation : _operations) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
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
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("URL url = new URL(mServiceAddress+\"/");
        String _name = operation.getName();
        _builder.append(_name, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("HttpURLConnection conn = (HttpURLConnection) url.openConnection();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.setRequestProperty(\"Content-Type\", \"application/json;charset=UTF-8\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.setRequestMethod(\"POST\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.setDoInput(true);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.setDoOutput(true);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.setChunkedStreamingMode(0);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<Feature> _featuresInput_1 = operation.getFeaturesInput();
          int _size_2 = _featuresInput_1.size();
          boolean _greaterThan_2 = (_size_2 > 0);
          if (_greaterThan_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("// write parameters");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("JsonWriter writer = new JsonWriter(new OutputStreamWriter(conn.getOutputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _qualifiedClassNameInputHelper = this.utils.qualifiedClassNameInputHelper(operation);
            _builder.append(_qualifiedClassNameInputHelper, "\t\t\t\t");
            _builder.append(".writeJson(input, writer);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("writer.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// read response code");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("int response = conn.getResponseCode();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("switch (response) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("case HttpURLConnection.HTTP_OK: {");
        _builder.newLine();
        {
          EList<Feature> _featuresOutput_1 = operation.getFeaturesOutput();
          int _size_3 = _featuresOutput_1.size();
          boolean _greaterThan_3 = (_size_3 > 0);
          if (_greaterThan_3) {
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("// read response");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            String _qualifiedClassNameOutput_1 = this.utils.qualifiedClassNameOutput(operation);
            _builder.append(_qualifiedClassNameOutput_1, "\t\t\t\t\t\t");
            _builder.append(" output = ");
            String _qualifiedClassNameOutputHelper = this.utils.qualifiedClassNameOutputHelper(operation);
            _builder.append(_qualifiedClassNameOutputHelper, "\t\t\t\t\t\t");
            _builder.append(".fromJson(reader);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("return output;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("reader.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("break;");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        {
          EList<com.mguidi.soa.soa.Exception> _exceptionts = operation.getExceptionts();
          int _size_4 = _exceptionts.size();
          boolean _greaterThan_4 = (_size_4 > 0);
          if (_greaterThan_4) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("case ServiceException.STATUS_CODE: {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("// read exception");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("ServiceException exception = ServiceExceptionHelper.fromJson(reader);");
            _builder.newLine();
            {
              EList<com.mguidi.soa.soa.Exception> _exceptionts_1 = operation.getExceptionts();
              for(final com.mguidi.soa.soa.Exception exception : _exceptionts_1) {
                {
                  EList<com.mguidi.soa.soa.Exception> _exceptionts_2 = operation.getExceptionts();
                  com.mguidi.soa.soa.Exception _get = _exceptionts_2.get(0);
                  boolean _equals = Objects.equal(exception, _get);
                  if (_equals) {
                    _builder.append("\t");
                    _builder.append("\t\t\t");
                    _builder.append("\t\t");
                    _builder.append("if (exception.getException().equals(");
                    QualifiedName _fullyQualifiedName = this.provider.getFullyQualifiedName(exception);
                    _builder.append(_fullyQualifiedName, "\t\t\t\t\t\t");
                    _builder.append(")) {");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t\t");
                    _builder.append("\t\t");
                    _builder.append("else if (exception.getCode().equals(");
                    QualifiedName _fullyQualifiedName_1 = this.provider.getFullyQualifiedName(exception);
                    _builder.append(_fullyQualifiedName_1, "\t\t\t\t\t\t");
                    _builder.append(")) {");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t\t\t");
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("throw new ");
                String _qualifiedClassName_1 = this.utils.qualifiedClassName(exception);
                _builder.append(_qualifiedClassName_1, "\t\t\t\t\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t\t");
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("else {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t\t");
            _builder.append("throw new IOException();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t\t");
            _builder.append("reader.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("default:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("throw new IOException();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} finally {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("conn.disconnect();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
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
}
