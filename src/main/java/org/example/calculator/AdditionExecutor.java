package org.example.calculator;

public class AdditionExecutor implements MathOperationExecutor {
    @Override
    public double execute(double operand1, double operand2, MathematicalOperators operator) {
        return operand1 + operand2;
    }
}
