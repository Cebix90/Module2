package org.example;

import java.util.Scanner;

public class TriangleMadeWithStars {
    public void printTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the triangle (must be greater than 0):");
        int height = scanner.nextInt();

        if(height <= 0) {
            System.out.println("Please enter a valid positive number for the height.");
        } else {
            for (int i = 0; i < height; i++) {
                for(int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
