package org.example;

import java.util.Scanner;

public class NumberInputReader {
    private final Scanner scanner = new Scanner(System.in);

    public int getANumber() {
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

    public void closeScanner() {
        scanner.close();
    }
}
