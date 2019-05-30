package com.ashish;

public class InvalidSalaryException  extends Exception {
    public InvalidSalaryException()
    {
        super("invalid");
    }

    public InvalidSalaryException(String message) {
        super(message);
    }

}
