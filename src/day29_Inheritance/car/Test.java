package day29_Inheritance.car;

public class Test {
    public static void main(String[] args) {
     Mercedes m1= new Mercedes();

    m1.setInfo( "A4", 2022, "Beige", 4521);
        System.out.println(m1);


        Audi audi = new Audi();
        audi.setInfo("A5", 2022, "Purple", 125000);
        System.out.println(audi);



    }
}
