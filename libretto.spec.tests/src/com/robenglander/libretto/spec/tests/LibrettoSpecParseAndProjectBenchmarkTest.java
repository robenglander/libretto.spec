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
import com.robenglander.libretto.spec.projection.mapper.LibrettoSpecProjectionMapper;

/**
 * Reports average parse time, average projection time, and parse+project on the same synthetic
 * document. Extrapolation to N specs assumes each file is similar in size to this fixture.
 * <p>
 * Tagged {@code timing} like other micro-benchmarks in this bundle.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoSpecInjectorProvider.class)
@Tag("timing")
class LibrettoSpecParseAndProjectBenchmarkTest {

	private static final int BEHAVIOR_COUNT = 200;
	private static final int WARMUP_PARSE = 25;
	private static final int WARMUP_PROJECT = 50;
	private static final int TIMED_ITERATIONS = 100;

	@Inject
	ParseHelper<Spec> parseHelper;

	@Test
	void benchmarkParseVersusProjectVersusCombined() throws Exception {
		String source = BenchmarkLibrettoBodies.specWithBehaviors(BEHAVIOR_COUNT);
		int sourceChars = source.length();

		for (int i = 0; i < WARMUP_PARSE; i++) {
			Spec w = parseHelper.parse(source);
			assertNotNull(w);
		}
		Spec warmupSpec = parseHelper.parse(source);
		for (int i = 0; i < WARMUP_PROJECT; i++) {
			LibrettoSpecProjectionMapper.project(warmupSpec);
		}

		long parseNs = 0L;
		for (int i = 0; i < TIMED_ITERATIONS; i++) {
			long t0 = System.nanoTime();
			Spec s = parseHelper.parse(source);
			long t1 = System.nanoTime();
			assertNotNull(s);
			parseNs += (t1 - t0);
		}
		double avgParseMs = parseNs / 1_000_000.0 / TIMED_ITERATIONS;

		Spec forProject = parseHelper.parse(source);
		long projectNs = 0L;
		for (int i = 0; i < TIMED_ITERATIONS; i++) {
			long t0 = System.nanoTime();
			LibrettoSpecProjectionMapper.project(forProject);
			long t1 = System.nanoTime();
			projectNs += (t1 - t0);
		}
		double avgProjectMs = projectNs / 1_000_000.0 / TIMED_ITERATIONS;

		long combinedNs = 0L;
		for (int i = 0; i < TIMED_ITERATIONS; i++) {
			long t0 = System.nanoTime();
			Spec s = parseHelper.parse(source);
			LibrettoSpecProjectionMapper.project(s);
			long t1 = System.nanoTime();
			combinedNs += (t1 - t0);
		}
		double avgCombinedMs = combinedNs / 1_000_000.0 / TIMED_ITERATIONS;

		double est1000CombinedMs = avgCombinedMs * 1000.0;
		double est1000ParseMs = avgParseMs * 1000.0;
		double est1000ProjectMs = avgProjectMs * 1000.0;

		System.out.printf(
				"[ParseProjectBenchmark] behaviors=%d timedIterations=%d sourceChars=%d%n",
				BEHAVIOR_COUNT, TIMED_ITERATIONS, sourceChars);
		System.out.printf(
				"[ParseProjectBenchmark] avgParseMs=%.4f avgProjectMs=%.4f avgParseAndProjectMs=%.4f%n",
				avgParseMs, avgProjectMs, avgCombinedMs);
		System.out.printf(
				"[ParseProjectBenchmark] roughExtrapolation1000SameSizeSpecs: parse~%.0fms project~%.0fms combined~%.0fms%n",
				est1000ParseMs, est1000ProjectMs, est1000CombinedMs);
	}
}
