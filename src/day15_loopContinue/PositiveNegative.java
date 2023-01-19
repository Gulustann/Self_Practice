package day15_loopContinue;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pos= "",  neg="";
      String result= "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
           result += input.nextInt() + " ";
            }

int numberOfNeg = result.length() - result.replaceAll("-", "").length();

        System.out.println( (5-numberOfNeg) + " positive and " + numberOfNeg + " negative");

input.close();

        /*
        Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print
        how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

         */
    }
}
