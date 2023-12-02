package org.example;

import java.util.Scanner;
import java.util.StringJoiner;

public class FibonacciSequence {
    public static void printFibonacciSequence(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers to print:");
        int arrSize = scanner.nextInt();
        System.out.println();

        long[] arr;

        if (arrSize < 1) {
            System.out.println("Invalid array size. Please provide a positive number greater than zero.");
        } else if (arrSize == 1) {
            System.out.println("Fibonacci sequence of " + arrSize + " numbers: 0");
        } else {
            arr = new long[arrSize];
            arr[0] = 0;
            arr[1] = 1;

            StringJoiner str = new StringJoiner(", ");
            str.add(Long.toString(arr[0]));
            str.add(Long.toString(arr[1]));

            for (int i = 2; i < arrSize; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                str.add(Long.toString(arr[i]));
            }

            System.out.println("Fibonacci sequence of " + arrSize + " numbers: " + str);
        }
    }
}
