package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.robenglander.libretto.spec.librettoSpec.IdentifierList;
import com.robenglander.libretto.spec.librettoSpec.IdentifierValue;
import com.robenglander.libretto.spec.librettoSpec.TextList;
import com.robenglander.libretto.spec.librettoSpec.TextValue;
import com.robenglander.libretto.spec.model.LibrettoSpecTextValues;

final class ProjectionValues {

	private ProjectionValues() {
	}

	static String text(TextValue tv) {
		return LibrettoSpecTextValues.text(tv);
	}

	static List<String> textList(TextList list) {
		if (list == null) {
			return List.of();
		}
		List<String> out = new ArrayList<>();
		for (TextValue tv : list.getValues()) {
			out.add(text(tv));
		}
		return List.copyOf(out);
	}

	static List<String> identifierList(IdentifierList list) {
		if (list == null) {
			return List.of();
		}
		List<String> out = new ArrayList<>();
		for (IdentifierValue iv : list.getValues()) {
			out.add(ProjectionNodeText.identifierText(iv));
		}
		return List.copyOf(out);
	}

	static List<String> behaviorIdList(com.robenglander.libretto.spec.librettoSpec.BehaviorIdList list) {
		if (list == null) {
			return List.of();
		}
		List<String> out = new ArrayList<>();
		for (String s : list.getValues()) {
			String t = Objects.requireNonNull(s, "behaviorId").trim();
			if (t.isEmpty()) {
				throw new IllegalStateException("LibrettoSpecProjectionMapper: behavior id must not be blank");
			}
			out.add(t);
		}
		return List.copyOf(out);
	}

	static List<String> refIdList(com.robenglander.libretto.spec.librettoSpec.ReferenceIdList list) {
		if (list == null) {
			return List.of();
		}
		List<String> out = new ArrayList<>();
		for (String s : list.getValues()) {
			String t = Objects.requireNonNull(s, "referenceId").trim();
			if (t.isEmpty()) {
				throw new IllegalStateException("LibrettoSpecProjectionMapper: reference id must not be blank");
			}
			out.add(t);
		}
		return List.copyOf(out);
	}
}
