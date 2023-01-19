package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task8_MinAndMaxNumbers {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)); OR use loop:

        for (int each : numbers) {
            list.addAll(Arrays.asList(each)); //each number added to ArrayList
        }
        System.out.println("Max number is: " + Collections.max(list));
        System.out.println("Min number is: " + Collections.min(list));


        /*
        Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
         */
    }
}
