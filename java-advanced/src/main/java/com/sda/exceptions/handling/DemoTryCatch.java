package com.sda.exceptions.handling;

public class DemoTryCatch {

    public static void main(String[] args) {
//        tryCatch();

        // multiple catch
        int[] intArray = {8, 6, 4};
        int index = 4;
        int y = 0;

//        int result = multipleCatch(intArray, index, y);
//        System.out.println(result);

        catchWithMultipleParams(intArray, index, y);
    }

    private static int catchWithMultipleParams(int[] array, int index, int divisor) {
        int result = 0;
        try {
            result = array[index] / divisor;
            // type | type ... name
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("ArithmeticException or ArrayIndexOutOfBoundsException");
        }
        return result;
    }

    private static int multipleCatch(int[] array, int index, int divisor) {
        int x = 0;
        try {
            // variable scope
            x = array[index] / divisor;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        } catch (Exception e) {
            System.out.println("other exceptions");
        }

        return x;
    }

    private static void tryCatch() {
        int y = 2;

        // try catch
        try {
            int x = 5 / y;
            // catch (type name)
        } catch (Exception e) {
            System.out.println("exception is caught and handled");
        } finally {
            System.out.println("this is printed no matter what");
        }
    }
}
