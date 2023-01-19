package day29_Inheritance.phoneTask;

public class Phone {
    private String brand, model, size;
    private double price;
    private String color;

    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setBrand(brand);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        if(brand==null){
            System.err.println("Add a brand name.");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isBlank() || brand.isEmpty()){
            System.err.println("Brand name cannot be blank or empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if(model==null){
            System.err.println("Add a modal.");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if(model.isBlank() || model.isEmpty()){
            System.err.println("Model cannot be blank or empty");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Prica cannot be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        if(color==null){
            System.err.println("Add a color");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if(color.isBlank() || color.isEmpty()){
            System.err.println("Color cannot be blank or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber){
    System.out.println("Calling "+ phoneNumber + "...");
}
public void text(long phoneNumber){
    System.out.println("texting to " + phoneNumber);
}

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

	2. Create a class named Samsung:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Samsung" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString(): prints samsung object info when the object is passed in the print statement

	3. Create a class named Nokia:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Nokia" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString(): prints nokia object info when the object is passed in the print statement

 */