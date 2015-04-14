package com.github.java_experiments.coursera;

/**
 * Created by Anton Kosyakin on 14.04.2015.
 */
public class ThreeSumBruteForceImpl implements ThreeSum {
    @Override
    public int count(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0)
                        count ++;
                }
            }
        }

        return count;
    }

    public String getName() {
        return "brute-force";
    }
}
