package com.bucur.testing.junit4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionTest {

    // test division
    @Test
    public void happyPath() {
        // given

        // type - reference name = constructor (instantiation)
        Calculator calculator = new Calculator();
        int expected = 2;

        // when
        int actual = calculator.divide(4, 2);

        // then
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void unhappyPath() {
        // given
        Calculator calculator = new Calculator();

        // when
        calculator.divide(4, 0);

        // then
        // should throw exception
    }
}
