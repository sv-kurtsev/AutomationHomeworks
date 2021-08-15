package com.java.homework_6.task_2;

public class Cake {
    private String taste;
     private double price;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
