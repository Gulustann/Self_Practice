package day28_Encapsulation.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Ulker", 2, 3, false);
        Candy candy2 = new Candy("Godiva", 5, 4, false);
        Candy candy3 = new Candy("Eti", 1, 2, true);
        Candy candy4 = new Candy("ABC", 8, 7, false);
        Candy candy5 = new Candy("CandyCane", 6, 4.5, true);

        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList());
        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy eachCandy : candies) {
            System.out.println(eachCandy.getBrand() + " : " + eachCandy.getPrice()+"$");
        }

    }
}
