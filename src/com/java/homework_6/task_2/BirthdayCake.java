package com.java.homework_6.task_2;

public class BirthdayCake extends Cake{
    int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    @Override
    public String toString() {
        return "BirthdayCake{" + super.toString() +
                ", candles=" + candles +
                '}';
    }
}
