package day04_concantenation;

public class EmployeeInfo {
    /*

1. name
2. age
3. gender
4. company_name 5. jobTitle
6. salary
3. Use concatenation to display the full info of the employee:
Ex:
given data:
name = “Daniel”
age = 28
gender = “Male” company_name = “Google Inc” job_title = ”Software Developer" salary = 90000
output:
Daniel is 28 years old, gender is Male.
Daniel works at Google Inc as a Software Developer. Daniel makes $ 90000 per year.
     */
    public static void main(String[] args) {
    String name = "Daniel",
            gender = "Male",
    company_name = "Google Inc",
    jobTitle = "Software Developer";

    int age = 28,
            salary = 90000;

        System.out.println("given data:\n\t");
        System.out.println("\tname = " + name);
        System.out.println("\tage = " + age);
        System.out.println("\tgender = " + gender);
        System.out.println("\tcompany_name = " + company_name);
        System.out.println("\tjobTitle = " + jobTitle);
        System.out.println("\tsalary = " + salary);
        System.out.println("output:\n");
        System.out.println("\t" + name + " is " + age + " years old, gender is "  + gender + "." + "\n\t" + name +
                " works at " + company_name + " as a " + jobTitle + "." + "\n\t" + name + " makes $ " + salary + " per year.");











    }
}
