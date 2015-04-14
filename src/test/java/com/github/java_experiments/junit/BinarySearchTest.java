package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.BinarySearch;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Anton Kosyakin on 14.04.2015.
 */
public class BinarySearchTest {
    @Test
    public void ensureItFinds() {
        assertThat(new BinarySearch().find(a, 33), equalTo(4));
    }

    @Test
    public void ensureItDoesntFind() {
        assertThat(new BinarySearch().find(a, 34), equalTo(-1));
    }

    private static final int a[] = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};
}
