package allPracticeTestSolutions;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = sc.next();
        sc.close();

        if(word.startsWith("x") || word.startsWith("X")){
            System.out.println(word.replace(word.charAt(0), 'a'));
        }









        /*
        Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
    }
}
