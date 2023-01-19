package allPracticeTestSolutions;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 words");
        String word1 = sc.next();
        String word2 = sc.next();
        sc.close();

        System.out.println(word1.substring(1)+word2.substring(1));


        /*
        Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */
    }
}
