package com.github.java_experiments.coursera;

/**
 * Created by anton_001 on 22.04.2015.
 */
public class Stack<T> {
    public void put(T item) {
        ListNode<T> node = new ListNode<>();
        node.item = item;
        node.next = root;
        root = node;
    }

    public T pop() {
        if (root == null) {
            return null;
        }

        T item = root.item;
        root = root.next;

        return item;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private static class ListNode<T> {
        public T item;
        public ListNode<T> next;
    }

    private ListNode<T> root;
}
