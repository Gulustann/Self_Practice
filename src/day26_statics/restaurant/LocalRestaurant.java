package day26_statics.restaurant;

import java.time.LocalDate;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("Mehmet Tahmisoglu", "Old Irving Park", 5);

        Server s1 = new Server("Sare", 001, 23.5, true, LocalDate.of(2020, 04, 05));
        Server s2 = new Server("Mahmut", 002, 15.5, false, LocalDate.of(2018, 9, 25));
        Server s3 = new Server("Fatma", 003, 18.5, true, LocalDate.of(2022, 01, 23));
        Server s4 = new Server("Gul", 004, 16.0, true, LocalDate.of(2015, 11, 12));

        Server[] servers = {s1, s2, s3, s4};


        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

       r1.hireServers(servers);
       r1.hireChefs(chefs);

        System.out.println(r1);
        for (Chef eachChef : chefs) {
            System.out.println(eachChef.name +" : " + eachChef.hourlyRate);
        }
        System.out.println("_____________________________________");
        for (Server eachServer : servers) {
            System.out.println(eachServer.name+ " : " + eachServer.hourlyRate);
        }


        /*
        Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information


         */
    }
}
