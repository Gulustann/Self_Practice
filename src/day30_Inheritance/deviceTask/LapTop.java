package day30_Inheritance.deviceTask;

public class LapTop extends PC{
   private static boolean hasTouchPad= true;

    public LapTop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String OS, boolean hasTouchScreen, boolean fingerPrintReader, String personalOrWorkPC, String desktopOrLapTop) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, OS, hasTouchScreen, fingerPrintReader, personalOrWorkPC, desktopOrLapTop);
    }

    public static boolean isHasTouchPad() {
        return hasTouchPad;
    }

    public static void setHasTouchPad(boolean hasTouchPad) {
        LapTop.hasTouchPad = hasTouchPad;
    }
}
