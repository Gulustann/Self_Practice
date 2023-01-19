package allPracticeTestSolutions;

import java.util.Scanner;

public class FirstCharUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName =sc.next();
        sc.close();
        firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter you last name");
        String lastName = sc.next();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+ lastName);






        /*
        Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

         */
    }
}
