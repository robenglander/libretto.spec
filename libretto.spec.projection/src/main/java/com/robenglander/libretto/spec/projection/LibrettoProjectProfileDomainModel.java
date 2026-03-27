package com.robenglander.libretto.spec.projection;

import java.util.ArrayList;
import java.util.List;

/**
 * Portable domain model of a Libretto project profile ({@code .lpp}): name, surface, project blocks,
 * LLM provider blocks — aligned with the Xtext grammar (multiple {@code project} / {@code llmProviders}
 * / {@code surface} sections in document order).
 *
 * @param profileName       root {@code profile} name ({@code ValidID})
 * @param surfaceElements   all {@code surface} blocks' elements concatenated in profile order
 * @param projectBlocks     each {@code project { … }} block
 * @param llmProviderBlocks each {@code llmProviders { … }} block
 */
public record LibrettoProjectProfileDomainModel(
		String profileName,
		List<ProjectedSurfaceElement> surfaceElements,
		List<ProjectedProjectBlock> projectBlocks,
		List<ProjectedLlmProvidersBlock> llmProviderBlocks) {

	public LibrettoProjectProfileDomainModel {
		profileName = profileName == null ? "" : profileName.trim();
		surfaceElements = surfaceElements == null ? List.of() : List.copyOf(surfaceElements);
		projectBlocks = projectBlocks == null ? List.of() : List.copyOf(projectBlocks);
		llmProviderBlocks = llmProviderBlocks == null ? List.of() : List.copyOf(llmProviderBlocks);
	}

	public static LibrettoProjectProfileDomainModel empty() {
		return new LibrettoProjectProfileDomainModel("", List.of(), List.of(), List.of());
	}

	/** All providers from all {@code llmProviders} blocks, in order. */
	public List<ProjectedLlmProviderEntry> allLlmProviders() {
		List<ProjectedLlmProviderEntry> out = new ArrayList<>();
		for (ProjectedLlmProvidersBlock b : llmProviderBlocks) {
			out.addAll(b.providers());
		}
		return List.copyOf(out);
	}
}
