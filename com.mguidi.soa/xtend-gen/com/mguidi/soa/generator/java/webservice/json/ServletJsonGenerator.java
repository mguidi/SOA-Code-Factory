package com.mguidi.soa.generator.java.webservice.json;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ServletJsonGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  public CharSequence generateServlet(final Service service) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameServlet = this.utils.packageNameServlet(service);
    _builder.append(_packageNameServlet, "");
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
    _builder.newLine();
    _builder.append("import javax.servlet.ServletException;");
    _builder.newLine();
    _builder.append("import javax.servlet.http.HttpServlet;");
    _builder.newLine();
    _builder.append("import javax.servlet.http.HttpServletRequest;");
    _builder.newLine();
    _builder.append("import javax.servlet.http.HttpServletResponse;");
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
    _builder.append("public abstract class ");
    String _classNameServlet = this.utils.classNameServlet(service);
    _builder.append(_classNameServlet, "");
    _builder.append("  extends HttpServlet implements ");
    String _qualifiedClassName = this.utils.qualifiedClassName(service);
    _builder.append(_qualifiedClassName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
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
    _builder.append("/*\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String ENCODING = \"UTF-8\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String CONTENT_TYPE = \"application/json\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String contentType = req.getContentType().split(\";\")[0];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String characterEncoding = req.getCharacterEncoding();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (contentType == null || characterEncoding == null || !contentType.equals(CONTENT_TYPE) || !characterEncoding.equals(ENCODING)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resp.sendError(HttpURLConnection.HTTP_BAD_REQUEST);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("resp.setCharacterEncoding(ENCODING);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("resp.setContentType(CONTENT_TYPE);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String operation = req.getPathInfo();");
    _builder.newLine();
    {
      EList<Operation> _operations = service.getOperations();
      for(final Operation operation : _operations) {
        {
          EList<Operation> _operations_1 = service.getOperations();
          Operation _get = _operations_1.get(0);
          boolean _equals = Objects.equal(operation, _get);
          if (_equals) {
            _builder.append("\t\t");
            _builder.append("if (operation.equals(\"/");
            String _name = operation.getName();
            _builder.append(_name, "\t\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("else if (operation.equals(\"/");
            String _name_1 = operation.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("_");
        String _signature = this.utils.signature(operation);
        _builder.append(_signature, "\t\t\t");
        _builder.append("(req, resp);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("resp.sendError(HttpURLConnection.HTTP_BAD_REQUEST);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Operation> _operations_2 = service.getOperations();
      for(final Operation operation_1 : _operations_2) {
        _builder.append("\t");
        _builder.append("private void _");
        String _signature_1 = this.utils.signature(operation_1);
        _builder.append(_signature_1, "\t");
        _builder.append("(HttpServletRequest req, HttpServletResponse resp) throws IOException {");
        _builder.newLineIfNotEmpty();
        {
          EList<Feature> _featuresInput = operation_1.getFeaturesInput();
          int _size = _featuresInput.size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            _builder.append("\t");
            _builder.append("\t");
            String _qualifiedClassNameInput = this.utils.qualifiedClassNameInput(operation_1);
            _builder.append(_qualifiedClassNameInput, "\t\t");
            _builder.append(" input;");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("JsonReader reader = new JsonReader(new InputStreamReader(req.getInputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("input = ");
            String _qualifiedClassNameInputHelper = this.utils.qualifiedClassNameInputHelper(operation_1);
            _builder.append(_qualifiedClassNameInputHelper, "\t\t\t");
            _builder.append(".fromJson(reader);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("reader.close();");
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
        {
          EList<Feature> _featuresOutput = operation_1.getFeaturesOutput();
          int _size_1 = _featuresOutput.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          if (_greaterThan_1) {
            _builder.append("\t");
            _builder.append("\t");
            String _qualifiedClassNameOutput = this.utils.qualifiedClassNameOutput(operation_1);
            _builder.append(_qualifiedClassNameOutput, "\t\t");
            _builder.append(" output;");
            _builder.newLineIfNotEmpty();
            {
              EList<com.mguidi.soa.soa.Exception> _exceptionts = operation_1.getExceptionts();
              int _size_2 = _exceptionts.size();
              boolean _equals_1 = (_size_2 == 0);
              if (_equals_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("output = ");
                String _signature_2 = this.utils.signature(operation_1);
                _builder.append(_signature_2, "\t\t");
                _builder.append("(input);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("output = ");
                String _signature_3 = this.utils.signature(operation_1);
                _builder.append(_signature_3, "\t\t\t");
                _builder.append("(input);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                {
                  EList<com.mguidi.soa.soa.Exception> _exceptionts_1 = operation_1.getExceptionts();
                  for(final com.mguidi.soa.soa.Exception exceptiont : _exceptionts_1) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("catch (");
                    String _qualifiedClassName_1 = this.utils.qualifiedClassName(exceptiont);
                    _builder.append(_qualifiedClassName_1, "\t\t");
                    _builder.append(" e) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("_exception(e, resp);");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("return;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("JsonWriter writer = new JsonWriter(new OutputStreamWriter(resp.getOutputStream(), ENCODING));");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            String _qualifiedClassNameOutputHelper = this.utils.qualifiedClassNameOutputHelper(operation_1);
            _builder.append(_qualifiedClassNameOutputHelper, "\t\t\t");
            _builder.append(".writeJson(output, writer);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("} finally {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("writer.close();");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            {
              EList<com.mguidi.soa.soa.Exception> _exceptionts_2 = operation_1.getExceptionts();
              int _size_3 = _exceptionts_2.size();
              boolean _equals_2 = (_size_3 == 0);
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("\t");
                String _signature_4 = this.utils.signature(operation_1);
                _builder.append(_signature_4, "\t\t");
                _builder.append("(input);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("try {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                String _signature_5 = this.utils.signature(operation_1);
                _builder.append(_signature_5, "\t\t\t");
                _builder.append("(input);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                {
                  EList<com.mguidi.soa.soa.Exception> _exceptionts_3 = operation_1.getExceptionts();
                  for(final com.mguidi.soa.soa.Exception exceptiont_1 : _exceptionts_3) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("catch (");
                    String _qualifiedClassName_2 = this.utils.qualifiedClassName(exceptiont_1);
                    _builder.append(_qualifiedClassName_2, "\t\t");
                    _builder.append(" e) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("_exception(e, resp);");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("return;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static void _exception(ServiceException e, HttpServletResponse resp) throws IOException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("resp.setStatus(ServiceException.STATUS_CODE);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JsonWriter writer =  new JsonWriter(new OutputStreamWriter(resp.getOutputStream(), ENCODING));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("ServiceExceptionHelper.writeJson(e, writer);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("writer.close();");
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
}
