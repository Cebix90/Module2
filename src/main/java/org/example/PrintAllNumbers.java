package org.example;

import java.util.Scanner;

public class PrintAllNumbers {
    private final Scanner scanner = new Scanner(System.in);

    public void run(){
        printNumbers();
    }
    private void printNumbers() {
        int number = getANumber();
        System.out.println();

        if(number < 0) {
            System.out.println(number + " isn't a natural number");
        } else {
            for(int i = 0; i <= number; i++){
                System.out.println(i);
            }
        }
    }
    private int getANumber() {
        System.out.println("Enter a natural number :");

        return Integer.parseInt(scanner.nextLine());
    }
}
