package day31_inheritance.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String id, double salary, String companyName) {
        super(name, age, gender, id, "Driver", salary, companyName);
    }

    public void work() {
        System.out.println(getName()+" is driving");
    }
}
