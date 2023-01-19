package day31_inheritance.employeeTask;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, id, "Developer", salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding in "+ programmingLanguage);
    }

    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", companyName='" + getCompanyName() + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
