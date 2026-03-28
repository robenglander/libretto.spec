package com.robenglander.libretto.spec.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.robenglander.libretto.spec.librettoProjectProfile.LLMProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.LlmProvidersBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;

/**
 * Shared logic for resolving {@code llmProviders} names (validation + quick fixes).
 */
public final class LlmProviderReferenceSupport {

	private LlmProviderReferenceSupport() {
	}

	public static Profile enclosingProfile(EObject from) {
		EObject c = from;
		while (c != null) {
			if (c instanceof Profile prof) {
				return prof;
			}
			c = c.eContainer();
		}
		return null;
	}

	public static Set<String> declaredProviderNames(Profile profile) {
		Set<String> names = new HashSet<>();
		if (profile == null) {
			return names;
		}
		EList<LlmProvidersBlock> blocks = profile.getLlmProviders();
		if (blocks == null) {
			return names;
		}
		for (LlmProvidersBlock lb : blocks) {
			if (lb == null) {
				continue;
			}
			EList<LLMProvider> providers = lb.getProviders();
			if (providers == null) {
				continue;
			}
			for (LLMProvider prov : providers) {
				if (prov != null && nonBlank(prov.getName())) {
					names.add(prov.getName());
				}
			}
		}
		return names;
	}

	/** Sorted copy for stable validation messages / issue data. */
	public static List<String> declaredProviderNamesSorted(Profile profile) {
		List<String> list = new ArrayList<>(declaredProviderNames(profile));
		Collections.sort(list);
		return list;
	}

	/**
	 * Comma-separated list of declared names (ValidID tokens do not contain commas). Empty profile yields "".
	 */
	public static String declaredProviderNamesCsv(Profile profile) {
		List<String> sorted = declaredProviderNamesSorted(profile);
		return String.join(",", sorted);
	}

	/** Inverse of {@link #declaredProviderNamesCsv(Profile)} for issue data / quick fixes. */
	public static List<String> splitDeclaredNamesCsv(String csv) {
		if (csv == null || csv.isBlank()) {
			return List.of();
		}
		return Arrays.stream(csv.split(","))
				.map(String::trim)
				.filter(s -> !s.isEmpty())
				.toList();
	}

	private static boolean nonBlank(String s) {
		return s != null && !s.isBlank();
	}
}
