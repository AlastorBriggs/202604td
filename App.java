/*
 * Name: Tevin Donegan
 * Date of Development: May 10, 2026
 * Assignment: SDC230 Performance Assessment - Calculations & Unique Numbers
 * Description: This application gets 10 integer values from the user,
 * stores them in an array, stores unique values in an ArrayList,
 * and displays the count, sum, and average for both collections.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArray = new int[10];
        ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();

        System.out.println("Tevin Donegan - Week 3 PA Calculations & Unique Numbers");

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbersArray[i] = input.nextInt();

            if (!uniqueNumbers.contains(numbersArray[i])) {
                uniqueNumbers.add(numbersArray[i]);
            }
        }

        int arraySum = calculateSum(numbersArray);
        double arrayAverage = (double) arraySum / numbersArray.length;

        int arrayListSum = calculateSum(uniqueNumbers);
        double arrayListAverage = (double) arrayListSum / uniqueNumbers.size();

        System.out.println("\nArray Results");
        System.out.println("Count of elements: " + numbersArray.length);
        System.out.println("Sum of all elements: " + arraySum);
        System.out.println("Average of values: " + arrayAverage);

        System.out.println("\nArrayList Results");
        System.out.println("Count of elements: " + uniqueNumbers.size());
        System.out.println("Sum of all elements: " + arrayListSum);
        System.out.println("Average of values: " + arrayListAverage);

        input.close();
    }
}