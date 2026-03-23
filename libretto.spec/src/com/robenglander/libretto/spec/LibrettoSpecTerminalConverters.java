package com.robenglander.libretto.spec;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Decodes {@code TEXT_BLOCK} (triple-quoted) tokens into the string body, aligned with libretto-core text-block handling.
 */
public class LibrettoSpecTerminalConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "TEXT_BLOCK")
	public IValueConverter<String> TEXT_BLOCK() {
		return new AbstractLexerBasedConverter<String>() {
			@Override
			public String toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				String t = string.trim();
				if (t.length() >= 6 && t.startsWith("\"\"\"") && t.endsWith("\"\"\"")) {
					String inner = t.substring(3, t.length() - 3);
					return inner.replace("\\\"\"\"", "\"\"\"").replace("\r\n", "\n");
				}
				return t;
			}
		};
	}
}
