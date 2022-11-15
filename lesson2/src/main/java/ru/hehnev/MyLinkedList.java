package ru.hehnev;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements MyList<T>{

    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size = 0;

    public MyLinkedList() {
        this.lastElement = new Node<>(null, firstElement, null);
        this.firstElement = new Node<>(null, null, lastElement);
    }

    @Override
    public T get(int index) {
        Node<T> current = node(index).getNext();
        return current.getCurrentElement();
    }

    @Override
    public void add(T obj) {
        Node<T> temp = lastElement;
        temp.setCurrentElement(obj);
        lastElement = new Node<>(null, temp, null);
        temp.setNext(lastElement);
        size++;
    }

    @Override
    public void insert(T obj, int index) {
        Node<T> current = node(index);
        current.next = new Node<>(obj, current.getPrev(), current.getNext());
        size++;
    }

    @Override
    public void delete(int index) {
        Node<T> current = node(index);
        current.getNext().setCurrentElement(null);
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            @Override
            public boolean hasNext() {;
                return counter < size;
            }

            @Override
            public T next() {
                return get(counter++);
            }
        };
    }

    Node<T> node(int index) {
        valid(index);
        Node<T> current = firstElement;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    private void valid(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("index " + index);
        }
    }

    private static class Node<T> {
        T currentElement;
        Node<T> next;
        Node<T> prev;

        public Node(T currentElement, Node<T> prev, Node<T> next) {
            this.currentElement = currentElement;
            this.prev = prev;
            this.next = next;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}
