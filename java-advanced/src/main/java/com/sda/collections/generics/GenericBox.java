package com.sda.collections.generics;

// can hold any type of toy / object
public class GenericBox<T> {

    private T item;

    // 1. set item by constructor
//    public GenericBox(T item) {
//        this.item = item;
//    }

    public T getItem() {
        return item;
    }

    // 2. set item by setter
    public void setItem(T item) {
        this.item = item;
    }

    // 3. set item by custom method
    public void add(T item) {
        this.item = item;
    }
}
