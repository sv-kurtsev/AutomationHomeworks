package com.java.homework_2;

public class SummaPokupki {
    void calculateSummuPokupki(double summaPokupki) {
        if (summaPokupki > 1000) {
            summaPokupki = summaPokupki - (summaPokupki * 0.15);
            System.out.println("Summa pokupki s uchetom skidki " + summaPokupki);
        } else {
            System.out.println("Skidka ne predostavlyaetsa");
        }
    }

    public static void main(String[] args) {
        SummaPokupki summaPokupki = new SummaPokupki();
        summaPokupki.calculateSummuPokupki(1500);
    }
}
