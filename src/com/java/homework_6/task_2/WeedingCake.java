package com.java.homework_6.task_2;

public class WeedingCake extends Cake {
    int tier;

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeedingCake{" +
                "tier=" + tier +
                '}';
    }
}
