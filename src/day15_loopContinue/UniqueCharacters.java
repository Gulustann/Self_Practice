package day15_loopContinue;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to find unique characters");
        String str = sc.nextLine(),
                unique = "";
        sc.close();
        char character = ' ';

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);

            if (str.indexOf(character) == str.lastIndexOf(character)) {
                unique += character + " ";
            }
        }
        System.out.println("Unique characters are: " + unique);





        /*
        Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique

         */
    }
}
