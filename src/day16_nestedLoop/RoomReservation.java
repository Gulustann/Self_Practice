package day16_nestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String yesOrNo = "", roomType = "";
        double king = 120,
                queen = 100,
                single = 80;


        int numberOfNight = 1;
        /*
        while(!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
            System.out.println("Would you like to reserve a room?");
            yesOrNo = sc.next();

        if(yesOrNo.equalsIgnoreCase("no")){
            return;
        }else if(yesOrNo.equalsIgnoreCase("yes")) {

            do {

                System.out.println("Which room would you like to reserve?");
                roomType = sc.next();

                if (roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("queen") ||
                        roomType.equalsIgnoreCase("single")) {
                    if (roomType.equalsIgnoreCase("king")) {
                        System.out.println("How may night would you like to stay?");
                        numberOfNight = sc.nextInt();
                        System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * king));
                    } else if (roomType.equalsIgnoreCase("queen")) {
                        System.out.println("How may night would you like to stay?");
                        numberOfNight = sc.nextInt();
                        System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * queen));
                    } else {
                        System.out.println("How may night would you like to stay?");
                        numberOfNight = sc.nextInt();
                        System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * single));
                    }
                    System.out.println("Would you like to reserve a room?");
                    roomType = sc.next();
                }
                while (!(roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("queen") ||
                        roomType.equalsIgnoreCase("single"))) {
                    System.out.println("Invalid entry. Which room would you like to reserve?");
                    roomType= sc.next();

                }


            } while (roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("queen") ||
                    roomType.equalsIgnoreCase("single"));


        } else{
            System.out.println("invalid entry. Would you like to reserve a room?");
            yesOrNo=sc.next();
        }

        }*/

        System.out.println("______________________________________");

     /*   System.out.println("Would you like to reserve a room?");
        yesOrNo = sc.next();

        if (yesOrNo.equalsIgnoreCase("no")) {
            return;
        } else if (yesOrNo.equalsIgnoreCase("yes")){

            while (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.println("Which room would you like to reserve?");
                roomType = sc.next();

                if (roomType.equalsIgnoreCase("king")) {
                    System.out.println("How may night would you like to stay?");
                    numberOfNight = sc.nextInt();
                    System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * king));
                } else if (roomType.equalsIgnoreCase("queen")) {
                    System.out.println("How may night would you like to stay?");
                    numberOfNight = sc.nextInt();
                    System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * queen));
                } else if (roomType.equalsIgnoreCase("single") || roomType.equalsIgnoreCase("single bed")) {
                    System.out.println("How may night would you like to stay?");
                    numberOfNight = sc.nextInt();
                    System.out.println("Price for " + numberOfNight + " night(s) is $" + (numberOfNight * single));
                } else {
                    while (!(roomType.equalsIgnoreCase("king") || roomType.equalsIgnoreCase("queen") ||
                            roomType.equalsIgnoreCase("single"))) {
                        System.out.println("Invalid entry. Please re-enter room type.");
                        roomType = sc.nextLine();
                    }
                }
                System.out.println("Would you like to reserve another room?");
                yesOrNo = sc.next();
                if (yesOrNo.equalsIgnoreCase("no")) {
                    return;
                }
            }
        }
        while (!(yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("yes"))) {
            System.out.println("Invalid entry. Would you like to reserve a room?");
            yesOrNo = sc.next();

        }


*/





        /*
        Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

         */
    }
}
