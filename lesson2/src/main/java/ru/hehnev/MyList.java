package ru.hehnev;

public interface MyList<T> extends Iterable<T>{
    T get(int index);
    void add(T obj);
    void insert(T obj, int index);
    void delete(int index);
}
