package org.example;

import java.util.Scanner;
import java.util.StringJoiner;

public class FibonacciSequence {
    private final Scanner scanner = new Scanner(System.in);

    public void run(){
        printFibonacciSequence();
    }

    private void printFibonacciSequence(){
        int arrSize = getANumber();

        if (arrSize <= 0) {
            System.out.println("Invalid array size. Please provide a positive number greater than zero.");
        } else {
            long[] arr = new long[(int) arrSize];
            arr[0] = 0;
            arr[1] = 1;

            StringJoiner str = new StringJoiner(", ");
            str.add(Long.toString(arr[0]));
            str.add(Long.toString(arr[1]));

            for(int i = 2; i < arrSize; i++){
                arr[i] = arr[i-1] + arr[i -2];
                str.add(Long.toString(arr[i]));
            }

            System.out.println(str);
        }
    }

    private int getANumber() {
        System.out.println("Enter a number: ");

        int input;

        try {
            input = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (input <= 0) {
                return Integer.MIN_VALUE;
            }

        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }

        return input;
    }
}
