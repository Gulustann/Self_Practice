package day30_Inheritance.bookTask;

import java.time.LocalTime;

public class TestBookObject {
    public static void main(String[] args) {
    EBook ebook = new EBook("Rich Dad Poor Dad", "Horror", "David Bell", 39.99, "small", 85);

    AudioBook audio = new AudioBook("Litte Things", "Adventure", "Kate Williams", 36.5, LocalTime.of(1, 23), "Chack Norries");

    ebook.readBook();

        System.out.println(ebook);
        System.out.println(audio);




    }
}
