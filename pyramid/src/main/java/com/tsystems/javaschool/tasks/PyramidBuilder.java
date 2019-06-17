package com.tsystems.javaschool.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PyramidBuilder {


    public int[][] buildPyramid(List<Integer> inputNumbers) {
        boolean flag;
        int[][]matrix;
        int size = inputNumbers.size();
        int count = 0;int rows = 1;int cols = 1;
        while(count < size){
            count=count+rows;
            rows++;
            cols=cols+2;
        }
        rows = rows-1;
        cols = cols-2;

        if(size==count) {
            flag = true;
        }else flag = false;

        if (flag) {
            List<Integer> sorted = inputNumbers.stream().sorted().collect(Collectors.toList());


            matrix = new int[rows][cols];
            for (int[] row : matrix) {
                Arrays.fill(row, 0);
            }

            int center = (cols / 2);
            count = 1;
            int arrIdx = 0;

            for (int i = 0, offset = 0; i < rows; i++, offset++, count++) {
                int start = center - offset;
                for (int j = 0; j < count * 2; j +=2, arrIdx++) {
                    matrix[i][start + j] = sorted.get(arrIdx);
                }
            }

            for(int [] a: matrix)
            {
                for(int b: a)
                    System.out.print(b+"  ");
                System.out.println();
            }
        }
        else{
            throw new CanNotBuildPyramidException("Wrong size of input Array");
        }
        return matrix;}}



