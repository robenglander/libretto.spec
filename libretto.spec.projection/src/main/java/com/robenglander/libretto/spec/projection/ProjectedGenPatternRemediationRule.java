package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code rule { pattern* code* correction* }} inside {@code rules}.
 */
public record ProjectedGenPatternRemediationRule(
		List<ProjectedGenPattern> patterns,
		List<ProjectedGenRemediationCode> codes,
		List<ProjectedGenRemediationCorrection> corrections) {

	public ProjectedGenPatternRemediationRule {
		patterns = patterns == null ? List.of() : List.copyOf(patterns);
		codes = codes == null ? List.of() : List.copyOf(codes);
		corrections = corrections == null ? List.of() : List.copyOf(corrections);
	}
}
