package com.tsystems.javaschool.tasks;

import java.util.List;

public class Subsequence {
    public <T> boolean find(List <T> x, List <T> y) {
        if (x.isEmpty() || y.isEmpty());
        boolean isAlright = true;
        int marker = 0;
        for (int iterX = 0; iterX < x.size(); iterX++) {
            if (isAlright != true) break;
            isAlright = false;
            for (int iterY = marker; iterY < y.size(); iterY++) {
                if (x.get(iterX).equals(y.get(iterY))) {
                    isAlright = true;
                    marker = iterY + 1;
                    break;
                }
            }
        }
        return isAlright;
    }
}
