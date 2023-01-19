package day22_arrayList;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
     String[] arr1 = {"A", "B", "C"};
     String[] arr2 = {"D", "E", "F", "G"};

     String[] arr3 = new String[arr1.length+ arr2.length];

     int k=0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(arr3));



        /*
        write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
    }
}
