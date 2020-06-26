package com.sda.recap;

public class ControlFlow {

    public void useIf() {
        int points = 100;

        if (points < 18) {
            System.out.println("too bad");
        } else if (points > 30) {
            System.out.println("pretty good");
        } else {
            System.out.println("very bad");
        }
    }

    public void useSwitch() {
        int direction = 2;

        switch (direction) {
            case 1 :
                System.out.println("going up");
                break;
            case 2 :
                System.out.println("going down");
                break;
            default:
                System.out.println("wrong button");
        }
    }

    public static void useFor() {
        int[] numbers = { 2, 5, 6, 7 };

        // from ; to ; increment
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 6) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }

    public static void useEnhancedFor() {
        int[] numbers = { 2, 5, 6, 7 };

        // element : collection
        for (int number : numbers) {
            System.out.println(number);
        }

    }



    public static void main(String[] args) {
        ControlFlow.useFor();
    }
}
