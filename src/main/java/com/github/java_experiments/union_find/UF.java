package com.github.java_experiments.union_find;

/**
 * Created by Anton Kosyakin on 10.04.2015.
 */
public class UF {
    public UF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int j = root(p);
        int k = root(q);
        id[j] = k;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int id[];

    private int root(int p) {
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }
}
