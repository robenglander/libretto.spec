package com.robenglander.libretto.spec.projection;

/**
 * @param kind  primitive keyword as authored ({@code boolean}, {@code int}, …)
 */
public record ProjectedPrimitiveJavaType(String kind) implements ProjectedJavaType {

	public ProjectedPrimitiveJavaType {
		kind = kind == null ? "" : kind.trim();
	}
}
