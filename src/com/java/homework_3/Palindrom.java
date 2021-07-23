package com.java.homework_3;

import java.util.Arrays;

public class Palindrom {
    static char[] createCharArray(String someString) {
        return someString.toCharArray();
    }

    static boolean checkPalindrom(String string) {
        char[] array1 = createCharArray(string);
        boolean isPalindrom = true;
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length / 2; i++) {
            if (array1[i] != array1[array1.length - 1 - i]) {
                System.out.println("Not a palindrom");
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrom("test"));
    }
}
