package com.sda.oop.abstraction;

public class Square extends Shape {

    double length;

    public Square(String color, double length) {
        super(color);
        System.out.println("square constructor");
        this.length = length;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    public String print() {
        // color from super (parent)
        // length from this (child)
        return "color is " + super.color + " and length = " + this.length;
    }
}
