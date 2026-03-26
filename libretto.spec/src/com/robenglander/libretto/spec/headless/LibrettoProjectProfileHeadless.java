package com.robenglander.libretto.spec.headless;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import com.robenglander.libretto.spec.LibrettoProjectProfileStandaloneSetup;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper;

/**
 * Headless native Libretto project profile: Xtext parse → EMF {@link ProjectProfile}.
 * <p>
 * Use {@link LibrettoProjectProfileProjectionMapper} for the portable projection used outside EMF.
 */
public final class LibrettoProjectProfileHeadless {

	private static final Injector INJECTOR =
			new LibrettoProjectProfileStandaloneSetup().createInjectorAndDoEMFRegistration();

	private LibrettoProjectProfileHeadless() {
	}

	/**
	 * Parse result: EMF root and resource-level syntax diagnostics (Xtext lexer/parser).
	 */
	public record ParseResult(ProjectProfile projectProfile, List<String> syntaxErrors) {
		public ParseResult {
			syntaxErrors = syntaxErrors == null ? List.of() : List.copyOf(syntaxErrors);
		}

		public boolean hasSyntaxErrors() {
			return !syntaxErrors.isEmpty();
		}

		public LibrettoProjectProfileDomainModelProjection project() {
			return projectProfile == null
					? new LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfileDomainModel.empty())
					: LibrettoProjectProfileProjectionMapper.project(projectProfile);
		}
	}

	public static ParseResult parse(String text) {
		if (text == null) {
			return new ParseResult(null, List.of("null project profile text"));
		}
		XtextResourceSet resourceSet = INJECTOR.getInstance(XtextResourceSet.class);
		URI uri = URI.createURI("synthetic:/inmemory.lpp");
		Resource resource = resourceSet.createResource(uri);
		Map<String, Object> loadOptions = new HashMap<>();
		loadOptions.put(XtextResource.OPTION_ENCODING, "UTF-8");
		try {
			resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), loadOptions);
		} catch (IOException e) {
			return new ParseResult(null, List.of("I/O: " + e.getMessage()));
		}
		List<String> errors = new ArrayList<>();
		for (Resource.Diagnostic d : resource.getErrors()) {
			errors.add(d.getMessage());
		}
		if (resource.getContents().isEmpty()) {
			return new ParseResult(null, errors.isEmpty() ? List.of("empty parse model") : errors);
		}
		ProjectProfile root = (ProjectProfile) resource.getContents().get(0);
		return new ParseResult(root, errors);
	}

	public static LibrettoProjectProfileDomainModelProjection parseAndProject(String text) {
		return parse(text).project();
	}
}
