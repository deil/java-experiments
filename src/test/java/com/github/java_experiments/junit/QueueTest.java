package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.Queue;
import com.github.java_experiments.coursera.QueueLinkedListImpl;
import org.hamcrest.core.IsNot;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.assertThat;

/**
 * Created by Anton Kosyakin on 24.04.2015.
 */
public class QueueTest {

    public static final int iterations = 5;

    @Test
    public void ensureNewQueueIsEmpty() {
        Queue<Integer> q = new QueueLinkedListImpl<>();
        assertThat(q.isEmpty(), equalTo(true));
    }

    @Test
    public void ensureQueueBecomesEmpty() {
        Queue<Integer> q = new QueueLinkedListImpl<>();
        for (int i = 0; i < iterations; i++) {
            q.enqueue(i);
        }

        assertThat(q.isEmpty(), not(equalTo(true)));

        for (int i = 0; i < iterations; i++) {
            q.dequeue();
        }

        assertThat(q.isEmpty(), equalTo(true));
    }

    @Test
    public void ensureDequeWhatWasQueued() {
        Queue<Integer> q = new QueueLinkedListImpl<>();
        for (int i = 0; i < iterations; i++) {
            q.enqueue(i);
        }

        for (int i = 0; i < iterations; i++) {
            assertThat(q.dequeue(), equalTo(i));
        }
    }
}
