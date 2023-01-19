package day09_swicthAndScanner;

import java.util.Scanner;

public class GradeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the score: ");

        int score = input.nextInt();
String result = (score >= 1 && score <= 100) ?
        (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F"
        : "Invalid Score";

        System.out.println(result);
 input.close();






/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */



    }
}
