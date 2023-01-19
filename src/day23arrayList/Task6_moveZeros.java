package day23arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6_moveZeros {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int countZeros = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

/* MUHTAR's solution:
 ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int countZeros = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

 */





        /*

         */
    }
}