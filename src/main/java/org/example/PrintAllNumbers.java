package org.example;

import java.util.Scanner;

public class PrintAllNumbers {
    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number, to print all of them:");
        int number = scanner.nextInt();
        System.out.println();

        if(number < 0) {
            System.out.println(number + " isn't a natural number");
        } else {
            for(int i = 0; i <= number; i++){
                System.out.println(i);
            }
        }
    }
}
