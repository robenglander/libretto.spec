/*
 * LSP semantic tokens for .lpp (VS Code / Cursor). Token type strings must match
 * org.eclipse.lsp4j.SemanticTokenTypes.
 */
package com.robenglander.libretto.spec.ide.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.lsp4j.SemanticTokenTypes;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;

import com.robenglander.libretto.spec.librettoProjectProfile.LibrettoProjectProfilePackage;

/**
 * Semantic highlighting for Libretto project profiles — complements TextMate and uses a different
 * palette from {@link LibrettoSpecSemanticHighlightingCalculator} via editor theme rules.
 */
public class LibrettoProjectProfileSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	private static final LibrettoProjectProfilePackage PKG = LibrettoProjectProfilePackage.eINSTANCE;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (cancelIndicator.isCanceled()) {
			return true;
		}
		if (object.eClass() == PKG.getProjectProfile() && object.eIsSet(PKG.getProjectProfile_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getProjectProfile_Name(),
					SemanticTokenTypes.Namespace);
		}
		if (object.eClass() == PKG.getProjectBlock() && object.eIsSet(PKG.getProjectBlock_RootDir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getProjectBlock_RootDir(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getProjectModule()) {
			if (object.eIsSet(PKG.getProjectModule_Name())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getProjectModule_Name(),
						SemanticTokenTypes.Namespace);
			}
			highlightStrings(acceptor, object, PKG.getProjectModule_Dirs());
			highlightStrings(acceptor, object, PKG.getProjectModule_SpecDirs());
			highlightStrings(acceptor, object, PKG.getProjectModule_TestDirs());
			highlightStrings(acceptor, object, PKG.getProjectModule_MainDirs());
			highlightStrings(acceptor, object, PKG.getProjectModule_BasePackages());
		}
		if (object.eClass() == PKG.getGenBlock()) {
			highlightStrings(acceptor, object, PKG.getGenBlock_InitialInstructions());
			if (object.eIsSet(PKG.getGenBlock_MaxRetries())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getGenBlock_MaxRetries(),
						SemanticTokenTypes.Number);
			}
			if (object.eIsSet(PKG.getGenBlock_ParseChecks())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getGenBlock_ParseChecks(),
						SemanticTokenTypes.EnumMember);
			}
			highlightStrings(acceptor, object, PKG.getGenBlock_DefaultCorrections());
		}
		if (object.eClass() == PKG.getGenPatternRemediationRule()) {
			highlightStrings(acceptor, object, PKG.getGenPatternRemediationRule_Patterns());
			highlightStrings(acceptor, object, PKG.getGenPatternRemediationRule_Codes());
			highlightStrings(acceptor, object, PKG.getGenPatternRemediationRule_Corrections());
		}
		if (object.eClass() == PKG.getGenDefaultRemediationRule()) {
			highlightStrings(acceptor, object, PKG.getGenDefaultRemediationRule_Codes());
			highlightStrings(acceptor, object, PKG.getGenDefaultRemediationRule_Correction());
		}
		if (object.eClass() == PKG.getNamedLlmProvider()) {
			if (object.eIsSet(PKG.getNamedLlmProvider_Name())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getNamedLlmProvider_Name(),
						SemanticTokenTypes.Namespace);
			}
			if (object.eIsSet(PKG.getNamedLlmProvider_Kinds())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getNamedLlmProvider_Kinds(),
						SemanticTokenTypes.EnumMember);
			}
			highlightStrings(acceptor, object, PKG.getNamedLlmProvider_LocalModelPaths());
			highlightStrings(acceptor, object, PKG.getNamedLlmProvider_Models());
			highlightStrings(acceptor, object, PKG.getNamedLlmProvider_Endpoints());
		}
		if (object.eClass() == PKG.getGenUsageBlock()) {
			highlightStrings(acceptor, object, PKG.getGenUsageBlock_PrimaryProviders());
			highlightStrings(acceptor, object, PKG.getGenUsageBlock_SecondaryProviders());
		}
		if (object.eClass() == PKG.getGenEscalationBlock()) {
			if (object.eIsSet(PKG.getGenEscalationBlock_Enableds())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getGenEscalationBlock_Enableds(),
						SemanticTokenTypes.EnumMember);
			}
			if (object.eIsSet(PKG.getGenEscalationBlock_EscalateAtRetries())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getGenEscalationBlock_EscalateAtRetries(),
						SemanticTokenTypes.Number);
			}
		}
		if (object.eClass() == PKG.getScopedSurface()) {
			if (object.eIsSet(PKG.getScopedSurface_ModuleId())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getScopedSurface_ModuleId(),
						SemanticTokenTypes.Namespace);
			}
			if (object.eIsSet(PKG.getScopedSurface_SpecId())) {
				highlightAllNodesForFeature(acceptor, object, PKG.getScopedSurface_SpecId(),
						SemanticTokenTypes.Namespace);
			}
		}
		if (object.eClass() == PKG.getReturnTypeRule() && object.eIsSet(PKG.getReturnTypeRule_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getReturnTypeRule_Name(),
					SemanticTokenTypes.Function);
		}
		if (object.eClass() == PKG.getParamTypeRule() && object.eIsSet(PKG.getParamTypeRule_ParamName())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getParamTypeRule_ParamName(),
					SemanticTokenTypes.Parameter);
		}
		if (object.eClass() == PKG.getRecordSelfReturnRule()
				&& object.eIsSet(PKG.getRecordSelfReturnRule_Methods())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getRecordSelfReturnRule_Methods(),
					SemanticTokenTypes.EnumMember);
		}
		if (object.eClass() == PKG.getOperationSignature() && object.eIsSet(PKG.getOperationSignature_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getOperationSignature_Name(),
					SemanticTokenTypes.Function);
		}
		if (object.eClass() == PKG.getTypedParam() && object.eIsSet(PKG.getTypedParam_ParamName())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getTypedParam_ParamName(),
					SemanticTokenTypes.Parameter);
		}
		if (object.eClass() == PKG.getQualifiedName() && object.eIsSet(PKG.getQualifiedName_Segments())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getQualifiedName_Segments(),
					SemanticTokenTypes.Type);
		}
		if (object.eClass() == PKG.getPrimitiveType() && object.eIsSet(PKG.getPrimitiveType_Kind())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getPrimitiveType_Kind(),
					SemanticTokenTypes.Type);
		}
		return false;
	}

	private void highlightStrings(IHighlightedPositionAcceptor acceptor, EObject object,
			EStructuralFeature feature) {
		if (object.eIsSet(feature)) {
			highlightAllNodesForFeature(acceptor, object, feature, SemanticTokenTypes.String);
		}
	}

	private void highlightAllNodesForFeature(IHighlightedPositionAcceptor acceptor, EObject object,
			EStructuralFeature feature, String lspTokenType) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(object, feature);
		for (INode node : nodes) {
			highlightNode(acceptor, node, lspTokenType);
		}
	}
}
