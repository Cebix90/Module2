package org.example.calculator;

public class CalculatorService {
    private final MathOperationExecutor operationExecutor;

    public CalculatorService(MathOperationExecutor operationExecutor) {
        this.operationExecutor = operationExecutor;
    }

    public double performOperation(double operand1, double operand2, MathematicalOperators operator) {
        return operationExecutor.execute(operand1, operand2, operator);
    }
}
