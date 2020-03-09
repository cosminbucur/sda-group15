package com.sda.oop.composition;

public class DemoComposition {

    public static void main(String[] args) {
        ComputerSet computerSet = new ComputerSet(new Monitor(), new Mouse());
        computerSet.process();
    }
}
