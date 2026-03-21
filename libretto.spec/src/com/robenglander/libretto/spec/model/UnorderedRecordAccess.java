/*
 * Read flattened fields from Libretto records whose grammar uses order-independent {@code items} lists
 * (Xtext merges alternatives into one item type with nullable slots per field).
 */
package com.robenglander.libretto.spec.model;

import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecord;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ActionField;
import com.robenglander.libretto.spec.librettoSpec.ActorField;
import com.robenglander.libretto.spec.librettoSpec.AppliesToField;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecordItem;
import com.robenglander.libretto.spec.librettoSpec.BoundaryOperationIdField;
import com.robenglander.libretto.spec.librettoSpec.BoundaryProfileIdField;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRawField;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecord;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecordItem;
import com.robenglander.libretto.spec.librettoSpec.BoundarySpecIdField;
import com.robenglander.libretto.spec.librettoSpec.CitationField;
import com.robenglander.libretto.spec.librettoSpec.ConditionsField;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecordItem;
import com.robenglander.libretto.spec.librettoSpec.DirectiveField;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceTargetField;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecordItem;
import com.robenglander.libretto.spec.librettoSpec.KindField;
import com.robenglander.libretto.spec.librettoSpec.ObjectsField;
import com.robenglander.libretto.spec.librettoSpec.OperationExpressionField;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OutcomeClassField;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecord;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OutcomesField;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SectionField;
import com.robenglander.libretto.spec.librettoSpec.SourceBlock;
import com.robenglander.libretto.spec.librettoSpec.SourceBlockItem;
import com.robenglander.libretto.spec.librettoSpec.StatementField;
import com.robenglander.libretto.spec.librettoSpec.StrengthField;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SubsectionField;
import com.robenglander.libretto.spec.librettoSpec.TargetSpecField;
import com.robenglander.libretto.spec.librettoSpec.TextField;
import com.robenglander.libretto.spec.librettoSpec.TitleField;
import com.robenglander.libretto.spec.librettoSpec.TypeField;
import com.robenglander.libretto.spec.librettoSpec.ValidatesField;
import com.robenglander.libretto.spec.librettoSpec.WritesField;
import com.robenglander.libretto.spec.librettoSpec.ReadsField;
import com.robenglander.libretto.spec.librettoSpec.ActionsField;
import com.robenglander.libretto.spec.librettoSpec.AssertionsField;
import com.robenglander.libretto.spec.librettoSpec.PreconditionsField;

public final class UnorderedRecordAccess {

	private UnorderedRecordAccess() {
	}

