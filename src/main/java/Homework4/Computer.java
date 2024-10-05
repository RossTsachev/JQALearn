package Homework4;

public class Computer {
    public int year;
    public double price;
    public String operationSystem;

    public Computer () {}

    public Computer (int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

     public int comparePrice(Computer compare) {
        return Double.compare(compare.price, this.price);
     }
}
