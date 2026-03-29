package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * {@code type openai}, {@code gemini}, or {@code anthropic} — exactly one {@code model}; no {@code filePath} or
 * {@code endpoint}.
 */
public record ProjectedLlmManagedProvider(
		String name,
		ProjectedLlmProviderType type,
		ProjectedLlmModel model) implements ProjectedLlmProvider {

	public ProjectedLlmManagedProvider {
		Objects.requireNonNull(name, "name");
		Objects.requireNonNull(type, "type");
		Objects.requireNonNull(model, "model");
		if (name.isBlank()) {
			throw new IllegalArgumentException("name must not be blank");
		}
	}
}
