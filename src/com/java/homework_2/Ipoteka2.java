package com.java.homework_2;

public class Ipoteka2 {
    void calculateIpoteka(int wifeAge, int husbandAge) {
        if (wifeAge < 35) {
            if (husbandAge < 35) {
                System.out.println("Ipoteka is available");
            } else {
                System.out.println("Ipoteka is not available");
            }
        } else {
            System.out.println("Ipoteka is not available");
        }
    }

    public static void main(String[] args) {
        Ipoteka2 newIpoteka = new Ipoteka2();
        newIpoteka.calculateIpoteka(34, 40);
    }
}
