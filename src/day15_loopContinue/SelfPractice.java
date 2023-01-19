package day15_loopContinue;

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a repeating string");
        String str = input.next();
        String result ="";
input.close();
        for (int i = 0; i < str.length(); i++) {
            char characters = str.charAt(i);
            if(!result.contains(""+characters)){
                result +=characters;
            }
        }
        System.out.println(result);
        /*Write a program that can remove the duplicated characters from  a string

        Ex:
        str = "aabbbcccc"

        output:
        abc*/


    }
    public static void abd(){
        System.out.println("hello");
    }
}
