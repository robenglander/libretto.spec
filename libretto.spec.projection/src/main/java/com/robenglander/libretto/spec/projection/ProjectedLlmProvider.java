package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code provider ValidID { type* localModelPath* model* endPoint* }}.
 */
public record ProjectedLlmProvider(
		String name,
		List<ProjectedLlmProviderType> types,
		List<ProjectedLlmLocalModelPath> localModelPaths,
		List<ProjectedLlmModel> models,
		List<ProjectedLlmEndpoint> endpoints) {

	public ProjectedLlmProvider {
		name = name == null ? "" : name.trim();
		types = types == null ? List.of() : List.copyOf(types);
		localModelPaths = localModelPaths == null ? List.of() : List.copyOf(localModelPaths);
		models = models == null ? List.of() : List.copyOf(models);
		endpoints = endpoints == null ? List.of() : List.copyOf(endpoints);
	}
}
