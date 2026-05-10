/**
 * Tevin Donegan
 * May 10, 2026
 * SDC230 Performance Assessment - Smallest Number
 *
 * This program asks the user how many integers they want to enter,
 * accepts the integers using a loop, and determines the smallest
 * number entered by the user.
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Print heading
        System.out.println("Tevin Donegan - Week 2 PA Smallest Number");

        // Ask user how many integers they will enter
        System.out.print("How many integers will you enter? ");
        int count = input.nextInt();

        // Variable to store the smallest number
        int smallest = 0;

        // Loop to get integers from the user
        for (int i = 1; i <= count; i++) {

            System.out.print("Enter integer #" + i + ": ");
            int number = input.nextInt();

            // First number becomes the smallest
            if (i == 1) {
                smallest = number;
            }
            // Check if current number is smaller
            else if (number < smallest) {
                smallest = number;
            }
        }

        // Print the smallest integer entered
        System.out.println("The smallest integer entered is: " + smallest);

        input.close();
    }
}