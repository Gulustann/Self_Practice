package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2_replaceAllMatchingElementsMethod {
    //Replaces all matching element to new element
    public static ArrayList<Integer> replaceAllMatchingElement(int[] arr, int oldElement, int newElement) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.replaceAll(list, oldElement, newElement);
        return list;
    }
    public static ArrayList<String> replaceAllMatchingElement(String[] arr, String oldElement, String newElement) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.replaceAll(list, oldElement, newElement);
        return list;
    }
    public static ArrayList<Double> replaceAllMatchingElement(Double[] arr, Double oldElement, Double newElement) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.replaceAll(list, oldElement, newElement);
        return list;
    }

    public static ArrayList<Character> replaceAllMatchingElement(char[] arr, char oldElement, char newElement) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        Collections.replaceAll(list, oldElement, newElement);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};


        System.out.println(replaceAllMatchingElement(arr, 10, 3000));

String[] names = {"ayse", "fatma", "ayse", "hediye", "salim"};
        System.out.println(replaceAllMatchingElement(names, "ayse", "Gulustan"));


     char[] ch = {'a' , 'b', 'a', 'c'} ;
        System.out.println(replaceAllMatchingElement(ch, 'a', 'z'));

/*
ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer
        newElement. The method replaces all the element of the array that matching with the given old element with the
        given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays

 */

    }
}
