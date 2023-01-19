package day29_Inheritance.teacher;

public class Teacher {
    private String name;
    private char gender;
    private int age, id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='F' || gender=='M'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age cannot be negative");
            System.exit(1);
        }
        if(age>=18 && age<=65){
            this.age = age;
        }else{
            System.err.println("Age must be between 18-65");
            System.exit(1);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        if(salary<0){
            System.err.println("Invalid salary: " + salary+ " Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void teaching (){
        System.out.println(name + " is teaching");
    }

    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }










}
/*
3. Create a custom Class named Teacher
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				teching()
				toString(): prints teacher object info when the object is passed in the print statement

 */