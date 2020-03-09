package com.sda.oop.story.andreea;

public class Pony {

    private String name;

    public Pony(String initialName) {
        this.name = initialName;
    }

    public void eat() {
        System.out.println("pony eating");
    }

    public void sleep() {
        System.out.println("pony sleeping");
    }

    public String getName() {
        return name;
    }
}
