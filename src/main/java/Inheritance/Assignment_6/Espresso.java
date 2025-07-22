package Inheritance.Assignment_6;

public class Espresso extends Coffee{

    // Constructor
    public Espresso() {
        super("Espresso");
    }

    // Implement Method
    public void brew() {
        this.addComponents("Espresso Shot");

        if (this.isIced) {
            System.out.println("Espresso cannot be iced. Serving hot.");
            this.setIced("n");
        }

    }

    public double getBasePrice() {
        return 2.0;
    }

}
