package com.java.homework_6.task_1;

public class Apple extends Fruit {
    public void removeSeeds() {
        System.out.println("We are removing seeds from apples now");
    }

    public Apple(int calories) {
        setCalories(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice");
    }
}
