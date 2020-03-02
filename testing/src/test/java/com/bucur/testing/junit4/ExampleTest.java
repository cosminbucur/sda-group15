package com.bucur.testing.junit4;

import org.junit.Test;

public class ExampleTest {

    // i want to test a calculator

    // i want to check the sum method

    @Test
    public void test() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actualSum = calculator.sum(2, 3);
        int expectedSum = 5;

        // then
        assert actualSum == expectedSum;
    }
}
