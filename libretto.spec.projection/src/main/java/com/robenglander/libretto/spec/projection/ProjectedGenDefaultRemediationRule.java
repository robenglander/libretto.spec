package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code default { code* correction* }} inside {@code rules}.
 */
public record ProjectedGenDefaultRemediationRule(
		List<ProjectedGenRemediationCode> codes,
		List<ProjectedGenRemediationCorrection> corrections) {

	public ProjectedGenDefaultRemediationRule {
		codes = codes == null ? List.of() : List.copyOf(codes);
		corrections = corrections == null ? List.of() : List.copyOf(corrections);
	}
}
