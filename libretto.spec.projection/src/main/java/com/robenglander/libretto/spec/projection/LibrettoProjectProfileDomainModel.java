package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Portable domain model of one {@code profile "…" { … }} block. The grammar may list several profile blocks
 * under the file root; {@link ProjectedProfile} is the per-file wrapper that carries exactly one such model for
 * the canonical projection (see mapper for which block is chosen when several exist).
 * <p>
 * Under validator-clean LPP there is exactly one {@code project { … }} and one {@code llmProviders { … }}; the
 * projection represents those as {@link Optional} singletons rather than lists of size one.
 *
 * @param profileName   this block’s {@code profile} name ({@code ValidID}); use {@link #empty()} for “no profile”
 * @param project       the single {@code project { … }} block, when present
 * @param llmProviders  the single {@code llmProviders { … }} block, when present
 */
public record LibrettoProjectProfileDomainModel(
		String profileName,
		Optional<ProjectedProjectBlock> project,
		Optional<ProjectedLlmProvidersBlock> llmProviders) {

	public LibrettoProjectProfileDomainModel {
		profileName = Objects.requireNonNull(profileName, "profileName");
		project = Objects.requireNonNull(project, "project");
		llmProviders = Objects.requireNonNull(llmProviders, "llmProviders");
	}

	public static LibrettoProjectProfileDomainModel empty() {
		return new LibrettoProjectProfileDomainModel("", Optional.empty(), Optional.empty());
	}

	/** All providers from the {@code llmProviders} block, in order; empty when the block is absent. */
	public List<ProjectedLlmProvider> allLlmProviders() {
		return llmProviders.map(b -> List.copyOf(b.providers())).orElseGet(List::of);
	}
}
