package com.robenglander.libretto.spec.projection;

import java.util.ArrayList;
import java.util.List;

/**
 * Result of mapping the EMF file root ({@code ProjectProfile}: zero or more {@code Profile} children) to portable
 * types without EMF
 * or Xtext on the consumer classpath.
 *
 * @param document all {@code profile} blocks from the file, in order
 */
public record LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfilesDocument document) {

	public LibrettoProjectProfileDomainModelProjection {
		document = document == null ? LibrettoProjectProfilesDocument.empty() : document;
	}

	/** Ordered list of portable models, one per {@code profile} block. */
	public List<LibrettoProjectProfileDomainModel> profiles() {
		return document.profiles();
	}

	/**
	 * First {@code profile} block’s model, or {@link LibrettoProjectProfileDomainModel#empty()} when the file
	 * has none. Convenience for single-profile files; use {@link #profiles()} when multiple apply.
	 */
	public LibrettoProjectProfileDomainModel domainModel() {
		List<LibrettoProjectProfileDomainModel> p = document.profiles();
		return p.isEmpty() ? LibrettoProjectProfileDomainModel.empty() : p.get(0);
	}

	/** {@link LibrettoProjectProfileDomainModel#profileName()} of the first profile; empty when none. */
	public String profileName() {
		return domainModel().profileName();
	}

	/** Project blocks from the first profile only. */
	public List<ProjectedProjectBlock> projectBlocks() {
		return domainModel().projectBlocks();
	}

	/** LLM provider blocks from the first profile only. */
	public List<ProjectedLlmProvidersBlock> llmProviderBlocks() {
		return domainModel().llmProviderBlocks();
	}

	/**
	 * First {@code project} block of the first profile, or {@code null}. Matches common single-profile
	 * files; use {@link #profiles()} for multi-profile data.
	 */
	public ProjectedProjectBlock projectBlock() {
		List<ProjectedProjectBlock> blocks = domainModel().projectBlocks();
		return blocks.isEmpty() ? null : blocks.get(0);
	}

	/** All providers from every {@code llmProviders} block in every profile, in order. */
	public List<ProjectedLlmProvider> llmProviders() {
		List<ProjectedLlmProvider> out = new ArrayList<>();
		for (LibrettoProjectProfileDomainModel m : document.profiles()) {
			out.addAll(m.allLlmProviders());
		}
		return List.copyOf(out);
	}
}
