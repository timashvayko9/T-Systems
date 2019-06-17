package com.tsystems.javaschool.tasks;

import java.util.Arrays;
import java.util.List;

public class PyramidTest {
    public static void main(String[] args) {
        PyramidBuilder p = new PyramidBuilder();
        List<Integer> inputNumbers = Arrays.asList(5,4,7,6,8,2,9,1,10,3);
        p.buildPyramid(inputNumbers);
    }
}
