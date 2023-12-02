package org.example;

import java.util.Scanner;

public class Calculator {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start the calculator or \"exit\" to close program");

        while (!scanner.nextLine().equalsIgnoreCase("exit")) {
            calculate(scanner);
            System.out.println("Press any key to start the calculator or \"exit\" to close program");
        }
    }

    private void calculate(Scanner scanner) {
        boolean repeatCalculation;

        do {
            double a = getNumberFromUser(scanner, "Please enter the first number: ");
            double b = getNumberFromUser(scanner, "Please enter the second number: ");
            String operatorSymbol = getOperationFromUser(scanner).trim();

            switch (operatorSymbol) {
                case "+" -> System.out.println("Result: " + add(a, b));
                case "-" -> System.out.println("Result: " + subtract(a, b));
                case "*" -> System.out.println("Result: " + multiply(a, b));
                case "/" -> System.out.println("Result: " + divide(a, b));
                default -> System.out.println("Invalid operator. Please try again.");
            }

            System.out.println("Do you want to perform another calculation? (y/n): ");
            repeatCalculation = scanner.nextLine().trim().equalsIgnoreCase("y");

        } while (repeatCalculation);
    }

    private String getOperationFromUser(Scanner scanner) {
        String operatorSymbol;
        boolean isValid;

        do {
            System.out.print("Enter the operator (+, -, *, /): ");
            operatorSymbol = scanner.nextLine().trim();

            isValid = operatorSymbol.equals("+") || operatorSymbol.equals("-") ||
                    operatorSymbol.equals("*") || operatorSymbol.equals("/");

            if (!isValid) {
                System.out.println("Invalid operator. Please enter a valid operator.");
            }
        } while (!isValid);

        return operatorSymbol;
    }

    private double getNumberFromUser(Scanner scanner, String prompt) {
        double result = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            try {
                result = Double.parseDouble(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return result;
    }

    private boolean isDifferentThan0(double number) {
        return number != 0;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double divide(double a, double b) {
        if (isDifferentThan0(b)) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }

    private double multiply(double a, double b) {
        return a * b;
    }
}
