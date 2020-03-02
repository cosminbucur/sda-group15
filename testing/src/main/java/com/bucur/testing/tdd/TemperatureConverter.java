package com.bucur.testing.tdd;

public class TemperatureConverter {

    public int toCelsius(int fahrenheitTemp) {
        return (fahrenheitTemp - 32) * 5 / 9;
    }
}
