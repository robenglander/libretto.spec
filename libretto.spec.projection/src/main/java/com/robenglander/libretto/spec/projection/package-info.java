/**
 * Portable projection of Libretto languages: immutable Java types without EMF or Xtext on the classpath.
 * <p>
 * <b>Libretto spec ({@code .libretto}):</b> root
 * {@link com.robenglander.libretto.spec.projection.LibrettoSpecDomainModelProjection} /
 * {@link com.robenglander.libretto.spec.projection.LibrettoSpecDomainModel}.
 * </p>
 * <p>
 * <b>Project profile ({@code .lpp}):</b> root
 * {@link com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection} /
 * {@link com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel}.
 * </p>
 * <p>
 * <b>Populate</b> from EMF in {@code libretto.spec} (mappers). <b>Consume</b> from {@code libretto-core}
 * for validation and tooling.
 * </p>
 * <p>
 * Decoded text-value bodies (grammar {@code TextValue}) are plain {@link String}s
 * (quotes / text blocks stripped by the mapper). Identifier values are single strings (including dotted
 * forms); {@code ^} keyword escapes are typically normalized in the mapper.
 * </p>
 */
package com.robenglander.libretto.spec.projection;
