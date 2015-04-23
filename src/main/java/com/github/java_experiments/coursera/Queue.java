package com.github.java_experiments.coursera;

/**
 * Created by Anton Kosyakin on 23.04.2015.
 */
public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
}
