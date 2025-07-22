package Inheritance.Assignment_6;

import java.util.ArrayList;

public abstract class Coffee {

    // Attributes
    public String name;
    public ArrayList<String> ingredients = new ArrayList<>();
    protected String size;
    protected boolean isIced;
    protected int shots;

    // Constructor
    public Coffee(String name) {
        this.name = name;
    }

    public void setIced(String iced) {
        if (iced.equalsIgnoreCase("y")) {
            this.isIced = true;
        } else {
            this.isIced = true;
        }
    }

    public void setSize(String size) {
        switch (size.toLowerCase()) {
            case "tall":
            case "grande":
            case "venti":
                this.size = size.toLowerCase();
                break;
            default:
                System.out.println("Invalid size. Setting to 'grande' by default.");
                this.size = "grande";
                break;
        }
    }

    public void setShots(int shots) {
        if (shots > 0 && shots <= 3) {
            this.shots = shots;
        } else {
            System.out.println("Invalid number of shots. Setting to 1 by default.");
            this.shots = 1;
        }
    }

    public void addCondiment(String condiment) {
        switch (condiment.toLowerCase()) {
            case "milk":
            case "sugar":
                this.addComponents(condiment.toLowerCase());
                break;
            default:
                System.out.println("Invalid condiment.");
                break;
        }
    }

    // Abstract Method
    public abstract void brew(); // brewing process are different

    public abstract double getBasePrice(); // price are different

    // Method
    public double getSizePriceAddition() {
        switch (this.size.toLowerCase()) {
            case "tall":
                return 0.0;
            case "grande":
                return 1.0;
            case "venti":
                return 2.0;
            default:
                return 0.0;
        }
    }

    public double getShotPriceAddition() {
        return (this.shots - 1) * 0.5; // assuming first shot is included in base price
    }

    public String getTmpStatus() {
        return this.isIced ? "Iced" : "Hot";
    }

    public void addComponents(String ingredient) {
        ingredients.add(ingredient.substring(0, 1).toUpperCase() + ingredient.substring(1).toLowerCase());
    }

    public void printPrice() {
        System.out.printf("The price for your coffee is %.2f%n", this.getBasePrice() + this.getSizePriceAddition() + getShotPriceAddition());
    }

    public void serve() {
        System.out.printf("Serving %s %s %s...%n", this.getTmpStatus(), this.size, this.name);
        System.out.println("Ingredients: " + String.join(", ", ingredients));
    }

}
