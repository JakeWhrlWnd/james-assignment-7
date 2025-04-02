package com.coderscampus.arraylist.domain;

import com.coderscampus.arraylist.CustomList;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] backingArray = new Object[10];
    private int size = 0;

    @Override
    public boolean add(T item) {
        if (size == backingArray.length) {
            Object[] newBackingArray = new Object[backingArray.length * 2];
            for (int i = 0; i < backingArray.length; i++) {
                newBackingArray[i] = backingArray[i];
            }
            backingArray = newBackingArray;
        }
        backingArray[size++] = item;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Oops, looks like the index: " + index + " is out of bounds for the array of size: " + size);
        }
        return (T) backingArray[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        return null;
    }
}
