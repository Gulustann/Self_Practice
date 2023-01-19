package day25_dateTimeFormattingConstructor;

public class Carpet {
public int width, length, unitPrice;
public boolean isPersion;

    public Carpet(int width, int length, int unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
    }
  public double calcCost(){
        if (isPersion == true){
            return (width*length*unitPrice) + 200;
        }
        return width*length*unitPrice;
  }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersion=" + isPersion +
                '}';
    }
}
/*
1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */