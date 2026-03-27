package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Result of mapping EMF {@code ProjectProfile} to portable types: {@link LibrettoProjectProfileDomainModel}
 * without EMF or Xtext on the consumer classpath.
 *
 * @param domainModel domain model (profile name, surface, projects, LLM blocks)
 */
public record LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfileDomainModel domainModel) {

	public LibrettoProjectProfileDomainModelProjection {
		domainModel = domainModel == null ? LibrettoProjectProfileDomainModel.empty() : domainModel;
	}

	/** Profile {@code ValidID} name; empty when absent. */
	public String profileName() {
		return domainModel.profileName();
	}

	public List<ProjectedSurfaceElement> surfaceElements() {
		return domainModel.surfaceElements();
	}

	public List<ProjectedProjectBlock> projectBlocks() {
		return domainModel.projectBlocks();
	}

	public List<ProjectedLlmProvidersBlock> llmProviderBlocks() {
		return domainModel.llmProviderBlocks();
	}

	/**
	 * First {@code project} block, or {@code null}. Matches common single-project profiles; use
	 * {@link #projectBlocks()} for the full list.
	 */
	public ProjectedProjectBlock projectBlock() {
		List<ProjectedProjectBlock> blocks = domainModel.projectBlocks();
		return blocks.isEmpty() ? null : blocks.get(0);
	}

	/** Flattened providers from every {@code llmProviders} block. */
	public List<ProjectedLlmProviderEntry> llmProviders() {
		return domainModel.allLlmProviders();
	}
}
