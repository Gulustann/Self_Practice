package day26_statics.restaurant;

import java.time.LocalDate;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public LocalDate hireDate;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime, LocalDate hireDate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hireDate = hireDate;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public Server(String name, int employeeID, double hourlyRate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
    }

    public Server(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public Server(String name) {
        this.name = name;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning tables");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + ((isFullTime == true) ? "full-time" : "part-time") +
                ", hireDate=" + hireDate +
                '}';
    }
}
/*4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
*/
