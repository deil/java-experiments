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

    private static final int[] a = {30, -40, -20, -10, 40, 0, 10, 5};
}
