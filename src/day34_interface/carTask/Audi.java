package day34_interface.carTask;

public class Audi extends Car implements AutoPark{
    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving Audi "+getModel()+" feels so good");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }
}
