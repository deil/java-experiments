package com.github.java_experiments.coursera;

import java.lang.reflect.Array;

/**
 * Created by Anton Kosyakin on 23.04.2015.
 */
public class StackArrayImpl<T> implements Stack<T> {
    @Override
    public void push(T item) {
        if (n == array.length) {
            resizeArray(2*array.length);
        }

        array[n++] = item;
    }

    @Override
    public T pop() {
        T item = (T) array[--n];
        array[n] = null;

        if (n == array.length/4) {
            resizeArray(array.length/2);
        }

        return item;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    private Object[] array = new Object[2];

    private int n;

    private void resizeArray(int capacity) {
        Object[] copy = new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
            array[i] = null;
        }

        array = copy;
    }
}
