package com.sda.exceptions.custom;

public class Car {

    // increase speed until a threshold is reached

    public static final int MAX_SPEED = 280;
    private int speed;

    // increase speed
    public void increaseSpeed() throws CarCrashedException {
        this.speed += 50;

        if (this.speed >= MAX_SPEED) {
//            throw new CarCrashedException("max threshold " + MAX_SPEED + " reached");
            // 3. use custom exception
            throw new CarCrashedException(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}
