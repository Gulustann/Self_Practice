package interview_questions.number_tasks;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIntEqualToTarget {
    public static void main(String[] args) {
       /* input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
        target = 9
        output: [1, 3]
        find the sum of 2 integer values equal
        to 9 and return there indexes*/

        int[] numbers ={1 , 2, 100, 7, 11, 15, 999 };

        int target =9;
        Map<Integer, Integer> sumMap= new HashMap<>();

        for(int i =0; i< numbers.length; i++){
            int sum = target - numbers[i];
            if(sumMap.containsKey(sum)){

              /*  return  new int[] {sumMap.get(sum), i};

            }else{

                sumMap.put(numbers[i], i);
            }
            return new int[] {};*/
                //SOLVE THIS PROBLEM
/*
public static int [] sumOfTarget(int [] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (current + arr[j] == target){
                    return new int [] {current, arr[j]};
                }
            }
        }
        return null;
    }

 */
                /*
                public static int[] findTwoNumbersWithSum9(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == 9) {
                return new int[] {i, j};
            }
        }
    }
    return new int[] {-1, -1};
}
                 */

        }
    }






}
}
