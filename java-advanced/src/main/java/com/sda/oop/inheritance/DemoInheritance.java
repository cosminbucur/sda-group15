package com.sda.oop.inheritance;

public class DemoInheritance {

    public static void main(String[] args) {
        // animal
        Animal animal = new Animal();
        animal.age = 5;
        animal.breed = "wolf";
        animal.makeNoise();

        // dog inherits animal (IS A)
        Dog dog = new Dog();
        dog.age = 10;
        dog.breed = "golden retriever";

        Car simpleCar = new Car();
        simpleCar.fillTank(10);
        simpleCar.drive();
    }
}
