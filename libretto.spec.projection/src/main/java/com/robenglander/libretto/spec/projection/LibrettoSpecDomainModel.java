package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * Portable domain model of a Libretto spec: id and top-level sections after parse and decode.
 *
 * @param specId   spec id from the opening {@code spec} header (trimmed); use {@code ""} only for “no spec” shells
 * @param sections top-level sections in document order
 */
public record LibrettoSpecDomainModel(String specId, List<ProjectedSpecSection> sections) {

	public LibrettoSpecDomainModel {
		specId = Objects.requireNonNull(specId, "specId");
		sections = List.copyOf(Objects.requireNonNull(sections, "sections"));
	}
}
