package com.sda.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        // create - use generics
        List<String> list = new ArrayList<>();

        // insert
        // add element
        list.add("one");
        // add element
        list.add("two");
        // add element
        list.add("three");

        // insert element at position 1
        list.add(1, "four");

        // read
        // read element at index 2
        list.get(2);    //

        // count elements
        System.out.printf("size %d", list.size());

        // update
        // change an item at a given index
        list.set(1, "five");

        // delete - check if exists
        if (list.contains("one")) {
            list.remove("one");
        }

        // iterate elements
        iterateUsingFor(list);

        iterateUsingForEach(list);

        iterateUsingIterator(list);
    }

    private static void iterateUsingFor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void iterateUsingIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterateUsingForEach(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
