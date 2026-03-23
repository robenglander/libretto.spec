/**
 * Portable projection of native {@code .libretto} specs: immutable Java types mirroring
 * {@code LibrettoSpec.xtext}, without EMF or Xtext on the classpath. Root type is
 * {@link com.robenglander.libretto.spec.projection.LibrettoSpecDomainModelProjection} wrapping
 * {@link com.robenglander.libretto.spec.projection.LibrettoSpecDomainModel}.
 * <p>
 * <b>Populate</b> from EMF in {@code libretto.spec} (mapper). <b>Consume</b> from {@code libretto-core}
 * for coherence and structural checks.
 * </p>
 * <p>
 * Decoded text-value bodies (grammar {@code TextValue}) are plain {@link String}s
 * (quotes / text blocks stripped by the mapper). Identifier values are single strings (including dotted
 * forms); {@code ^} keyword escapes are typically normalized in the mapper.
 * </p>
 */
package com.robenglander.libretto.spec.projection;
