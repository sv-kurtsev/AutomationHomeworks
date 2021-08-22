package com.java.homework_7.task_1;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(100, "Вий", "hard", 300));
        bookCollection.add(new Book(130, "Fahrenhet 911", "soft", 170));
        bookCollection.add(new Book(500, "Java for beginners", "soft", 800));
        bookCollection.add(new Book(300, "Football in details", "soft", 280));
        bookCollection.add(new Book(80, "Dracula", "hard", 350));
        bookCollection.add(new Book(70, "Advunteres of Tom Sawyer", "soft", 220));
        bookCollection.add(new Book(70, "Advantures of Hecklberry Finn", "soft", 240));
        bookCollection.add(new Book(90, "A crime and a punishment", "hard", 340));
        bookCollection.add(new Book(110, "The cherry garden", "hard", 180));
        bookCollection.add(new Book(210, "The war and peace", "hard", 730));
        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();
        for (Book book : bookCollection) {
            if (book.getCoverType().equals("soft")) {
                booksWithSoftCover.add(book);
            } else {
                booksWithHardCover.add(book);
            }
        }
        System.out.println("We have such books with soft cover:");
        for (Book book : booksWithSoftCover) {
            System.out.println(book.getTitle());
        }
        System.out.println("\nWe have such books with soft cover:");
        for (Book book : booksWithHardCover) {
            System.out.println(book.getTitle());
        }
    }
}
