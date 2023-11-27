package org.example;

import java.util.Scanner;

public class FactorialCalculator {
    private final NumberInputReader inputReader;

    public FactorialCalculator(NumberInputReader inputReader) {
        this.inputReader = inputReader;
    }

    public void run(){
        int factorial = inputReader.getANumber();
        inputReader.closeScanner();
        if(factorial < 1) {
            System.out.println("Input must be bigger than 0");
        } else {
            calculateFactorial(factorial);
        }
    }

    private void calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Factorial of " + number + " = " + result);
    }
}
