package com.github.java_experiments.coursera;

/**
 * Created by Anton Kosyakin on 23.04.2015.
 */
public interface Stack<T> {
    void push(T item);

    T pop();

    boolean isEmpty();
}
