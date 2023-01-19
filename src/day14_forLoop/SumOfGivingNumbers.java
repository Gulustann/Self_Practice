package day14_forLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfGivingNumbers {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("What is your number");
int num = input.nextInt();
int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println(result
        );

        input.close();
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
}
}