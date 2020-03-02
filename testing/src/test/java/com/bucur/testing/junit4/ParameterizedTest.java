package com.bucur.testing.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    // test calculator add with multiple parameters

    @Parameterized.Parameter(0)
    public int argument1;

    @Parameterized.Parameter(1)
    public int argument2;

    @Parameterized.Parameter(2)
    public int expected;

    // define test combinations
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                // argument 1, argument 2, expected
                {1, 1, 2},  // scenario 1
                {2, 4, 6},  // scenario 2
                {1, 3, 7},
                {4, 1, 5}
        });
    }

    // givenState_whenMethodUnderTest_thenExpectedResult
    @Test
    public void givenCalculator_whenSum_thenReturnOk() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.sum(argument1, argument2);

        // then
        assertEquals(expected, actual);
    }
}
