package com.sda.recap;

// encapsulation
public class Computer {

    private String brand;
    private Keyboard keyboard;

    public Computer(String brand) {
        this.brand = brand;
        this.keyboard = new Keyboard();
    }

    public void print() {}

    public void count() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }
}
