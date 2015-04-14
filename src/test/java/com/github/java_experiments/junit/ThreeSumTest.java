package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.ThreeSum;
import com.github.java_experiments.coursera.ThreeSumBinarySearchImpl;
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
    public void ensureBinarySearchImplWorks() {
        ThreeSum alg = new ThreeSumBinarySearchImpl();
        assertThat(alg.count(a), equalTo(4));
    }

    @Test
    public void checkTimeComplexity() {
        int iterations = 6;
        int n = 100;
        int[][] data = new int[iterations][n];

        ThreeSum[] algs = new ThreeSum[2];
        algs[0] = new ThreeSumBruteForceImpl();
        algs[1] = new ThreeSumBinarySearchImpl();

        for (int i = 0; i < iterations; i++) {
            data[i] = generateInputs(n << i);
        }

        for (int i = 0; i < algs.length; i++) {
            long firstDiff = 0;
            for (int j = 0; j < iterations; j++) {
                ThreeSum alg = algs[i];
                int[] localData = data[j];

                long start = System.currentTimeMillis();
                alg.count(localData);
                long diff = System.currentTimeMillis() - start;
                if (firstDiff == 0) {
                    System.out.print(String.format("%s: %d ms", alg.getName(), diff));
                    firstDiff = diff;
                } else {
                    System.out.print(String.format("  %.1f", diff / (double) firstDiff));
                    System.out.flush();
                }
            }

            System.out.println();
        }

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
