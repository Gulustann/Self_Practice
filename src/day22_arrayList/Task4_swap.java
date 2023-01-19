package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task4_swap {
    public static ArrayList<Integer> swap(int[] arr, int index1, int index2){
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<Double> swap(Double[] arr, int index1, int index2){
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<Character> swap(char[] arr, int index1, int index2){
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;
    }
    public static ArrayList<String> swap(String[] arr, int index1, int index2){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.swap(list, index1, index2);
        return list;

    }
    
    /*
    Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method
    swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array
     */

    public static void main(String[] args) {

String[] str= {"Gulustan", "Sare", "Almis", "Mehmet"};

        System.out.println(swap(str, 0, 2));






    }
}
