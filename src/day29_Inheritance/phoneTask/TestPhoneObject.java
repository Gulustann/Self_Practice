package day29_Inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone();
        iPhone1.setInfo("Apple", "S12", "Medium", 1100, "Green");
        System.out.println(iPhone1);
        iPhone1.faceTime(773_569_87);
        iPhone1.faceTime("ghcdsui@hotmail.com");


        System.out.println("_________________________________________");

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "A3", "Large", 895, "White");
        System.out.println(samsung);
        samsung.freeze();

        System.out.println("_________________________________________");

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "Q1", "x-Large", 100, "Black");
        System.out.println(nokia);
        nokia.selfDefense();



    }
}
