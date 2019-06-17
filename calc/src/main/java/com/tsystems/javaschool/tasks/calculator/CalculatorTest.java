package com.tsystems.javaschool.tasks.calculator;

import java.util.Scanner;

public class CalculatorTest extends Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println(calc.evaluate(s));
        }

    }
}