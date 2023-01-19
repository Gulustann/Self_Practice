package day31_inheritance.employeeTask;

public class Employee {
private String name;
private int age;
private char gender;
private String id, jobTitle;
private double salary;
private String companyName;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            System.err.println("Age cannot be zero, negative or less than 18");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M' || gender=='F'){
            this.gender = gender;
        }else{
            System.err.println("Incorrect entry");
            System.exit(1);
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("Salary cannot be zero or below zero");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
1. Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()


 */