package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.Stack;
import com.github.java_experiments.coursera.StackArrayImpl;
import com.github.java_experiments.coursera.StackLinkedListImpl;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by anton_001 on 22.04.2015.
 */
public class StackTest {
    @Test
    public void ensureNewStackIsEmpty() {
        Stack<Integer> stack = new StackArrayImpl<>();
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void ensureItPopsWhatWasPushed() {
        Stack<String> stack = new StackArrayImpl<>();
        String string = "hello world";
        stack.push(string);
        assertThat(stack.pop(), equalTo(string));
    }

    @Test
    public void ensureLongSequence() {
        Stack<String> stack = new StackArrayImpl<>();
        stack.push("hello");
        stack.push("cruel");
        stack.push("world");

        String str = stack.pop();
        stack.pop();
        str = stack.pop() + " " + str;

        assertThat(str, equalTo("hello world"));
    }

    @Test
    public void testPerformance() {
        long ms = System.currentTimeMillis();
        Stack<Integer> stack = new StackLinkedListImpl<>();
        performTesting(stack);
        System.out.println(String.format("LinkedList: %d ms", System.currentTimeMillis() - ms));

        ms = System.currentTimeMillis();
        stack = new StackArrayImpl<>();
        performTesting(stack);
        System.out.println(String.format("Array: %d ms", System.currentTimeMillis() - ms));
    }

    private void performTesting(Stack<Integer> stack) {
        long iterations = 15_000_000;
        for (int i = 0; i < iterations; i++) {
            stack.push(i);
        }

        for (int i = 0; i < iterations/2; i++) {
            stack.pop();
        }

        for (int i = 0; i < iterations/4; i++) {
            stack.push(i);
        }
    }
}
