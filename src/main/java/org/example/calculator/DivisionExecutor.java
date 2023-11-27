package org.example.calculator;

public class DivisionExecutor implements MathOperationExecutor {
    @Override
    public double execute(double operand1, double operand2, MathematicalOperators operator) {
        if (operand2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return operand1 / operand2;
    }
}
