/*
 * Custom validation aligned with {@code LibrettoTextValidator} in the libretto project (coherence + IDs).
 */
package com.robenglander.libretto.spec.validation;

import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestsSection;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryExportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryImportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecord;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSection;
import com.robenglander.libretto.spec.librettoSpec.DottedIdentifier;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.IdentifierValue;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectivesSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataCompiledAtField;
import com.robenglander.libretto.spec.librettoSpec.MetadataCompilerVersionField;
import com.robenglander.libretto.spec.librettoSpec.MetadataField;
import com.robenglander.libretto.spec.librettoSpec.MetadataJavaPackageField;
import com.robenglander.libretto.spec.librettoSpec.MetadataModelMetadataField;
import com.robenglander.libretto.spec.librettoSpec.MetadataModuleField;
import com.robenglander.libretto.spec.librettoSpec.MetadataSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataStatusField;
import com.robenglander.libretto.spec.librettoSpec.MetadataTitleField;
import com.robenglander.libretto.spec.librettoSpec.MetadataVersionField;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.OutcomeClassValue;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecord;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeSection;
import com.robenglander.libretto.spec.librettoSpec.ProseSection;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferencesSection;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SimpleIdentifier;
import com.robenglander.libretto.spec.librettoSpec.SourceBlock;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import com.robenglander.libretto.spec.librettoSpec.TextValue;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecordItem;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecordItem;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SourceBlockItem;
import com.robenglander.libretto.spec.librettoSpec.LibrettoSpecPackage.Literals;
import com.robenglander.libretto.spec.model.LibrettoSpecTextValues;
import com.robenglander.libretto.spec.model.SpecSections;
import com.robenglander.libretto.spec.model.UnorderedRecordAccess;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

/**
 * Libretto coherence checks (IDs, cross-references, operation surface). Issue codes match
 * {@code com.robenglander.libretto.core.emit.LibrettoTextValidator} where applicable.
 */
public class LibrettoSpecValidator extends AbstractLibrettoSpecValidator {

