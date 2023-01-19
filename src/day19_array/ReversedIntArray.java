package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversedIntArray {
    public static void main(String[] args) {
       int[]  array = {1,2,3,4,5};  //index:0-4
        int[] reversed= new int[array.length];
        for (int i = array.length - 1, k=0; i >= 0; i--, k++) {
            reversed [k] += array[i];
        }
        System.out.println(Arrays.toString(reversed));




        /*
        Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */
    }
}
