package com.robenglander.libretto.spec.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.projection.LibrettoSpecDomainModelProjection;
import com.robenglander.libretto.spec.projection.mapper.LibrettoSpecProjectionMapper;

/**
 * Manual / optional: run with {@code -Dgroups=timing} or exclude {@code timing} in CI if noisy.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoSpecInjectorProvider.class)
@Tag("timing")
class LibrettoSpecProjectionTimingTest {

	@Inject
	ParseHelper<Spec> parseHelper;

	@Test
	void benchmarkProjectionOnly() throws Exception {
		Spec spec = parseHelper.parse(BenchmarkLibrettoBodies.specWithBehaviors(200));
		assertNotNull(spec);

		int warmup = 50;
		for (int i = 0; i < warmup; i++) {
			LibrettoSpecProjectionMapper.project(spec);
		}

		int iterations = 500;
		long t0 = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			LibrettoSpecDomainModelProjection p = LibrettoSpecProjectionMapper.project(spec);
			assertNotNull(p);
		}
		long elapsedNs = System.nanoTime() - t0;
		double perMs = elapsedNs / 1_000_000.0 / iterations;
		System.out.printf(
				"[LibrettoSpecProjectionTiming] iterations=%d totalMs=%.3f avgPerProjectionMs=%.6f%n",
				iterations, elapsedNs / 1_000_000.0, perMs);
	}

}
