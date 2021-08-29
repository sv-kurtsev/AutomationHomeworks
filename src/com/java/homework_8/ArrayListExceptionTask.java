package com.java.homework_8;

import com.java.homework_7.task_1.Book;

import java.util.ArrayList;

public class ArrayListExceptionTask {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(100, "Вий", "hard", 300));
        books.add(new Book(130, "Fahrenhet 911", "soft", 170));
        books.add(new Book(500, "Java for beginners", "soft", 800));
        books.add(new Book(300, "Football in details", "soft", 280));
        books.add(new Book(80, "Dracula", "hard", 350));
        try {
            Book fifthBook = books.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You are trying to reach an unexisting element");
        }
    }
}
