package com.sda.oop.polymorphism;

public class DemoDynamicPolymorphism {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//
//        Animal dog = new Dog();
//
//        animal.walk();
//        dog.walk();

        Animal dog = new Dog();
        Animal lion = new Lion();
        Zoo zoo = new Zoo();

        zoo.feed(dog);
        zoo.feed(lion);
    }
}
