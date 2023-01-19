package day14_forLoop;

import java.util.Scanner;

public class RetrieveDigitLetterSpecialCharc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write something to retrieve letters digits and special characters");
        String str = input.nextLine();
        input.close();

        String letters = "",
                numbers = "",
                characters = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
                letters += str.charAt(i);
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                numbers += str.charAt(i);
            } else {
                characters += str.charAt(i);
            }
        }

        System.out.println("letter: " + letters);
        System.out.println("numbers: " + numbers);
        System.out.println("characters: " + characters);

    }
}

/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */