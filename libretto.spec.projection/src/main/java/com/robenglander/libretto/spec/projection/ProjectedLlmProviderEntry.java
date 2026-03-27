package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code provider name { kind* localModelPath* model* endpoint* }}.
 */
public record ProjectedLlmProviderEntry(
		String name,
		List<String> kinds,
		List<String> localModelPaths,
		List<String> models,
		List<String> endpoints) {

	public ProjectedLlmProviderEntry {
		name = name == null ? "" : name.trim();
		kinds = normalizeList(kinds);
		localModelPaths = normalizeList(localModelPaths);
		models = normalizeList(models);
		endpoints = normalizeList(endpoints);
	}

	private static List<String> normalizeList(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
