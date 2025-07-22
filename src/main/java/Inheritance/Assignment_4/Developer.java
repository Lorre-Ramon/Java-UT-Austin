package Inheritance.Assignment_4;

public class Developer extends Employee{

    // Attributes
    String programmingLanguage;
    boolean worksRemotely;

    // Constructor
    public Developer(String name, int id, double baseSalary, String pgmLanguage, boolean worksRemotely) {
        super(name, id, baseSalary);

        this.programmingLanguage = pgmLanguage;
        this.worksRemotely = worksRemotely;
    }

    // Method
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("Programming Language: %s Remote: %b%n",
                this.programmingLanguage,
                this.worksRemotely);
        System.out.printf("Annual Salary: $%.1f%n", calculateAnnualSalary());
        System.out.println();
    }

//    public double calculateAnnualSalary() {
//
//    }


}
