package com.java.homework_6.task_1;

public class Lemon extends Fruit {
    public void cut() {
        System.out.println("We are cutting lemons");
    }
    public Lemon(int calories) {
        setCalories(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Lemon juice");
    }
}
