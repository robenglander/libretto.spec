package com.robenglander.libretto.spec.projection;

/**
 * Pattern / code-keyed remediation rule inside {@code remediations.rules}.
 */
public record ProjectedTestGenPatternRemediation(String pattern, String code, String correction) {

	public ProjectedTestGenPatternRemediation {
		pattern = pattern == null ? "" : pattern;
		code = code == null ? "" : code;
		correction = correction == null ? "" : correction;
	}
}
