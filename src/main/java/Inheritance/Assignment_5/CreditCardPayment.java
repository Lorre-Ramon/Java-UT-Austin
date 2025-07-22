package Inheritance.Assignment_5;

public class CreditCardPayment extends Payment {

    // Attributes
    String cardNumber;
    String cardHolderName;
    String expiryDate;

    // Constructor
    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    // Method
    public boolean processPayment() {
        return this.amount < 5000;
    }

    public void printProcessingMessage() {
        System.out.printf("Processing payment of %.0f %s via Credit Card...%n",
                this.amount,
                this.currency);
    }
}
