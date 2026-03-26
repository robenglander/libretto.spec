package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable domain model of a Libretto project profile ({@code .lpp}): profile name and surface elements.
 *
 * @param profileName     root {@code profile "<string>"} — logical name; should match spec metadata {@code project_profile_id} when binding
 * @param surfaceElements contents of {@code surface { … }} in document order; empty if absent
 */
public record LibrettoProjectProfileDomainModel(
		String profileName,
		List<ProjectedSurfaceElement> surfaceElements) {

	public LibrettoProjectProfileDomainModel {
		profileName = profileName == null ? "" : profileName.trim();
		surfaceElements = surfaceElements == null ? List.of() : List.copyOf(surfaceElements);
	}

	public static LibrettoProjectProfileDomainModel empty() {
		return new LibrettoProjectProfileDomainModel("", List.of());
	}
}
