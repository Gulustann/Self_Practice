package day25_dateTimeFormattingConstructor;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public int pizzaQuantity;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping, int pizzaQuantity) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.pizzaQuantity = pizzaQuantity;
    }


    public int calcCost() {
        int cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost = 10 + (2 * (numberOfCheeseTopping+numberOfPepperoniTopping));
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12 + (2 * (numberOfCheeseTopping+numberOfPepperoniTopping));
        } else {
            cost= 14+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));
        }
        return cost*pizzaQuantity;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}









/*
  size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */