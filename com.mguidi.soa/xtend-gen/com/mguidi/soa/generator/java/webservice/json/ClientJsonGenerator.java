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
    {
      boolean _accountRequired = this.accountRequired(service);
      if (_accountRequired) {
        _builder.append("import com.mguidi.soa.commons.service.AuthTokenManager;");
        _builder.newLine();
        _builder.newLine();
      }
    }
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
    _builder.append("import com.mguidi.soa.commons.service.BaseClient;");
    _builder.newLine();
    _builder.append("import com.mguidi.soa.commons.service.ServiceException;");
    _builder.newLine();
    _builder.append("import com.mguidi.soa.commons.service.ServiceExceptionHelper;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _classNameClient = this.utils.classNameClient(service);
    _builder.append(_classNameClient, "");
    _builder.append(" extends BaseClient implements ");
    String _qualifiedClassNameInterface = this.utils.qualifiedClassNameInterface(service);
    _builder.append(_qualifiedClassNameInterface, "");
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
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String mServiceAddress;");
    _builder.newLine();
    {
      boolean _accountRequired_1 = this.accountRequired(service);
      if (_accountRequired_1) {
        _builder.append("\t");
        _builder.append("private AuthTokenManager mAuthTokenManager;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _classNameClient_1 = this.utils.classNameClient(service);
    _builder.append(_classNameClient_1, "\t");
    _builder.append("(String baseAddress");
    {
      boolean _accountRequired_2 = this.accountRequired(service);
      if (_accountRequired_2) {
        _builder.append(", AuthTokenManager authTokenMager");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("mServiceAddress = baseAddress + NAME;");
    _builder.newLine();
    {
      boolean _accountRequired_3 = this.accountRequired(service);
      if (_accountRequired_3) {
        _builder.append("\t\t");
        _builder.append("mAuthTokenManager = authTokenMager;");
        _builder.newLine();
      }
    }
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
            String _qualifiedClassNameInput = this.utils.qualifiedClassNameInput(operation);
            _builder.append(_qualifiedClassNameInput, "\t");
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
        {
          EList<Feature> _featuresOutput_1 = operation.getFeaturesOutput();
          int _size_2 = _featuresOutput_1.size();
          boolean _greaterThan_2 = (_size_2 > 0);
          if (_greaterThan_2) {
            _builder.append("return ");
          }
        }
        String _signature_1 = this.utils.signature(operation);
        _builder.append(_signature_1, "\t\t");
        _builder.append("(");
        {
          EList<Feature> _featuresInput_1 = operation.getFeaturesInput();
          int _size_3 = _featuresInput_1.size();
          boolean _greaterThan_3 = (_size_3 > 0);
          if (_greaterThan_3) {
            _builder.append("input, ");
          }
        }
        _builder.append("1);");
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
        _builder.append("public ");
        {
          EList<Feature> _featuresOutput_2 = operation.getFeaturesOutput();
          int _size_4 = _featuresOutput_2.size();
          boolean _greaterThan_4 = (_size_4 > 0);
          if (_greaterThan_4) {
            String _qualifiedClassNameOutput_1 = this.utils.qualifiedClassNameOutput(operation);
            _builder.append(_qualifiedClassNameOutput_1, "\t");
          } else {
            _builder.append("void");
          }
        }
        _builder.append(" ");
        String _signature_2 = this.utils.signature(operation);
        _builder.append(_signature_2, "\t");
        _builder.append("(");
        {
          EList<Feature> _featuresInput_2 = operation.getFeaturesInput();
          int _size_5 = _featuresInput_2.size();
          boolean _greaterThan_5 = (_size_5 > 0);
          if (_greaterThan_5) {
            String _qualifiedClassNameInput_1 = this.utils.qualifiedClassNameInput(operation);
            _builder.append(_qualifiedClassNameInput_1, "\t");
            _builder.append(" input, ");
          }
        }
        _builder.append("int maxRetries) throws IOException");
        String _throwsException_1 = this.utils.throwsException(operation);
        _builder.append(_throwsException_1, "\t");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        {
          boolean _setTokenRequired = this.setTokenRequired(operation);
          if (_setTokenRequired) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("// set auth token on the input of the request ");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("if (mAuthTokenManager != null) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("input.setAuthToken(mAuthTokenManager.getAuthToken());");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
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
        _builder.append("int numTries = 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("long startTime = System.currentTimeMillis();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("boolean isConnected = false;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("while (numTries < maxRetries) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("HttpURLConnection conn = null;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn = (HttpURLConnection) url.openConnection();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setConnectTimeout(getNextTimeout(numTries));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setRequestProperty(\"Content-Type\", \"application/json;charset=UTF-8\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setRequestMethod(\"POST\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setDoInput(true);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setDoOutput(true);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.setChunkedStreamingMode(0);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("conn.connect();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("isConnected = true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        {
          EList<Feature> _featuresInput_3 = operation.getFeaturesInput();
          int _size_6 = _featuresInput_3.size();
          boolean _greaterThan_6 = (_size_6 > 0);
          if (_greaterThan_6) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("// write parameters");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("JsonWriter writer = new JsonWriter(new OutputStreamWriter(conn.getOutputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            String _qualifiedClassNameInputHelper = this.utils.qualifiedClassNameInputHelper(operation);
            _builder.append(_qualifiedClassNameInputHelper, "\t\t\t\t\t");
            _builder.append(".writeJson(input, writer);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("writer.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("// read response code");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("int response = conn.getResponseCode();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("switch (response) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("case HttpURLConnection.HTTP_OK: {");
        _builder.newLine();
        {
          EList<Feature> _featuresOutput_3 = operation.getFeaturesOutput();
          int _size_7 = _featuresOutput_3.size();
          boolean _greaterThan_7 = (_size_7 > 0);
          if (_greaterThan_7) {
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("// read response");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            String _qualifiedClassNameOutput_2 = this.utils.qualifiedClassNameOutput(operation);
            _builder.append(_qualifiedClassNameOutput_2, "\t\t\t\t\t\t\t");
            _builder.append(" output = ");
            String _qualifiedClassNameOutputHelper = this.utils.qualifiedClassNameOutputHelper(operation);
            _builder.append(_qualifiedClassNameOutputHelper, "\t\t\t\t\t\t\t");
            _builder.append(".fromJson(reader);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.newLine();
            {
              boolean _saveTokenRequired = this.saveTokenRequired(operation);
              if (_saveTokenRequired) {
                _builder.append("\t");
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("if (mAuthTokenManager != null && output.getAuthToken() != null) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("mAuthTokenManager.saveAuthToken(output.getAuthToken());");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("return output;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("reader.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("break;");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        {
          EList<com.mguidi.soa.soa.Exception> _exceptionts = operation.getExceptionts();
          int _size_8 = _exceptionts.size();
          boolean _greaterThan_8 = (_size_8 > 0);
          if (_greaterThan_8) {
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("case ServiceException.STATUS_CODE: {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("// read exception");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
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
                    _builder.append("\t\t\t\t");
                    _builder.append("\t\t");
                    _builder.append("if (exception.getException().equals(\"");
                    QualifiedName _fullyQualifiedName = this.provider.getFullyQualifiedName(exception);
                    _builder.append(_fullyQualifiedName, "\t\t\t\t\t\t\t");
                    _builder.append("\")) {");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t\t");
                    _builder.append("else if (exception.getException().equals(\"");
                    QualifiedName _fullyQualifiedName_1 = this.provider.getFullyQualifiedName(exception);
                    _builder.append(_fullyQualifiedName_1, "\t\t\t\t\t\t\t");
                    _builder.append("\")) {");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("throw new ");
                String _qualifiedClassName = this.utils.qualifiedClassName(exception);
                _builder.append(_qualifiedClassName, "\t\t\t\t\t\t\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t\t");
            _builder.append("else {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t\t\t");
            _builder.append("throw new IOException();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t\t");
            _builder.append("reader.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("default:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t");
        _builder.append("throw new IOException();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("} catch (IOException e) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("if (isTimeoutException(startTime, isConnected, conn.getReadTimeout(), conn.getConnectTimeout()) && numTries < (maxRetries - 1)) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("// Fall through loop, retry");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("// On last attempt, throw the exception regardless");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("throw e;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("} finally {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("if (conn != null) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("conn.disconnect();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("numTries++;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("throw new UnsupportedOperationException();");
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
  
  public boolean setTokenRequired(final Operation operation) {
    EList<Feature> _featuresInput = operation.getFeaturesInput();
    for (final Feature feature : _featuresInput) {
      String _name = feature.getName();
      boolean _equals = _name.equals("authToken");
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public boolean saveTokenRequired(final Operation operation) {
    EList<Feature> _featuresOutput = operation.getFeaturesOutput();
    for (final Feature feature : _featuresOutput) {
      String _name = feature.getName();
      boolean _equals = _name.equals("authToken");
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public boolean accountRequired(final Service service) {
    EList<Operation> _operations = service.getOperations();
    for (final Operation operation : _operations) {
      {
        EList<Feature> _featuresInput = operation.getFeaturesInput();
        for (final Feature feature : _featuresInput) {
          String _name = feature.getName();
          boolean _equals = _name.equals("authToken");
          if (_equals) {
            return true;
          }
        }
        EList<Feature> _featuresOutput = operation.getFeaturesOutput();
        for (final Feature feature_1 : _featuresOutput) {
          String _name_1 = feature_1.getName();
          boolean _equals_1 = _name_1.equals("authToken");
          if (_equals_1) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
