package com.java.homework_1.zakupka;

public class Zakupka {
    public static void main(String[] args) {
        boolean sort1 = false;
        boolean sort2 = true;
        boolean inStock = false;
        if (sort1 || sort2) {
            inStock = true;
            System.out.println("Apples are in stock");
        } else {
            System.out.println("Apples are out of stock");
        }
        System.out.println(inStock);
    }
}
