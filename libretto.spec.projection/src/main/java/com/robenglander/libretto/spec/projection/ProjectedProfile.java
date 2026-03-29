package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * Portable view of one {@code .lpp} file’s canonical profile payload: exactly one
 * {@link LibrettoProjectProfileDomainModel} (the contents of a single {@code profile "…" { … }} block).
 * <p>
 * When the parse root has no profile blocks, {@link #profile()} is {@link LibrettoProjectProfileDomainModel#empty()}.
 * Valid LPP requires exactly one {@code profile} block; mapping from a validator-clean model always reflects that
 * single block (see {@link com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper}).
 */
public record ProjectedProfile(LibrettoProjectProfileDomainModel profile) {

	public ProjectedProfile {
		profile = Objects.requireNonNull(profile, "profile");
	}

	public static ProjectedProfile empty() {
		return new ProjectedProfile(LibrettoProjectProfileDomainModel.empty());
	}
}
