package com.sda.exceptions.custom;

public class DemoCustomException {

    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.increaseSpeed();    // 0
            car.increaseSpeed();    // 50
            car.increaseSpeed();    // 100
            car.increaseSpeed();    // 100
            car.increaseSpeed();    // 100
            car.increaseSpeed();    // 100
            car.increaseSpeed();    // 100
            car.increaseSpeed();    // 280
        } catch (CarCrashedException e) {
            System.out.println("please decrease speed");
        }
    }
}
