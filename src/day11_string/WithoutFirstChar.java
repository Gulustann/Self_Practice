package day11_string;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first word");
        String first = input.nextLine();

        System.out.println("Enter you second word");
        String second = input.nextLine();
input.close();
        System.out.println(first.substring(1, first.length()) + second.substring(1, second.length()));
                                                 // length-1 +1 ==>last index#            //length-1 +1









        /*
        Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */
    }
}

