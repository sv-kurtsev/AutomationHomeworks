package com.java.homework_2;

public class Task8 {
    void calculateSales(int sales) {
        int salesForBonus = 11;
        if (sales >= salesForBonus) {
            System.out.println("You have a bonus!");
        } else {
            System.out.println(salesForBonus - sales + " sales remain to have a bonus");
        }
    }

    public static void main(String[] args) {
        Task8 newCalculation = new Task8();
        newCalculation.calculateSales(9);
    }
}
