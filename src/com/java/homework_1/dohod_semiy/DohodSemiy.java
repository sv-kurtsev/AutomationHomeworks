package com.java.homework_1.dohod_semiy;

public class DohodSemiy {
    int dohod;
    int minValue;
    int maxValue;
    boolean result;
    boolean calculateIpoteka(int dohod, int minValue, int maxValue) {
        this.dohod = dohod;
        this.minValue = minValue;
        this.maxValue = maxValue;
        result = dohod > minValue && dohod < maxValue;
        return result;
    }
    public static void main(String[] args) {
        DohodSemiy ipoteka = new DohodSemiy();
        System.out.println(ipoteka.calculateIpoteka(30_000, 20_000, 50_000));
    }
}
