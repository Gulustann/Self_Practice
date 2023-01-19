package day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 50;
        char grade = 'A';

        while (score >= 0 && score <= 100) {

            System.out.println("Enter your score");
            score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.exit(1);
            }
            grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
            System.out.println(grade + "\nWould you like to continue?");
            String respond = sc.next();
            if (respond.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            } else if (!respond.equalsIgnoreCase("yes")){
                System.err.println("Invalid Entry");
                System.exit(1);
            }
        }
sc.close();
        /*
        Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program

         */
    }
}
