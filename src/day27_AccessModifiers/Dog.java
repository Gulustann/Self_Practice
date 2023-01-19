package day27_AccessModifiers;

public class Dog {
  public String breed, size;
  public char gender;
  public int age;
  public String color;

  public static int numberOfLegs;
  public static int numbOfEyes;
  public static int numberOfWings;

  public boolean isFriendly;

  static{
      numberOfLegs = 4;
      numbOfEyes = 2;
      numberOfWings = 0;
  }

    public Dog(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }
    public static void eat(){
        System.out.println("Eats dog food");
    }
    public static void drink(){
        System.out.println("Drinks water");
    }
    public static void sleep(){
        System.out.println("Sleeps");
    }
    public static void play(){
        System.out.println("Sleeps");
    }
    public static void bark(){
        System.out.println("Barks");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }

    /*
    Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
     */
}
