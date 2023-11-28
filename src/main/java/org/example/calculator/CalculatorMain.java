package org.example.calculator;

import java.util.Scanner;

public class CalculatorMain {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println("Choose 1 for perform calculator operation or 2 for exit the program");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    performCalculatorOperation(scanner);
                    continue;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }
    }

    private static void performCalculatorOperation(Scanner scanner) {
        do {
            double operand1 = getValidDoubleInput(scanner, "Enter the first number: ");
            double operand2 = getValidDoubleInput(scanner, "Enter the second number: ");

            System.out.print("Enter the operator (+, -, *, /): ");

            char operatorSymbol;
            MathematicalOperators operator;
            while (true) {
                String operatorInput = scanner.nextLine().trim();
                if (operatorInput.length() == 1) {
                    operatorSymbol = operatorInput.charAt(0);
                    operator = getOperator(operatorSymbol);

                    if(operator != null){
                        break;
                    } else {
                        System.out.println("Invalid operator. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a single operator (+, -, *, /):");
                }
            }

            MathOperationExecutor operationExecutor = getOperationExecutor(operator);
            if (operationExecutor == null) {
                System.out.println("Unsupported operation. Please try again.");
                continue;
            }

            CalculatorService calculatorService = new CalculatorService(operationExecutor);

            double result = calculatorService.performOperation(operand1, operand2, operator);

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (!answer.equals("y")) {
                break;
            }

        } while (true);
    }

    private static MathematicalOperators getOperator(char operatorSymbol) {
        return switch (operatorSymbol) {
            case '+' -> MathematicalOperators.ADDITION;
            case '-' -> MathematicalOperators.SUBTRACTION;
            case '*' -> MathematicalOperators.MULTIPLICATION;
            case '/' -> MathematicalOperators.DIVISION;
            default -> null;
        };
    }
    private static MathOperationExecutor getOperationExecutor(MathematicalOperators operator) {
        return switch (operator) {
            case ADDITION -> new AdditionExecutor();
            case SUBTRACTION -> new SubtractionExecutor();
            case MULTIPLICATION -> new MultiplicationExecutor();
            case DIVISION -> new DivisionExecutor();
            default -> null;
        };
    }

    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double result;

        while (true) {
            System.out.print(prompt);

            try {
                result = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return result;
    }
}
