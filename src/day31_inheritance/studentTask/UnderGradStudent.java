package day31_inheritance.studentTask;

public class UnderGradStudent extends Student{


    public UnderGradStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study() {
        System.out.println(getName()+" is an undergraduate student at "+ getSchoolName()+" and studies " + getFieldOfStudy());
    }
}
