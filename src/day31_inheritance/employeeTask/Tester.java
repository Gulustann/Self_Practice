package day31_inheritance.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String id, double salary, String companyName) {
        super(name, age, gender, id, "Tester", salary, companyName);
    }

    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is testing");
    }
}
