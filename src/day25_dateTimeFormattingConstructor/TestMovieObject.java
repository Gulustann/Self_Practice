package day25_dateTimeFormattingConstructor;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObject {
    public static void main(String[] args) {
Movie m1 = new Movie("USA", "Java Developer: Zero to Hero", LocalDate.of(2021,04,18), "Kuzzat Altay");
//m1.addCast("Ozzy");
       String [] castList = {"Ozzy", "Ali", "Muhtar", "Huseyin", "Jenny", "Kozim", "Aliye", "Oscar"};
        m1.addCast(castList);
        System.out.println(m1);

        System.out.println(m1.cast.toString());
        System.out.println(Arrays.toString(castList));

Movie m2 = new Movie("Turkey", "abd", LocalDate.of(2022, 05, 4), "Kozim");

        System.out.println(m2);
        m2.addCast("Kozim");
        System.out.println(m2);
        System.out.println(m2.cast);

    }
}