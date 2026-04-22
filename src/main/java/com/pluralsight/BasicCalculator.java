package com.pluralsight;

// Import Scanner for  user to input
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {

        // Add my scanner
        Scanner scanner = new Scanner(System.in);

        // Tell user to input their first variable and assign
        System.out.print("Enter the first number: ");
        double firstVariable = scanner.nextDouble();

        // Tell user to input their first variable and assign
        System.out.print("Enter the second number: ");
        double secondVariable = scanner.nextDouble();


        // Ask user about what math operation they want to do
        System.out.println("Possible Calculations:\n ");
        System.out.println("(A)dd\n" + "(S)ubtract\n" + "(M)ultiply\n" + "(D)ivide\n");
        System.out.println("Please select an option:\n ");
        String Operation = scanner.nextLine();

        // insert the multiply operation and display the result
        double Multiply = firstVariable * secondVariable;
        System.out.println( firstVariable + " * " + secondVariable + " = " + Multiply);

    }
}
