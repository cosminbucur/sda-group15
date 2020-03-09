package com.sda.oop.encapsulation;

public class Printer {

    // --- fields
    private String color;
    private int maxNumberOfPages;

    public Printer() {
        this.color = "blue";
        this.maxNumberOfPages = 10;
    }

    // --- actions

    public void print() {
        System.out.println("printing with coloer " + color + " and max pages " + maxNumberOfPages);
    }

    public String getColor() {
        return color;
    }

    //
//    public void setColor(String color) {
//        this.color = color;
//    }
//
    public int getMaxNumberOfPages() {
        return maxNumberOfPages;
    }
//
//    public void setMaxNumberOfPages(int maxNumberOfPages) {
//        this.maxNumberOfPages = maxNumberOfPages;
//    }
}
