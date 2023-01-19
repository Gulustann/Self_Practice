package day09_swicthAndScanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter a match operator");
        char mathOperator = input.next().charAt(0);

        double result = 0; //temporary result. Will be replaced.

        if (mathOperator== '+' || mathOperator=='-' || mathOperator=='/' || mathOperator=='*'){
            System.out.println("Enter your second number");
            double num2 = input.nextDouble();
            if(mathOperator=='+'){
                result= num1+num2;
            } else if(mathOperator=='-'){
                result = num1-num2;
            }else if(mathOperator=='*'){
                result = num1*num2;
            }else{
                result=num1/num2;
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid entry");
        }

input.close();





        /*
        Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
         */
    }
}
