/**
 * Name: Tevin Donegan
 * Date: May 9, 2026
 * Assignment: SDC230 Performance Assessment - Classes
 * Description:
 * The Employee class stores employee information
 * including first name, last name, and monthly salary.
 * The class includes constructors, getters, and setters.
 */

public class Employee {

    // Private instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;

        // Only set salary if >= 1000
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter for monthly salary
    public void setMonthlySalary(double monthlySalary) {

        // Only set salary if >= 1000
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        }
    }
}