	public static SourceBlock behaviorSource(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getSource);
	}

	public static ActorField behaviorActor(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getActor);
	}

	public static ActionField behaviorAction(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getAction);
	}

	public static ObjectsField behaviorObjects(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getObjects);
	}

	public static ReadsField behaviorReads(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getReads);
	}

	public static WritesField behaviorWrites(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getWrites);
	}

	public static ConditionsField behaviorConditions(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getConditions);
	}

	public static OutcomesField behaviorOutcomes(BehaviorRecord br) {
		return firstItemField(br.getItems(), BehaviorRecordItem::getOutcomes);
	}

	public static TargetSpecField dependencyTargetSpec(DependencyRecord dep) {
		return firstItemField(dep.getItems(), DependencyRecordItem::getTargetSpec);
	}

	public static KindField dependencyKind(DependencyRecord dep) {
		return firstItemField(dep.getItems(), DependencyRecordItem::getKind);
	}

	public static TitleField referenceTitle(ReferenceRecord ref) {
		return firstItemField(ref.getItems(), ReferenceRecordItem::getTitle);
	}

	public static TypeField referenceType(ReferenceRecord ref) {
		return firstItemField(ref.getItems(), ReferenceRecordItem::getType);
	}

	public static CitationField referenceCitation(ReferenceRecord ref) {
		return firstItemField(ref.getItems(), ReferenceRecordItem::getCitation);
	}

	public static SectionField sectionContextSection(SectionContextRecord rec) {
		return firstItemField(rec.getItems(), SectionContextRecordItem::getSection);
	}

	public static TextField sectionContextText(SectionContextRecord rec) {
		return firstItemField(rec.getItems(), SectionContextRecordItem::getText);
	}

	public static SectionField subsectionContextSection(SubsectionContextRecord rec) {
		return firstItemField(rec.getItems(), SubsectionContextRecordItem::getSection);
	}

	public static SubsectionField subsectionContextSubsection(SubsectionContextRecord rec) {
		return firstItemField(rec.getItems(), SubsectionContextRecordItem::getSubsection);
	}

	public static TextField subsectionContextText(SubsectionContextRecord rec) {
		return firstItemField(rec.getItems(), SubsectionContextRecordItem::getText);
	}

	public static StatementField outOfScopeStatement(OutOfScopeRecord oos) {
		return firstItemField(oos.getItems(), OutOfScopeRecordItem::getStatement);
	}

	public static OperationExpressionField operationSurfaceExpression(OperationSurfaceRecord op) {
		return firstItemField(op.getItems(), OperationSurfaceRecordItem::getOperationExpression);
	}

	public static OutcomeClassField operationSurfaceOutcome(OperationSurfaceRecord op) {
		return firstItemField(op.getItems(), OperationSurfaceRecordItem::getOutcomeClass);
	}

	public static ImplementsSurfaceTargetField implementsSurfaceTarget(ImplementsSurfaceRecord impl) {
		return firstItemField(impl.getItems(), ImplementsSurfaceRecordItem::getTargetSpec);
	}

	public static BoundarySpecIdField boundarySpecId(BoundaryRecord br) {
		return firstItemField(br.getItems(), BoundaryRecordItem::getSpecIdField);
	}

	public static BoundaryOperationIdField boundaryOperationId(BoundaryRecord br) {
		return firstItemField(br.getItems(), BoundaryRecordItem::getOperationIdField);
	}

	public static BoundaryProfileIdField boundaryProfileId(BoundaryRecord br) {
		return firstItemField(br.getItems(), BoundaryRecordItem::getProfileIdField);
	}

	public static BoundaryRawField boundaryRaw(BoundaryRecord br) {
		return firstItemField(br.getItems(), BoundaryRecordItem::getRawField);
	}

	public static SourceBlock acceptanceTestSource(AcceptanceTestRecord at) {
		return firstItemField(at.getItems(), AcceptanceTestRecordItem::getSource);
	}

	public static ValidatesField acceptanceTestValidates(AcceptanceTestRecord at) {
		return firstItemField(at.getItems(), AcceptanceTestRecordItem::getValidates);
	}

	public static PreconditionsField acceptanceTestPreconditions(AcceptanceTestRecord at) {
		return firstItemField(at.getItems(), AcceptanceTestRecordItem::getPreconditions);
	}

	public static ActionsField acceptanceTestActions(AcceptanceTestRecord at) {
		return firstItemField(at.getItems(), AcceptanceTestRecordItem::getActions);
	}

	public static AssertionsField acceptanceTestAssertions(AcceptanceTestRecord at) {
		return firstItemField(at.getItems(), AcceptanceTestRecordItem::getAssertions);
	}

	public static SourceBlock implementationDirectiveSource(ImplementationDirectiveRecord idr) {
		return firstItemField(idr.getItems(), ImplementationDirectiveRecordItem::getSource);
	}

	public static AppliesToField implementationDirectiveAppliesTo(ImplementationDirectiveRecord idr) {
		return firstItemField(idr.getItems(), ImplementationDirectiveRecordItem::getAppliesTo);
	}

	public static StrengthField implementationDirectiveStrength(ImplementationDirectiveRecord idr) {
		return firstItemField(idr.getItems(), ImplementationDirectiveRecordItem::getStrength);
	}

	public static DirectiveField implementationDirectiveDirective(ImplementationDirectiveRecord idr) {
		return firstItemField(idr.getItems(), ImplementationDirectiveRecordItem::getDirective);
	}

	public static SectionField sourceBlockSection(SourceBlock block) {
		return firstItemField(block.getItems(), SourceBlockItem::getSection);
	}

	public static SubsectionField sourceBlockSubsection(SourceBlock block) {
		return firstItemField(block.getItems(), SourceBlockItem::getSubsection);
	}

	private static <I, R> R firstItemField(java.util.List<I> items, java.util.function.Function<I, R> getter) {
		if (items == null) {
			return null;
		}
		for (I item : items) {
			R v = getter.apply(item);
			if (v != null) {
				return v;
			}
		}
		return null;
	}
}
