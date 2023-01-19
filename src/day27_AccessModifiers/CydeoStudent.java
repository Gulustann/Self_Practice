package day27_AccessModifiers;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public String groupNumber;

    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, String groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    public static void printSchoolName() {
        System.out.println("School name: " + schoolName);
    }

    public static void printScretCode() {
        System.out.println("Secret code: " + secretCode);
    }

    public void attendClass() {
        System.out.println(name + " attendance is more than 90%");
    }

    public void study() {
        System.out.println(name + " studies more than 8 hours per day");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber='" + groupNumber + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    /*
    2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
     */
}
