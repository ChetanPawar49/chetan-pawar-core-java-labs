package com.chetan.lab4.ex3;

public class Exercise3 {

    public static void main(String[] args) {

        Book book = new Book(101, "Java Programming", 5, "James Gosling");

        JournalPaper journal = new JournalPaper(102, "AI Research", 3, "John Smith", 2024);

        Video video = new Video(103, "Inception", 4, 148, "Christopher Nolan", "Sci-Fi", 2010);

        CD cd = new CD(104, "Greatest Hits", 6, 60, "Michael Jackson", "Pop");

        System.out.println("----- Library Items -----");

        book.print();
        journal.print();
        video.print();
        cd.print();

        System.out.println("\n----- Checkout Book -----");
        book.checkOut();
        book.print();

        System.out.println("\n----- Checkin Book -----");
        book.checkIn();
        book.print();

        System.out.println("\n----- Add Copies -----");
        cd.addItem(5);
        cd.print();
    }
}
