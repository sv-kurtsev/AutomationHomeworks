package com.java.homework_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfFiveDoubles {
    public static void main(String[] args) {
        double currentNumber = 0.0;
        double sumOfNumbers = 0.0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; ) {
            try {
                currentNumber = scanner.nextDouble();
                sumOfNumbers += currentNumber;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("You have entered the wrong number");
                scanner.next();
                continue;
            }
        }
        System.out.println("The sum of 5double numbers is " + sumOfNumbers);
    }
}
