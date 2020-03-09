package com.sda.oop.inheritance;

// abstract classes can not be instantiated
// used to be extended
public abstract class Vehicle {

    int tankCapacity;

    // abstract method - must be implemented
    public abstract int fillTank(int amount);

    public abstract void service();

    // regular method - the same for all vehicles
    public void drive() {
        System.out.println("driving...");
    }
}
