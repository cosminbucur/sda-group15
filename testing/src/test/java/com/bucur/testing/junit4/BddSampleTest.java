package com.bucur.testing.junit4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BddSampleTest {

    // BDD - behavior driven design

    // given_when_then
    @Test
    public void givenState_whenMethodUnderTest_thenExpectedResult() {
        // given - the required object
        MyObject myObject = new MyObject();
        String expected = "it works!";

        // when - test some method
        String actual = myObject.methodUnderTest();

        // then - check that actual equals expected
        assertEquals(expected, actual);
    }
}
