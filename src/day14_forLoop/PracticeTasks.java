package day14_forLoop;

import java.util.Scanner;
//write a program that can ask the user enter a number for five times, print the max number
public class PracticeTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter a number");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }

        }
        System.out.println("max = " + max);

        System.out.println("________________________________________________________");
//write a program that can ask the user enter a number for five times, print the max number
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int number = input.nextInt();
            if (number < min) {
                min = number;
            }
        }
            System.out.println("min = " + min);

input.close();
        }

}

