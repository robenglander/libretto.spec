package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import com.robenglander.libretto.spec.projection.LibrettoSpecDocumentProjection;
import com.robenglander.libretto.spec.projection.ProjectedSpecSection;

/**
 * EMF {@link Spec} → portable {@link LibrettoSpecDocumentProjection}.
 */
public final class LibrettoSpecProjectionMapper {

	private LibrettoSpecProjectionMapper() {
	}

	public static LibrettoSpecDocumentProjection project(Spec spec) {
		if (spec == null) {
			return new LibrettoSpecDocumentProjection("", List.of());
		}
		String specId = spec.getSpecId() == null ? "" : spec.getSpecId().trim();
		List<ProjectedSpecSection> sections = new ArrayList<>();
		for (SpecSection sec : spec.getSections()) {
			ProjectedSpecSection p = LibrettoSpecSectionMapper.mapSection(sec);
			if (p != null) {
				sections.add(p);
			}
		}
		return new LibrettoSpecDocumentProjection(specId, sections);
	}

	/** Raw node text for {@link com.robenglander.libretto.spec.librettoSpec.IdentifierValue} (caret escapes normalized). */
	static String identifierText(EObject iv) {
		return ProjectionNodeText.identifierText(iv);
	}
}
