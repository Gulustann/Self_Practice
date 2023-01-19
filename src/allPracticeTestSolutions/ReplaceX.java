package allPracticeTestSolutions;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        sc.close();

        String word = sc.next();
        if(word.contains("x")){
            System.out.println(word.replace('x', 'a'));
            if(word.contains("X")){
                System.out.println(word.replace('X', 'a'));
            }
        }







        /*
        Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */
    }
}
