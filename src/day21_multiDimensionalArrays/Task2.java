package day21_multiDimensionalArrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] each1DItemGroup : items) { //each 1D group (String array) indexOfItem: 0-lastIndex

            String eachWord = "";
            for (String eachElement : each1DItemGroup) { //eachElement added to eachWord (String) with tab space between each element
                eachWord += eachElement + "\t";
            }
            System.out.println(eachWord); //prints as String (not array) each group in separate line and tab between elements
        }
        /*Apple	Banana	Grape	Avocado
        Paper Towels	Toilet Papers	Tissues	Diapers
        Coke	Fanta	Arizona Tea	Pepsi	Water	*/
        System.out.println("_________________________________");

        for (String[] each1D : items) {//1D from index 0-2. Group is forward from index 0 - lastIndexOfItem
            String eachWord = "";
            for (int i = each1D.length - 1; i >= 0; i--) {//order of element from the group is reversed
                                            //lastIndexOf1D - 0
                eachWord += each1D[i] + "\t"; //reversed order of each element added to eachWord String w/"\t"
            }
            System.out.println(eachWord);
        }
        /*Avocado	Grape	Banana	Apple
        Diapers	Tissues	Toilet Papers	Paper Towels
        Water	Pepsi	Arizona Tea	Fanta	Coke*/
        System.out.println("_________________________________");

        for (int i = items.length - 1; i >= 0; i--) { //Group order is reversed from index: lastIndexOfItem - 0
            String[] reverse1D = items[i];

            String eachWord = "";
            for (String eachElement : reverse1D) {
                eachWord += eachElement + "\t";
            }
            System.out.println(eachWord);
        }
/*Coke	Fanta	Arizona Tea	Pepsi	Water
Paper Towels	Toilet Papers	Tissues	Diapers
Apple	Banana	Grape	Avocado	*/





        /*
         Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

         */
    }
}
