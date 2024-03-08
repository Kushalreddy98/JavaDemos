package com.exceptions.custom;

public class OutOfLimitsException extends Exception{
    public OutOfLimitsException() {
    }

    public OutOfLimitsException(String message) {
        super(message);
    }
}
