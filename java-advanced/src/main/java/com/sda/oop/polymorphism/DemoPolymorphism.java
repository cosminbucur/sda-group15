package com.sda.oop.polymorphism;

public class DemoPolymorphism {

    public static void main(String[] args) {
        // reference of type Human = object of type Boy
        Human boy = new Boy();

        // reference of type Human = object of type Human
        Human human = new Human();

        boy.walk(); // goes to Human method
        human.walk();   // goes to Human method

        boy.run();
        human.run();
    }
}
