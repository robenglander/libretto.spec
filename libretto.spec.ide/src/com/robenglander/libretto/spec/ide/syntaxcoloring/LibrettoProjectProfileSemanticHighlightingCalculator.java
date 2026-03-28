/*
 * LSP semantic tokens for .lpp (VS Code / Cursor). Token type strings must match
 * org.eclipse.lsp4j.SemanticTokenTypes.
 * <p>
 * {@link SemanticTokenTypes#Variable} is used for {@code name=ValidID} (and equivalent) assignments;
 * surface rules use {@code ID} and keep distinct token types.
 */
package com.robenglander.libretto.spec.ide.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
		// TrueFalseKeyword → concrete TrueKeyword ("true" | "false"); red in librettoprofile, not maroon keyword.
		if (object.eClass() == PKG.getTrueKeyword() && object.eIsSet(PKG.getTrueKeyword_Keyword())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getTrueKeyword_Keyword(),
					SemanticTokenTypes.Macro);
			return false;
		}
		// Grammar convention: types named *Keyword carry the fixed terminal on feature "keyword".
		if (isGrammarKeywordType(object.eClass().getName())) {
			EStructuralFeature kw = object.eClass().getEStructuralFeature("keyword");
			if (kw != null && object.eIsSet(kw)) {
				highlightAllNodesForFeature(acceptor, object, kw, SemanticTokenTypes.Keyword);
			}
			return false;
		}
		// ValidID assignments (grammar rule ValidID) — themed as variable (green in librettoprofile).
		// Name may be on file root ProjectProfile (older shape) or on inner Profile (profiles+=Profile*).
		highlightNameFeatureAsVariable(acceptor, object, PKG.getEClassifier("ProjectProfile"));
		highlightNameFeatureAsVariable(acceptor, object, PKG.getEClassifier("Profile"));
		if (object.eClass() == PKG.getRootDirectory() && object.eIsSet(PKG.getRootDirectory_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getRootDirectory_Dir(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getProjectModule() && object.eIsSet(PKG.getProjectModule_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getProjectModule_Name(),
					SemanticTokenTypes.Variable);
		}
		if (object.eClass() == PKG.getDirectory() && object.eIsSet(PKG.getDirectory_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getDirectory_Dir(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getSpecDirectory() && object.eIsSet(PKG.getSpecDirectory_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getSpecDirectory_Dir(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getTestDirectory() && object.eIsSet(PKG.getTestDirectory_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getTestDirectory_Dir(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getMainDirectory() && object.eIsSet(PKG.getMainDirectory_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getMainDirectory_Dir(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getBasePackage() && object.eIsSet(PKG.getBasePackage_Dir())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getBasePackage_Dir(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getInitialInstruction() && object.eIsSet(PKG.getInitialInstruction_Instruction())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getInitialInstruction_Instruction(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getMaxRetries() && object.eIsSet(PKG.getMaxRetries_MaxRetries())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getMaxRetries_MaxRetries(),
					SemanticTokenTypes.Number);
		}
		if (object.eClass() == PKG.getDefaultCorrection() && object.eIsSet(PKG.getDefaultCorrection_Correction())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getDefaultCorrection_Correction(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getPattern() && object.eIsSet(PKG.getPattern_Pattern())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getPattern_Pattern(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getCode() && object.eIsSet(PKG.getCode_Code())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getCode_Code(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getCorrection() && object.eIsSet(PKG.getCorrection_Correction())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getCorrection_Correction(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getLLMProvider() && object.eIsSet(PKG.getLLMProvider_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getLLMProvider_Name(),
					SemanticTokenTypes.Variable);
		}
		if (object.eClass() == PKG.getLocalModelPath() && object.eIsSet(PKG.getLocalModelPath_Path())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getLocalModelPath_Path(),
					SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getProviderType() && object.eIsSet(PKG.getProviderType_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getProviderType_Name(),
					SemanticTokenTypes.Variable);
		}
		if (object.eClass() == PKG.getModel() && object.eIsSet(PKG.getModel_Mode())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getModel_Mode(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getEndpoint() && object.eIsSet(PKG.getEndpoint_Mode())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getEndpoint_Mode(), SemanticTokenTypes.String);
		}
		if (object.eClass() == PKG.getPrimaryProvider() && object.eIsSet(PKG.getPrimaryProvider_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getPrimaryProvider_Name(),
					SemanticTokenTypes.Variable);
		}
		if (object.eClass() == PKG.getSecondaryProvider() && object.eIsSet(PKG.getSecondaryProvider_Name())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getSecondaryProvider_Name(),
					SemanticTokenTypes.Variable);
		}
		if (object.eClass() == PKG.getAtRetry() && object.eIsSet(PKG.getAtRetry_Value())) {
			highlightAllNodesForFeature(acceptor, object, PKG.getAtRetry_Value(),
					SemanticTokenTypes.Number);
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

	private void highlightNameFeatureAsVariable(IHighlightedPositionAcceptor acceptor, EObject object,
			EClassifier classifier) {
		if (!(classifier instanceof EClass eClass) || !eClass.isInstance(object)) {
			return;
		}
		EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
		if (nameFeature != null && object.eIsSet(nameFeature)) {
			highlightAllNodesForFeature(acceptor, object, nameFeature, SemanticTokenTypes.Variable);
		}
	}

	private static boolean isGrammarKeywordType(String eClassName) {
		return eClassName != null && eClassName.endsWith("Keyword");
	}

	private void highlightAllNodesForFeature(IHighlightedPositionAcceptor acceptor, EObject object,
			EStructuralFeature feature, String lspTokenType) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(object, feature);
		for (INode node : nodes) {
			highlightNode(acceptor, node, lspTokenType);
		}
	}
}
