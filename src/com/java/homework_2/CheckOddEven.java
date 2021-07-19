package com.java.homework_2;

public class CheckOddEven {
    void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

    public static void main(String[] args) {
        CheckOddEven newCheck = new CheckOddEven();
        newCheck.checkOddEven(4);
    }
}
