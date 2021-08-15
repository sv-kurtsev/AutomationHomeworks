package com.java.homework_6.task_2;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setTaste("Very Sweet");
        cake.setPrice(100);
        System.out.println(cake);
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setTaste("Not so sweet");
        birthdayCake.setCandles(30);
        birthdayCake.setPrice(120);
        System.out.println(birthdayCake);
        WeedingCake weedingCake = new WeedingCake();
        weedingCake.setTier(3);
        weedingCake.setPrice(200);
        weedingCake.setTaste("sweet enough");
        System.out.println(weedingCake);
    }
}
