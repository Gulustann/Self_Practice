package day42_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] scoreJosh = {78,95,68,74,55};

        Map<String, int[]> studentsOfMap = new LinkedHashMap<>();

        studentsOfMap.put("Josh", scoreJosh);
        studentsOfMap.put("Nora", new int[]{80, 85, 90, 67, 67});
        studentsOfMap.put("Amy", new int[]{87, 71, 85, 81, 54});
        studentsOfMap.put("Nate", new int[]{95, 98, 81, 73, 60});
        studentsOfMap.put("Aron", new int[]{56, 67, 78, 90, 95});

        for (Map.Entry<String, int[]> eachSet : studentsOfMap.entrySet()) {
            System.out.println(eachSet.getKey()+" : "+ Arrays.toString(eachSet.getValue()));
        }






     /*
     Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

      */
    }
}
