package com.java.homework_9;

import java.util.Scanner;

public class StartsAndEndsWithLastChar {
    public static String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(backAround(sc.nextLine()));
    }
}
