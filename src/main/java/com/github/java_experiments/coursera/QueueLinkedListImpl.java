package com.github.java_experiments.coursera;

/**
 * Created by Anton Kosyakin on 24.04.2015.
 */
public class QueueLinkedListImpl<T> implements Queue<T> {
    @Override
    public void enqueue(T item) {
        ListNode<T> newItem = new ListNode<>();
        newItem.item = item;
        if (tail != null) {
            tail.next = newItem;
            tail = newItem;
        } else {
            head = newItem;
            tail = newItem;
        }
    }

    @Override
    public T dequeue() {
        T item = head.item;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return item;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    private static class ListNode<T> {
        public T item;
        public ListNode<T> next;
    }

    private ListNode<T> head;

    private ListNode<T> tail;
}
