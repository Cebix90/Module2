package org.example;

import java.util.StringJoiner;

public class FibonacciSequence {
    private final NumberInputReader inputReader = new NumberInputReader();

    public void run(){
        printFibonacciSequence();
    }

    private void printFibonacciSequence(){
        int arrSize = inputReader.getANumber();

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

        inputReader.closeScanner();
    }
}
