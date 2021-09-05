package com.java.homework_9;

import java.util.Arrays;
import java.util.List;

public class WordInUpperCase {
    public static String afterFellInUpperCase(String inputString) {
        String previousWord = "feel";
        String[] wordsArray = inputString.split("\s");
        List<String> listOfStrings = Arrays.asList(wordsArray);
        int expectedWordIndex = (listOfStrings.indexOf(previousWord)) + 1;
        return wordsArray[expectedWordIndex].toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(afterFellInUpperCase("Get a modern feel with a smudge-resistant only for \n" +
                "$2.50, you can finish now"));
    }
}
