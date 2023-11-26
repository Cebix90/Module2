package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LowestNumber {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Double> numbers = new ArrayList<>();

    public void run() {
        getANumbers();
        if (!numbers.isEmpty())
            findTheLowestNumber();
        else
            System.out.println("List of numbers is empty.");
    }

    private void findTheLowestNumber() {
        double lowest = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < lowest)
                lowest = numbers.get(i);
        }

        System.out.println("The lowest number given " + lowest);
    }
    private void getANumbers() {
        System.out.println("Enter 5 numbers and get the lowest:");

        for (int i = 0; i < 5; i++) {
            try {
                double input = Double.parseDouble(scanner.nextLine());
                numbers.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                i--;
            }
        }
        scanner.close();
    }
}
