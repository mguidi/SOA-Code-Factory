package com.mguidi.soa.generator;

import com.google.inject.Inject;
import com.mguidi.soa.generator.android.AndroidGenerator;
import com.mguidi.soa.generator.android.jsonhelper.AndroidJsonHelperGenerator;
import com.mguidi.soa.generator.android.webservice.json.AndroidWebServiceJsonGenerator;
import com.mguidi.soa.generator.java.JavaGenerator;
import com.mguidi.soa.generator.java.jsonhelper.JavaJsonHelperGenerator;
import com.mguidi.soa.generator.java.webservice.json.JavaWebServiceJsonGenerator;
import com.mguidi.soa.generator.scala.ScalaGenerator;
import com.mguidi.soa.generator.swift.SwiftGenerator;
import com.mguidi.soa.generator.swift.jsonhelper.SwiftJsonHelperGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SOAGenerator implements IGenerator {
  @Inject
  @Extension
  private JavaGenerator javaGenerator;
  
  @Inject
  @Extension
  private JavaJsonHelperGenerator javaJsonHelperGenerator;
  
  @Inject
  @Extension
  private JavaWebServiceJsonGenerator javaWebServiceJsonGenerator;
  
  @Inject
  @Extension
  private AndroidGenerator androidGenerator;
  
  @Inject
  @Extension
  private AndroidJsonHelperGenerator androidJsonHelperGenerator;
  
  @Inject
  @Extension
  private AndroidWebServiceJsonGenerator androidWebServiceJsonGenerator;
  
  @Inject
  @Extension
  private SwiftGenerator swiftGenerator;
  
  @Inject
  @Extension
  private SwiftJsonHelperGenerator swiftJsonHelperGenerator;
  
  @Inject
  @Extension
  private ScalaGenerator scalaGenerator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.javaGenerator.doGenerate(resource, fsa);
    this.javaJsonHelperGenerator.doGenerate(resource, fsa);
    this.javaWebServiceJsonGenerator.doGenerate(resource, fsa);
    this.androidGenerator.doGenerate(resource, fsa);
    this.androidJsonHelperGenerator.doGenerate(resource, fsa);
    this.androidWebServiceJsonGenerator.doGenerate(resource, fsa);
    this.swiftGenerator.doGenerate(resource, fsa);
    this.swiftJsonHelperGenerator.doGenerate(resource, fsa);
    this.scalaGenerator.doGenerate(resource, fsa);
  }
}
