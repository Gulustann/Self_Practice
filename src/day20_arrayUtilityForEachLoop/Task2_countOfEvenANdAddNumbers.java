package day20_arrayUtilityForEachLoop;

public class Task2_countOfEvenANdAddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 22};

        int oddNumber = 0;
        int evenNumbers = 0;

        for (int each : numbers) { //each number
            if (each % 2 == 0) { //if division by 2 equals to zero == even
                evenNumbers++; //evenNumber increases by 1
            } else { //odd number
                oddNumber++;
            }
        }

        System.out.println("Count of even numbers: " + evenNumbers +
                "\nCount of odd numbers: " + oddNumber);



        /*
         Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
         */
    }
}
