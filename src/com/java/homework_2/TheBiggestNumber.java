package com.java.homework_2;

public class TheBiggestNumber {
    void calculateTheBiggestNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println("The first number is the biggest");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The second number is the biggest");
        } else {
            System.out.println("The third number is the biggest");
        }
    }

    public static void main(String[] args) {
        TheBiggestNumber theBiggestNumber = new TheBiggestNumber();
        theBiggestNumber.calculateTheBiggestNumber(400, 500, 300);
    }
}
