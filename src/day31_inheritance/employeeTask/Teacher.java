package day31_inheritance.employeeTask;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, String id, double salary, String companyName) {
        super(name, age, gender, id, "Teacher", salary, companyName);
    }

    public void work() {
        System.out.println(getName()+" is teaching");
    }
}
