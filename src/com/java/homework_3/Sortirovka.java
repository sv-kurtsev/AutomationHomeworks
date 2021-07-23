package com.java.homework_3;

import java.util.Arrays;

public class Sortirovka {
    static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        return array;
    }

    static int[] sortBubble(int[] array) {
        boolean counter = false;
        while (!counter) {
            counter = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = a;
                    counter = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = createArray(5);
        System.out.println();
        System.out.println(Arrays.toString(sortBubble(array)));
    }
}
