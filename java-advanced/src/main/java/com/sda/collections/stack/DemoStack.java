package com.sda.collections.stack;

import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        // Iterable - ability to be iterable
        // Collection - common behavior for any collection type
        // List - behavior specific to index
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.size();   // size 1
        stack.push(3);
        stack.push(1);

        stack.pop();    // 2, 3
        stack.empty();  // false

        Integer last = stack.peek();
        System.out.println("last = " + last);
        Integer searchTwo = stack.search(2);
        System.out.println("searchTwo = " + searchTwo);

        stack.size();
    }
}
