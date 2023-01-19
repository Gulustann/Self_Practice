package day09_swicthAndScanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        double area= radius * radius * 3.14;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area of the circle is: " + area +
                "\nPerimeter of the circle is: " + perimeter);

input.close();






/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */





    }
}
