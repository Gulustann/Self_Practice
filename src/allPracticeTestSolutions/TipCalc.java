package allPracticeTestSolutions;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Split or not");
        String split = sc.next();
        if (split.equalsIgnoreCase("yes")) {

            System.out.println("Enter the number of people");
            int numberOfPeople = sc.nextInt();


            System.out.println("Enter the check amount");
            double checkAmount = sc.nextDouble();

            System.out.println("Service quality?");
            String serviceQuality = sc.next();

            double checkAmountWTip = 0;
            if (serviceQuality.equals("Poor")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.05);
            } else if (serviceQuality.equals("Fair")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.1);
            } else if (serviceQuality.equals("Good")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.15);
            } else if (serviceQuality.equals("Great")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.20);
            } else {
                checkAmountWTip = checkAmount + (checkAmount * 0.25);
            }

            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total pay :" + checkAmountWTip);
            System.out.println("Total tip :" + (checkAmountWTip - checkAmount));
            System.out.println("Total per person :" + (checkAmountWTip / numberOfPeople));
            System.out.println("Tip per person (included to total) :" + (checkAmountWTip - checkAmount) / numberOfPeople);

        }else if(split.equalsIgnoreCase("no")){
            System.out.println("Enter the check amount");
            double checkAmount = sc.nextDouble();

            System.out.println("Service quality?");
            String serviceQuality = sc.next();

            double checkAmountWTip = 0;
            if (serviceQuality.equals("Poor")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.05);
            } else if (serviceQuality.equals("Fair")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.1);
            } else if (serviceQuality.equals("Good")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.15);
            } else if (serviceQuality.equals("Great")) {
                checkAmountWTip = checkAmount + (checkAmount * 0.20);
            } else {
                checkAmountWTip = checkAmount + (checkAmount * 0.25);
            }

            System.out.println("Total pay :" + checkAmountWTip);
            System.out.println("Total tip :" + (checkAmountWTip - checkAmount));
        }












        /*
         Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
         */
    }
}
