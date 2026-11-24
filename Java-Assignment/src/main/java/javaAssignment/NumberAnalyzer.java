
package javaAssignment;

import java.util.Scanner;

public class NumberAnalyzer {

    /**
     * Starts the Number Analyzer application.
     * Displays the menu and processes the user's selected operation
     * until the user chooses to exit.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    System.out.println(checkNumberType(number));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = input.nextInt();

                    int result = calculateSum(number1, number2);

                    System.out.println("Sum = " + result);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        input.close();
    }

    /**
     * Prints all integers starting from 10 and ending at 1
     * in descending order.
     */
    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Displays numbers from 1 to 10 and identifies each
     * number as either even or odd.
     */
    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * Determines whether the given integer is positive,
     * negative, or zero.
     *
     * @param number the integer to be checked
     * @return Positive, Negative, or Zero depending on the value
     */
    public static String checkNumberType(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two integer values and provides their total.
     *
     * @param number1 the first integer value
     * @param number2 the second integer value
     * @return the sum of the two given numbers
     */
    public static int calculateSum(int number1, int number2) {

        return number1 + number2;
    }
}

