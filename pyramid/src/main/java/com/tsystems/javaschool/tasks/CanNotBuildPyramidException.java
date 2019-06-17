package com.tsystems.javaschool.tasks;

public class CanNotBuildPyramidException extends RuntimeException {
    public CanNotBuildPyramidException(String alert){
        super(alert);
    }
}
