package org.example;

import org.example.calculator.CalculatorMain;

public class Main {
    public static void main(String[] args) {
        NumberInputReader inputReader = new NumberInputReader();
//        NumberCheck numberCheck = new NumberCheck();
//        numberCheck.checkNumber();

//        Average average = new Average();
//        average.run();

//        LowestNumber lowestNumber = new LowestNumber();
//        lowestNumber.run();

//        TriangleMadeWithStars triangleMadeWithStars = new TriangleMadeWithStars();
//        triangleMadeWithStars.run();

//        PrintAllNumbers printAllNumbers = new PrintAllNumbers();
//        printAllNumbers.run();

//        SumOfNumbers sumOfNumbers = new SumOfNumbers();
//        sumOfNumbers.run();

//        FibonacciSequence fibonacciSequence = new FibonacciSequence();
//        fibonacciSequence.run();

//        FactorialCalculator factorialCalculator = new FactorialCalculator(inputReader);
//        factorialCalculator.run();

        CalculatorMain calculatorMain = new CalculatorMain();
        calculatorMain.start();
    }
}