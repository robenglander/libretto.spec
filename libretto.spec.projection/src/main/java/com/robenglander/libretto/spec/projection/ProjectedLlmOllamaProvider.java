package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * {@code type ollama} — exactly one {@code model} and one {@code endpoint}; no {@code filePath}.
 */
public record ProjectedLlmOllamaProvider(
		String name,
		ProjectedLlmModel model,
		ProjectedLlmEndpoint endpoint) implements ProjectedLlmProvider {

	public ProjectedLlmOllamaProvider {
		Objects.requireNonNull(name, "name");
		Objects.requireNonNull(model, "model");
		Objects.requireNonNull(endpoint, "endpoint");
		if (name.isBlank()) {
			throw new IllegalArgumentException("name must not be blank");
		}
	}
}
