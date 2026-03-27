package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code llmProviders { provider "name" { … } }}.
 */
public record ProjectedLlmProviderEntry(
		String name,
		String kind,
		String localModelPath,
		String model,
		String endpoint) {

	public ProjectedLlmProviderEntry {
		name = name == null ? "" : name.trim();
		kind = kind == null ? "" : kind.trim();
		localModelPath = localModelPath == null ? "" : localModelPath.trim();
		model = model == null ? "" : model.trim();
		endpoint = endpoint == null ? "" : endpoint.trim();
	}
}
