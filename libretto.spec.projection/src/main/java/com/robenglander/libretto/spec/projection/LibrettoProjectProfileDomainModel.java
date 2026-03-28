package com.robenglander.libretto.spec.projection;

import java.util.ArrayList;
import java.util.List;

/**
 * Portable domain model of one {@code profile "…" { … }} block inside a {@code .lpp} file (the grammar
 * allows many such blocks under the file root). For the whole file, see
 * {@link LibrettoProjectProfilesDocument}.
 *
 * @param profileName       this block’s {@code profile} name ({@code ValidID})
 * @param projectBlocks     each {@code project { … }} block in this profile
 * @param llmProviderBlocks each {@code llmProviders { … }} block in this profile
 */
public record LibrettoProjectProfileDomainModel(
		String profileName,
		List<ProjectedProjectBlock> projectBlocks,
		List<ProjectedLlmProvidersBlock> llmProviderBlocks) {

	public LibrettoProjectProfileDomainModel {
		profileName = profileName == null ? "" : profileName.trim();
		projectBlocks = projectBlocks == null ? List.of() : List.copyOf(projectBlocks);
		llmProviderBlocks = llmProviderBlocks == null ? List.of() : List.copyOf(llmProviderBlocks);
	}

	public static LibrettoProjectProfileDomainModel empty() {
		return new LibrettoProjectProfileDomainModel("", List.of(), List.of());
	}

	/** All providers from all {@code llmProviders} blocks, in order. */
	public List<ProjectedLlmProvider> allLlmProviders() {
		List<ProjectedLlmProvider> out = new ArrayList<>();
		for (ProjectedLlmProvidersBlock b : llmProviderBlocks) {
			out.addAll(b.providers());
		}
		return List.copyOf(out);
	}
}
