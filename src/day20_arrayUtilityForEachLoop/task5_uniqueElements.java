package day20_arrayUtilityForEachLoop;

public class task5_uniqueElements {
    public static void main(String[] args) {

        String[] str = {"hello", "java", "hello", "how", "are", "you", "java"};

        String unique = "";

        for (String each : str) { //each element of str
            int count = 0;
            for (String second : str) { //going over second time to compare each other
                if (each.equals(second)) { // if elements exist more than one,
                    count++; //count increases by 1
                }
            }
            if (count == 1) { // if count is one which means unique
                unique += each+" "; //that element added to unique String
            }
        }
        System.out.println(unique);







        /*
        5. Write a program that can display the unique elements of an array

			MUST use for each loops


         */
    }
}
