package com.sda.exceptions.custom;

// 1. extend exception
public class CarCrashedException extends RuntimeException {

    // 2. add details
    // override
    public CarCrashedException(String message) {
        super(message);
    }

    // custom
    public CarCrashedException(Car car) {
        super("car " + car + "has crashed");
    }
}
