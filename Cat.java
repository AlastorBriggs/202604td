/*******************************************************************
 * Name: Tevin Donegan
 * Date: May 10, 2026
 * Assignment: SDC230 Performance Assessment - Inheritance & Overriding
 *
 * Description:
 * Subclass representing a Cat that extends the Animal class
 * and overrides the printAnimal function.
 *******************************************************************/

public class Cat extends Animal {

    // Class property
    private String Name;

    // Constructor
    public Cat(String type, int age, String name) {

        super(type, age);

        Name = name;
    }

    // Getter method
    public String getName() {

        return Name;
    }

    // Setter method
    public void setName(String name) {

        Name = name;
    }

    // Override superclass function
    @Override
    public void printAnimal() {

        System.out.printf(
                "Cat Type: %s%nAge: %d%nName: %s%n%n",
                getType(),
                getAge(),
                Name);
    }
}