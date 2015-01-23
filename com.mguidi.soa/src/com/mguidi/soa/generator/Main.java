package com.mguidi.soa.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import com.mguidi.soa.generator.SOAAndroidGenerator;
import com.mguidi.soa.generator.SOAJavaGenerator;
import com.mguidi.soa.generator.SOASwiftGenerator;

public class Main {

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		Injector injector = new com.mguidi.soa.SOAStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(args[0], args[1]);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private SOAAndroidGenerator generatorAndroid;
	
	@Inject
	private SOAJavaGenerator generatorJava;
	
	@Inject
	private SOASwiftGenerator generatorSwift;

	@Inject
	private JavaIoFileSystemAccess fileAccess;
	
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;

	private void runGenerator(String folderName, String target) throws IOException {
		// check target
		if (!target.equals("android") &&  !target.equals("java") && !target.equals("swift")) {
			System.out.println("Invalid target.");
			System.exit(-2);
		}
		
		// configure and start the generator
		fileAccess.setOutputPath("output_soa/");
		
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		Set<Resource> resources = new LinkedHashSet<Resource>();
		for (String fileName : getSourceFiles(folderName)) {
			Resource modelResource = set.getResource(URI.createURI(fileName),
					true);
			resources.add(modelResource);
		}
		
		if (target.equals("android")) {
			generatorAndroid.doGenerate(resources, fileAccess);
			
		} else if (target.equals("java")) {
			generatorJava.doGenerate(resources, fileAccess);
			
		}

		for (Resource resource : resources) {
			// validate the resource
			List<Issue> list = validator.validate(resource, CheckMode.ALL,
					CancelIndicator.NullImpl);
			if (!list.isEmpty()) {
				for (Issue issue : list) {
					System.err.println(issue);
				}
				System.exit(-2);
			}

			if (target.equals("android")) {
				generatorAndroid.doGenerate(resource, fileAccess);

			} else if (target.equals("java")) {
				generatorJava.doGenerate(resource, fileAccess);
				
			} else if (target.equals("swift")) {
				generatorSwift.doGenerate(resource, fileAccess);
			}
		}

		System.out.println("Code generation finished.");
	}

	private List<String> getSourceFiles(String folderName) throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		File folder = new File(folderName);
		for (String s : folder.list()) {
			File f = new File(folder.getAbsolutePath() + '/' + s);
			String relativePath = folderName + '/' + s;
			if (isModelFile(f)) {
				result.add(relativePath);
			} else if (f.isDirectory()) {
				result.addAll(getSourceFiles(relativePath));
			}
		}
		
		return result;
	}

	private boolean isModelFile(File f) {
		return f.isFile() && f.getName().endsWith("." + fileExtension);
	}

}
