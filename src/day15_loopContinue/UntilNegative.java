package day15_loopContinue;

import java.util.Enumeration;
import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        while (num >= 0) {
            sum += num;

            System.out.println("Enter a number");
            num = input.nextInt();
        }

        System.out.println(sum);
input.close();




        /*
        Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user
        until user enters a negative number.
         */
    }
}
