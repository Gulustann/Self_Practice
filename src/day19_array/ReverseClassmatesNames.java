package day19_array;

public class ReverseClassmatesNames {
    public static void main(String[] args) {

        String [] classmates = {"Gulustan Tahmisoglu","Justin Bieber", "Billie Eilish", "Kanye West","Ariana Grande",
                "Travis Scott", "Dua Lipa", "Britney Spears", "Will Smith", "Jen Lopez"};

        for (int i = 0; i < classmates.length; i++) {
            String reversedName="";
            for (int j = classmates[i].length()-1; j >=0 ; j--) {
                reversedName+= classmates[i].charAt(j);
            }
            System.out.println(reversedName);
        }










        /*
        create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */
    }
}
