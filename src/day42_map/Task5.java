package day42_map;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group3 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group4 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));
//Create map that has integer as keys and List of Strings as values.
//        	add the group number and students name of that group as a pair to the map

        Map<Integer, List<String>> groups = new LinkedHashMap<>();//no duplicates, insertion order, accept null
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        System.out.println(Arrays.asList(groups.values()));
        /*
        [[[Duygu, Magda, Farangez, Edison, Kerem, Farangis], [Margie, Vesele, Iryn, Nilufar, Aziza,
        Nurcan, Raika, Igor, Elif, Sana, Azamat], [Alex, Ali, Andriy, Cassandra, Sevgul, Olha, Tito,
        Ozan, Serkan, Furkan, Madina, Muharrem], [Maria, Kristina, Amin, George, Layan, Amin, Yulia,
        George, Ayanle, Maxim, Nermin, Doughlas], [Nazar, Veronika, Mikael, Layla, Badmaa, Zaeir, Anna,
         Tamara, Eugene]]]
         */

        System.out.println("_____________________________________________________");

        for (Map.Entry<Integer, List<String>> eachSet : groups.entrySet()) {
            System.out.println(eachSet.getValue());
        }

/*
[Duygu, Magda, Farangez, Edison, Kerem, Farangis]
[Margie, Vesele, Iryn, Nilufar, Aziza, Nurcan, Raika, Igor, Elif, Sana, Azamat]
[Alex, Ali, Andriy, Cassandra, Sevgul, Olha, Tito, Ozan, Serkan, Furkan, Madina, Muharrem]
[Maria, Kristina, Amin, George, Layan, Amin, Yulia, George, Ayanle, Maxim, Nermin, Doughlas]
[Nazar, Veronika, Mikael, Layla, Badmaa, Zaeir, Anna, Tamara, Eugene]
 */






    }
}
/*
3. Given the following lists that conatin the names of the students from each group:
		List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));

        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));

        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));

        List<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));

        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        3.1 Create map that has integer as keys and List of Strings as values.
        	add the group number and students name of that group as a pair to the map

    	3.2 Write a program that can display student names of the each group in 5 separate lines

 */