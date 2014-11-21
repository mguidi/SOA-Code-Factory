package com.mguidi.soa.generator.android.jsonhelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.android.jsonhelper.GradleBuildGenerator;
import com.mguidi.soa.generator.android.jsonhelper.ManifestGenerator;
import com.mguidi.soa.generator.java.Beautifier;
import com.mguidi.soa.generator.java.jsonhelper.EntityJsonHelperGenerator;
import com.mguidi.soa.generator.java.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Entity;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class AndroidJsonHelperGenerator implements IGenerator {
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
        String _version = this.utils.version(e);
        String _plus = ("android/" + _version);
        String _plus_1 = (_plus + "/model-json/");
        String _moduleName = this.utils.moduleName(e);
        String _plus_2 = (_plus_1 + _moduleName);
        String _plus_3 = (_plus_2 + "/build.gradle");
        CharSequence _generateBuildModelJson = this.gradleBuildGenerator.generateBuildModelJson(e, resource);
        fsa.generateFile(_plus_3, _generateBuildModelJson);
        String _version_1 = this.utils.version(e);
        String _plus_4 = ("android/" + _version_1);
        String _plus_5 = (_plus_4 + "/model-json/");
        String _moduleName_1 = this.utils.moduleName(e);
        String _plus_6 = (_plus_5 + _moduleName_1);
        String _plus_7 = (_plus_6 + "/src/main/AndroidManifest.xml");
        CharSequence _generateManifestModelJson = this.manifestGenerator.generateManifestModelJson(e);
        fsa.generateFile(_plus_7, _generateManifestModelJson);
      }
    }
    for (final Entity e_1 : entities) {
      String _version_2 = this.utils.version(e_1);
      String _plus_8 = ("android/" + _version_2);
      String _plus_9 = (_plus_8 + "/model-json/");
      String _moduleName_2 = this.utils.moduleName(e_1);
      String _plus_10 = (_plus_9 + _moduleName_2);
      String _plus_11 = (_plus_10 + "/src/main/java/");
      String _qualifiedClassNameHelper = this.utils.qualifiedClassNameHelper(e_1);
      String _replace = _qualifiedClassNameHelper.replace(".", "/");
      String _plus_12 = (_plus_11 + _replace);
      String _plus_13 = (_plus_12 + ".java");
      CharSequence _generateJsonHelper = this.entityJsonHelperGenerator.generateJsonHelper(e_1);
      CharSequence _format = this.beautifier.format(_generateJsonHelper);
      fsa.generateFile(_plus_13, _format);
    }
  }
}
