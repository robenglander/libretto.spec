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
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfilesDocument;
import com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper;

/**
 * Headless native Libretto project profile: Xtext parse → EMF {@link ProjectProfile} (file root).
 * <p>
 * Use {@link LibrettoProjectProfileProjectionMapper} for the portable projection used outside EMF.
 */
public final class LibrettoProjectProfileHeadless {

	private static final Injector INJECTOR =
			new LibrettoProjectProfileStandaloneSetup().createInjectorAndDoEMFRegistration();

	private LibrettoProjectProfileHeadless() {
	}

	/**
	 * Parse result: EMF file root and resource-level syntax diagnostics (Xtext lexer/parser).
	 */
	public record ParseResult(ProjectProfile fileRoot, List<String> syntaxErrors) {
		public ParseResult {
			syntaxErrors = syntaxErrors == null ? List.of() : List.copyOf(syntaxErrors);
		}

		public boolean hasSyntaxErrors() {
			return !syntaxErrors.isEmpty();
		}

		/**
		 * First {@code profile "…"} block from the parse tree, or {@code null} when absent.
		 *
		 * @deprecated Prefer {@link #fileRoot()} and {@link LibrettoProjectProfileDomainModelProjection#profiles()};
		 *             retained for callers that assume a single profile block.
		 */
		@Deprecated
		public Profile projectProfile() {
			if (fileRoot == null || fileRoot.getProfiles().isEmpty()) {
				return null;
			}
			return fileRoot.getProfiles().get(0);
		}

		public LibrettoProjectProfileDomainModelProjection project() {
			return fileRoot == null
					? new LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfilesDocument.empty())
					: LibrettoProjectProfileProjectionMapper.project(fileRoot);
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
		Object root = resource.getContents().get(0);
		ProjectProfile fileRoot = root instanceof ProjectProfile pp ? pp : null;
		return new ParseResult(fileRoot, errors);
	}

	public static LibrettoProjectProfileDomainModelProjection parseAndProject(String text) {
		return parse(text).project();
	}
}
