package com.mguidi.soa.generator.java;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.io.File;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;

@Singleton
@SuppressWarnings("all")
public class Beautifier {
  @Inject
  private JavaBeautifier javaBeautifier;
  
  /**
   * Format code with PostProcessor (XPand style).
   */
  public CharSequence format(final CharSequence code) {
    File file = new File("temp.java");
    Outlet _outlet = new Outlet();
    FileHandleImpl fileHandle = new FileHandleImpl(_outlet, file);
    fileHandle.setBuffer(code);
    this.javaBeautifier.beforeWriteAndClose(fileHandle);
    return fileHandle.getBuffer();
  }
}
