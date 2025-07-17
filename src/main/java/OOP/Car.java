package OOP;

import java.util.Locale;
import java.util.Scanner;

public class Car {

    // attribute define
    public String model;
    public int year;
    public double base_price;
    public String color;

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

    public String toString() {
        return "I'm a " + this.model + ", year " + this.year + ", color of " + this.color + ", base price of "
 +this.base_price;
    }

    public double getColorRate() {

        double colorRate = 0.0;

        if (this.color.toLowerCase().equals("white")) {
            colorRate += 0.10;
        } else if (this.color.toLowerCase().equals("silver")) {
            colorRate += 0.15;
        } else if (this.color.toLowerCase().equals("blue")) {
            colorRate += 0.20;
        } else if (this.color.toLowerCase().equals("red")) {
            colorRate += 0.25;
        }

        return colorRate;
    }

    public double getFinalPrice(double tax_rate) {
        return (1 + tax_rate) * this.base_price * (1 + getColorRate());
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Car myCar = new Car(); // create an instance

        System.out.println("Enter car details:");

        System.out.print("Model: ");
        myCar.model = scnr.nextLine();

        System.out.print("Year: ");
        myCar.year = scnr.nextInt();

        System.out.print("Color: ");
        myCar.color = scnr.next();

        System.out.print("Base Price: ");
        myCar.base_price = scnr.nextDouble();

        System.out.println(myCar);

        System.out.printf("The final price for the car: $%.2f%n", myCar.getFinalPrice(0.08));

    }
}

