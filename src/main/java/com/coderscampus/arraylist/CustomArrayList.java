package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] backingArray = new Object[10];
    private int size = 0;

    @Override
    public boolean add(T item) {
        backingArray[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        return null;
    }
}
