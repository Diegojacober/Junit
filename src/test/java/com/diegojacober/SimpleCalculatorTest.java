package com.diegojacober;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void twoPlusTwoShouldEqualFour() {
        assertEquals(4, calculator.add(2, 2));
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    void threePlusSevenShouldEqualTen() {
        assertEquals(10, calculator.add(3, 7));
    }

    @Test
    void TenMinusFiveShoudEqualFIve() {
        assertEquals(5, calculator.sub(10, 5));
    }
}