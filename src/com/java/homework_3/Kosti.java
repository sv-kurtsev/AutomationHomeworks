package com.java.homework_3;

import java.util.Random;

public class Kosti {
    static int position;

    static int throwDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    static void startGame() {
        for (int i = 0; i < 5; i++) {
            position += throwDie();
            if (position == 20) {
                System.out.println("The current position is " + position + " - You win!");
                break;
            } else if (position > 20) {
                System.out.println("You lost");
                break;
            } else {
                System.out.print("The current position is " + position + ", ");
                if (i < 4) {
                    System.out.println(20 - position + " cells remains to win");
                } else {
                    System.out.println(20 - position + " cells remains, yo cannot throw a die again, you lost");
                }
            }
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}
