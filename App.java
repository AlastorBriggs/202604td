/**
 * Name: Tevin Donegan
 * Date: May 9, 2026
 * Assignment: SDC230 Performance Assessment - IO & Operators
 * Description:
 * This application demonstrates the use of input, output,
 * arithmetic operators, and comparison operators using
 * integer and floating-point values.
 */



public class App {

    public static void main(String[] args) {

        // Header
        System.out.println("Tevin Donegan - Week 1 PA Classes");
        System.out.println();

        // Create Employee objects
        Employee employee1 = new Employee("John", "Smith", 2500.00);
        Employee employee2 = new Employee("Mary", "Johnson", 500.00); // Invalid salary

        // Display original employee information
        System.out.println("Original Employee Information");
        System.out.println("-----------------------------");

        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Monthly Salary: $" + employee1.getMonthlySalary());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Monthly Salary: $" + employee2.getMonthlySalary());
        System.out.println();

        // Update employee information
        employee1.setLastName("Williams");
        employee2.setFirstName("Sarah");

        employee1.setMonthlySalary(3200.00);
        employee2.setMonthlySalary(2800.00);

        // Display updated employee information
        System.out.println("Updated Employee Information");
        System.out.println("----------------------------");

        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Monthly Salary: $" + employee1.getMonthlySalary());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Monthly Salary: $" + employee2.getMonthlySalary());
    }
}