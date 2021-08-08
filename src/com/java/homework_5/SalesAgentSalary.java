package com.java.homework_5;

public class SalesAgentSalary {
    int workedHours;
    double rate;
    int experience;
    int salesAmount;
    double salesSum;
    private double salary;

    public SalesAgentSalary(int workedHours, double rate) {
        this.workedHours = workedHours;
        this.rate = rate;
        this.salary = setSalary(workedHours, rate);
    }

    public SalesAgentSalary(int workedHours, double rate, int experience, int salesAmount, double salesSum) {
        this.workedHours = workedHours;
        this.rate = rate;
        this.experience = experience;
        this.salesAmount = salesAmount;
        this.salesSum = salesSum;
        this.salary = setSalary(workedHours, rate, experience, salesAmount, salesSum);
    }

    public double calculateSalary(int workedHours, double rate) {
        if (workedHours > 160) {
            return (workedHours - 160) * (rate * 1.5) + 160 * rate;
        } else {
            return workedHours * rate;
        }
    }

    public double checkCoefficient(int experience) {
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

    public double checkBonusSalesAmount(int sales) {
        if (sales > 20) {
            return 250;
        } else if (sales < 10) {
            return -150;
        } else {
            return 0;
        }
    }

    public double checkBonusSumAmount(double salesSum) {
        if (salesSum > 15_000) {
            return 300;
        } else {
            return 0;
        }
    }

    private double setSalary(int workedHours, double rate) {
        return calculateSalary(workedHours, rate);
    }

    private double setSalary(int workedHours, double rate, int experience, int salesAmount, double salesSum) {
        return calculateSalary(workedHours, rate) * checkCoefficient(experience) + checkBonusSalesAmount(salesAmount)
                + checkBonusSumAmount(salesSum);
    }

    public double getSalary() {
        return salary;
    }
}
