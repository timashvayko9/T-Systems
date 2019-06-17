package com.tsystems.javaschool.tasks.calculator;

import static org.junit.Assert.*;


public class CalculatorTestTest {
    @org.junit.Test
    public void main() {
        Calculator calc = new Calculator();
        String s = "2+2*2+(4+1)*2";
        String s1 = calc.evaluate(s);
        String expected = "16";
        assertEquals(s1,expected);
    }
}