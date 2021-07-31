package com.java.homework_4;

public class RaschetZarplaty {

    static double firstMethod(int workedHours, double rate) {
        if (workedHours > 160) {
            return (workedHours - 160) * (rate * 1.5);
        } else {
            return 0;
        }
    }

    static double secondMethod(int experience) {
        if (experience < 2) {
            return 1;
        } else if (experience >= 2 && experience < 4) {
            return 1.2;
        } else if (experience >= 4 && experience < 6) {
            return 1.3;
        } else {
            return 1.4;
        }
    }

    static double thirdMethod(int sales) {
        if (sales > 20) {
            return 250;
        } else if (sales < 10) {
            return -150;
        } else {
            return 0;
        }
    }

    static double fourthMethod(double salesSum) {
        if (salesSum > 15_000) {
            return 300;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int workedHours = 162;
        int regularHours = workedHours <= 160 ? workedHours : workedHours - (workedHours - 160);
        double rate = 100;
        int experience = 1;
        int sales = 30;
        double salesSum = 20_000;
        double salary_without_bonus = firstMethod(workedHours, rate) + secondMethod(experience) * regularHours * rate;
        System.out.println(salary_without_bonus);
        double bonus = thirdMethod(sales) + fourthMethod(salesSum);
        System.out.println(bonus);
        double salary = salary_without_bonus + bonus;
        System.out.println(salary);
    }
}
