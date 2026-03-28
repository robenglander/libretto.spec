package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code localModelPath} keyword with STRING {@code path} under {@code provider}.
 */
public record ProjectedLlmLocalModelPath(String path) {

	public ProjectedLlmLocalModelPath {
		path = path == null ? "" : path.trim();
	}
}
