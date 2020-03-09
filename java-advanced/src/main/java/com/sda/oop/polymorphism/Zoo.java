package com.sda.oop.polymorphism;

public class Zoo {

    public void feed(Animal animal) {
        System.out.println("feed animal");
        animal.walk();
    }

    public void feed(Object animal) {
        if (animal instanceof Dog) {

        } else if (animal instanceof Lion) {

        }
    }
}
