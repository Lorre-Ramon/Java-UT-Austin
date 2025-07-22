package Inheritance.Assignment_4;

public class Employee {

    // Attributes
    public String name;
    public int id;
    public double baseSalary;

    // Constructor
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    // Method
    public void displayDetails() {
        System.out.printf("Employee: %s ID: %d%nBase Salary: $%.1f%n",
                this.name,
                this.id,
                this.baseSalary);
    }

    public double calculateAnnualSalary() {
        return baseSalary * 12;
    }
}
