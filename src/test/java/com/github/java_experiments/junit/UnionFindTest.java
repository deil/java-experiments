package com.github.java_experiments.junit;

import com.github.java_experiments.union_find.UF;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anton Kosyakin on 10.04.2015.
 */
public class UnionFindTest {
    @Test
    public void Test1() {
        UF uf = buildFirstStep();

        Assert.assertFalse(uf.connected(0, 7));
        Assert.assertTrue(uf.connected(8, 9));
    }

    @Test
    public void Test2() {
        UF uf = buildSecondStep();

        Assert.assertTrue(uf.connected(0, 7));
    }

    private UF buildFirstStep() {
        UF uf = new UF(10);

        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);

        return uf;
    }

    private UF buildSecondStep() {
        UF uf = buildFirstStep();
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(1, 0);

        return uf;
    }
}
