package Inheritance.Assignment_5;

public class Main {

    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(3000, "USD", "1234-5678-9012-3456", "John Doe", "12/25"),
            new PayPalPayment(7000, "USD", "asjdf@outlook.com", "password123"),
            new CreditCardPayment(6000, "USD", "1234-5678-9012-3456", "John Doe", "12/25")
        };

        for (Payment pymt : payments) {
            pymt.paymentSummary();
            System.out.println();
        }
    }
}
