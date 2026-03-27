package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code default { code … correction … }} inside {@code rules}.
 */
public record ProjectedGenDefaultRemediationRule(
		List<String> codes,
		List<String> corrections) {

	public ProjectedGenDefaultRemediationRule {
		codes = normalizeList(codes);
		corrections = normalizeList(corrections);
	}

	private static List<String> normalizeList(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
