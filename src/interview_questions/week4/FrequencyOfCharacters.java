package interview_questions.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDD";

        //1st way (best, shortest)

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each.charAt(0), frequency);
        }
        System.out.println(map);

        //2nd way

        System.out.println("_________________________________________________");

        String result = "";
        for (String each : str.split("")) {//String to array

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)) {
                result += each + frequency + " ";
            }
        }

        System.out.println(result);

        System.out.println("__________________________________________________");

        //3rd way
        String res = "";


        for (String each : str.split("")) {//String to array
            int count = 0;
            for (String element : str.split("")) {
                if (element.equals(each)) {// element == each==> DOES NOT WORK!!!!!!
                    count++;
                }
            }
            if (res.contains(each)) {
                continue;//skip if already in result
            }
            res += each+count+" ";
        }

        System.out.println(res);


        /*
        String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
    }
}
