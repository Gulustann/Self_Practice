package day14_forLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write something");
        String str = input.nextLine();
        input.close();

        int sumOfNumbers = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
sumOfNumbers += str.charAt(i)-48;
            }
        }


        System.out.println(sumOfNumbers);


    }
}
        /*
        Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
         */

