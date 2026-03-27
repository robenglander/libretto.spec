package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Result of mapping EMF {@code ProjectProfile} to portable types: {@link LibrettoProjectProfileDomainModel}
 * without EMF or Xtext on the consumer classpath.
 *
 * @param domainModel  domain model (profile name, surface, project, testgen, llm providers)
 */
public record LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfileDomainModel domainModel) {

	public LibrettoProjectProfileDomainModelProjection {
		domainModel = domainModel == null ? LibrettoProjectProfileDomainModel.empty() : domainModel;
	}

	/** Profile name from {@code profile "…"}; empty when absent. */
	public String profileName() {
		return domainModel.profileName();
	}

	public List<ProjectedSurfaceElement> surfaceElements() {
		return domainModel.surfaceElements();
	}

	/** {@code project { … }} or {@code null}. */
	public ProjectedProjectBlock projectBlock() {
		return domainModel.projectBlock();
	}

	/** Declared {@code llmProviders} entries. */
	public List<ProjectedLlmProviderEntry> llmProviders() {
		return domainModel.llmProviders();
	}
}
