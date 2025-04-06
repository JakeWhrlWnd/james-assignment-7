package com.coderscampus.arraylist;

import com.coderscampus.arraylist.domain.CustomArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void add_givenValidItem_addsItem() {
        CustomList<Integer> sut = new CustomArrayList<>();
        sut.add(13);
        assertEquals(13, sut.get(0));
    }

    @Test
    void add_givenValidItem_incrementsSize() {
        CustomList<Integer> sut = new CustomArrayList<>();
        sut.add(13);
        assertEquals(1, sut.getSize());
    }

    @Test
    void add_givenInitialCapacity_addsInitialCapacity() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        assertEquals(10, sut.getSize());
    }

    @Test
    void add_givenMoreThanInitialCapacity_addsToInitialCapacity() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 20; i++) {
            sut.add(i);
        }
        assertEquals(20, sut.getSize());
        for (int i = 0; i < 20; i++) {
            assertEquals(i, sut.get(i));
        }
    }

    @Test
    void add_givenMoreThanInitialCapacity_triggersResize() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 20; i++) {
            sut.add(i);
        }
        assertEquals(20, sut.getSize());
        for (int i = 0; i < 20; i++) {
            assertEquals(i, sut.get(i));
        }
    }

    @Test
    void add_givenValidIndex_addsItem() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.add(2,13);
        assertEquals(13, sut.get(2));
    }

    @Test
    void add_givenValidIndex_addsItemToTheBeginning() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.add(0,13);
        assertEquals(13, sut.get(0));
    }

    @Test
    void add_givenValidIndex_addsItemToTheMiddle() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.add(5,13);
        assertEquals(13, sut.get(5));
    }

    @Test
    void add_givenValidIndex_addsItemToTheEnd() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.add(10,13);
        assertEquals(13, sut.get(10));
    }

    @Test
    void add_givenInvalidIndex_throwsIndexOutOfBoundsException() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> sut.add(11,13));
    }

    @Test
    void remove_givenValidIndex_returnsCorrectElement() {
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.remove(4);
        assertEquals(5, sut.get(4));
    }

    @Test
    void get() {
        fail("Not yet implemented");
    }

    @Test
    void remove() {
        fail("Not yet implemented");
    }
}