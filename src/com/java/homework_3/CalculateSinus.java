package com.java.homework_3;

import java.lang.Math;

public class CalculateSinus {
    static void calculateSinus() {
        for (double i = 0; i <= 360; i += 10) {
            System.out.println(Math.sin(Math.toRadians(i)));
        }
    }

    public static void main(String[] args) {
        calculateSinus();
    }
}
