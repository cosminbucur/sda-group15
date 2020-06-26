package com.sda.recap.abstraction;

public class Andreea extends Woman implements Developer {

    @Override
    public void feel() {
        System.out.println("I feel pretty");
    }

    public void writeCode() {
        System.out.println("java run");
    }
}
