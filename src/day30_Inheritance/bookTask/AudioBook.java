package day30_Inheritance.bookTask;

import java.time.LocalTime;

public class AudioBook extends Book{
    private LocalTime length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price, LocalTime length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        if (length.equals(0)) {
            System.err.println("Length of the book cannot be zero or below zero");
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
