package day15_loopContinue;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = "",
                married = "",
                accidentsOrClaims = "",
                fullCoverageOrLiability = "",
                antiTheftDevice = "";

        int mileage = 1,
                age = -1;

        double priceForLiability = 0,
                priceForFullCoverage = 0;

        System.out.println("Enter your name");
        String name = sc.nextLine();

        while (!(gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m"))) {
            System.out.println("Enter your gender. F/M");
            gender = sc.next();
        }
        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))) {
            System.out.println("Are you married? Yes/No");
            married = sc.next();
        }

        while (!(age >= 0 && age <= 120)) {
            System.out.println("How old are you?");
            age = sc.nextInt();
            if (age < 25) {
                priceForLiability = 90;

            } else {
                priceForLiability = 50;
            }
            if (age < 25) {
                priceForFullCoverage = 160;

            } else {
                priceForFullCoverage = 120;
            }

        }

        while (!(mileage >= 5)) {
            System.out.println("How many miles do you drive in a day?");
            mileage = sc.nextInt();

        }

        System.out.println("Do you want full coverage or liability insurance?");
        fullCoverageOrLiability = sc.next();
        if (fullCoverageOrLiability.equalsIgnoreCase("liability")) {

            if (mileage <= 10) {
                priceForLiability += 10;
            } else if (mileage > 10 && mileage < 50) {
                priceForLiability += 30;
            } else {
                priceForLiability += 50;
            }
        } else if (fullCoverageOrLiability.equalsIgnoreCase("full coverage")
        || fullCoverageOrLiability.equalsIgnoreCase("full")) {

            if (mileage <= 10) {
                priceForFullCoverage += 20;
            } else if (mileage > 10 && mileage < 50) {
                priceForFullCoverage += 40;
            } else {
                priceForFullCoverage += 70;

            }
        }
        while (!(accidentsOrClaims.equalsIgnoreCase("yes") || accidentsOrClaims.equalsIgnoreCase("No"))) {
            System.out.println("Do you have any accidents or claims in past 5 years (Yes/No)");
            accidentsOrClaims = sc.next();

        }

        while (!(antiTheftDevice.equalsIgnoreCase("yes") || antiTheftDevice.equalsIgnoreCase("no"))) {
            System.out.println("Does your car have an anti-theft device (Yes/No");
            antiTheftDevice = sc.next();
            if (antiTheftDevice.equalsIgnoreCase("yes")) {
                priceForLiability -= priceForLiability * 0.05;
                priceForFullCoverage -= priceForFullCoverage * 0.05;
            }
        }
        //______________________________________//


        if (accidentsOrClaims.equalsIgnoreCase("yes")) {
            priceForLiability += priceForLiability * 0.15;
            priceForFullCoverage += priceForFullCoverage * 0.15;
        } else if(accidentsOrClaims.equalsIgnoreCase("no")){
            priceForLiability -= priceForLiability * 0.10;
            priceForFullCoverage -= priceForFullCoverage * 0.10;
        }


        if (married.equalsIgnoreCase("yes")) {
            priceForLiability *= 0.95;
            priceForFullCoverage *= 0.95;

            if(fullCoverageOrLiability.equalsIgnoreCase("liability")){
                System.out.println("Price for Liability: $" +priceForLiability);
            }else{
                System.out.println("Price for full coverage: $" + priceForFullCoverage);
            }








        /*
        Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount


         */
        }
    }
}

