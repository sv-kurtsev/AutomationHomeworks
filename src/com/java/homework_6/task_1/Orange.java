package com.java.homework_6.task_1;

public class Orange extends Fruit {
    public void squeeze() {
        System.out.println();
    }
    public Orange(int calories) {
        setCalories(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange juice");
    }
}
