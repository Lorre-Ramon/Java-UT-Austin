package Inheritance.Assignment_5;

public abstract class Payment {

    /**
     * If an abstract class only has abstract methods, it can be replaced with an interface.
     */

    // Attributes
    double amount;
    String currency;

    // Constructor
    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract boolean processPayment();

    public abstract void printProcessingMessage();

    /**
     * Hook up Method:
     * A method in the parent class that calls other methods, some of which may be abstract and implemented in subclasses.
     */

    public void paymentSummary() {
        this.printProcessingMessage();
        if (this.processPayment()) {
            System.out.printf("Payment approved.%nAmount: %.1f USD%n", this.amount);
        } else {
            System.out.printf("Payment declined. Amount exceeds limit.%nAmount: %.1f USD%n", this.amount);
        }

    }

}
