package com.java.homework_9;

import java.util.Scanner;

public class StringLengthEquals3OrNot {
    public static String withoutFirstAndLastChar(String inputString) {
    if (inputString.length() <= 3) {
        return inputString;
    } else {
        String cutString = inputString.substring(0, 3);
        return cutString.repeat(3);
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(withoutFirstAndLastChar(sc.nextLine()));
    }
}
