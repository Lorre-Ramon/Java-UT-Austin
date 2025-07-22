package Inheritance.Assignment_4;

public class Manager extends Employee{

    // Attributes
    double bonus;
    int teamSize;

    // Constructor
    public Manager(String name, int id, double baseSalary, double bonus, int teamSize) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.teamSize = teamSize;
    }

    // Method
    public double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + this.bonus;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Bonus: %.1f Team Size: %d%n",
                this.bonus,
                this.teamSize);
        System.out.printf("Annual Salary: $%.1f%n", calculateAnnualSalary());
        System.out.println();

    }



}
