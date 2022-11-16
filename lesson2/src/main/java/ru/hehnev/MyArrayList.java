package ru.hehnev;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private int capacity = 4;

    private int size = 0;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[capacity];
    }

    public MyArrayList(int newCapacity) {
        this.array = new Object[newCapacity];
        this.capacity = newCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public T get(int index) {
        valid(index);
        return (T) array[index];
    }

    @Override
    public void add(T obj) {
        if (size == array.length - 1) {
            resize();
        }
        array[size++] = obj;
    }

    @Override
    public void insert(T obj, int index) {
        valid(index);
        if (index == size - 1) {
            resize();
        }
        Object[] newArray = new Object[size];
        System.arraycopy(array, index, newArray, 0, size);
        array[index] = obj;
        size++;
        if (size == capacity) {
            resize();
        }
        System.arraycopy(newArray, 0, array, index + 1, newArray.length);
    }


    @Override
    public void delete(int index) {
        valid(index);
        Object[] newObject = new Object[size];
        System.arraycopy(array, index + 1, newObject, 0, size);
        size--;
        System.arraycopy(newObject, 0, array, index, size);

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return array.length > 0 && size > count;
            }

            @Override
            public T next() {
                return (T) array[count++];
            }
        };
    }

    private void resize() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void valid(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
    }
}
