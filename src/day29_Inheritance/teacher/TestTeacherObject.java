package day29_Inheritance.teacher;

public class TestTeacherObject {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setInfo("Sare", 'F', 25, 412563, "Java Teacher", 210000);
        System.out.println(t1.getSalary());




    }
}
