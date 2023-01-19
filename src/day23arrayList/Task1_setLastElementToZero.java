package day23arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_setLastElementToZero {
    public static void main(String[] args) {

        /* int[] numbers ={1,2,3,4,5};
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int each : numbers) {
           list1.addAll(Arrays.asList(each)) ;
        }
        System.out.println(list1);//[1, 2, 3, 4, 5]
        */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5)) ;
        list.set(list.toArray().length-1, 0); //list converted to array to get length-1 for the
                                                // last index #
        System.out.println(list);






        /*
         write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];

         */
    }
}
