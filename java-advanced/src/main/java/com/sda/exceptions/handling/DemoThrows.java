package com.sda.exceptions.handling;

public class DemoThrows {

    public static void main(String[] args) throws Exception {
        // define elements
        int[] someIntArray = {3, 4, 2};

        // checked exception
//        try {
//            printArrayElements(someIntArray, 3);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        printArrayElements(someIntArray, 3);
    }

    // print array elements
    // accessor return-type name (type name)
    public static void printArrayElements(int[] array, int index) throws Exception {
        if (index < 0 || index >= array.length) {
            throw new Exception("incorrect arguments");
        }
        System.out.println(array[index]);
    }
}
