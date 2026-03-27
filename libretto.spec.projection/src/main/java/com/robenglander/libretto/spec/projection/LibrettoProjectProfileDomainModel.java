package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable domain model of a Libretto project profile ({@code .lpp}): name, surface, project layout, LLM providers.
 *
 * @param profileName     root {@code profile "<string>"} — logical name; should match spec metadata {@code project_profile_id} when binding
 * @param surfaceElements contents of {@code surface { … }} in document order; empty if absent
 * @param projectBlock    {@code project { … }} or {@code null} when absent
 * @param llmProviders    entries from {@code llmProviders { … }}; empty when absent
 */
public record LibrettoProjectProfileDomainModel(
		String profileName,
		List<ProjectedSurfaceElement> surfaceElements,
		ProjectedProjectBlock projectBlock,
		List<ProjectedLlmProviderEntry> llmProviders) {

	public LibrettoProjectProfileDomainModel {
		profileName = profileName == null ? "" : profileName.trim();
		surfaceElements = surfaceElements == null ? List.of() : List.copyOf(surfaceElements);
		llmProviders = llmProviders == null ? List.of() : List.copyOf(llmProviders);
	}

	public static LibrettoProjectProfileDomainModel empty() {
		return new LibrettoProjectProfileDomainModel("", List.of(), null, List.of());
	}
}
