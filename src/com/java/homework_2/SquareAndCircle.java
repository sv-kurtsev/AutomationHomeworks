package com.java.homework_2;

public class SquareAndCircle {

    double calculateRadius(double circleArea) {
        double squareRadius = circleArea / 3.14;
        return Math.sqrt(squareRadius);
    }

    double calculateSquareSide(double squareArea) {
        return Math.sqrt(squareArea);
    }

    double calculateDiagonalKvadrata(double side) {
        return Math.sqrt(2) * side;
    }

    void krugVKvadrate(double circleArea, double squareArea) {
        if (calculateRadius(circleArea) * 2 < calculateSquareSide(squareArea)) {
            System.out.println("Krug pomestitsya v kvadrate");
        } else {
            System.out.println("Krug ne pomestitsya v kvadrate");
        }
    }

    void kvadratVKruge(double circleArea, double squareArea) {
        if (calculateRadius(circleArea) * 2 > calculateDiagonalKvadrata(calculateSquareSide(squareArea))) {
            System.out.println("Kvadrat pomestitsya kruge");
        } else {
            System.out.println("Kvadrat pomestitsya kruge");
        }
    }

    public static void main(String[] args) {
        SquareAndCircle newCheck = new SquareAndCircle();
        newCheck.krugVKvadrate(100, 200);
        newCheck.kvadratVKruge(500, 100);
    }
}
