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
        int j = find(q);
        int k = find(p);
        for (int i = 0; i < id.length; i++) {
            if (i == q)
                continue;

            if (find(i) == k) {
                id[i] = j;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    private int id[];

    private int find(int p) {
        return id[p];
    }
}
