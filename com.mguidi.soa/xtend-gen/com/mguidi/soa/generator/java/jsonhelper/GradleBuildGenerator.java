package com.mguidi.soa.generator.java.jsonhelper;

import com.google.inject.Inject;
import com.mguidi.soa.generator.java.Utils;
import com.mguidi.soa.soa.Architecture;
import java.util.HashSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GradleBuildGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  public CharSequence generateBuildModelJson(final Architecture architecture, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply plugin: \'java\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("sourceCompatibility = 1.6");
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
    String _plus_2 = (_plus_1 + "-model:");
    String _version = this.utils.version(architecture);
    String _plus_3 = (_plus_2 + _version);
    _builder.append(_plus_3, "    ");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    {
      HashSet<Utils.Dependency> _modelDependencies = this.utils.modelDependencies(architecture);
      for(final Utils.Dependency dependency : _modelDependencies) {
        _builder.append("    ");
        _builder.append("compile \'");
        _builder.append(((((dependency.applicationId + ":") + dependency.moduleName) + "-model-json:") + dependency.version), "    ");
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
    String _applicationId_1 = this.utils.applicationId(architecture);
    _builder.append(_applicationId_1, "            ");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("pom.artifactId = \'");
    String _moduleName_1 = this.utils.moduleName(architecture);
    _builder.append(_moduleName_1, "\t\t\t");
    _builder.append("-model-json\'");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("pom.version = \'");
    String _version_1 = this.utils.version(architecture);
    _builder.append(_version_1, "\t\t\t");
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
    return _builder;
  }
}
