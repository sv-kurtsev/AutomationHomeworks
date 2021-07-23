package com.java.homework_3;

public class ReverseString {
    static char[] createArray(String string) {
        return string.toCharArray();
    }

    static void reverseString(char[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        reverseString(createArray("Test"));
    }
}
