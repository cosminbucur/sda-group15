package com.bucur.testing.junit4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTest {

    // i want to know what assertions are

    @Test
    public void assertionTest() {


        int[] array1 = {3, 4};
        int[] array2 = {3, 4};
        String nullString = null;
        String one = "text";
        String two = "text";

        assertEquals(64, 2 * 32);
        assertEquals("visible only on fail", 64, 2 * 32);
        assertNotEquals("values are not equal", 1, 2);
        assertTrue(true);
        boolean isAdult = false;
        assertFalse(isAdult);

        assertArrayEquals(array1, array2);
        assertNull(nullString);
        assertSame(one, two);
    }
}
