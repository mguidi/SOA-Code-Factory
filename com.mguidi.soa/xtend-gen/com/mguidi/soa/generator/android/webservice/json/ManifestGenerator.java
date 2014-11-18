package com.mguidi.soa.generator.android.webservice.json;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Architecture;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ManifestGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateManifestServiceJson(final Architecture architecture) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("package=\"");
    String _applicationId = this.utils.applicationId(architecture);
    _builder.append(_applicationId, "\t");
    _builder.append(".");
    String _moduleName = this.utils.moduleName(architecture);
    _builder.append(_moduleName, "\t");
    _builder.append(".service.json\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("android:versionCode=\"1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:versionName=\"");
    String _version = this.utils.version(architecture);
    _builder.append(_version, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("</manifest>");
    _builder.newLine();
    return _builder;
  }
}
