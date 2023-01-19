package day29_Inheritance.developer;

public class Developer {
    private String name;
    private char gender;
    private int age, id;
    private String jobTitle;
    private double salary;
    private String programmingLanguage;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, String programmingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgrammingLanguage(programmingLanguage);
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage=="Java" || programmingLanguage=="JavaScript" || programmingLanguage=="Python" ||
        programmingLanguage=="Ruby" || programmingLanguage=="C#" || programmingLanguage=="C++" ||
        programmingLanguage=="Swift"){
            this.programmingLanguage = programmingLanguage;
        }else{
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

}
/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
 */