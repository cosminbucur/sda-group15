package com.sda.enums;

public class DemoEnums {

    public static void main(String[] args) {
        Hero archer = new Hero(100, Role.ARCHER);
        Hero fighter = new Hero(200, Role.FIGHTER);

        // print all values in enum
        archer.getRole().printEnum();
    }
}
