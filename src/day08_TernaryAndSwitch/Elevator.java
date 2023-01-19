package day08_TernaryAndSwitch;

public class Elevator {
    public static void main(String[] args) {
        int floor = 5;
        String result = "Floor " + floor + " is selected. Companies: ";

        if (floor >= 1 && floor <= 3) {
            if (floor == 1) result += "Lobby, Verizon, Starbucks";
            if (floor == 2) result += "Cydeo, NASA, Intelsat";
            if (floor == 3) result += "Lyft, BofA, Stake house";
        } else {
            result = "Invalid floor - " + floor;
        }
        System.out.println(result);




        /*
        1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"

         */
    }
}
