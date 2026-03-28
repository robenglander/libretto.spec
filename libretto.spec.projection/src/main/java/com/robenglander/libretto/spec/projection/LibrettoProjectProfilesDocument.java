package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of a parsed {@code .lpp} file: the EMF root ({@code ProjectProfile}) holds zero or more
 * {@code profile "…" { … }} blocks ({@code Profile}) in order.
 *
 * @param profiles each top-level profile block, in file order
 */
public record LibrettoProjectProfilesDocument(List<LibrettoProjectProfileDomainModel> profiles) {

	public LibrettoProjectProfilesDocument {
		profiles = profiles == null ? List.of() : List.copyOf(profiles);
	}

	public static LibrettoProjectProfilesDocument empty() {
		return new LibrettoProjectProfilesDocument(List.of());
	}
}
