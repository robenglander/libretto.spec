package com.robenglander.libretto.spec.projection;

import java.util.List;

/** Portable view of one {@code llmProviders { … }} block at profile level. */
public record ProjectedLlmProvidersBlock(List<ProjectedLlmProvider> providers) {

	public ProjectedLlmProvidersBlock {
		providers = providers == null ? List.of() : List.copyOf(providers);
	}
}
