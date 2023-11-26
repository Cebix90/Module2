package org.example;

import java.util.Scanner;

public class SumOfNumbers {
    private final Scanner scanner = new Scanner(System.in);
    int number = getANumber();
    public void run(){
        System.out.println("Sum of all numbers from 0-" + number + " is equal to " + sumNumbers());
    }
    private int sumNumbers() {

        int sum = 0;
        System.out.println();

        if(number < 0) {
            System.out.println(number + " isn't a natural number");
        } else {
            for(int i = 0; i <= number; i++){
                sum += i;
            }
        }

        return sum;
    }
    private int getANumber() {
        System.out.println("Enter a natural number :");

        return Integer.parseInt(scanner.nextLine());
    }
}
