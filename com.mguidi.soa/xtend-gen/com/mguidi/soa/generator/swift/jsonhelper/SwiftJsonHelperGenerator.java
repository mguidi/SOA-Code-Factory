package com.mguidi.soa.generator.swift.jsonhelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mguidi.soa.generator.swift.jsonhelper.EntityJsonHelperGenerator;
import com.mguidi.soa.generator.swift.jsonhelper.JsonUtils;
import com.mguidi.soa.soa.Entity;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SwiftJsonHelperGenerator implements IGenerator {
  @Inject
  @Extension
  private JsonUtils utils;
  
  @Inject
  @Extension
  private EntityJsonHelperGenerator entityJsonHelperGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    for (final Entity e : _filter) {
      String _moduleName = this.utils.moduleName(e);
      String _plus = ("swift/commons/" + _moduleName);
      String _plus_1 = (_plus + "/");
      String _version = this.utils.version(e);
      String _plus_2 = (_plus_1 + _version);
      String _plus_3 = (_plus_2 + "/src/model/helper/json/");
      String _classNameHelper = this.utils.classNameHelper(e);
      String _plus_4 = (_plus_3 + _classNameHelper);
      String _plus_5 = (_plus_4 + ".swift");
      CharSequence _generateJsonHelper = this.entityJsonHelperGenerator.generateJsonHelper(e);
      fsa.generateFile(_plus_5, _generateJsonHelper);
    }
  }
}
