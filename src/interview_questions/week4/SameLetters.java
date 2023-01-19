package interview_questions.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static boolean SameLetters(String str1, String str2) {
        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(list1);

        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);

        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        String str1 = "xyz", str2 = "zyx";
        System.out.println(SameLetters(str1, str2));//true

        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);//Collection ==> no need to reassign
        System.out.println(list2);//[x, y, z]
        /*
        String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
         */
    }
}
