package com.sda.oop.abstraction;

public class DemoAbstraction {

    public static void main(String[] args) {
        Shape square = new Square("yellow", 10.5);
        System.out.println(square.print());
    }
}
