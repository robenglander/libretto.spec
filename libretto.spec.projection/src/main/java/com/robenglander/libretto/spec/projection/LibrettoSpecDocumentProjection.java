package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Root portable view of a native {@code .libretto} document after parse and decode.
 *
 * @param specId  spec id from the opening {@code spec} header (trimmed)
 * @param sections  top-level sections in document order
 */
public record LibrettoSpecDocumentProjection(String specId, List<ProjectedSpecSection> sections) {

	public LibrettoSpecDocumentProjection {
		specId = specId == null ? "" : specId.trim();
		sections = sections == null ? List.of() : List.copyOf(sections);
	}
}
