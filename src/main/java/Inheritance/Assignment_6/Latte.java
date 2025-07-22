package Inheritance.Assignment_6;

public class Latte extends Coffee{

    public Latte() {
        super("Latte");
    }

    // Implement Method
    public void brew() {
        this.addComponents("Espresso Shot");
        this.addComponents("Milk");

        if (this.isIced) {
            this.addComponents("Ice");
        }

    }

    public double getBasePrice() {
        return 3.0;
    }

}
