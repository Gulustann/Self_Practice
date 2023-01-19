package day09_swicthAndScanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many total shares you have already?");
        int shares = input.nextInt();


        if (shares <= 0) System.out.println("Invalid value");
        else {
            System.out.println("How much your total value in the stock market is");
            int value = input.nextInt();
            if (value <= 0) {
                System.out.println("Invalid value");
            } else {

                System.out.println("Enter the name of the company you have the most shares in");
                input.nextLine(); // to clear out the memory
                String company = input.nextLine();

                System.out.println("Your total stock market holding is $" + (shares*value) +
                        " which is made up of " + shares + " shares. " + company + " is your company holdings");

            }
        }


input.close();





        /*
        Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

         */
    }
}
