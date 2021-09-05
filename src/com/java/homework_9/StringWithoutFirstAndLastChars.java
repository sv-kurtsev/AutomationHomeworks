package com.java.homework_9;

import java.util.Scanner;

public class StringWithoutFirstAndLastChars {

    public static String withoutFirstAndLastChar(String inputString) {
        if (inputString.length() < 3) {
            return inputString;
        } else
            return inputString.substring(1, inputString.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(withoutFirstAndLastChar(sc.nextLine()));
    }
}
