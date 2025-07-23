package Interface.Assignment7;

public class CommissionEmployee implements Employee{

    // Attributes
    private String name;
    private String id;
    private double baseSalary;
    private double totalSales;
    private double commissionRate;

    // Constructor
    public CommissionEmployee(String name, String id, double baseSalary, double totalSales, double commissionRate) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    // Methods
    public double calculatePay() {
        return this.baseSalary * 12 + (this.totalSales * this.commissionRate);
    }

    public String getName() {
        return this.name;
    }

    public String getDetails() {
        return String.format("Commission - %s | ID: %s | Pay: $%.1f",
                this.name, this.id, this.calculatePay());
    }

}
