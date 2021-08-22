package com.java.homework_7.task_2;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {
    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String studentName : namesOfStudents) {
            if (firstTest.get(studentName) > secondTest.get(studentName)) {
                gradeBookMap.put(studentName, firstTest.get(studentName));
            } else {
                gradeBookMap.put(studentName, secondTest.get(studentName));
            }
            System.out.println(studentName + " " + gradeBookMap.get(studentName));
        }
    }
}
