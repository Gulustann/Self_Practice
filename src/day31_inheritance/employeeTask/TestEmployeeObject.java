package day31_inheritance.employeeTask;

public class TestEmployeeObject {
    public static void main(String[] args) {
       Tester tester= new Tester("Gulustan", 35, 'F', "A123", 150000, "Apple") ;

       Developer developer = new Developer("Mehmet", 42, 'M', "A122", 250000, "Google", "Java");

        Teacher teacher = new Teacher("Sare", 25, 'F', "A199", 175000, "Cydeo");

        Driver driver= new Driver("Ismail", 65, 'M', "A001", 300000, "Hayat");

        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);

        System.out.println("____________________________________________________________");

        tester.work();
        teacher.work();
        developer.work();
        driver.work();




    }
}
