package com.robenglander.libretto.spec.projection;

/** Portable view of {@code code} STRING inside remediation {@code rule} or {@code default}. */
public record ProjectedGenRemediationCode(String code) {

	public ProjectedGenRemediationCode {
		code = code == null ? "" : code.trim();
	}
}
