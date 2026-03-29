package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * Shared validation for portable projection string fields: reject {@code null} and blank/whitespace-only values so
 * invalid input cannot be laundered into a record that looks structurally valid.
 */
public final class ProjectionStrings {

	private ProjectionStrings() {
	}

	/**
	 * Non-null string, trimmed; throws {@link IllegalArgumentException} if the trimmed value is empty.
	 */
	public static String requireNonBlank(String raw, String fieldLabel) {
		Objects.requireNonNull(raw, fieldLabel);
		String trimmed = raw.trim();
		if (trimmed.isEmpty()) {
			throw new IllegalArgumentException(fieldLabel + " must not be blank");
		}
		return trimmed;
	}

	/**
	 * Non-null string, trimmed; empty after trim is allowed (e.g. optional projection fields that may be absent in
	 * the source text).
	 */
	public static String requireNonNullTrim(String raw, String fieldLabel) {
		Objects.requireNonNull(raw, fieldLabel);
		return raw.trim();
	}
}
