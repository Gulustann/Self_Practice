package day31_inheritance.studentTask;

public class CydeoStudent extends Student{


    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
    }

    public void study() {
        System.out.println(getName()+" is a "+ getSchoolName()+" student and studies " + getFieldOfStudy());
    }
}
