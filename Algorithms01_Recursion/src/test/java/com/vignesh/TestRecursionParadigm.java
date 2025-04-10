package com.vignesh;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestRecursionParadigm {
    @Test
    @DisplayName("Testing RecusrionParadigm.sumOfNNaturalNumbers(int) with Natural Numbers")
    public void testSumOfNNaturalNumbersWithNaturalNumbers() {
        int actual = RecursionParadigm.sumOfNNaturalNumbers(6);
        int expected = 6*(6+1)/2;
        assertEquals(expected, actual, "May be both are not equal");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.sumOfNNaturalNumbers(int) with 0")
    public void testSumOfNaturalNumbersWithZero() {
        assertThrows(IllegalArgumentException.class, () -> RecursionParadigm.sumOfNNaturalNumbers(0),
                "May be both are not same");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.sumOfNNaturalNumbers(int) with Negative Integers")
    public void testSumOfNaturalNumbersWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> RecursionParadigm.sumOfNNaturalNumbers(-10),
                "May be both are not same");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.factorial(int) with Natural Numbers")
    public void testFactorialWithNaturalNumbers() {
        assertEquals(120,RecursionParadigm.factorial(5), "Expected and Actual results are not same");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.factorial(int) with zero")
    public void testFactorialWithZero() {
        assertEquals(1,RecursionParadigm.factorial(0), "Expected and Actual results are not same");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.factorial(int) with Negative Numbers")
    public void testFactorialWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class,() -> RecursionParadigm.factorial(-5), "Expected and Actual results are not same");
    }

    @Test
    @DisplayName("Testing RecusrionParadigm.fabonacci(int) with Natural Numbers")
    public void testFibonacciWithNaturalNumbers() {
        assertEquals(1,RecursionParadigm.fibonacci(1), "Expected and Actual results are not same");
        assertEquals(1,RecursionParadigm.fibonacci(2), "Expected and Actual results are not same");
        assertEquals(5,RecursionParadigm.fibonacci(5), "Expected and Actual results are not same");
        assertEquals(8,RecursionParadigm.fibonacci(6), "Expected and Actual results are not same");
    }
}
