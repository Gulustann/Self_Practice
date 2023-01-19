package day36_polymorphism;

import day31_inheritance.employeeTask.*;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01",  110000,"QA"),
                new Developer("Lucy", 27, 'F', "A02",  128000, "Java","Java Developer"),
                new Tester("George", 28,'M', "A03",  120000,"SDET"),
                new Developer("Yulia", 23, 'F',"A04",  135000, "Software Developer","Python"),
                new Tester("Cihad", 30, 'M',"A05",  105000,"SDET"),
                new Developer("Gulistan",  26, 'F', "A06",  130000, "Web Developer","Python"),
                new Tester("Nora",  28, 'F', "A07",  120000,"QE"),
                new Driver("Aaron", 48, 'M', "D1",  90000,"Truck Driver"),
                new Driver("Bella", 32, 'F', "D12", 95000,"Truck Driver"),
                new Developer("Diana",  29, 'F', "A08", 140000, "Front-end Developer", "C#"),
                new Tester("Tatiana",  25, 'F',"A09",  130000,"SDET"),
                new Developer("Alena",  26, 'F',"A10",  150000, "Back-end Developer","Java"),
                new Tester("Timur",  29, 'M',"A11",  115000,"SDET"),
                new Teacher("James", 45,  'M', "B1",  75000,"Math Teacher"),
                new Developer("Hasan",  26, 'F', "A12",  142000, "Full Stack Developer","Java"),
                new Tester("Nataliia",  24, 'F', "A13",  125000,"QE"),
                new Developer("Ermek",  26, 'M',"A14",  142000, "Full Stack Developer","Java"),
                new Tester("Khashayar",  30, 'M',"A15", 105000,"SDET"),
                new Teacher("Conor", 35,  'M', "B2",  85000,"Physics Teacher"),
        };
        ArrayList<Employee> scrumMembers = new ArrayList<>();
        for (Employee each : employees) {
            if(each instanceof Developer || each instanceof Tester){
                scrumMembers.add(each);
            }
        }
        System.out.println(scrumMembers);

        System.out.println("_________________________________________________________");

        ArrayList<Tester> testers = new ArrayList<>();

        for (Employee each : employees) {
            if(each instanceof Tester){
                testers.add((Tester) each);
            }
        }
        System.out.println(testers);
        System.out.println("_________________________________________________________");

        ArrayList<Developer> developers = new ArrayList<>();

        for (Employee each : employees) {
            if(each instanceof Developer){
                developers.add((Developer) each);
            }
        }
        System.out.println(developers);

        System.out.println("_________________________________________________________");
        double maxSalaryTester=0;
        String richestTester="";

        for (Employee each : employees) {
            if(each instanceof Tester && each.getSalary()>maxSalaryTester){
                maxSalaryTester=each.getSalary();
                richestTester= each.getName()+" "+ each.getCompanyName()+" "+each.getJobTitle();
            }
        }

        System.out.println("maxSalary = $" + maxSalaryTester+ " belongs to "+ richestTester);

        System.out.println("_________________________________________________________");
        double maxSalaryDev=0;
        String richestDev="";

        for (Employee each : employees) {
            if(each instanceof Developer && each.getSalary()>maxSalaryTester){
                maxSalaryDev=each.getSalary();
                richestDev= each.getName()+" "+ each.getCompanyName()+" "+each.getJobTitle();
            }
        }

        System.out.println("maxSalary = $" + maxSalaryDev+ " belongs to "+ richestDev);


/*
2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?

 */
    }
}
