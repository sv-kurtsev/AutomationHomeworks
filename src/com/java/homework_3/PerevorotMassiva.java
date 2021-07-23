package com.java.homework_3;

import java.util.Arrays;

public class PerevorotMassiva {
    static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        return array;
    }

    static int[] reverseArray(int[] array) {
        int a;
        for (int i = 0; i < array.length / 2; i++) {
            a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;

        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(createArray(6))));
    }
}
