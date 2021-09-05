package com.java.homework_9;

public enum Ball {

    FOOTBALL_BALL(40, "football", 300, "leather"),
    BASKETBALL_BALL(50, "basketball", 350, "gum"),
    HANDBALL_BALL(25, "handball", 200, "leather"),
    RUGBY_BALL(60, "rugby", 500, "leather"),
    TENNIS_BALL(20, "tennis", 100, "textile");

    private double size;
    private String kindOfSport;
    private double price;
    private String material;

    Ball(double size, String kindOfSport, double price, String material) {
        this.size = size;
        this.kindOfSport = kindOfSport;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
