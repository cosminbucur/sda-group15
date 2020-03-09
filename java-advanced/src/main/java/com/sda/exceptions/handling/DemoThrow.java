package com.sda.exceptions.handling;

public class DemoThrow {

    public static void main(String[] args) {
        try {
//            activate();
            deactivate();
        } catch (NullPointerException e) {
            System.out.println("caught in main()");
        }
    }

    public static void activate() {
        try {
            // some code
            String myString = null;
            if (myString == null) {
                throw new NullPointerException("something is null");
            }
        } catch (NullPointerException e) {
            System.out.println("caught in activate()");

            // rethrow the exception
            throw e;
        }
    }

    public static void deactivate() {
        // some code
        String myString = null;
        if (myString == null) {
            throw new NullPointerException("something is null");
        }
    }
}
