package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable domain model of a Libretto spec: id and top-level sections after parse and decode.
 *
 * @param specId  spec id from the opening {@code spec} header (trimmed)
 * @param sections  top-level sections in document order
 */
public record LibrettoSpecDomainModel(String specId, List<ProjectedSpecSection> sections) {

	public LibrettoSpecDomainModel {
		specId = specId == null ? "" : specId.trim();
		sections = sections == null ? List.of() : List.copyOf(sections);
	}
}
