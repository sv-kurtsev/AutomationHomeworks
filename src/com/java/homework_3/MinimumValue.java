package com.java.homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] array = scanner.nextArray();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(calculateMinValue(array));

    }

    static int calculateMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
