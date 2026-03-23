package com.robenglander.libretto.spec.documentation;

import com.robenglander.libretto.spec.librettoSpec.DependencyKeyword;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSection;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSectionKeyword;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;

/**
 * Hover / documentation for Libretto DSL elements via Xtext's
 * {@link org.eclipse.xtext.documentation.IEObjectDocumentationProvider} (Eclipse editor and LSP).
 */
public class LibrettoSpecEObjectDocumentationProvider extends MultiLineCommentDocumentationProvider {

	private static final String DEPENDENCIES_SECTION = """
			### dependencies

			Top-level section listing **architectural** edges to other specs. Each row is a `dependency` record with `target_spec` (and optional `notes`). Authoring conventions and citations belong in **`references`**, not here.
			""";

	private static final String DEPENDENCY_RECORD = """
			### dependency

			One **architectural** dependency: use `target_spec: "OTHER-SpecId"` (required); `notes` is optional. The `dependencies` section only models cross-spec structure; conventions live under **`references`**.
			""";

	@Override
	public String getDocumentation(EObject o) {
		// Keyword-only types (see grammar) so LSP/Eclipse hover resolves on the tokens themselves.
		if (o instanceof DependenciesSectionKeyword) {
			return DEPENDENCIES_SECTION;
		}
		if (o instanceof DependencyKeyword) {
			return DEPENDENCY_RECORD;
		}
		if (o instanceof DependenciesSection) {
			return DEPENDENCIES_SECTION;
		}
		if (o instanceof DependencyRecord) {
			return DEPENDENCY_RECORD;
		}
		return super.getDocumentation(o);
	}
}
