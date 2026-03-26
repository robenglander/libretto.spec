package com.robenglander.libretto.spec.ui.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Eclipse editor colors for {@code .lpp} — warm violet/amber, distinct from
 * {@link LibrettoSpecHighlightingConfiguration}.
 */
public class LibrettoProjectProfileHighlightingConfiguration extends DefaultHighlightingConfiguration {

	@Override
	public TextStyle keywordTextStyle() {
		TextStyle style = super.keywordTextStyle();
		style.setColor(new RGB(197, 134, 192));
		return style;
	}

	@Override
	public TextStyle stringTextStyle() {
		TextStyle style = super.stringTextStyle();
		style.setColor(new RGB(220, 178, 92));
		return style;
	}

	@Override
	public TextStyle commentTextStyle() {
		TextStyle style = super.commentTextStyle();
		style.setColor(new RGB(118, 148, 132));
		return style;
	}
}
