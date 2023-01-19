package day11_string;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = input.nextLine();

        System.out.println("Enter your second word");
        String word2 = input.nextLine();
input.close();
        char word1LastLetter = word1.toLowerCase().charAt(word1.length() - 1);
        char word2FirstLetter = word2.toLowerCase().charAt(0);

        if (word1LastLetter == word2FirstLetter) {
            System.out.println(word1 + word2.substring(1));
        } else {
            System.out.println(word1 + word2);
        }

        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
    }
}
