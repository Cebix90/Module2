package org.example;

import java.util.Scanner;

public class NumberCheck {
    private final Scanner scanner = new Scanner(System.in);

    public void checkNumber() {
        int number = getANumber();
        positiveOrNegative(number);
    }

    private void positiveOrNegative(int number) {

        if(number > 0)
            System.out.println("Entered number is positive.");
        else if(number < 0)
            System.out.println("Entered number is negative.");
        else
            System.out.println("Entered number is equal to zero.");
    }

    private int getANumber() {
        System.out.println("Enter a number to check if is positive or negative:");

        return  Integer.parseInt(scanner.nextLine());
    }
}
