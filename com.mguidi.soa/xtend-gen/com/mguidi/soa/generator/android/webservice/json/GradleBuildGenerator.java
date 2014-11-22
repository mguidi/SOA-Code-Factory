package com.mguidi.soa.generator.android.webservice.json;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Entities;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Model;
import com.mguidi.soa.soa.Module;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GradleBuildGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateBuildServiceJson(final Architecture architecture, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply plugin: \'com.android.library\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("buildscript {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("repositories {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("jcenter()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("dependencies {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("classpath \'com.android.tools.build:gradle:0.13.2\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("android {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("compileSdkVersion 21");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("buildToolsVersion \"21.0.0\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("defaultConfig {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("minSdkVersion 5");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task androidSourcesJar(type: Jar) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("classifier = \'sources\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("from android.sourceSets.main.java.srcDirs");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("artifacts {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("archives androidSourcesJar");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("repositories {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mavenLocal()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mavenCentral()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("dependencies {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("compile \'com.google.code.gson:gson:2.3\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("compile \'");
    String _applicationId = this.utils.applicationId(architecture);
    String _plus = (_applicationId + ":");
    String _moduleName = this.utils.moduleName(architecture);
    String _plus_1 = (_plus + _moduleName);
    String _plus_2 = (_plus_1 + "-service:android_");
    String _version = this.utils.version(architecture);
    String _plus_3 = (_plus_2 + _version);
    _builder.append(_plus_3, "    ");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    {
      boolean _and = false;
      Module _module = architecture.getModule();
      Model _model = _module.getModel();
      boolean _notEquals = (!Objects.equal(_model, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Module _module_1 = architecture.getModule();
        Model _model_1 = _module_1.getModel();
        EList<Entities> _entities = _model_1.getEntities();
        Iterable<Entity> _filter = Iterables.<Entity>filter(_entities, Entity.class);
        int _size = IterableExtensions.size(_filter);
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        _builder.append("    ");
        _builder.append("compile \'");
        String _applicationId_1 = this.utils.applicationId(architecture);
        String _plus_4 = (_applicationId_1 + ":");
        String _moduleName_1 = this.utils.moduleName(architecture);
        String _plus_5 = (_plus_4 + _moduleName_1);
        String _plus_6 = (_plus_5 + "-model-json:android_");
        String _version_1 = this.utils.version(architecture);
        String _plus_7 = (_plus_6 + _version_1);
        _builder.append(_plus_7, "    ");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      HashSet<Utils.Dependency> _serviceModelDependencies = this.utils.serviceModelDependencies(architecture);
      for(final Utils.Dependency dependency : _serviceModelDependencies) {
        _builder.append("    ");
        _builder.append("compile \'");
        _builder.append(((((dependency.applicationId + ":") + dependency.moduleName) + "-model-json:android_") + dependency.version), "    ");
        _builder.append("\'");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("apply plugin: \'maven\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("uploadArchives {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("repositories {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mavenDeployer {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("repository(url: mavenLocal().url)");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("pom.groupId = \'");
    String _applicationId_2 = this.utils.applicationId(architecture);
    _builder.append(_applicationId_2, "            ");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("pom.artifactId = \'");
    String _moduleName_2 = this.utils.moduleName(architecture);
    _builder.append(_moduleName_2, "\t\t\t");
    _builder.append("-service-json\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("pom.version = \'android_");
    String _version_2 = this.utils.version(architecture);
    _builder.append(_version_2, "\t\t\t");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
