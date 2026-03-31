package com.aboke;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GradeCalculatorTest {

    @Test
    public void testGradeA() {
        GradeCalculator calculator = new GradeCalculator();
        assertEquals("A", calculator.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        GradeCalculator calculator = new GradeCalculator();
        assertEquals("B", calculator.calculateGrade(85));
    }

    @Test
    public void testGradeF() {
        GradeCalculator calculator = new GradeCalculator();
        assertEquals("F", calculator.calculateGrade(50));
    }
}