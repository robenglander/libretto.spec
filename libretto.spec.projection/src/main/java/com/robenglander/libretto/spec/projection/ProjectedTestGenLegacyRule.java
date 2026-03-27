package com.robenglander.libretto.spec.projection;

/** Legacy {@code rule "key" instruction "…"} entries under {@code remediationRules}. */
public record ProjectedTestGenLegacyRule(String key, String instruction) {

	public ProjectedTestGenLegacyRule {
		key = key == null ? "" : key.trim();
		instruction = instruction == null ? "" : instruction.trim();
	}
}
