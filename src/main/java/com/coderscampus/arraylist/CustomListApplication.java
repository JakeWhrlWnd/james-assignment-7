package com.coderscampus.arraylist;

import com.coderscampus.arraylist.domain.CustomArrayList;

public class CustomListApplication {
    public static void main(String[] args) {

        CustomList<Integer> numbers = new CustomArrayList<>();

        for (int i = 0; i < 25; i++) {
            numbers.add(i + 1);
        }
        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
        System.out.println();
        numbers.add(10, 33);
        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
        System.out.println();
        numbers.remove(3);
        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
        System.out.println();
        try {
            System.out.println(numbers.get(10000));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
