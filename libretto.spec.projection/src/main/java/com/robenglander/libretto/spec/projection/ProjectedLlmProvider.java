package com.robenglander.libretto.spec.projection;

/**
 * Portable view of one {@code provider ValidID { … }} under {@code llmProviders}. Validator-clean LPP fixes exactly
 * one shape per {@code type}; that shape is modeled as this sealed hierarchy so invalid combinations are not
 * representable and constructors do not coerce bad input into placeholder values.
 */
public sealed interface ProjectedLlmProvider permits
		ProjectedLlmLocalProvider,
		ProjectedLlmManagedProvider,
		ProjectedLlmOllamaProvider {

	String name();
}
