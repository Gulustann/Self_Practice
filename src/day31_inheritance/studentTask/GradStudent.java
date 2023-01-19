package day31_inheritance.studentTask;

public class GradStudent extends Student{


    public GradStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study() {
        System.out.println(getName()+" is a graduate student at "+ getSchoolName()+" and studies " + getFieldOfStudy());
    }
}
