package OOP;

import java.sql.SQLOutput;

public class Car {

    // attribute define
    private String model;
    private int year;
    private double base_price;
    private String color;

    // constructor define
    public Car() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Car(String model, int year, double base_price, String color) {
        this.model = model;
        this.year = year;
        this.base_price = base_price;
        this.color = color;
    }

    // method define

    public void setBasePrice(double price) {
        this.base_price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFinalPrice(double tax_rate) {
        return (1 + tax_rate) * this.base_price;
    }

    public static void main(String[] args) {

        Car myCar = new Car(); // create an instance

        myCar.setModel("Corolla");
        myCar.setYear(2025);
        myCar.setBasePrice(24000);

        System.out.printf("The final price for the car: $%.2f%n", myCar.getFinalPrice(0.0825));

    }
}

