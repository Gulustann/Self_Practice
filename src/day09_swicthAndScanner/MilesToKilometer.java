package day09_swicthAndScanner;

import java.util.Scanner;

public class MilesToKilometer {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter miles: ");

        int miles = input.nextInt();
        double milesToKm = miles * 1.60934 ;

        String result = miles + " miles equal to " + milesToKm + " kilometers";

        System.out.println(result);

        input.close();






        /*
        Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

         */
    }
}
