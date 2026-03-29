package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** Portable view of one {@code llmProviders { … }} block at profile level. */
public record ProjectedLlmProvidersBlock(List<ProjectedLlmProvider> providers) {

	public ProjectedLlmProvidersBlock {
		providers = List.copyOf(Objects.requireNonNull(providers, "providers"));
	}
}
