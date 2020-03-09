package com.sda.oop.encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {
        // encapsulate printer
        Printer printer = new Printer();
        printer.print();

        Person person = new Person();
        person.setFirstName("Gigi");

        person.setFirstName("");
    }
}
