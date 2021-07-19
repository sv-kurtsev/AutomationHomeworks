package com.java.homework_2;

public class ManagerSalary {
    void calculateSalary(int sells) {
        int salary = 1000;
        if (sells > 10) {
            salary += 250;
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        ManagerSalary newSalary = new ManagerSalary();
        newSalary.calculateSalary(11);
    }
}
