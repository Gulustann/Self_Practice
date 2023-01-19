package day30_Inheritance.deviceTask;

public class Iphone extends Phone{
    public Iphone(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" is face timing with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is face timing with " + email);
    }
}
