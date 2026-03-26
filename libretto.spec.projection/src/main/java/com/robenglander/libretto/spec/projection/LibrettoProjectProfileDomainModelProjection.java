package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Result of mapping EMF {@code ProjectProfile} to portable types: {@link LibrettoProjectProfileDomainModel}
 * without EMF or Xtext on the consumer classpath.
 *
 * @param domainModel  domain model (profile name and surface elements)
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
}
