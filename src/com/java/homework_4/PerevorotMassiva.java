package com.java.homework_4;

import java.util.Arrays;

public class PerevorotMassiva {
   static int[] createArray(int...array) {
        return array;
    }
    static void reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int i = array.length - 1;
        for (int a: array) {
            newArray[i] = a;
            i--;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        reverseArray(createArray(1,2,3,4,5,6,7,0));
    }
}
