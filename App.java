/*******************************************************************
 * Name: Tevin Donegan
 * Date: May 10, 2026
 * Assignment: SDC230 Performance Assessment - Account Balance Calculations
 *
 * Description:
 * This application asks the user for a starting account balance,
 * then allows the user to enter credits and debits until 0 is entered.
 * The program handles invalid input and throws a user-defined exception
 * if a debit would cause the account balance to become negative.
 * The current system date and time are also displayed.
 *******************************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                "Tevin Donegan - Week 4 PA Account Balance Calculations");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        System.out.println(
                "Current Date and Time: " + now.format(format));

        System.out.println();

        double balance = 0.0;
        boolean validStartingBalance = false;

        while (!validStartingBalance) {
            try {
                System.out.print("Enter the starting balance: ");
                balance = input.nextDouble();

                validStartingBalance = true;

            } catch (InputMismatchException e) {
                System.err.println("Exception: " + e);
                System.out.println("Error: Starting balance must be a number.");
                input.nextLine();
            }
        }

        boolean continueProgram = true;

        while (continueProgram) {
            try {
                System.out.print(
                        "Enter a credit or debit amount, or 0 to quit: ");

                double amount = input.nextDouble();

                if (amount == 0) {
                    continueProgram = false;
                } else if (amount < 0 && balance + amount < 0) {
                    throw new Exception(
                            "Transaction would cause account balance to go negative.");
                } else {
                    balance += amount;

                    System.out.printf(
                            "Updated account balance: $%.2f%n",
                            balance);
                }

            } catch (InputMismatchException e) {
                System.err.println("Exception: " + e);
                System.out.println(
                        "Error: You must enter a numeric credit or debit amount.");
                input.nextLine();

            } catch (Exception e) {
                System.err.println("Exception: " + e);
                System.out.println(e.getMessage());
            }
        }

        System.out.printf(
                "%nFinal account balance: $%.2f%n",
                balance);

        input.close();
    }
}
