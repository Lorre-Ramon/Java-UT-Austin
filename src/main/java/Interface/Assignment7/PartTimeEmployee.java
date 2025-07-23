package Interface.Assignment7;

public class PartTimeEmployee implements Employee{

    // Attributes
    private String name;
    private String id;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Methods
    public double calculatePay() {
        return this.hourlyRate * this.hoursWorked;
    }

    public String getName() {
        return this.name;
    }

    public String getDetails() {
        return String.format("Part-Time - %s | ID: %s | Pay: $%.1f",
                this.name, this.id, this.calculatePay());
    }

}
