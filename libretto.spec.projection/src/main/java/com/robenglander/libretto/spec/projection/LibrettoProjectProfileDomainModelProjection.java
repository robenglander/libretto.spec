package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Result of mapping the EMF file root ({@code ProjectProfile}) to portable types without EMF or Xtext on the
 * consumer classpath.
 *
 * @param projectedProfile exactly one logical profile; see {@link ProjectedProfile}
 */
public record LibrettoProjectProfileDomainModelProjection(ProjectedProfile projectedProfile) {

	public LibrettoProjectProfileDomainModelProjection {
		projectedProfile = Objects.requireNonNull(projectedProfile, "projectedProfile");
	}

	/**
	 * The single profile’s portable model, or {@link LibrettoProjectProfileDomainModel#empty()} when the file has
	 * no {@code profile} block.
	 */
	public LibrettoProjectProfileDomainModel domainModel() {
		return projectedProfile.profile();
	}

	/** {@link LibrettoProjectProfileDomainModel#profileName()} of {@link #domainModel()}. */
	public String profileName() {
		return domainModel().profileName();
	}

	/**
	 * The single {@code project { … }} block when present (validator-clean LPP has exactly one).
	 */
	public Optional<ProjectedProjectBlock> project() {
		return domainModel().project();
	}

	/**
	 * The single {@code llmProviders { … }} block when present (validator-clean LPP has exactly one).
	 */
	public Optional<ProjectedLlmProvidersBlock> llmProvidersBlock() {
		return domainModel().llmProviders();
	}

	/**
	 * Same as {@link #project()}; kept for older call sites.
	 */
	public Optional<ProjectedProjectBlock> projectBlock() {
		return domainModel().project();
	}

	/** All providers from the {@code llmProviders} block, in declaration order. */
	public List<ProjectedLlmProvider> llmProviders() {
		return domainModel().allLlmProviders();
	}
}
