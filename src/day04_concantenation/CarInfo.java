package day04_concantenation;

public class CarInfo {
    /*
    2. Declarethefollowingvariables:
1. year 2. make
3. model 4. miles 5. color
6. Price
3. Useconcatenationtoprintthefullinfoofthecarinthe
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
     */
    public static void main(String[] args) {

        int year = 2018,
                miles = 50_000,
                price = 19_000;

        String make = "Toyota",
                model = "Camry",
                color = "Red";

        System.out.println("Car information is:\n\t" + year + " " + make + " " + model + ", " + miles + " miles, " +
                color + ", " + "$" + price);














    }
}
