package org.example.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        double operand2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operatorSymbol = scanner.next().charAt(0);

        MathematicalOperators operator = getOperator(operatorSymbol);
        if (operator == null) {
            System.out.println("Invalid operator. Exiting...");
            return;
        }

        MathOperationExecutor operationExecutor = getOperationExecutor(operator);
        if (operationExecutor == null) {
            System.out.println("Unsupported operation. Exiting...");
            return;
        }

        CalculatorService calculatorService = new CalculatorService(operationExecutor);

        double result = calculatorService.performOperation(operand1, operand2, operator);

        System.out.println("Result: " + result);
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
}
