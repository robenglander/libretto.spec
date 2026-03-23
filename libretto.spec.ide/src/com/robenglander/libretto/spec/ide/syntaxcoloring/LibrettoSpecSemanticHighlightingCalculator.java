/*
 * LSP semantic tokens (VS Code / Cursor) via org.eclipse.xtext.ide.server.semantictokens.SemanticTokensService.
 * Style strings must match LSP semantic token type names (see org.eclipse.lsp4j.SemanticTokenTypes).
 */
package com.robenglander.libretto.spec.ide.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.lsp4j.SemanticTokenTypes;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;

import com.robenglander.libretto.spec.librettoSpec.LibrettoSpecPackage;

/**
 * Emits semantic token ranges for LibrettoSpec so editors can color beyond TextMate (spec id, B-/AT-/etc. ids).
 */
public class LibrettoSpecSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	private static final LibrettoSpecPackage PKG = LibrettoSpecPackage.eINSTANCE;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (cancelIndicator.isCanceled()) {
			return true;
		}
		EClass eClass = object.eClass();
		// Leading keyword before ':' for grammar rules named *Field (e.g. spec_id, title, section).
		if (eClass.getName().endsWith("Field")) {
			highlightLeadingFieldKeyword(acceptor, object);
		}
		// Top-level spec identifier (e.g. ACCOUNT-403b)
		if (object.eClass() == PKG.getSpec()) {
			highlightAllNodesForFeature(acceptor, object, PKG.getSpec_SpecId(), SemanticTokenTypes.Namespace);
		}
		// Record "id" string attributes (behavior B-###, acceptance AT-###, directives, etc.)
		for (EAttribute attr : object.eClass().getEAllAttributes()) {
			if (!"id".equals(attr.getName())) {
				continue;
			}
			if (attr.getEAttributeType() != EcorePackage.Literals.ESTRING) {
				continue;
			}
			if (object.eIsSet(attr)) {
				highlightAllNodesForFeature(acceptor, object, attr, SemanticTokenTypes.EnumMember);
			}
		}
		// Multi-valued id lists (e.g. behavior id lists)
		if (object.eClass() == PKG.getBehaviorIdList() && object.eIsSet(PKG.getBehaviorIdList_Values())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getBehaviorIdList_Values(),
					SemanticTokenTypes.EnumMember);
		}
		if (object.eClass() == PKG.getReferenceIdList() && object.eIsSet(PKG.getReferenceIdList_Values())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getReferenceIdList_Values(),
					SemanticTokenTypes.Variable);
		}
		// Free-text lines in prose / string lists — distinct from structural keywords in TextMate
		if (object.eClass() == PKG.getTextList() && object.eIsSet(PKG.getTextList_Values())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getTextList_Values(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getTextValue() && object.eIsSet(PKG.getTextValue_Text())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getTextValue_Text(), SemanticTokenTypes.String);
		}
		return false;
	}

	private void highlightAllNodesForFeature(IHighlightedPositionAcceptor acceptor, EObject object,
			EStructuralFeature feature, String lspTokenType) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(object, feature);
		for (INode node : nodes) {
			highlightNode(acceptor, node, lspTokenType);
		}
	}

	/**
	 * Highlights the first visible leaf when it is immediately followed by ':' (field label keyword).
	 */
	private void highlightLeadingFieldKeyword(IHighlightedPositionAcceptor acceptor, EObject object) {
		INode node = NodeModelUtils.getNode(object);
		if (node == null) {
			return;
		}
		ILeafNode firstVisible = null;
		for (ILeafNode leaf : node.getLeafNodes()) {
			if (leaf.isHidden()) {
				continue;
			}
			if (firstVisible == null) {
				firstVisible = leaf;
				continue;
			}
			String second = leaf.getText().trim();
			if (":".equals(second)) {
				highlightNode(acceptor, firstVisible, SemanticTokenTypes.Property);
			}
			return;
		}
	}
}
