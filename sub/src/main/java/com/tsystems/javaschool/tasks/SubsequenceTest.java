package com.tsystems.javaschool.tasks;

import java.util.Arrays;

public class SubsequenceTest extends Subsequence {
    public static void main(String[] args) {
        SubsequenceTest s = new SubsequenceTest();
        boolean b = s.find(Arrays.asList("A", "B", "C", "D"),
                Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M","C", "DC", "D"));
        System.out.println(b);
    }
}
