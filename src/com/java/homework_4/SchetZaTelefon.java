package com.java.homework_4;

public class SchetZaTelefon {
    static double calculateInternet(double usedTraffic) {
        if (usedTraffic <= 8) {
            return 0;
        } else {
            return (usedTraffic - 8) * 100;
        }
    }

    static double calculateCallsInUkraine(int minutes) {
        if (minutes <= 500) {
            return minutes * 0.5;
        } else {
            return (500 * 0.5) + ((minutes - 500) * 0.75);
        }
    }

    static double calculateSMS(int SMS) {
        if (SMS <= 50) {
            return SMS;
        } else {
            return SMS + (SMS - 50) * 1.5;
        }
    }

    static double calculateCallsZone1(int minutes) {
        return minutes * 1.5;
    }

    static double calculateCallsZone2(int minutes) {
        return minutes * 2;
    }

    public static void main(String[] args) {
        double cost = calculateInternet(10) + calculateCallsInUkraine(600) + calculateSMS(60) + calculateCallsZone1(50) + calculateCallsZone2(20);
        double costWithTax = cost + cost * 0.07;
        System.out.println(cost);
        System.out.println(costWithTax);
    }
}
