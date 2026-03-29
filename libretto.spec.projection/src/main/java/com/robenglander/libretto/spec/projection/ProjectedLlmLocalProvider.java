package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * {@code type local} — exactly one {@code filePath}; no {@code model} or {@code endpoint}.
 */
public record ProjectedLlmLocalProvider(String name, ProjectedLlmLocalModelPath filePath) implements ProjectedLlmProvider {

	public ProjectedLlmLocalProvider {
		Objects.requireNonNull(name, "name");
		Objects.requireNonNull(filePath, "filePath");
		if (name.isBlank()) {
			throw new IllegalArgumentException("name must not be blank");
		}
	}
}
