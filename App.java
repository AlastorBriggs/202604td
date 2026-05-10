/*******************************************************************
 * Name: Tevin Donegan
 * Date: May 10, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 *
 * Description:
 * Main application class that demonstrates inheritance and
 * overriding using Animal and Cat classes.
 *******************************************************************/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) throws Exception {

        // Print header line
        System.out.println(
                "Tevin Donegan - Week 5 PA Inheritance and Overriding");

        // Display current date and time
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        System.out.println(
                "Current Date and Time: " + now.format(format));

        System.out.println();

        // Create instances of Animal and Cat
        Animal animal = new Animal("Dog", 4);

        Cat cat = new Cat("Cat", 4, "Whiskers");

        // Print original properties
        animal.printAnimal();

        cat.printAnimal();

        // Update object properties
        animal.setType("Bird");

        animal.setAge(2);

        cat.setType("Tiger");

        cat.setAge(6);

        cat.setName("Shadow");

        // Print updated properties
        animal.printAnimal();

        cat.printAnimal();
    }
}