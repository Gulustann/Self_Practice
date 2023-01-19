package day42_map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        String[] group1 = {"Mehmet", "Gulustan", "Sare", "Almina"};
        String[] group2 = {"Semih", "Burcu", "Yaman", "Efe"};
        String[] group3 = {"Halil", "Elif", "Omer", "Mehmet", "Zeynep"};
        String[] group4 = {"Aliya", "Kazim","Huseyin","Jen","Liam"};
        String[] group5 = {"Caglar", "Ozlem", "Emir"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        System.out.println(Arrays.asList(groups.get(1)));
        System.out.println("____________________________________________________");

//4.3 Display the names of each student from each groups

        for (String[] eachGroup : groups.values()) {
            System.out.println(Arrays.asList(eachGroup));
        }



    }
}
/*
4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]>   = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups

 */