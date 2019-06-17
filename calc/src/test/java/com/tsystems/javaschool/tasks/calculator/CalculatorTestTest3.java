package com.tsystems.javaschool.tasks.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestTest3 {
    @Test
    public void main() {
        Calculator calc = new Calculator();
        String s = "((2+2))";
        String s1 = calc.evaluate(s);
        String expected = "4";
        assertEquals(s1,expected);
    }


}