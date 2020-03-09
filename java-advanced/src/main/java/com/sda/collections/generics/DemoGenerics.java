package com.sda.collections.generics;

public class DemoGenerics {

    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();
        ToyPlane toyPlane = new ToyPlane();

        RegularBox boxWithToy = new RegularBox(toyCar);
//        RegularBox regularBox = new RegularBox(toyPlane);

        GenericBox<ToyCar> boxWithCars = new GenericBox<>();
        boxWithCars.setItem(toyCar);

        GenericBox<ToyPlane> boxWithPlane = new GenericBox<>();
        boxWithPlane.add(toyPlane);
    }
}
