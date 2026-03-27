package com.robenglander.libretto.spec.projection;

/** Default code-keyed remediation inside {@code remediations.rules}. */
public record ProjectedTestGenDefaultRemediation(String code, String correction) {

	public ProjectedTestGenDefaultRemediation {
		code = code == null ? "" : code;
		correction = correction == null ? "" : correction;
	}
}
