package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code parseCheck} with {@code true}/{@code false} keyword under {@code gen}.
 */
public record ProjectedGenParseCheck(String value) {

	public ProjectedGenParseCheck {
		value = value == null ? "" : value.trim();
	}
}
