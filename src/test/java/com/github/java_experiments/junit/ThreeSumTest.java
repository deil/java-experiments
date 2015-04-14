package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.ThreeSum;
import com.github.java_experiments.coursera.ThreeSumBruteForceImpl;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Anton Kosyakin on 14.04.2015.
 */
public class ThreeSumTest {
    @Test
    public void ensureBruteForceImplementationWorks() {
        ThreeSum alg = new ThreeSumBruteForceImpl();
        assertThat(alg.count(a), equalTo(4));
    }

    @Test
    public void checkTimeComplexity() {
        int n = 100;
        long firstDiff = 0;
        for (int i = 0; i < 5; i++) {
            int[] data = generateInputs(n << i); // n, 2*n, 4*n

            long start = System.currentTimeMillis();
            new ThreeSumBruteForceImpl().count(data);
            long diff = System.currentTimeMillis() - start;

            if (firstDiff == 0) {
                System.out.print(String.format("%d ms", diff));
                firstDiff = diff;
            } else {
                System.out.print(String.format("  %.1f", diff / (double) firstDiff));
                System.out.flush();
            }
        }

        System.out.println();
    }

    private static final int[] a = {30, -40, -20, -10, 40, 0, 10, 5};

    private int[] generateInputs(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * n * 2) - n;
        }

        return result;
    }
}
