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
    void add() {
        // Arrange
        CustomList<Integer> sut = new CustomArrayList<>();
        // Act
        sut.add(13);
        Integer expectedValue = sut.get(0);
        // Assert
        assertEquals(13,expectedValue);
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