package com.github.java_experiments.coursera;

import java.util.Arrays;

/**
 * Created by Anton Kosyakin on 15.04.2015.
 */
public class ThreeSumBinarySearchImpl implements ThreeSum {
    @Override
    public int count(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        int count = 0;
        BinarySearch searcher = new BinarySearch();

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                int key = -b[i] - b[j];
                if (searcher.find(b, key) > j) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public String getName() {
        return "binary-search";
    }
}
