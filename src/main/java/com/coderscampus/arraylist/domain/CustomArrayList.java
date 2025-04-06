package com.coderscampus.arraylist.domain;

import com.coderscampus.arraylist.CustomList;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] backingArray = new Object[10];
    private int size = 0;

    private void ensureCapacity() {
        if (size == backingArray.length) {
            Object[] newBackingArray = new Object[backingArray.length * 2];
            System.arraycopy(backingArray, 0, newBackingArray, 0, backingArray.length);
            backingArray = newBackingArray;
        }
    }

    private void indexOutOfBoundsCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Oops, looks like the index: " + index + " is out of bounds for the array of size: " + size);
        }
    }

    @Override
    public boolean add(T item) {
        ensureCapacity();
        backingArray[size++] = item;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        indexOutOfBoundsCheck(index);
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            backingArray[i + 1] = backingArray[i];
        }
        backingArray[index] = item;
        size++;
        return true;
    }


    @Override
    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        indexOutOfBoundsCheck(index);
        return (T) backingArray[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        indexOutOfBoundsCheck(index);
        T item = (T) backingArray[index];
        for (int i = index; i < size - 1; i++) {
            backingArray[i] = backingArray[i + 1];
        }
        backingArray[size - 1] = null;
        size--;
        return item;
    }
}
