package day34_interface.carTask;

public class CydeoCar extends Car implements AutoPilot, Flyable{
    public CydeoCar(String model, int year, double price, String color) {
        super("Cydeo Car", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Use voice control to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving Tesla "+ getModel()+" is pricey");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has auto pilot feature");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+ getModel()+" can fly");
    }

}
