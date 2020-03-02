package com.bucur.testing.junit4;

import org.junit.*;

public class LifecycleTest {

    // LifeCycleTest - test class

    // method1  - test method
    // method2

    // junit lifecycle

    @BeforeClass
    public static void beforeClass() {
        System.out.println("run before the first test method");
    }

    ;

    @AfterClass
    public static void afterClass() {
        System.out.println("run after the last test method");
    }

    @Before
    public void before() {
        System.out.println("run before each test method");
    }

    @After
    public void after() {
        System.out.println("run after each test method");
    }

    // actual test

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}
