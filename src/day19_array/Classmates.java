package day19_array;

public class Classmates {
    public static void main(String[] args) {

/*OTHER WAY: String [] classmates = {"Gulustan Tahmisoglu","Justin Bieber", "Billie Eilish", "Kanye West","Ariana Grande",
 "Travis Scott", "Dua Lipa", "Britney Spears", "Will Smith", "Jen Lopez"};
 */
        String[] classmates = new String[10];
        classmates[0] = "Gulustan Tahmisoglu";
        classmates[1]="Justin Bieber";
        classmates[2]="Billie Eilish";
        classmates[3]="Kanye West";
        classmates[4]="Ariana Grande";
        classmates[5]="Travis Scott";
        classmates[6]="Dua Lipa";
        classmates[7]="Britney Spears";
        classmates[8]="Will Smith";
        classmates[9]="Jen Lopez";
        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].toUpperCase().charAt(0) + "." +
                    classmates[i].toUpperCase().charAt(classmates[i].indexOf(" ")+1)+ ".");

        }






        /*
        create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

         */
    }
}
