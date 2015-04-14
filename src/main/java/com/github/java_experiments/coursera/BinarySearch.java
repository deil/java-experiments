package com.github.java_experiments.coursera;

/**
 * Created by Anton Kosyakin on 14.04.2015.
 */
public class BinarySearch {
    public int find(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) {
                lo = mid + 1;
            } else if (key < a[mid]) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
