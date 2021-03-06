package com.mguidi.soa.generator.java.webservice.json;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.Operation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OperationInputJsonHelperGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private EntityJsonHelperGenerator entityHelper;
  
  public CharSequence generateJsonHelper(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameInputHelper = this.utils.packageNameInputHelper(operation);
    _builder.append(_packageNameInputHelper, "");
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
    String _qualifiedClassNameInput = this.utils.qualifiedClassNameInput(operation);
    _builder.append(_qualifiedClassNameInput, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _classNameInputHelper = this.utils.classNameInputHelper(operation);
    _builder.append(_classNameInputHelper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _qualifiedClassNameInput_1 = this.utils.qualifiedClassNameInput(operation);
    _builder.append(_qualifiedClassNameInput_1, "\t");
    _builder.append(" fromJson(JsonReader reader) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String key;");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameInput = this.utils.classNameInput(operation);
    _builder.append(_classNameInput, "\t\t");
    _builder.append(" obj = new ");
    String _classNameInput_1 = this.utils.classNameInput(operation);
    _builder.append(_classNameInput_1, "\t\t");
    _builder.append("(); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("reader.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameInput_2 = this.utils.classNameInput(operation);
    EList<Feature> _featuresInput = operation.getFeaturesInput();
    CharSequence _readFeatures = this.entityHelper.readFeatures(_classNameInput_2, _featuresInput);
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
    String _qualifiedClassNameInput_2 = this.utils.qualifiedClassNameInput(operation);
    _builder.append(_qualifiedClassNameInput_2, "\t");
    _builder.append(" obj, JsonWriter writer) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("writer.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameInput_3 = this.utils.classNameInput(operation);
    EList<Feature> _featuresInput_1 = operation.getFeaturesInput();
    CharSequence _writeFeatures = this.entityHelper.writeFeatures(_classNameInput_3, _featuresInput_1);
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
}
