package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    void start() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumTest1() {
        int actualResult = sumCalculator.sum(1);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumTest2() {
        int actualResult = sumCalculator.sum(3);
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumTest3() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}