package day11_string;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Split or no split?");
        String split = input.next().toLowerCase();


        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double totalToPay
                = input.nextDouble();

        System.out.println("Service quality");
        input.nextLine();
        String serviceQuality = input.nextLine().toLowerCase();

        input.close();

        double  totalTip = (serviceQuality.equals("excellent"))? totalToPay*0.25
                :(serviceQuality.equals("great"))? totalToPay*0.2
                :(serviceQuality.equals("good"))? totalToPay*0.15
                :(serviceQuality.equals("fair"))? totalToPay*0.10
                : totalToPay*0.05 ;

        double totalPerPerson = (totalToPay+totalTip)/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;

if(split.equals("yes")){
    System.out.println("Number of people: " + numberOfPeople);
    System.out.println("Total to pay: " + totalToPay);
    System.out.println("Total tip: " + totalTip);
    System.out.println("Total per person: "+ totalPerPerson) ;
    System.out.println("Tip per person: " + tipPerPerson);
}else{
    System.out.println("Number of people: " + numberOfPeople);
    System.out.println("Total to pay: " + totalToPay);
    System.out.println("Total tip: " + totalTip);
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
