package day19_array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
//1. find out the first index number of "Gloves"

int glovesIndexNumber= items[2].indexOf('G');
        System.out.println("glovesIndexNumber = " + glovesIndexNumber);


// 2. find out if "iPad" is contained in the item list
String list =Arrays.toString(items); //List of items
        System.out.println("iPad is in the list: " + list.contains("iPad")); //boolean - if list contains "iPad"

// 3. Print the report of each shopping item name - price - #ID

        String result="";
        for (int i = 0; i < 5; i++) {
            result += "Item: " + items[i] + " Price: $" + prices[i] + " Item Number: " + itemIDs[i] + "\n";
        }
        System.out.println(result);



        /*
        Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */
    }
}
