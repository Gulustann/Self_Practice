package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_insert {
   public static ArrayList<Integer> insert(int[] arr, int index, int newElement) {
    ArrayList<Integer> list = new ArrayList<>(); //new ArrayList created to be able use add method
       for (int i = 0; i < arr.length; i++) {
           list.addAll(Arrays.asList(arr[i])); //each array elements added to arrayList
       }
list.add(index, newElement); //new element added to specified index number using add method
return list;
   }
    public static ArrayList<Character> insert(char[] arr, int index, char newElement) {
        ArrayList<Character> list = new ArrayList<>();
        for (char i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }
    public static ArrayList<String> insert(String[] arr, int index, String newElement) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }
    public static ArrayList<Double> insert(Double[] arr, int index, Double newElement) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));
        }
        list.add(index, newElement);
        return list;
    }

    /*
    3. Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
        the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array


     */
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","a", "b", "c"} ; //ARRAY
        System.out.println(Arrays.toString(arr));


        System.out.println(insert(arr, 3, "gulustan"));




    }
}
