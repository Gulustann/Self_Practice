package day15_loopContinue;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter positive number");
        int num1 = sc.nextInt();

        System.out.println("Please enter another positive number");
        int num2 = sc.nextInt();
        int result = 0;


        if (num1 > 0 && num2 > 0 && num1 > num2) {


            while ((num1 > num2)) {
                num1 -= num2;
                result ++;

            }

        } else {
            System.err.println("invalid numbers");
        }

        System.out.println(result);





        /*
        Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers
         without using / (division) and * (multiplication) operators.

         */
    }
}
