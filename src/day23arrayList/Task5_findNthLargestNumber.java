package day23arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5_findNthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 5;

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p); //????????? NO IDEA???????????
        }

        System.out.println(Collections.max(list));

        /*
         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int n = 5, min = 0;

        for (int i = 0; i < n; i++) {
            min = Collections.min(numbers);
            numbers.remove(Integer.valueOf(min));
        }

        System.out.println(n + "th max number is: " + min);

         */

        /*
        write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
         */
    }
}
