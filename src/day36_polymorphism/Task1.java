package day36_polymorphism;

import day34_interface.carTask.Audi;
import day34_interface.carTask.Car;
import day34_interface.carTask.Honda;
import day34_interface.carTask.Tesla;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000,"White"),
                new Audi("Q6", 2014, 32000,"Red"),
                new Honda("Accord", 2011, 20000,"White"  ),
                new Audi("Q4",  2015, 33000,"Blue"),
                new Audi("A7", 2019, 35000,"Black"),
                new Audi("Q8", 2018, 40000,"White"),
                new Audi("Q5", 2009, 30000,"Purple"),
                new Audi("A4",  2011, 30000,"Black"),
                new Honda("Civic", 2018, 30000,"Red"),
                new Honda("CR-V",  2012, 23000,"Red"),
                new Honda("HR-V", 2019, 35000,"Blue"),
                new Tesla("Model 3", 2015, 45000,"White"),
                new Tesla("Model Y",  2017, 65000,"Black"),
                new Tesla("Model X", 2016, 48000,"White"),
                new Tesla("Model X", 2014, 48000,"Blue"),
        };

        for (Car each : cars) {
            if(each instanceof Honda){
                if((each.getYear()>=2010) && (each.getYear()<=2011)){
                    System.out.println(each.getMake()+" "+each.getModel()+" "+each.getYear()+ " is eligible for recall");
                }
            }
            if(each instanceof Audi){
                if((each.getYear()>=2015) && (each.getYear()<=2019)){
                    System.out.println(each.getMake()+" "+each.getModel()+" "+each.getYear()+ " is eligible for recall");
                }
            }
            if(each instanceof Tesla){
                if((each.getYear()>=2015) && (each.getYear()<=2016)){
                    System.out.println(each.getMake()+" "+each.getModel()+" "+each.getYear()+ " is eligible for recall");
                }
            }
        }
        System.out.println("_________________________________________________________");
        double mostExpensiveCar=0;
        String car="";
        for (Car each : cars) {
            if(each.getPrice()>mostExpensiveCar){
                mostExpensiveCar= each.getPrice();
                car=each.getYear()+" "+each.getMake()+" "+each.getModel();
            }
        }
        System.out.println("mostExpensiveCar = $" + mostExpensiveCar+ " "+ car);

        System.out.println("_________________________________________________________");
        double lowestPriceCar=cars[0].getPrice();
        String cheapestCar="";

        for (Car each : cars) {
           if(each.getPrice()<lowestPriceCar){
               lowestPriceCar=each.getPrice();
               cheapestCar= each.getYear()+" "+each.getMake()+" "+each.getModel();
           }
        }
        System.out.println("Cheapest car is : $"+lowestPriceCar+" "+ cheapestCar);

        System.out.println("_________________________________________________________");

        ArrayList<Car> teslaCars = new ArrayList<>();

        for (Car each : cars) {
            if(each instanceof Tesla){
                teslaCars.add(each);
            }
        }
        System.out.println(teslaCars);

        /*
        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
         */






    }
}
