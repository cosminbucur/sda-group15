package com.sda.recap.exceptions;

import java.io.IOException;

public class DemoExceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.readFromFile();
        } catch (IOException e) {
            System.out.println("could not read from file");
        } catch (Exception e) {
            System.out.println("other problem");
        } finally {
            System.out.println("run every time");
        }
    }
}
