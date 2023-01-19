package day20_arrayUtilityForEachLoop;

import java.util.Arrays;

public class Task4_palindroms {
    public static void main(String[] args) {
        String[] array = {"anna", "level", "Java"};

        int count = 0;

        for (String each : array) { // each element: anna, level, Java
            String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i); //starting from end of each element's(reverse)
                                // each character (char) collected at reverse String
            }
            if(each.equals(reverse)){ //if each element equals to reverse
                count++; //count increases by 1
            }
        }

        System.out.println(count);



        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

         */
    }
}
