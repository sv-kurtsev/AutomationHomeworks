package com.java.homework_2;

public class GreatestValue {
    void calculateGreatestValue(int number, int number2) {
        int x = number;
        int y = number2;
        if (x > y) {
            System.out.println("The number x has the greatest value");
        } else if (y > x) {
            System.out.println("The number y has the greatest value");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        GreatestValue value = new GreatestValue();
        value.calculateGreatestValue(50, 10);
    }
}
