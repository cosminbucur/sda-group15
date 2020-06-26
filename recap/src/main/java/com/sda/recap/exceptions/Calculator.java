package com.sda.recap.exceptions;

import java.io.IOException;

public class Calculator {

    // trows used for compile time exceptions
    public void readFromFile() throws IOException {
        // provide file
    }

    public void useThrowKeyWord() {
        // some operation
        if (5 > 1) {
            throw new RuntimeException("5 greater than 1");
        }
    }
}
