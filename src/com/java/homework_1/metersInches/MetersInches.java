package com.java.homework_1.metersInches;

public class MetersInches {
    public static void main(String[] args) {
    double meters = 100;
    double miles = 10;
    double kilograms = 50;
    double kmPerHr = 60;
    double metersToInches = meters * 39.37;
    String metersToInchesRounded = String.format("%.2f", metersToInches);
    System.out.println(meters + " meters = " + metersToInchesRounded + " inches.");
    double milesToKilometers = miles * 1.609;
    System.out.println(miles + " miles = " + milesToKilometers + " kilometers.");
    double kilogramsToPounds = kilograms * 2.2046;
    System.out.println(kilograms + " kilograms = " + kilogramsToPounds + " pounds.");
    double kilometersPerHourToMilesPerHour = kmPerHr * 0.6214;
    System.out.println(kmPerHr + " kilometers per hour = " + kilometersPerHourToMilesPerHour + " miles per hour.");
    double reverseKilometersPerHourToMilesPerHour = kilometersPerHourToMilesPerHour * 1.609;
    String roundedReverseKilometersPerHourToMilesPerHour = String.format("%.2f",reverseKilometersPerHourToMilesPerHour);
        System.out.println(kilometersPerHourToMilesPerHour + " miles per hour = " + roundedReverseKilometersPerHourToMilesPerHour + " kilometers per hour.");
    }
}
