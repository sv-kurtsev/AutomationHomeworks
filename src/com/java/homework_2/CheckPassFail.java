package com.java.homework_2;

public class CheckPassFail {
    void checkPassFail(int mark) {
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    public static void main(String[] args) {
        CheckPassFail newCheck = new CheckPassFail();
        newCheck.checkPassFail(50);
    }
}
