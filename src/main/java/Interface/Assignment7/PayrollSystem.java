package Interface.Assignment7;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class PayrollSystem {

    public static void main(String[] args) {

        // Instantiate the employee list
        List<Employee> myEmployees = new ArrayList<Employee>();

        Employee daisy = new PartTimeEmployee("Daisy",
                "PT2002", 8, 300);
        myEmployees.add(daisy);

        Employee ethan = new FullTimeEmployee("Ethan",
                "FT1002", 267);
        myEmployees.add(ethan);

        Employee alice = new FullTimeEmployee("Alice",
                "FT1001", 334);
        myEmployees.add(alice);

        Employee bob = new PartTimeEmployee("Bob",
                "PT2001", 5, 600);
        myEmployees.add(bob);

        Employee charlie = new CommissionEmployee("Charlie",
                "CM3001", 100, 46000, 0.05);
        myEmployees.add(charlie);

        // Displays the name, type, and computed pay for each employee
        System.out.println("== Employee Details ==");
        for (Employee emp : myEmployees) {
            System.out.println(emp.getDetails());
        }

        // Calculates and prints the total payroll
        double totalPayroll = 0;
        for (Employee emp : myEmployees) {
            totalPayroll += emp.calculatePay();
        }
        System.out.printf("%nTotal Payroll: $%.1f%n%n", totalPayroll);

        // Filters and displays all employees with pay greater than $3000
        System.out.println("== High Earners (>$3000) ==");
        for (Employee emp : myEmployees) {
            if (emp.calculatePay() > 3000) {
                System.out.println(emp.getDetails());
            }
        }

        // Sorts and prints employees by name alphabetically
        System.out.println();
        System.out.println("== Sorted by Name ==");

        myEmployees.sort(Comparator.comparing(Employee::getName));
        for (Employee emp : myEmployees) {
            System.out.println(emp.getDetails());
        }

    }
}
