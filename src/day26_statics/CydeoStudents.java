package day26_statics;

public class CydeoStudents {
public String name;
public int age;
public char gender;
public int batchNumber;
public String groupNumber;

public static String schoolName = "Cydeo";
public static  String magicWord = "Java";

    public CydeoStudents(String name, int age, char gender, int batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " studies too much!");
    }
    public void attendClass(){
        System.out.println(name + " attendance is more than 95%");
    }

    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }
    public static void programmingLanguage(){
        System.out.println(schoolName+" uses " + magicWord + " as programming language." );
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
    /*
    Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

     */
}
