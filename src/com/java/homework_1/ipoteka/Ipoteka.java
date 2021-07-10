package com.java.homework_1.ipoteka;

public class Ipoteka {

    public static void main(String[] args) {
        int husbandAge = 30;
        int wifeAge = 25;
        boolean fewerThan35 = false;
        if (husbandAge < 35 && wifeAge < 35) {
            fewerThan35 = true;
            System.out.println("A husband and a wife are younger than 35 years old.");
            System.out.println(fewerThan35);
        } else {
            fewerThan35 = false;
            System.out.println("Somebody of them is 35 or older.");
            System.out.println(fewerThan35);
        }
    }

}
