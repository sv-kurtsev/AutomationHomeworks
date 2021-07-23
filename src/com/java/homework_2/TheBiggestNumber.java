package com.java.homework_2;

public class TheBiggestNumber {

    void calculateTheBiggestNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println(number1 + " is the biggest, " + "then " + number2 + " the smallest number is " + number3);
            } else {
                System.out.println(number1 + " is the biggest, " + "then " + number3 + " the smallest number is " + number2);
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.println(number2 + " is the biggest, " + "then " + number1 + " the smallest number is " + number3);
            } else {
                System.out.println(number2 + " is the biggest, " + "then " + number3 + " the smallest number is " + number1);
            }
        } else {
            if (number1 > number2) {
                System.out.println(number3 + " is the biggest, " + "then " + number1 + " the smallest number is " + number2);
            } else {
                System.out.println(number3 + " is the biggest, " + "then " + number2 + " the smallest number is " + number1);
            }
        }
    }

    public static void main(String[] args) {
        TheBiggestNumber theBiggestNumber = new TheBiggestNumber();
        theBiggestNumber.calculateTheBiggestNumber(800, 900, 700);
    }
}
