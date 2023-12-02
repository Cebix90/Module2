package org.example;

import java.util.Scanner;

public class SumOfNumbers {
    public static void sumUpToInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number to sum up to (inclusive):");
        int number = scanner.nextInt();

        int sum = 0;

        if(number < 0) {
            System.out.println(number + " isn't a natural number");
        } else {
            for(int i = 0; i <= number; i++){
                sum += i;
            }
        }

        System.out.println("The sum of numbers up to the specified value is: " + sum);
    }
}
