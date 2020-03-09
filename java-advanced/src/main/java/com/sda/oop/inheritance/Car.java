package com.sda.oop.inheritance;

// IS-A vehicle
public class Car extends Vehicle {

    private int fabricationYear;

    @Override
    public int fillTank(int amount) {
        // add amount to capacity
        this.fabricationYear = 2020;
        return super.tankCapacity + amount;
    }

    @Override
    public void service() {
        System.out.println("service car");
    }
}
