package com.mguidi.soa.generator.java

import com.google.inject.Singleton
import com.google.inject.Inject
import org.eclipse.xpand2.output.JavaBeautifier
import java.io.File
import org.eclipse.xpand2.output.FileHandleImpl
import org.eclipse.xpand2.output.Outlet

@Singleton
class Beautifier {

	@Inject
	JavaBeautifier javaBeautifier

	/**
	 *Format code with PostProcessor (XPand style).
	 */
	def CharSequence format(CharSequence code) {

		// create fileHandle with dummy outlet.
		var file = new File("temp.java");
		var fileHandle = new FileHandleImpl(new Outlet(), file);
		fileHandle.setBuffer(code);
		
		// call postProcessor for formatting the code.
		javaBeautifier.beforeWriteAndClose(fileHandle);
		
		// return formatted results.
		return fileHandle.getBuffer();

	}
}