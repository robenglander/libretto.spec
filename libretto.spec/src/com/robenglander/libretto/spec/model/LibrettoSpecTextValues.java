package com.robenglander.libretto.spec.model;

import com.robenglander.libretto.spec.librettoSpec.TextValue;

/**
 * Access decoded spec text from {@link TextValue} model elements (no surrounding quotes).
 */
public final class LibrettoSpecTextValues {

	private LibrettoSpecTextValues() {
	}

	public static String text(TextValue tv) {
		if (tv == null || tv.getText() == null) {
			return "";
		}
		return tv.getText();
	}
}
