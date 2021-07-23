package com.java.homework_3;

public class Task_6 {
    static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        return array;
    }

    static void checkDividing(int[] array) {
        int number = 0;
        for (int a : array) {
            if (a % 2 == 0 && a % 3 != 0) {
                number++;
            }
        }
        System.out.println();
        System.out.println("Number of needed numbers is " + number);
    }

    public static void main(String[] args) {
        checkDividing(createArray(5));
    }
}
