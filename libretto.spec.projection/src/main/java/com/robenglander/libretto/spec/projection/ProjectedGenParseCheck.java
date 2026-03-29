package com.robenglander.libretto.spec.projection;

/**
 * Portable view of a {@code parseCheck} line under {@code gen}. The {@code boolean} is the grammar
 * {@code value = TrueFalseKeyword} (lexical {@code true} / {@code false}), not the {@code parseCheck} keyword token.
 */
public record ProjectedGenParseCheck(boolean value) {
}
