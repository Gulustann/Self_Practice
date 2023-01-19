package day09_swicthAndScanner;

import java.util.Scanner;

public class PeopleLiveTogether {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int numOfPeople = input.nextInt();

        String result = (numOfPeople<3)? "Live with less than 3 people" :(numOfPeople<=6)? "Live with 3 - 6 people" :
                "Live with more than 6 people";
        System.out.println(result);

input.close();






/*
 Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
    }
}
