package interview_questions.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){//LinkedHasSet==> no duplicate, insertion order
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(str.split("")));
        str = String.join("", set1);//ABC
       // str= set1.toString();//[A, B, C]
        return str;
    }

    public static String removeDuplicates2(String str){
        String result="";
        for (String each : str.split("")) {
            if(result.contains(each)){//if result contains each
                continue;//skip
            }else{//otherwise
                result += each;//add to result
            }
        }
        return result;

    }


    public static void main(String[] args) {
        String str = "AAABBBCCCDEEEFFFFFFF";
        System.out.println(removeDuplicates(str));

        System.out.println(removeDuplicates2(str));





        /*
        String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
         */
    }
}
