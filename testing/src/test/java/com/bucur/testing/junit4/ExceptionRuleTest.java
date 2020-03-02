package com.bucur.testing.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionRuleTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void unhappyPath() {
        // given
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("other message");
        Calculator calculator = new Calculator();

        // when
        calculator.divide(4, 0);

        // then
        // should throw exception
    }
}
