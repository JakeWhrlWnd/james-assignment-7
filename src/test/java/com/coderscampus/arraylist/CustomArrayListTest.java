package com.coderscampus.arraylist;

import com.coderscampus.arraylist.domain.CustomArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    // Test-Driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass
    // Step 3 - Refactor your code
    // Rinse and repeat Steps 1 - 3

    // Three A's - "ARRANGE, ACT, ASSERT"
    // Arrange - set things up
    // Act - calling the method
    // Assert - expected behavior/actual behavior
    @Test
    void should_add_one_element_to_the_arraylist() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        sut.add(13);
        int actualElement = sut.get(0);
        int actualSize = sut.getSize();
        // Assert
        assertEquals(13, actualElement);
        assertEquals(1, actualSize);
    }

    @Test
    void should_add_ten_elements_to_the_arraylist() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        int actualSize = sut.getSize();
        // Assert
        for (int i = 0; i < sut.getSize(); i++) {
            assertEquals(i, sut.get(i));
        }
        assertEquals(10, actualSize);
    }

    @Test
    void should_add_more_than_ten_elements_to_the_arraylist() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        for (int i = 0; i < 20; i++) {
            sut.add(i);
        }
        int actualElement = sut.get(19);
        int actualSize = sut.getSize();
        // Assert
        assertEquals(19, actualElement);
        assertEquals(20, actualSize);
    }

    @Test
    void should_double_the_size_of_the_arraylist() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        for (int i = 0; i < 40; i++) {
            sut.add(i);
        }
        int actualSize = sut.getSize();
        // Assert
        assertEquals(40, actualSize);
    }

    @Test
    void testAdd() {
        fail("Not yet implemented");
    }

    @Test
    void getSize() {
        fail("Not yet implemented");
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