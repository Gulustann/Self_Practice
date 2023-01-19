package day34_interface.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the ket to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+ getMake()+" "+ getModel()+" is smooth");
    }
}
