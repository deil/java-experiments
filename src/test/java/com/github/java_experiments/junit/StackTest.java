package com.github.java_experiments.junit;

import com.github.java_experiments.coursera.Stack;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
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
        Stack<Integer> stack = new Stack<>();
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void ensureItPopsWhatWasPushed() {
        Stack<String> stack = new Stack<>();
        String string = "hello world";
        stack.put(string);
        assertThat(stack.pop(), equalTo(string));
    }

    @Test
    public void ensureLongSequence() {
        Stack<String> stack = new Stack<>();
        stack.put("hello");
        stack.put("cruel");
        stack.put("world");

        String str = stack.pop();
        stack.pop();
        str = stack.pop() + " " + str;

        assertThat(str, equalTo("hello world"));
    }
}
