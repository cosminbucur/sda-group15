package com.sda.oop.abstraction;

public abstract class Shape {

    String color;

    // no more default constructor Shape() {}

    public Shape(String color) {
        System.out.println("shape constructor called");
        this.color = color;
    }

    // abstract methods
    abstract double area();

    public abstract String print();

    // concrete method
    public String getColor() {
        return color;
    }
}
