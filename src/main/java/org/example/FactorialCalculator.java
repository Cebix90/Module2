package org.example;

import java.util.Scanner;

public class FactorialCalculator {
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the positive number to calculate factorial:");
        int number = scanner.nextInt();

        if(number > 0){
            long result = 1;
            for (int i = 1; i <= number; i++){
                result *= i;
            }
            System.out.println("Factorial of number " + number + " = " + result);
        } else {
            System.out.println("Number must be positive :)");
        }
    }
}
