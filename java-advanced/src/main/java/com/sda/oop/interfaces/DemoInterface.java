package com.sda.oop.interfaces;

public class DemoInterface {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());

        Shape shape = rectangle;
        System.out.println(shape.getPerimeter());
    }
}