	public static final String DUPLICATE_BEHAVIOR_ID = "DUPLICATE_BEHAVIOR_ID";
	public static final String DUPLICATE_AT_ID = "DUPLICATE_AT_ID";
	public static final String DUPLICATE_OOS_ID = "DUPLICATE_OOS_ID";
	public static final String AT_REFERENCES_UNKNOWN_BEHAVIOR = "AT_REFERENCES_UNKNOWN_BEHAVIOR";
	public static final String DUPLICATE_OPERATION_SURFACE_ID = "DUPLICATE_OPERATION_SURFACE_ID";
	public static final String UNIMPLEMENTED_OPERATION_SURFACE_ENTRY = "UNIMPLEMENTED_OPERATION_SURFACE_ENTRY";
	public static final String OPERATION_SURFACE_OUTCOME_CLASS_MISMATCH = "OPERATION_SURFACE_OUTCOME_CLASS_MISMATCH";
	public static final String UNMAPPED_BEHAVIOR_OPERATION = "UNMAPPED_BEHAVIOR_OPERATION";
	public static final String OPERATION_SURFACE_NOT_COVERED_BY_ACCEPTANCE_TEST = "OPERATION_SURFACE_NOT_COVERED_BY_ACCEPTANCE_TEST";
	public static final String ACCEPTANCE_TEST_VALIDATES_BEHAVIOR_WITHOUT_SURFACED_OPERATION = "ACCEPTANCE_TEST_VALIDATES_BEHAVIOR_WITHOUT_SURFACED_OPERATION";
	public static final String ACCEPTANCE_TEST_VALIDATES_NON_SURFACED_OPERATION = "ACCEPTANCE_TEST_VALIDATES_NON_SURFACED_OPERATION";
	public static final String DUPLICATE_IMPLEMENTS_TARGET = "DUPLICATE_IMPLEMENTS_TARGET";
	public static final String IMPLEMENTS_TARGET_NOT_IN_DEPENDENCIES = "IMPLEMENTS_TARGET_NOT_IN_DEPENDENCIES";
	public static final String IMPLEMENTS_SURFACE_WITHOUT_OPERATION_SURFACE = "IMPLEMENTS_SURFACE_WITHOUT_OPERATION_SURFACE";
	public static final String BOUNDARY_EXPORT_MISSING_SPEC_ID = "BOUNDARY_EXPORT_MISSING_SPEC_ID";
	public static final String BOUNDARY_EXPORT_MISSING_OPERATION_ID = "BOUNDARY_EXPORT_MISSING_OPERATION_ID";
	public static final String BOUNDARY_EXPORT_UNKNOWN_OPERATION_ID = "BOUNDARY_EXPORT_UNKNOWN_OPERATION_ID";
	public static final String BOUNDARY_EXPORT_DUPLICATE_TARGET = "BOUNDARY_EXPORT_DUPLICATE_TARGET";
	public static final String BOUNDARY_IMPORT_MISSING_SPEC_ID = "BOUNDARY_IMPORT_MISSING_SPEC_ID";
	public static final String BOUNDARY_IMPORT_MISSING_OPERATION_ID = "BOUNDARY_IMPORT_MISSING_OPERATION_ID";
	public static final String BOUNDARY_IMPORT_UNKNOWN_OPERATION_ID = "BOUNDARY_IMPORT_UNKNOWN_OPERATION_ID";
	public static final String BOUNDARY_IMPORT_DUPLICATE_TARGET = "BOUNDARY_IMPORT_DUPLICATE_TARGET";
	public static final String MISSING_METADATA_SECTION = "MISSING_METADATA_SECTION";
	public static final String MISSING_METADATA_STATUS = "MISSING_METADATA_STATUS";
	public static final String MISSING_METADATA_MODULE = "MISSING_METADATA_MODULE";
	public static final String MISSING_METADATA_PACKAGE = "MISSING_METADATA_PACKAGE";
	public static final String DUPLICATE_METADATA_FIELD = "DUPLICATE_METADATA_FIELD";
	public static final String MISSING_BEHAVIOR_SOURCE = "MISSING_BEHAVIOR_SOURCE";
	public static final String MISSING_BEHAVIOR_ACTOR = "MISSING_BEHAVIOR_ACTOR";
	public static final String MISSING_BEHAVIOR_ACTION = "MISSING_BEHAVIOR_ACTION";
	public static final String MISSING_BEHAVIOR_OBJECTS = "MISSING_BEHAVIOR_OBJECTS";
	public static final String MISSING_BEHAVIOR_READS = "MISSING_BEHAVIOR_READS";
	public static final String MISSING_BEHAVIOR_WRITES = "MISSING_BEHAVIOR_WRITES";
	public static final String MISSING_BEHAVIOR_CONDITIONS = "MISSING_BEHAVIOR_CONDITIONS";
	public static final String MISSING_BEHAVIOR_OUTCOMES = "MISSING_BEHAVIOR_OUTCOMES";
	public static final String MISSING_DEPENDENCY_TARGET_SPEC = "MISSING_DEPENDENCY_TARGET_SPEC";
	public static final String MISSING_REFERENCE_TITLE = "MISSING_REFERENCE_TITLE";
	public static final String MISSING_REFERENCE_TYPE = "MISSING_REFERENCE_TYPE";
	public static final String MISSING_REFERENCE_CITATION = "MISSING_REFERENCE_CITATION";
	public static final String MISSING_SECTION_CONTEXT_SECTION = "MISSING_SECTION_CONTEXT_SECTION";
	public static final String MISSING_SECTION_CONTEXT_TEXT = "MISSING_SECTION_CONTEXT_TEXT";
	public static final String MISSING_SUBSECTION_CONTEXT_SECTION = "MISSING_SUBSECTION_CONTEXT_SECTION";
	public static final String MISSING_SUBSECTION_CONTEXT_SUBSECTION = "MISSING_SUBSECTION_CONTEXT_SUBSECTION";
	public static final String MISSING_SUBSECTION_CONTEXT_TEXT = "MISSING_SUBSECTION_CONTEXT_TEXT";
	public static final String MISSING_OOS_STATEMENT = "MISSING_OOS_STATEMENT";
	public static final String MISSING_OPERATION_SURFACE_EXPRESSION = "MISSING_OPERATION_SURFACE_EXPRESSION";
	public static final String MISSING_OPERATION_SURFACE_OUTCOME_CLASS = "MISSING_OPERATION_SURFACE_OUTCOME_CLASS";
	public static final String MISSING_IMPLEMENTS_TARGET_SPEC = "MISSING_IMPLEMENTS_TARGET_SPEC";
	public static final String MISSING_ACCEPTANCE_TEST_SOURCE = "MISSING_ACCEPTANCE_TEST_SOURCE";
	public static final String MISSING_ACCEPTANCE_TEST_VALIDATES = "MISSING_ACCEPTANCE_TEST_VALIDATES";
	public static final String MISSING_ACCEPTANCE_TEST_PRECONDITIONS = "MISSING_ACCEPTANCE_TEST_PRECONDITIONS";
	public static final String MISSING_ACCEPTANCE_TEST_ACTIONS = "MISSING_ACCEPTANCE_TEST_ACTIONS";
	public static final String MISSING_ACCEPTANCE_TEST_ASSERTIONS = "MISSING_ACCEPTANCE_TEST_ASSERTIONS";
	public static final String MISSING_IMPLEMENTATION_DIRECTIVE_SOURCE = "MISSING_IMPLEMENTATION_DIRECTIVE_SOURCE";
	public static final String MISSING_IMPLEMENTATION_DIRECTIVE_APPLIES_TO = "MISSING_IMPLEMENTATION_DIRECTIVE_APPLIES_TO";
	public static final String MISSING_IMPLEMENTATION_DIRECTIVE_STRENGTH = "MISSING_IMPLEMENTATION_DIRECTIVE_STRENGTH";
	public static final String MISSING_IMPLEMENTATION_DIRECTIVE_DIRECTIVE = "MISSING_IMPLEMENTATION_DIRECTIVE_DIRECTIVE";
	public static final String MISSING_SOURCE_BLOCK_SECTION = "MISSING_SOURCE_BLOCK_SECTION";
	public static final String DUPLICATE_TOP_LEVEL_SECTION = "DUPLICATE_TOP_LEVEL_SECTION";
	public static final String DUPLICATE_NESTED_FIELD = "DUPLICATE_NESTED_FIELD";

	private static final Pattern OPERATION_CONDITION_PATTERN = Pattern.compile("operation\\s*=\\s*(.+)$");

	private static final class NestedSlot<I> {
		private final Function<I, ?> getter;
		private final EStructuralFeature itemFeature;
		private final String label;

		NestedSlot(Function<I, ?> getter, EStructuralFeature itemFeature, String label) {
			this.getter = getter;
			this.itemFeature = itemFeature;
			this.label = label;
		}
	}

	/** Underline the grammar keyword for {@code record} (fallback: structural feature). */
	private void errorOnRecordConstruct(EObject record, String message, String code) {
		errorAnchored(record, ValidationKeywordAnchor.recordConstructKeyword(record), message, code,
				recordConstructFallback(record));
	}

	private void warningOnRecordConstruct(EObject record, String message, String code) {
		warningAnchored(record, ValidationKeywordAnchor.recordConstructKeyword(record), message, code,
				recordConstructFallback(record));
	}

