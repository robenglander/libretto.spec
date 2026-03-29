package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * Result of mapping EMF {@code Spec} to portable types: {@link LibrettoSpecDomainModel} without
 * EMF or Xtext on the consumer classpath.
 *
 * @param domainModel domain model (spec id and sections)
 */
public record LibrettoSpecDomainModelProjection(LibrettoSpecDomainModel domainModel) {

	public LibrettoSpecDomainModelProjection {
		domainModel = Objects.requireNonNull(domainModel, "domainModel");
	}

	public String specId() {
		return domainModel.specId();
	}

	public List<ProjectedSpecSection> sections() {
		return domainModel.sections();
	}
}
