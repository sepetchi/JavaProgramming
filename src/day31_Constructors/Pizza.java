package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calculateCost() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        return totalPrice;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calculateCost()+
                '}';
    }
}
