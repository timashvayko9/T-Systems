package com.tsystems.javaschool.tasks.calculator;

import static org.junit.Assert.*;

public class CalculatorTestTest1 {

    @org.junit.Test
    public void main() {
        Calculator calc = new Calculator();
        String s = ")))";
        String s1 = calc.evaluate(s);
        String expected = null;
        assertEquals(s1,expected);
    }

}