package com.java.homework_2;

public class Equation {
    void calculateEquation(int a, int b) {
        if (a != 0) {
            int x = -b / a;
            System.out.println(x);
        } else {
            System.out.println("Parameter a cannot be zero");
        }

    }

    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.calculateEquation(0, 6);
    }
}
