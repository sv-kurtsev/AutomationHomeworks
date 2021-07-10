package com.java.homework_1.CelsiusFahrenheit;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        double celsius = 20;
        double fahrenheit = 41;
        double kelvin = 38;
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("For fahrenheit temperature " + fahrenheit
                + " celsius temperature is: " + fahrenheitToCelsius);
        double celsiusToFahrenheit = celsius * 9 / 5 + 32;
        System.out.println("For celsius temperature " + celsius
                + " fahrenheit temperature is: " + celsiusToFahrenheit);
        double celsiusToKelvin = celsius + 273.16;
        System.out.println("For celsius temperature " + celsius
                + " kelvin temperature is: " + celsiusToKelvin);
    }
}

