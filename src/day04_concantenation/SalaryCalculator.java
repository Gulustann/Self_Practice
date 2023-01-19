package day04_concantenation;

public class SalaryCalculator {
    /*
    2. DeclarethefollowingVariables: 1. name
2. hourlyRate 3. weeklyHours
3. Write a program that can calculate the salary,and display the following info:
Hint: there are 52 weeks in a year
salary = hourlyRate * weeklyHours * 52
Ex:
given data:
name = “Joshua” hourlyRate = 40 weeklyHours = 45
output:
Hello Joshua, your salary is $ 93600

     */
    public static void main(String[] args) {
      String name = "Joshua";
      int hourlyRate = 40,
              weeklyHours = 45;

      int salary = hourlyRate * weeklyHours * 52;

        System.out.println("given data:");
        System.out.println("\tname = " + name);
        System.out.println("\thourlyRate = " + hourlyRate);
        System.out.println("\tweeklyHours = " + weeklyHours);

        System.out.println("output:");
        System.out.println("\tHello " + name + ", " + "your salary is $ " + salary);














    }


}
