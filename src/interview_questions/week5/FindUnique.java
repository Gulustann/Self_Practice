package interview_questions.week5;

import java.util.*;

public class FindUnique {
    public static String uniqueCharacters(String str) {
        String unique = "";

        for (String each1 : str.split("")) {
            int count = 0;
            for (String each2 : str.split("")) {
                if (each1.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += each1;
            }
        }
        return unique;
    }


    /*
    Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(uniqueCharacters(str));

        System.out.println("_____________________2nd WAY-EASIER_________________________________");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p-> Collections.frequency(list, p)>1);
        System.out.println(list);



    }
}
