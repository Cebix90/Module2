package org.example;

import java.util.Scanner;

public class Average {
    public void averageOfThreePositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 positive numbers and get their average.\nPlease enter first number:");
        int first = getNumber(scanner);

        System.out.println("Enter second number:");
        int second = getNumber(scanner);

        System.out.println("Enter third number:");
        int third = getNumber(scanner);

        if(first > 0 && second > 0 && third > 0){
            double result = (double) (first + second + third) / 3;
            System.out.println("Average: " + result);
        }
        else {
            System.out.println("All numbers must be positive!");
        }
    }

    private static int getNumber(Scanner scanner){
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return number;
    }
}
