package day34_interface.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    protected void start() {
        System.out.println("Twist the ket to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    protected void drive() {
        System.out.println("Driving "+ getMake()+" "+getModel()+" is luxury");
    }
}
