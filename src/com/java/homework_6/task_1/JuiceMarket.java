package com.java.homework_6.task_1;

public class JuiceMarket {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.makeJuice();
        Fruit fruit1 = new Apple(5);
        fruit1.makeJuice();
        fruit1.setCalories(6);
        System.out.println(fruit1.getCalories());
        Fruit fruit2 = new Banana(7);
        System.out.println(fruit2.getCalories());
        fruit2.makeJuice();
        Banana banana = new Banana(8);
        banana.makeJuice();
        System.out.println(banana.getCalories());
        Lemon lemon = new Lemon(9);
        Fruit fruit3 = lemon;
        fruit3.makeJuice();
        Orange orange = new Orange(10);
        Fruit fruit4 = orange;
        fruit4.makeJuice();

    }
}
