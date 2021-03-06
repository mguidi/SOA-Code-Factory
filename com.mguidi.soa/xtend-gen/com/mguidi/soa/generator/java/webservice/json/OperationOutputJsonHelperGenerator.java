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
public class OperationOutputJsonHelperGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private EntityJsonHelperGenerator entityHelper;
  
  public CharSequence generateJsonHelper(final Operation operation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageNameOutputHelper = this.utils.packageNameOutputHelper(operation);
    _builder.append(_packageNameOutputHelper, "");
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
    String _qualifiedClassNameOutput = this.utils.qualifiedClassNameOutput(operation);
    _builder.append(_qualifiedClassNameOutput, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _classNameOutputHelper = this.utils.classNameOutputHelper(operation);
    _builder.append(_classNameOutputHelper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _qualifiedClassNameOutput_1 = this.utils.qualifiedClassNameOutput(operation);
    _builder.append(_qualifiedClassNameOutput_1, "\t");
    _builder.append(" fromJson(JsonReader reader) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String key;");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameOutput = this.utils.classNameOutput(operation);
    _builder.append(_classNameOutput, "\t\t");
    _builder.append(" obj = new ");
    String _classNameOutput_1 = this.utils.classNameOutput(operation);
    _builder.append(_classNameOutput_1, "\t\t");
    _builder.append("(); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("reader.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameOutput_2 = this.utils.classNameOutput(operation);
    EList<Feature> _featuresOutput = operation.getFeaturesOutput();
    CharSequence _readFeatures = this.entityHelper.readFeatures(_classNameOutput_2, _featuresOutput);
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
    String _qualifiedClassNameOutput_2 = this.utils.qualifiedClassNameOutput(operation);
    _builder.append(_qualifiedClassNameOutput_2, "\t");
    _builder.append(" obj, JsonWriter writer) throws IOException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("writer.beginObject();");
    _builder.newLine();
    _builder.append("\t\t");
    String _classNameOutput_3 = this.utils.classNameOutput(operation);
    EList<Feature> _featuresOutput_1 = operation.getFeaturesOutput();
    CharSequence _writeFeatures = this.entityHelper.writeFeatures(_classNameOutput_3, _featuresOutput_1);
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
