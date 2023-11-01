package com.diegojacober;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GraderTest {

    Grader grader;

    @BeforeEach
    void setUp() {
       grader = new Grader();
    }

    @Test
    void negativeOneShoudReturnException() throws IllegalArumentException{
        assertThrows(IllegalArumentException.class, () -> {
            grader.determineLetterGrade(-9);
        });
    }

    @Test
    void fiftyNineShouldReturnF() throws IllegalArumentException {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() throws IllegalArumentException {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() throws IllegalArumentException {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyShouldReturnB() throws IllegalArumentException {
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void ninetyFiveShouldReturnA() throws IllegalArumentException {
        assertEquals('A', grader.determineLetterGrade(95));
    }
}
