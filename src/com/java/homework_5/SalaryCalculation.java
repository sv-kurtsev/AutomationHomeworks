package com.java.homework_5;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1 = new SalesAgentSalary(161, 10);
        SalesAgentSalary agent2 = new SalesAgentSalary(180, 20, 5, 30, 5000);
        System.out.println(agent1.getSalary());
        System.out.println(agent2.getSalary());
    }
}
