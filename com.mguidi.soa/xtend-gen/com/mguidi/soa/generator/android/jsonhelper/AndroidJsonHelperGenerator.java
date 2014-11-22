package com.mguidi.soa.generator.android.jsonhelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.android.jsonhelper.GradleBuildGenerator;
import com.mguidi.soa.generator.android.jsonhelper.InstallScriptGenerator;
import com.mguidi.soa.generator.android.jsonhelper.ManifestGenerator;
import com.mguidi.soa.generator.java.Beautifier;
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Entity;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class AndroidJsonHelperGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private EntityJsonHelperGenerator entityJsonHelperGenerator;
  
  @Inject
  @Extension
  private Beautifier beautifier;
  
  @Inject
  @Extension
  private GradleBuildGenerator gradleBuildGenerator;
  
  @Inject
  @Extension
  private ManifestGenerator manifestGenerator;
  
  @Inject
  @Extension
  private InstallScriptGenerator installScriptGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    List<Entity> entities = IterableExtensions.<Entity>toList(_filter);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
    Iterable<Architecture> _filter_1 = Iterables.<Architecture>filter(_iterable_1, Architecture.class);
    for (final Architecture e : _filter_1) {
      int _size = entities.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _applicationId = this.utils.applicationId(e);
        String _plus = ("android/" + _applicationId);
        String _plus_1 = (_plus + "/");
        String _moduleName = this.utils.moduleName(e);
        String _plus_2 = (_plus_1 + _moduleName);
        String _plus_3 = (_plus_2 + "/");
        String _version = this.utils.version(e);
        String _plus_4 = (_plus_3 + _version);
        String _plus_5 = (_plus_4 + "/model-json/build.gradle");
        CharSequence _generateBuildModelJson = this.gradleBuildGenerator.generateBuildModelJson(e, resource);
        fsa.generateFile(_plus_5, _generateBuildModelJson);
        String _applicationId_1 = this.utils.applicationId(e);
        String _plus_6 = ("android/" + _applicationId_1);
        String _plus_7 = (_plus_6 + "/");
        String _moduleName_1 = this.utils.moduleName(e);
        String _plus_8 = (_plus_7 + _moduleName_1);
        String _plus_9 = (_plus_8 + "/");
        String _version_1 = this.utils.version(e);
        String _plus_10 = (_plus_9 + _version_1);
        String _plus_11 = (_plus_10 + "/model-json/src/main/AndroidManifest.xml");
        CharSequence _generateManifestModelJson = this.manifestGenerator.generateManifestModelJson(e);
        fsa.generateFile(_plus_11, _generateManifestModelJson);
      }
    }
    for (final Entity e_1 : entities) {
      String _applicationId_2 = this.utils.applicationId(e_1);
      String _plus_12 = ("android/" + _applicationId_2);
      String _plus_13 = (_plus_12 + "/");
      String _moduleName_2 = this.utils.moduleName(e_1);
      String _plus_14 = (_plus_13 + _moduleName_2);
      String _plus_15 = (_plus_14 + "/");
      String _version_2 = this.utils.version(e_1);
      String _plus_16 = (_plus_15 + _version_2);
      String _plus_17 = (_plus_16 + "/model-json/src/main/java/");
      String _qualifiedClassNameHelper = this.utils.qualifiedClassNameHelper(e_1);
      String _replace = _qualifiedClassNameHelper.replace(".", "/");
      String _plus_18 = (_plus_17 + _replace);
      String _plus_19 = (_plus_18 + ".java");
      CharSequence _generateJsonHelper = this.entityJsonHelperGenerator.generateJsonHelper(e_1);
      CharSequence _format = this.beautifier.format(_generateJsonHelper);
      fsa.generateFile(_plus_19, _format);
    }
  }
  
  public void doGenerate(final Set<Resource> resources, final IFileSystemAccess fsa) {
    LinkedList<Architecture> _architectureOrder = this.utils.architectureOrder(resources);
    CharSequence _generateInstallScriptModelJson = this.installScriptGenerator.generateInstallScriptModelJson(_architectureOrder);
    fsa.generateFile("android/install_model_json_script.sh", _generateInstallScriptModelJson);
  }
}
