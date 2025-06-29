package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AAA{

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();  // Arrange
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int result = calculator.add(5, 3);  // Act
        assertEquals(8, result);           // Assert
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);  // Act
        assertEquals(6, result);                 // Assert
    }
}