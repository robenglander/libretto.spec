package com.robenglander.libretto.spec.headless;

import com.google.inject.Injector;
import com.robenglander.libretto.spec.LibrettoSpecStandaloneSetup;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.projection.LibrettoSpecDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoSpecDomainModelProjection;
import com.robenglander.libretto.spec.projection.mapper.LibrettoSpecProjectionMapper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Single supported path for headless native Libretto: Xtext parse → EMF {@link Spec}.
 * <p>
 * Use {@link LibrettoSpecProjectionMapper} for the portable projection used outside EMF.
 */
public final class LibrettoSpecHeadless {

	private static final Injector INJECTOR =
			new LibrettoSpecStandaloneSetup().createInjectorAndDoEMFRegistration();

	private LibrettoSpecHeadless() {
	}

	/**
	 * Parse result: EMF root and resource-level syntax diagnostics (Xtext lexer/parser).
	 */
	public record ParseResult(Spec spec, List<String> syntaxErrors) {
		public ParseResult {
			syntaxErrors = syntaxErrors == null ? List.of() : List.copyOf(syntaxErrors);
		}

		public boolean hasSyntaxErrors() {
			return !syntaxErrors.isEmpty();
		}

		public LibrettoSpecDomainModelProjection project() {
			return spec == null
					? new LibrettoSpecDomainModelProjection(new LibrettoSpecDomainModel("", List.of()))
					: LibrettoSpecProjectionMapper.project(spec);
		}
	}

	public static ParseResult parse(String text) {
		if (text == null) {
			return new ParseResult(null, List.of("null Libretto text"));
		}
		XtextResourceSet resourceSet = INJECTOR.getInstance(XtextResourceSet.class);
		URI uri = URI.createURI("synthetic:/inmemory.libretto");
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
		Spec spec = (Spec) resource.getContents().get(0);
		return new ParseResult(spec, errors);
	}

	public static LibrettoSpecDomainModelProjection parseAndProject(String text) {
		return parse(text).project();
	}
}
