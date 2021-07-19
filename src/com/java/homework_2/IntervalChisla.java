package com.java.homework_2;

public class IntervalChisla {
void checkInterval(int currentNumber, int startInterval, int endInterval) {
    if (currentNumber > startInterval && currentNumber < endInterval) {
        System.out.println("The current number is inside the interval");
    } else {
        System.out.println("The current number is outside the interval");
    }
}

    public static void main(String[] args) {
        IntervalChisla intervalChisla = new IntervalChisla();
        intervalChisla.checkInterval(2, -5, 3);
    }
}
