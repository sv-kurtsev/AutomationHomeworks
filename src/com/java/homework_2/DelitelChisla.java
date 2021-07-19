package com.java.homework_2;

public class DelitelChisla {
    void divideNumber(double a, double b) {
        if (b % a != 0) {
            System.out.println("Chislo a ne yavlayetsya delitelem chisla b");
        } else {
            System.out.println("Chislo a yavlayetsya delitelem chisla b");
        }
    }

    public static void main(String[] args) {
        DelitelChisla delitelChisla = new DelitelChisla();
        delitelChisla.divideNumber(10, 20);
    }
}
