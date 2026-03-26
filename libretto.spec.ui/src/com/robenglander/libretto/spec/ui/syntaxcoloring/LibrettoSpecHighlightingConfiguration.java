package com.robenglander.libretto.spec.ui.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Eclipse editor colors for {@code .libretto} — cool cyan/blue keyword family (pairs with Cursor
 * TextMate {@code source.libretto} / green semantic {@code property}).
 */
public class LibrettoSpecHighlightingConfiguration extends DefaultHighlightingConfiguration {

	@Override
	public TextStyle keywordTextStyle() {
		TextStyle style = super.keywordTextStyle();
		style.setColor(new RGB(86, 156, 214));
		return style;
	}

	@Override
	public TextStyle stringTextStyle() {
		TextStyle style = super.stringTextStyle();
		style.setColor(new RGB(206, 145, 120));
		return style;
	}

	@Override
	public TextStyle commentTextStyle() {
		TextStyle style = super.commentTextStyle();
		style.setColor(new RGB(106, 153, 85));
		return style;
	}
}
