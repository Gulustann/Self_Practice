package day16_nestedLoop;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius, diameter, area;
       String yesOrNo = "yes";

        do{
            System.out.println("What is the radius of a circle?");
            radius =sc.nextDouble();
         if(radius<=0){
             break;
         }else{
             System.out.println("Diameter of circle: " + (2*radius)+
                     "\nArea of circle: " + (3.14*radius*radius)+
                     "\nPerimeter of circle: " + (2*3.14*radius));
         }
            System.out.println("Would you like to calculate another circle? Yes/No");
         yesOrNo = sc.next();
         if(yesOrNo.equalsIgnoreCase("no")){
             System.out.println("Thank you for using Cydeo Circle Calculator APP");
         }else{
             while(!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
                 System.out.println("Invalid entry! Would you like to calculate another circle? Yes/No");
                 yesOrNo=sc.next();
             }
         }
        }while (yesOrNo.equalsIgnoreCase("yes"));
sc.close();




        /*Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program*/
    }
}
