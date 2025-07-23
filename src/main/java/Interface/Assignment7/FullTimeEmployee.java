package Interface.Assignment7;

public class FullTimeEmployee implements Employee{

    // Attributes
    private String name;
    private String id;
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, String id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    // Methods
    public double calculatePay() {
        return monthlySalary * 12;
    }

    public String getDetails() {
        return String.format("Full-Time - %s | ID: %s | Pay: $%.1f",
                this.name, this.id, this.calculatePay());
    }

    public String getName() {
        return this.name;
    }
}
