package com.robenglander.libretto.spec.projection.mapper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.robenglander.libretto.spec.librettoSpec.IdentifierValue;
import com.robenglander.libretto.spec.librettoSpec.SimpleIdentifier;

/**
 * Text from parse nodes (identifiers have no EAttributes).
 */
final class ProjectionNodeText {

	private ProjectionNodeText() {
	}

	static String identifierText(EObject iv) {
		if (iv instanceof SimpleIdentifier si) {
			String id = si.getId();
			return id == null ? "" : stripCaretKeywordEscapes(id);
		}
		if (!(iv instanceof IdentifierValue)) {
			return "";
		}
		INode n = NodeModelUtils.findActualNodeFor(iv);
		if (n == null) {
			return "";
		}
		return stripCaretKeywordEscapes(n.getText().trim());
	}

	static String stripCaretKeywordEscapes(String raw) {
		if (raw == null || raw.isEmpty()) {
			return "";
		}
		String t = raw.trim();
		String[] parts = t.split("\\.", -1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			if (i > 0) {
				sb.append('.');
			}
			String p = parts[i];
			if (p.startsWith("^") && p.length() > 1) {
				sb.append(p, 1, p.length());
			} else {
				sb.append(p);
			}
		}
		return sb.toString();
	}
}