	private static EStructuralFeature recordConstructFallback(EObject record) {
		if (record instanceof BehaviorRecord) {
			return Literals.BEHAVIOR_RECORD__ITEMS;
		}
		if (record instanceof SourceBlock) {
			return Literals.SOURCE_BLOCK__ITEMS;
		}
		if (record instanceof DependencyRecord) {
			return Literals.DEPENDENCY_RECORD__ITEMS;
		}
		if (record instanceof ReferenceRecord) {
			return Literals.REFERENCE_RECORD__ITEMS;
		}
		if (record instanceof SectionContextRecord) {
			return Literals.SECTION_CONTEXT_RECORD__ITEMS;
		}
		if (record instanceof SubsectionContextRecord) {
			return Literals.SUBSECTION_CONTEXT_RECORD__ITEMS;
		}
		if (record instanceof OutOfScopeRecord) {
			return Literals.OUT_OF_SCOPE_RECORD__ITEMS;
		}
		if (record instanceof OperationSurfaceRecord) {
			return Literals.OPERATION_SURFACE_RECORD__ITEMS;
		}
		if (record instanceof ImplementsSurfaceRecord) {
			return Literals.IMPLEMENTS_SURFACE_RECORD__ITEMS;
		}
		if (record instanceof BoundaryRecord) {
			return Literals.BOUNDARY_RECORD__ITEMS;
		}
		if (record instanceof AcceptanceTestRecord) {
			return Literals.ACCEPTANCE_TEST_RECORD__ITEMS;
		}
		if (record instanceof ImplementationDirectiveRecord) {
			return Literals.IMPLEMENTATION_DIRECTIVE_RECORD__ITEMS;
		}
		if (record instanceof Spec) {
			return Literals.SPEC__SECTIONS;
		}
		var feats = record.eClass().getEStructuralFeatures();
		return feats.isEmpty() ? Literals.SPEC__SECTIONS : feats.get(0);
	}

	private void errorAnchored(EObject object, String keyword, String message, String code,
			EStructuralFeature fallback) {
		int[] span = ValidationKeywordAnchor.spanForKeyword(object, keyword);
		if (span != null) {
			acceptError(message, object, span[0], span[1], code);
		} else {
			error(message, object, fallback, code);
		}
	}

	private void warningAnchored(EObject object, String keyword, String message, String code,
			EStructuralFeature fallback) {
		int[] span = ValidationKeywordAnchor.spanForKeyword(object, keyword);
		if (span != null) {
			acceptWarning(message, object, span[0], span[1], code);
		} else {
			warning(message, object, fallback, code);
		}
	}

	private <I extends EObject> void checkAtMostOneNestedSlot(List<I> items, NestedSlot<I> slot) {
		if (items == null) {
			return;
		}
		boolean seen = false;
		for (I it : items) {
			if (slot.getter.apply(it) == null) {
				continue;
			}
			if (seen) {
				EObject parent = it.eContainer();
				errorAnchored(parent, ValidationKeywordAnchor.recordConstructKeyword(parent),
						"Duplicate " + slot.label + " field in record body.", DUPLICATE_NESTED_FIELD,
						recordConstructFallback(parent));
				return;
			}
			seen = true;
		}
	}

	private <I extends EObject> void checkAtMostOneNestedSlots(List<I> items, @SuppressWarnings("unchecked") NestedSlot<I>... slots) {
		if (items == null || slots == null) {
			return;
		}
		for (NestedSlot<I> slot : slots) {
			checkAtMostOneNestedSlot(items, slot);
		}
	}

	@Check
	public void checkAtMostOneTopLevelSectionBlockPerKind(Spec spec) {
		Set<org.eclipse.emf.ecore.EClass> seen = new HashSet<>();
		for (SpecSection sec : spec.getSections()) {
			org.eclipse.emf.ecore.EClass k = sec.eClass();
			if (!seen.add(k)) {
				errorAnchored(sec, ValidationKeywordAnchor.topLevelSectionKeyword(sec),
						"Duplicate top-level section block (only one block allowed per section keyword).", DUPLICATE_TOP_LEVEL_SECTION,
						primaryFeatureForSection(sec));
			}
		}
	}

	@Check
	public void checkSpecHasMetadataSection(Spec spec) {
		if (SpecSections.metadataSections(spec).isEmpty()) {
			errorAnchored(spec, "spec", "Spec is missing required metadata section.", MISSING_METADATA_SECTION,
					Literals.SPEC__SECTIONS);
		}
	}

