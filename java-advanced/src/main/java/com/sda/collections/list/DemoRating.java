package com.sda.collections.list;

import java.util.Arrays;
import java.util.List;

public class DemoRating {

    public static void main(String[] args) {
        Rating goodRating = new Rating(5);
        Rating averageRating = new Rating(3);
        Rating badRating = new Rating(1);
//        Rating invalidRating = new Rating(6);

        // compute average
        int average = (goodRating.getValue() + averageRating.getValue() + badRating.getValue()) / 3;

        List<Rating> ratings = Arrays.asList(goodRating, averageRating, badRating);

        System.out.println(computeAverage(ratings));
    }

    private static int computeAverage(List<Rating> ratings) {
        int sum = 0;

        // iterate ratings
        for (Rating rating : ratings) {
            // get value from rating
            int value = rating.getValue();

            // add value to a sum
            sum = sum + value;
        }
        // divide sum to number of ratings
        return sum / ratings.size();
    }
}
