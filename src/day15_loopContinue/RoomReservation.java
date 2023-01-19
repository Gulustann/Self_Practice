package day15_loopContinue;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int kingBed = 120,
                queenBed = 100,
                singleBed = 80;
        String answer= "";
        String roomType= "";

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Would you like to reserve a room?");
            answer=sc.next();

            while(answer.equalsIgnoreCase("yes")){
                System.out.println("Which type of room would you like to reserve?");
                roomType=sc.next();
                if(roomType.equalsIgnoreCase("king")){
                    System.out.println("King bed is $" + kingBed);
                    return;
                }else if(roomType.equalsIgnoreCase("queen")){
                    System.out.println("Queen bed is $" + queenBed);
                    return;
                }else if(roomType.equalsIgnoreCase("single")){
                    System.out.println("Single bed is $" + singleBed);
                    return;
                }else {
                    System.out.println("Invalid entry. Please re-enter room type");
                }

            }if(answer.equalsIgnoreCase("no")){
                System.out.println("Have a nice day!");
            }

        }
sc.close();








        /*

	8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

         */
    }
}
