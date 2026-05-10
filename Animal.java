/*******************************************************************
 * Name: Tevin Donegan
 * Date: May 10, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 *
 * Description:
 * Superclass representing a generic Animal.
 *******************************************************************/

public class Animal {

    // Class properties
    private String Type;

    private int Age;

    // Constructor
    public Animal(String type, int age) {

        Type = type;

        Age = age;
    }

    // Getter methods
    public String getType() {

        return Type;
    }

    public int getAge() {

        return Age;
    }

    // Setter methods
    public void setType(String type) {

        Type = type;
    }

    public void setAge(int age) {

        Age = age;
    }

    // Print animal information
    public void printAnimal() {

        System.out.printf(
                "Animal Type: %s%nAge: %d%n%n",
                Type,
                Age);
    }
}