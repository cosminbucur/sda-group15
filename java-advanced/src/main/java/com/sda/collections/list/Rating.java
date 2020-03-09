package com.sda.collections.list;

// rating between 1 - 5
public class Rating {

    private int value;

    // constructor
    public Rating(int value) {
        if (value < 1 || value > 5) {
            throw new InvalidRatingException("rating must be between 1 and 5");
        }
        this.value = value;
    }

    // getter
    public int getValue() {
        return value;
    }
}
