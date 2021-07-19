package com.java.homework_1.ipoteka;

public class Ipoteka {

    int husbandAge;
    int wifeAge;
    boolean fewerThan35;

    boolean calculateAge(int husbandAge, int wifeAge) {
        this.husbandAge = husbandAge;
        this.wifeAge = wifeAge;
        fewerThan35 = husbandAge < 35 && wifeAge < 35;
        return fewerThan35;

    }

    public static void main(String[] args) {
        Ipoteka result = new Ipoteka();
        System.out.println(result.calculateAge(34, 32));
    }
}


