package com.robenglander.libretto.spec.projection;

/** Portable view of {@code initialInstruction} STRING under {@code gen}. */
public record ProjectedGenInstruction(String instruction) {

	public ProjectedGenInstruction {
		instruction = instruction == null ? "" : instruction.trim();
	}
}
