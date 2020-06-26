package com.sda.recap;

public class Variables {

    // assignment
    String name = "Alex";   // default ""
    boolean isAdult;        // default false
    int age = 50;           // default 0
    double price = 20.5;    // default 0.0
    long timestamp = 1232354356465L;

    // access modifier type name(parameters) { body }
    // method signature
    public void checkAge(int value) {
        // ctrl + shift + up arrow / down arrow - move code
        if (age == value) {
            System.out.println("equal");
        }

        if (age >= value) {
            System.out.println("greater");
        }

        if (age != value) {
            System.out.println("not equal");
        }

        // evaluate each expression
        if (age < 10 && age < 20) {

        } else {

        }

        if (age < 10 || age < 20) {

        } else {

        }
    }

    // variable scope
    public double harmonic() {
        double sum = 5;
        sum = sum + price;
        return sum;
    }

    public int useMyCount() {
        // passing argument
        count(10);
        return 0;
    }

    // defining parameter
    public int count(int parameter) {
        return parameter + 1;
    }

    // command method
    public void printAName() {
        System.out.println("Alex");
    }

    // query method
    public int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
