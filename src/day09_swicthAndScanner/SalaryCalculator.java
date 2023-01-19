package day09_swicthAndScanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What si your hourly rate?");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours in a week do you work?");
        double hours = input.nextDouble();


        System.out.println("What is you state tax?");
        double stateTax = input.nextDouble();

        System.out.println("What is you federal tax?");
        double federalTax = input.nextDouble();

        double salary = hourlyRate * hours * 52;
        double stateTaxCalc = salary * stateTax;
        double federalTaxCalc = salary * federalTax;
        double totalTax = stateTaxCalc + federalTaxCalc;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTaxCalc = " + stateTaxCalc);
        System.out.println("federalTaxCalc = " + federalTaxCalc);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

input.close();










        /*
        Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */
    }
}
