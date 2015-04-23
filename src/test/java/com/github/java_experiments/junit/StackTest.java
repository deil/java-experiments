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
}
