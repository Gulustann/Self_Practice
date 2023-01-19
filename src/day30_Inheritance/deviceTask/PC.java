package day30_Inheritance.deviceTask;

public class PC extends Computer{
   private String personalOrWorkPC;
   private String desktopOrLapTop;

    public PC(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, String OS, boolean hasTouchScreen, boolean fingerPrintReader, String personalOrWorkPC, String desktopOrLapTop) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, OS, hasTouchScreen, fingerPrintReader);
        setPersonalOrWorkPC(personalOrWorkPC);
        setDesktopOrLapTop(desktopOrLapTop);
    }

    public String getPersonalOrWorkPC() {
        return personalOrWorkPC;
    }

    public void setPersonalOrWorkPC(String personalOrWorkPC) {
        if(personalOrWorkPC.equalsIgnoreCase("personal") || personalOrWorkPC.equalsIgnoreCase("work")){
            this.personalOrWorkPC = personalOrWorkPC;
        }else{
            System.err.println("Invalid entry");
            System.exit(1);
        }


    }

    public void getDesktopOrLapTop() {
       this.desktopOrLapTop=desktopOrLapTop;
    }

    public void setDesktopOrLapTop(String desktopOrLapTop) {
        if(desktopOrLapTop.equalsIgnoreCase("desktop") || desktopOrLapTop.equalsIgnoreCase("laptop")){
            this.desktopOrLapTop = desktopOrLapTop;
        }else{
            System.err.println("Invalid entry");
            System.exit(1);
        }

    }
}
