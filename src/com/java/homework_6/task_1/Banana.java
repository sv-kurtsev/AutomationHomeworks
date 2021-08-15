package com.java.homework_6.task_1;

public class Banana extends Fruit {
    public void peel() {
        System.out.println("We are peeling bananas now");
    }

    public Banana(int calories) {
        setCalories(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice");
    }
}
