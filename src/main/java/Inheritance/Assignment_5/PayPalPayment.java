package Inheritance.Assignment_5;

public class PayPalPayment extends Payment{

    // Attributes
    String email;
    String password;

    // Constructor
    public PayPalPayment(double amount, String currency, String email, String password) {
        super(amount, currency);
        this.email = email;
        this.password = password;
    }

    // Method
    @Override
    public boolean processPayment() {
        return this.amount < 10000;
    }

    public void printProcessingMessage() {
        System.out.printf("Processing payment of %.0f %s via PayPal...%n",
                this.amount,
                this.currency);
    }
}
