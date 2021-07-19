package com.java.homework_1.zakupka;

public class Zakupka {

        boolean sort1;
        boolean sort2;
        boolean inStock;
         boolean calculateApples(boolean sort1, boolean sort2) {
             this.sort1 = sort1;
             this.sort2 = sort2;
            inStock = sort1 || sort2;
            return inStock;
        }
    public static void main(String[] args) {
             Zakupka resultApples = new Zakupka();
        System.out.println(resultApples.calculateApples(false, true));
    }
}
