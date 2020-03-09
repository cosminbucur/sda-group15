package com.sda.oop.encapsulation;

public class Person {

    // firstName
    // age

    private String firstName;
    private int age;

    // prevent creation of person with empty name
    public void setFirstName(String newValue) {
        // if new value = null -> dont change name
        // if new value != null but is "" -> dont change name
        if (newValue != null && !"".equals(newValue)) {
            this.firstName = newValue;
        }

    }

    // grow older
    public void growOlder() {
        age++;
    }
}