	@Check
	public void checkMetadataSectionRequiredAndUnique(MetadataSection metaSec) {
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataTitleField, "title",
				Literals.METADATA_TITLE_FIELD__TITLE);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataVersionField, "version",
				Literals.METADATA_VERSION_FIELD__VERSION);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataStatusField, "status",
				Literals.METADATA_STATUS_FIELD__STATUS);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataModuleField, "module",
				Literals.METADATA_MODULE_FIELD__MODULE_NAME);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataJavaPackageField, "package",
				Literals.METADATA_JAVA_PACKAGE_FIELD__JAVA_PACKAGE);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataCompiledAtField, "compiled_at",
				Literals.METADATA_COMPILED_AT_FIELD__COMPILED_AT);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataCompilerVersionField, "compiler_version",
				Literals.METADATA_COMPILER_VERSION_FIELD__COMPILER_VERSION);
		checkAtMostOneMetadataSlot(metaSec, f -> f instanceof MetadataModelMetadataField, "model_metadata",
				Literals.METADATA_MODEL_METADATA_FIELD__MODEL_METADATA);

		boolean hasStatus = false;
		boolean hasModule = false;
		boolean hasPackage = false;
		for (MetadataField f : metaSec.getFields()) {
			if (f instanceof MetadataStatusField) {
				hasStatus = true;
			}
			if (f instanceof MetadataModuleField mf && mf.getModuleName() != null
					&& !LibrettoSpecTextValues.text(mf.getModuleName()).isBlank()) {
				hasModule = true;
			}
			if (f instanceof MetadataJavaPackageField jf && jf.getJavaPackage() != null
					&& !LibrettoSpecTextValues.text(jf.getJavaPackage()).isBlank()) {
				hasPackage = true;
			}
		}
		String mk = ValidationKeywordAnchor.topLevelSectionKeyword(metaSec);
		if (!hasStatus) {
			errorAnchored(metaSec, mk, "metadata is missing required status field (draft or public).",
					MISSING_METADATA_STATUS, Literals.METADATA_SECTION__FIELDS);
		}
		if (!hasModule) {
			errorAnchored(metaSec, mk, "metadata is missing required module field.", MISSING_METADATA_MODULE,
					Literals.METADATA_SECTION__FIELDS);
		}
		if (!hasPackage) {
			errorAnchored(metaSec, mk, "metadata is missing required package field.", MISSING_METADATA_PACKAGE,
					Literals.METADATA_SECTION__FIELDS);
		}
	}

	private void checkAtMostOneMetadataSlot(MetadataSection metaSec, Predicate<MetadataField> present, String keyword,
			EStructuralFeature fieldFallback) {
		boolean seen = false;
		for (MetadataField f : metaSec.getFields()) {
			if (!present.test(f)) {
				continue;
			}
			if (seen) {
				errorAnchored(f, keyword, "Duplicate " + keyword + " field in metadata.", DUPLICATE_METADATA_FIELD,
						fieldFallback);
				return;
			}
			seen = true;
		}
	}

	@Check
	public void checkBehaviorRecordRequiredFields(BehaviorRecord br) {
		checkAtMostOneNestedSlots(br.getItems(),
				new NestedSlot<>(BehaviorRecordItem::getSource, Literals.BEHAVIOR_RECORD_ITEM__SOURCE, "source"),
				new NestedSlot<>(BehaviorRecordItem::getActor, Literals.BEHAVIOR_RECORD_ITEM__ACTOR, "actor"),
				new NestedSlot<>(BehaviorRecordItem::getAction, Literals.BEHAVIOR_RECORD_ITEM__ACTION, "action"),
				new NestedSlot<>(BehaviorRecordItem::getObjects, Literals.BEHAVIOR_RECORD_ITEM__OBJECTS, "objects"),
				new NestedSlot<>(BehaviorRecordItem::getReads, Literals.BEHAVIOR_RECORD_ITEM__READS, "reads"),
				new NestedSlot<>(BehaviorRecordItem::getWrites, Literals.BEHAVIOR_RECORD_ITEM__WRITES, "writes"),
				new NestedSlot<>(BehaviorRecordItem::getConditions, Literals.BEHAVIOR_RECORD_ITEM__CONDITIONS, "conditions"),
				new NestedSlot<>(BehaviorRecordItem::getOutcomes, Literals.BEHAVIOR_RECORD_ITEM__OUTCOMES, "outcomes"));
		if (UnorderedRecordAccess.behaviorSource(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required source block.", MISSING_BEHAVIOR_SOURCE);
		}
		if (UnorderedRecordAccess.behaviorActor(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required actor field.", MISSING_BEHAVIOR_ACTOR);
		}
		if (UnorderedRecordAccess.behaviorAction(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required action field.", MISSING_BEHAVIOR_ACTION);
		}
		if (UnorderedRecordAccess.behaviorObjects(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required objects field.", MISSING_BEHAVIOR_OBJECTS);
		}
		if (UnorderedRecordAccess.behaviorReads(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required reads field.", MISSING_BEHAVIOR_READS);
		}
		if (UnorderedRecordAccess.behaviorWrites(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required writes field.", MISSING_BEHAVIOR_WRITES);
		}
		if (UnorderedRecordAccess.behaviorConditions(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required conditions field.", MISSING_BEHAVIOR_CONDITIONS);
		}
		if (UnorderedRecordAccess.behaviorOutcomes(br) == null) {
			errorOnRecordConstruct(br, "Behavior is missing required outcomes field.", MISSING_BEHAVIOR_OUTCOMES);
		}
	}

	@Check
	public void checkSourceBlockHasSection(SourceBlock block) {
		checkAtMostOneNestedSlot(block.getItems(),
				new NestedSlot<>(SourceBlockItem::getSection, Literals.SOURCE_BLOCK_ITEM__SECTION, "section"));
		checkAtMostOneNestedSlot(block.getItems(),
				new NestedSlot<>(SourceBlockItem::getSubsection, Literals.SOURCE_BLOCK_ITEM__SUBSECTION, "subsection"));
		if (UnorderedRecordAccess.sourceBlockSection(block) == null) {
			errorOnRecordConstruct(block, "source block is missing required section field.", MISSING_SOURCE_BLOCK_SECTION);
		}
	}

	@Check
	public void checkDependencyRecordRequiredFields(DependencyRecord dep) {
		checkAtMostOneNestedSlots(dep.getItems(),
				new NestedSlot<>(DependencyRecordItem::getTargetSpec, Literals.DEPENDENCY_RECORD_ITEM__TARGET_SPEC, "target_spec"));
		if (UnorderedRecordAccess.dependencyTargetSpec(dep) == null) {
			errorOnRecordConstruct(dep, "Dependency is missing required target_spec field.", MISSING_DEPENDENCY_TARGET_SPEC);
		}
	}

	@Check
	public void checkReferenceRecordRequiredFields(ReferenceRecord ref) {
		checkAtMostOneNestedSlots(ref.getItems(),
				new NestedSlot<>(ReferenceRecordItem::getTitle, Literals.REFERENCE_RECORD_ITEM__TITLE, "title"),
				new NestedSlot<>(ReferenceRecordItem::getType, Literals.REFERENCE_RECORD_ITEM__TYPE, "type"),
				new NestedSlot<>(ReferenceRecordItem::getCitation, Literals.REFERENCE_RECORD_ITEM__CITATION, "citation"));
		if (UnorderedRecordAccess.referenceTitle(ref) == null) {
			errorOnRecordConstruct(ref, "Reference is missing required title field.", MISSING_REFERENCE_TITLE);
		}
		if (UnorderedRecordAccess.referenceType(ref) == null) {
			errorOnRecordConstruct(ref, "Reference is missing required type field.", MISSING_REFERENCE_TYPE);
		}
		if (UnorderedRecordAccess.referenceCitation(ref) == null) {
			errorOnRecordConstruct(ref, "Reference is missing required citation field.", MISSING_REFERENCE_CITATION);
		}
	}

	@Check
	public void checkSectionContextRecordRequiredFields(SectionContextRecord rec) {
		checkAtMostOneNestedSlots(rec.getItems(),
				new NestedSlot<>(SectionContextRecordItem::getSection, Literals.SECTION_CONTEXT_RECORD_ITEM__SECTION, "section"),
				new NestedSlot<>(SectionContextRecordItem::getText, Literals.SECTION_CONTEXT_RECORD_ITEM__TEXT, "text"));
		if (UnorderedRecordAccess.sectionContextSection(rec) == null) {
			errorOnRecordConstruct(rec, "section_context is missing required section field.", MISSING_SECTION_CONTEXT_SECTION);
		}
		if (UnorderedRecordAccess.sectionContextText(rec) == null) {
			errorOnRecordConstruct(rec, "section_context is missing required text field.", MISSING_SECTION_CONTEXT_TEXT);
		}
	}

	@Check
	public void checkSubsectionContextRecordRequiredFields(SubsectionContextRecord rec) {
		checkAtMostOneNestedSlots(rec.getItems(),
				new NestedSlot<>(SubsectionContextRecordItem::getSection, Literals.SUBSECTION_CONTEXT_RECORD_ITEM__SECTION,
						"section"),
				new NestedSlot<>(SubsectionContextRecordItem::getSubsection, Literals.SUBSECTION_CONTEXT_RECORD_ITEM__SUBSECTION,
						"subsection"),
				new NestedSlot<>(SubsectionContextRecordItem::getText, Literals.SUBSECTION_CONTEXT_RECORD_ITEM__TEXT, "text"));
		if (UnorderedRecordAccess.subsectionContextSection(rec) == null) {
			errorOnRecordConstruct(rec, "subsection_context is missing required section field.",
					MISSING_SUBSECTION_CONTEXT_SECTION);
		}
		if (UnorderedRecordAccess.subsectionContextSubsection(rec) == null) {
			errorOnRecordConstruct(rec, "subsection_context is missing required subsection field.",
					MISSING_SUBSECTION_CONTEXT_SUBSECTION);
		}
		if (UnorderedRecordAccess.subsectionContextText(rec) == null) {
			errorOnRecordConstruct(rec, "subsection_context is missing required text field.", MISSING_SUBSECTION_CONTEXT_TEXT);
		}
	}

	@Check
	public void checkOutOfScopeRecordStatement(OutOfScopeRecord oos) {
		checkAtMostOneNestedSlot(oos.getItems(),
				new NestedSlot<>(OutOfScopeRecordItem::getStatement, Literals.OUT_OF_SCOPE_RECORD_ITEM__STATEMENT, "statement"));
		if (UnorderedRecordAccess.outOfScopeStatement(oos) == null) {
			errorOnRecordConstruct(oos, "Out-of-scope item is missing required statement field.", MISSING_OOS_STATEMENT);
		}
	}

	@Check
	public void checkOperationSurfaceRecordRequiredFields(OperationSurfaceRecord op) {
		checkAtMostOneNestedSlots(op.getItems(),
				new NestedSlot<>(OperationSurfaceRecordItem::getOperationExpression,
						Literals.OPERATION_SURFACE_RECORD_ITEM__OPERATION_EXPRESSION, "operation_expression"),
				new NestedSlot<>(OperationSurfaceRecordItem::getOutcomeClass, Literals.OPERATION_SURFACE_RECORD_ITEM__OUTCOME_CLASS,
						"outcome_class"));
		if (UnorderedRecordAccess.operationSurfaceExpression(op) == null) {
			errorOnRecordConstruct(op, "operation_surface entry is missing required operation_expression field.",
					MISSING_OPERATION_SURFACE_EXPRESSION);
		}
		if (UnorderedRecordAccess.operationSurfaceOutcome(op) == null) {
			errorOnRecordConstruct(op, "operation_surface entry is missing required outcome_class field.",
					MISSING_OPERATION_SURFACE_OUTCOME_CLASS);
		}
	}

	@Check
	public void checkImplementsSurfaceRecordTarget(ImplementsSurfaceRecord impl) {
		checkAtMostOneNestedSlot(impl.getItems(),
				new NestedSlot<>(ImplementsSurfaceRecordItem::getTargetSpec, Literals.IMPLEMENTS_SURFACE_RECORD_ITEM__TARGET_SPEC,
						"target_spec"));
		if (UnorderedRecordAccess.implementsSurfaceTarget(impl) == null) {
			errorOnRecordConstruct(impl, "implements_surface entry is missing required target_spec field.",
					MISSING_IMPLEMENTS_TARGET_SPEC);
		}
	}

	@Check
	public void checkAcceptanceTestRecordRequiredFields(AcceptanceTestRecord at) {
		checkAtMostOneNestedSlots(at.getItems(),
				new NestedSlot<>(AcceptanceTestRecordItem::getSource, Literals.ACCEPTANCE_TEST_RECORD_ITEM__SOURCE, "source"),
				new NestedSlot<>(AcceptanceTestRecordItem::getValidates, Literals.ACCEPTANCE_TEST_RECORD_ITEM__VALIDATES,
						"validates"),
				new NestedSlot<>(AcceptanceTestRecordItem::getPreconditions, Literals.ACCEPTANCE_TEST_RECORD_ITEM__PRECONDITIONS,
						"preconditions"),
				new NestedSlot<>(AcceptanceTestRecordItem::getActions, Literals.ACCEPTANCE_TEST_RECORD_ITEM__ACTIONS, "actions"),
				new NestedSlot<>(AcceptanceTestRecordItem::getAssertions, Literals.ACCEPTANCE_TEST_RECORD_ITEM__ASSERTIONS,
						"assertions"));
		if (UnorderedRecordAccess.acceptanceTestSource(at) == null) {
			errorOnRecordConstruct(at, "Acceptance test is missing required source block.", MISSING_ACCEPTANCE_TEST_SOURCE);
		}
		if (UnorderedRecordAccess.acceptanceTestValidates(at) == null) {
			errorOnRecordConstruct(at, "Acceptance test is missing required validates field.", MISSING_ACCEPTANCE_TEST_VALIDATES);
		}
		if (UnorderedRecordAccess.acceptanceTestPreconditions(at) == null) {
			errorOnRecordConstruct(at, "Acceptance test is missing required preconditions field.",
					MISSING_ACCEPTANCE_TEST_PRECONDITIONS);
		}
		if (UnorderedRecordAccess.acceptanceTestActions(at) == null) {
			errorOnRecordConstruct(at, "Acceptance test is missing required actions field.", MISSING_ACCEPTANCE_TEST_ACTIONS);
		}
		if (UnorderedRecordAccess.acceptanceTestAssertions(at) == null) {
			errorOnRecordConstruct(at, "Acceptance test is missing required assertions field.",
					MISSING_ACCEPTANCE_TEST_ASSERTIONS);
		}
	}

	@Check
	public void checkImplementationDirectiveRecordRequiredFields(ImplementationDirectiveRecord idr) {
		checkAtMostOneNestedSlots(idr.getItems(),
				new NestedSlot<>(ImplementationDirectiveRecordItem::getSource, Literals.IMPLEMENTATION_DIRECTIVE_RECORD_ITEM__SOURCE,
						"source"),
				new NestedSlot<>(ImplementationDirectiveRecordItem::getAppliesTo,
						Literals.IMPLEMENTATION_DIRECTIVE_RECORD_ITEM__APPLIES_TO, "applies_to"),
				new NestedSlot<>(ImplementationDirectiveRecordItem::getStrength,
						Literals.IMPLEMENTATION_DIRECTIVE_RECORD_ITEM__STRENGTH, "strength"),
				new NestedSlot<>(ImplementationDirectiveRecordItem::getDirective,
						Literals.IMPLEMENTATION_DIRECTIVE_RECORD_ITEM__DIRECTIVE, "directive"));
		if (UnorderedRecordAccess.implementationDirectiveSource(idr) == null) {
			errorOnRecordConstruct(idr, "Implementation directive is missing required source block.",
					MISSING_IMPLEMENTATION_DIRECTIVE_SOURCE);
		}
		if (UnorderedRecordAccess.implementationDirectiveAppliesTo(idr) == null) {
			errorOnRecordConstruct(idr, "Implementation directive is missing required applies_to field.",
					MISSING_IMPLEMENTATION_DIRECTIVE_APPLIES_TO);
		}
		if (UnorderedRecordAccess.implementationDirectiveStrength(idr) == null) {
			errorOnRecordConstruct(idr, "Implementation directive is missing required strength field.",
					MISSING_IMPLEMENTATION_DIRECTIVE_STRENGTH);
		}
		if (UnorderedRecordAccess.implementationDirectiveDirective(idr) == null) {
			errorOnRecordConstruct(idr, "Implementation directive is missing required directive field.",
					MISSING_IMPLEMENTATION_DIRECTIVE_DIRECTIVE);
		}
	}

	@Check
	public void checkLibrettoCoherence(Spec spec) {
		var behaviorRecords = SpecSections.behaviorRecords(spec);
		Map<String, Integer> behaviorIdCounts = new HashMap<>();
		for (BehaviorRecord br : behaviorRecords) {
			String id = br.getId();
			if (id != null) {
				behaviorIdCounts.merge(id, 1, Integer::sum);
			}
		}
		Set<String> behaviorIds = new HashSet<>(behaviorIdCounts.keySet());
		for (BehaviorRecord br : behaviorRecords) {
			String id = br.getId();
			if (id != null && behaviorIdCounts.get(id) > 1) {
				errorOnRecordConstruct(br, "Duplicate behavior id in Libretto: " + id, DUPLICATE_BEHAVIOR_ID);
			}
		}

		Set<String> atIds = new HashSet<>();
		for (AcceptanceTestRecord at : SpecSections.acceptanceTestRecords(spec)) {
			String id = at.getId();
			if (id != null && !atIds.add(id)) {
				errorOnRecordConstruct(at, "Duplicate acceptance test id in Libretto: " + id, DUPLICATE_AT_ID);
			}
		}

		Set<String> oosIds = new HashSet<>();
		for (var oos : SpecSections.outOfScopeRecords(spec)) {
			String id = oos.getId();
			if (id != null && !oosIds.add(id)) {
				errorOnRecordConstruct(oos, "Duplicate out-of-scope id in Libretto: " + id, DUPLICATE_OOS_ID);
			}
		}

		for (AcceptanceTestRecord at : SpecSections.acceptanceTestRecords(spec)) {
			String atId = at.getId();
			var validates = UnorderedRecordAccess.acceptanceTestValidates(at);
			if (validates == null || validates.getValue() == null) {
				continue;
			}
			for (String behaviorId : validates.getValue().getValues()) {
				if (behaviorId != null && !behaviorIds.contains(behaviorId)) {
					errorOnRecordConstruct(at, "Acceptance test " + atId + " references unknown behavior id " + behaviorId
							+ " in validates.", AT_REFERENCES_UNKNOWN_BEHAVIOR);
				}
			}
		}

		validateDeterministicCoherenceSurface(spec);
	}

	private void validateDeterministicCoherenceSurface(Spec spec) {
		Set<String> dependencyTargets = new LinkedHashSet<>();
		for (DependencyRecord dep : SpecSections.dependencyRecords(spec)) {
			var ts = UnorderedRecordAccess.dependencyTargetSpec(dep);
			if (ts != null && ts.getValue() != null) {
				dependencyTargets.add(LibrettoSpecTextValues.text(ts.getValue()));
			}
		}

		Set<String> operationIds = new LinkedHashSet<>();
		Map<String, String> operationSurfaceByExpression = new HashMap<>();
		Set<String> operationExpressions = new LinkedHashSet<>();
		for (OperationSurfaceRecord op : SpecSections.operationSurfaceRecords(spec)) {
			String opId = op.getId();
			if (opId != null && !operationIds.add(opId)) {
				errorOnRecordConstruct(op, "Duplicate operation surface id in Libretto: " + opId,
						DUPLICATE_OPERATION_SURFACE_ID);
			}
			var opExpr = UnorderedRecordAccess.operationSurfaceExpression(op);
			var opOutcome = UnorderedRecordAccess.operationSurfaceOutcome(op);
			if (opExpr == null || opOutcome == null) {
				continue;
			}
			String operationExpression = LibrettoSpecTextValues.text(opExpr.getValue());
			OutcomeClassValue outcomeEnum = opOutcome.getValue();
			String outcomeClass = outcomeEnum != null ? outcomeEnum.getLiteral() : "";
			operationExpressions.add(operationExpression);
			operationSurfaceByExpression.put(operationExpression, outcomeClass);
		}

		Set<String> behaviorOperations = new LinkedHashSet<>();
		Map<String, Set<String>> behaviorOperationsByBehaviorId = new HashMap<>();
		Map<String, Set<String>> behaviorOutcomeByOperation = new HashMap<>();
		for (BehaviorRecord behaviorRecord : SpecSections.behaviorRecords(spec)) {
			String behaviorId = behaviorRecord.getId();
			var actionField = UnorderedRecordAccess.behaviorAction(behaviorRecord);
			String action = actionField != null ? identifierText(actionField.getValue()) : null;
			String inferredOutcome = inferOutcomeClass(action);
			var condField = UnorderedRecordAccess.behaviorConditions(behaviorRecord);
			if (condField == null || condField.getValue() == null) {
				continue;
			}
			for (TextValue condition : condField.getValue().getValues()) {
				if (condition == null) {
					continue;
				}
				String c = LibrettoSpecTextValues.text(condition);
				Matcher m = OPERATION_CONDITION_PATTERN.matcher(c);
				if (m.find()) {
					String operationExpression = m.group(1).trim();
					behaviorOperations.add(operationExpression);
					behaviorOperationsByBehaviorId.computeIfAbsent(behaviorId, k -> new LinkedHashSet<>())
							.add(operationExpression);
					behaviorOutcomeByOperation.computeIfAbsent(operationExpression, k -> new LinkedHashSet<>())
							.add(inferredOutcome);
				}
			}
		}

		if (!operationExpressions.isEmpty()) {
			for (String requiredExpr : operationExpressions) {
				if (!behaviorOperations.contains(requiredExpr)) {
					warningAnchored(spec, "spec", "Operation surface entry has no backing behavior condition.",
							UNIMPLEMENTED_OPERATION_SURFACE_ENTRY, Literals.SPEC__SECTIONS);
				}
			}
			for (var entry : operationSurfaceByExpression.entrySet()) {
				String expression = entry.getKey();
				String surfaceOutcome = entry.getValue();
				Set<String> derivedOutcomes = behaviorOutcomeByOperation.get(expression);
				if (derivedOutcomes == null || !derivedOutcomes.contains(surfaceOutcome)) {
					warningAnchored(spec, "spec",
							"operation_surface outcome_class has no matching behavior action-derived outcome.",
							OPERATION_SURFACE_OUTCOME_CLASS_MISMATCH, Literals.SPEC__SECTIONS);
				}
			}
			for (String behaviorExpr : behaviorOperations) {
				if (!operationExpressions.contains(behaviorExpr)) {
					warningAnchored(spec, "spec", "Behavior operation expression not present in operation_surface.",
							UNMAPPED_BEHAVIOR_OPERATION, Literals.SPEC__SECTIONS);
				}
			}

			Set<String> atValidatedBehaviorIds = new LinkedHashSet<>();
			for (AcceptanceTestRecord acceptanceTestRecord : SpecSections.acceptanceTestRecords(spec)) {
				var v = UnorderedRecordAccess.acceptanceTestValidates(acceptanceTestRecord);
				if (v == null || v.getValue() == null) {
					continue;
				}
				atValidatedBehaviorIds.addAll(v.getValue().getValues());
			}

			for (String operationExpression : operationExpressions) {
				boolean covered = false;
				for (String behaviorId : atValidatedBehaviorIds) {
					if (behaviorId == null) {
						continue;
					}
					Set<String> ops = behaviorOperationsByBehaviorId.get(behaviorId);
					if (ops != null && ops.contains(operationExpression)) {
						covered = true;
						break;
					}
				}
				if (!covered) {
					warningAnchored(spec, "spec",
							"operation_surface expression is not covered by any acceptance test validates linkage.",
							OPERATION_SURFACE_NOT_COVERED_BY_ACCEPTANCE_TEST, Literals.SPEC__SECTIONS);
				}
			}

			for (AcceptanceTestRecord acceptanceTestRecord : SpecSections.acceptanceTestRecords(spec)) {
				String atId = acceptanceTestRecord.getId();
				var valField = UnorderedRecordAccess.acceptanceTestValidates(acceptanceTestRecord);
				if (valField == null || valField.getValue() == null) {
					continue;
				}
				for (String behaviorId : valField.getValue().getValues()) {
					if (behaviorId == null) {
						continue;
					}
					Set<String> behaviorOps = behaviorOperationsByBehaviorId.get(behaviorId);
					if (behaviorOps == null || behaviorOps.isEmpty()) {
						warningOnRecordConstruct(acceptanceTestRecord,
								"Acceptance test validates a behavior with no operation expression linkage.",
								ACCEPTANCE_TEST_VALIDATES_BEHAVIOR_WITHOUT_SURFACED_OPERATION);
						continue;
					}
					boolean hasSurfaceLink = false;
					for (String op : behaviorOps) {
						if (operationExpressions.contains(op)) {
							hasSurfaceLink = true;
							break;
						}
					}
					if (!hasSurfaceLink) {
						warningOnRecordConstruct(acceptanceTestRecord,
								"Acceptance test validates behavior that does not map to operation_surface.",
								ACCEPTANCE_TEST_VALIDATES_NON_SURFACED_OPERATION);
					}
				}
			}
		}

		Set<String> implementsTargets = new LinkedHashSet<>();
		for (ImplementsSurfaceRecord impl : SpecSections.implementsSurfaceRecords(spec)) {
			var tgt = UnorderedRecordAccess.implementsSurfaceTarget(impl);
			if (tgt == null || tgt.getValue() == null) {
				continue;
			}
			String target = LibrettoSpecTextValues.text(tgt.getValue());
			if (!implementsTargets.add(target)) {
				errorOnRecordConstruct(impl, "Duplicate implements_surface target in Libretto: " + target,
						DUPLICATE_IMPLEMENTS_TARGET);
			}
			if (!dependencyTargets.contains(target)) {
				errorOnRecordConstruct(impl, "implements_surface target missing from dependencies: " + target,
						IMPLEMENTS_TARGET_NOT_IN_DEPENDENCIES);
			}
		}
		if (!implementsTargets.isEmpty() && operationIds.isEmpty()) {
			errorAnchored(spec, "spec", "implements_surface is present but operation_surface has no entries.",
					IMPLEMENTS_SURFACE_WITHOUT_OPERATION_SURFACE, Literals.SPEC__SECTIONS);
		}

		validateBoundarySection(SpecSections.boundaryExportRecords(spec), "BOUNDARY_EXPORT", operationIds);
		validateBoundarySection(SpecSections.boundaryImportRecords(spec), "BOUNDARY_IMPORT", operationIds);
	}

	private static EStructuralFeature primaryFeatureForSection(SpecSection sec) {
		if (sec instanceof MetadataSection) {
			return Literals.METADATA_SECTION__FIELDS;
		}
		if (sec instanceof DependenciesSection) {
			return Literals.DEPENDENCIES_SECTION__RECORDS;
		}
		if (sec instanceof ReferencesSection) {
			return Literals.REFERENCES_SECTION__RECORDS;
		}
		if (sec instanceof ProseSection) {
			return Literals.PROSE_SECTION__RECORDS;
		}
		if (sec instanceof OutOfScopeSection) {
			return Literals.OUT_OF_SCOPE_SECTION__RECORDS;
		}
		if (sec instanceof OperationSurfaceSection) {
			return Literals.OPERATION_SURFACE_SECTION__RECORDS;
		}
		if (sec instanceof ImplementsSurfaceSection) {
			return Literals.IMPLEMENTS_SURFACE_SECTION__RECORDS;
		}
		if (sec instanceof BoundaryExportsSection) {
			return Literals.BOUNDARY_EXPORTS_SECTION__RECORDS;
		}
		if (sec instanceof BoundaryImportsSection) {
			return Literals.BOUNDARY_IMPORTS_SECTION__RECORDS;
		}
		if (sec instanceof BehaviorsSection) {
			return Literals.BEHAVIORS_SECTION__RECORDS;
		}
		if (sec instanceof AcceptanceTestsSection) {
			return Literals.ACCEPTANCE_TESTS_SECTION__RECORDS;
		}
		if (sec instanceof ImplementationDirectivesSection) {
			return Literals.IMPLEMENTATION_DIRECTIVES_SECTION__RECORDS;
		}
		return Literals.SPEC__SECTIONS;
	}

	private void validateBoundarySection(Iterable<BoundaryRecord> records, String codePrefix, Set<String> knownOperationIds) {
		Set<String> seen = new LinkedHashSet<>();
		for (BoundaryRecord record : records) {
			checkAtMostOneNestedSlots(record.getItems(),
					new NestedSlot<>(BoundaryRecordItem::getSpecIdField, Literals.BOUNDARY_RECORD_ITEM__SPEC_ID_FIELD, "spec_id"),
					new NestedSlot<>(BoundaryRecordItem::getOperationIdField, Literals.BOUNDARY_RECORD_ITEM__OPERATION_ID_FIELD,
							"operation_id"),
					new NestedSlot<>(BoundaryRecordItem::getProfileIdField, Literals.BOUNDARY_RECORD_ITEM__PROFILE_ID_FIELD,
							"profile_id"),
					new NestedSlot<>(BoundaryRecordItem::getRawField, Literals.BOUNDARY_RECORD_ITEM__RAW_FIELD, "raw"));
			var specIdF = UnorderedRecordAccess.boundarySpecId(record);
			var opIdF = UnorderedRecordAccess.boundaryOperationId(record);
			String specId = specIdF != null && specIdF.getValue() != null
					? LibrettoSpecTextValues.text(specIdF.getValue()) : "";
			String operationId = opIdF != null && opIdF.getValue() != null
					? LibrettoSpecTextValues.text(opIdF.getValue()) : "";

			if (specId.isBlank()) {
				errorOnRecordConstruct(record, "Boundary record is missing spec_id.", codePrefix + "_MISSING_SPEC_ID");
			}
			if (operationId.isBlank()) {
				errorOnRecordConstruct(record, "Boundary record is missing operation_id.",
						codePrefix + "_MISSING_OPERATION_ID");
			} else if (!knownOperationIds.contains(operationId)) {
				errorOnRecordConstruct(record, "Boundary record references unknown operation_id: " + operationId,
						codePrefix + "_UNKNOWN_OPERATION_ID");
			}
			String key = specId + "::" + operationId;
			if (!specId.isBlank() && !operationId.isBlank() && !seen.add(key)) {
				errorOnRecordConstruct(record, "Duplicate boundary target in section: " + key,
						codePrefix + "_DUPLICATE_TARGET");
			}
		}
	}

	private static String inferOutcomeClass(String actionValue) {
		if (actionValue == null) {
			return OutcomeClassValue.RETURNS.getLiteral();
		}
		String normalized = actionValue.trim().toLowerCase();
		if ("throw".equals(normalized) || "reject".equals(normalized) || "deny".equals(normalized)) {
			return OutcomeClassValue.REJECTS.getLiteral();
		}
		return OutcomeClassValue.RETURNS.getLiteral();
	}

	private static String identifierText(IdentifierValue v) {
		if (v == null) {
			return null;
		}
		if (v instanceof SimpleIdentifier si) {
			return stripLeadingCaret(si.getId());
		}
		if (v instanceof DottedIdentifier dotted) {
			StringBuilder sb = new StringBuilder(stripLeadingCaret(dotted.getHead()));
			for (String t : dotted.getTail()) {
				sb.append('.').append(stripLeadingCaret(t));
			}
			return sb.toString();
		}
		var node = NodeModelUtils.getNode(v);
		String raw = node != null ? node.getText().trim() : "";
		return stripLeadingCaret(raw);
	}

	/** Xtext-style '^' escape on identifiers (see org.eclipse.xtext.common.Terminals ID). */
	private static String stripLeadingCaret(String segment) {
		if (segment == null || segment.isEmpty()) {
			return "";
		}
		if (segment.startsWith("^") && segment.length() > 1) {
			return segment.substring(1);
		}
		return segment;
	}

}
