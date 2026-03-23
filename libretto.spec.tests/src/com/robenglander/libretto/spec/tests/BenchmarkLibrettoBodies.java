package com.robenglander.libretto.spec.tests;

/**
 * Synthetic Libretto source for timing / throughput benchmarks (not a semantic example spec).
 */
final class BenchmarkLibrettoBodies {

	private BenchmarkLibrettoBodies() {
	}

	/**
	 * Minimal valid spec shell with {@code behaviorCount} empty {@code behavior} records.
	 */
	static String specWithBehaviors(int behaviorCount) {
		StringBuilder sb = new StringBuilder(32_000 + behaviorCount * 32);
		sb.append("""
				spec Bench-Synthetic {
				  metadata {
				    title: "Bench"
				    status: draft
				    module: "m"
				    package: "p"
				  }
				  dependencies { }
				  references { }
				  prose { }
				  out_of_scope { }
				  operation_surface { }
				  implements_surface { }
				  boundary_exports { }
				  boundary_imports { }
				  behaviors {
				""");
		for (int i = 0; i < behaviorCount; i++) {
			sb.append("    behavior b").append(i).append(" { }\n");
		}
		sb.append("""
				  }
				  acceptance_tests { }
				  implementation_directives { }
				}
				""");
		return sb.toString();
	}
}
