package day27_AccessModifiers;

public class IPhone {
    public static String brand;
    public String model, size, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "USA";
    }

    public IPhone(String mode, String size, String color, double price) {
        this.model = mode;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public static void printOS() {
        System.out.println("OS is: " + OS);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling.." + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting to: " + phoneNumber);
    }

    public void faceTime(long phoneNumber) {
        System.out.println("Facetime with " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("Facetime with " + email);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
