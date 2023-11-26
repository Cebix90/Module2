package org.example;

import java.util.Scanner;

public class TriangleMadeWithStars {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        printTheTriangle();
    }
    private void printTheTriangle() {
        int height = this.getAHeight();

        if(height <= 0) {
            System.out.println("Invalid input. Please enter a valid positive number for the height.");
        } else {
            for (int i = 0; i < height; i++) {
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    private int getAHeight() {
        System.out.println("Enter a height of triangle (must be bigger than 0):");

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
