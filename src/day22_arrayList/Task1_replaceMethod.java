package day22_arrayList;

import java.util.Arrays;

public class Task1_replaceMethod {

    public static int[] replace(int[] arr, int index, int newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static Double[] replace(Double[] arr, int index, Double newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static String[] replace(String[] arr, int index, String newElement){

        arr[index] = newElement;
        return  arr;
    }
    public static char[] replace(char[] arr, int index, char newElement){

        arr[index] = newElement;
        return  arr;
    }

    public static void main(String[] args) {

int[] array = {1,2,3,4,5,6};
array = replace(array, 1, 56);
        System.out.println(Arrays.toString(array));

        String[] str = {"ayse", "fatma", "mehmet", "josh"};
        str=replace(str, 1, "gulustan" );
        System.out.println(Arrays.toString(str));


        /*Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays


         */
    }
}
