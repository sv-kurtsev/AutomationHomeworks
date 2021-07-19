package com.java.homework_2;

public class FingerNumber {
    void defineFinger(int fingerNumber) {
        switch (fingerNumber) {
            case (1):
                System.out.println(fingerNumber + " - Bolshoy");
                break;
            case (2):
                System.out.println(fingerNumber + " - Ykazatelnyi");
                break;
            case (3):
                System.out.println(fingerNumber + " - Sredniy");
                break;
            case (4):
                System.out.println(fingerNumber + " - Bezimyanniy");
                break;
            case (5):
                System.out.println(fingerNumber + " - Mizinets");
                break;
            default:
                System.out.println("Enter a valid number!");
        }
    }

    public static void main(String[] args) {
        FingerNumber fingerNumber = new FingerNumber();
        fingerNumber.defineFinger(1);
    }
}
