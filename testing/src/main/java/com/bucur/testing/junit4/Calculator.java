package com.bucur.testing.junit4;

public class Calculator {

    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    // implement division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }
}
