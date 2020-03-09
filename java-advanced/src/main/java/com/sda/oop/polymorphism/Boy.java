package com.sda.oop.polymorphism;

public class Boy extends Human {

    // not overriding - static
    public static void walk() {
        System.out.println("boy walks");
    }

    // final can't override

    // not overriding
    private void sing() {
        System.out.println("boy sings");
    }
}
