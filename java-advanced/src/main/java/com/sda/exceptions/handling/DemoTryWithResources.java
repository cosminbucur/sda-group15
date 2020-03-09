package com.sda.exceptions.handling;

import java.util.Scanner;

public class DemoTryWithResources {

    public static void main(String[] args) {
//        regularTryCatch();

        tryWithResources();
    }

    private static void regularTryCatch() {
        // read from user input
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("wow! you typed " + scanner.next() + " you so smart.");
        } catch (Exception e) {
            // handle exception
        } finally {
            // cleanup
            if (scanner != null) {
                scanner.close();
            }
        }
        System.out.println(scanner.next());
    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("wow! you typed " + scanner.next() + " you so smart.");
        } catch (Exception e) {
            // handle exception
        }
        // no need to close scanner in finally
    }
}
