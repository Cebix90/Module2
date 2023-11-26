package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Double> numbers = new ArrayList<>();

    public void run() {
        getANumbers();
        if (!numbers.isEmpty())
            System.out.println("Average: " + calculateAverage());
        else
            System.out.println("List of numbers is cleared. You have to enter only positive numbers");
    }

    private void getANumbers() {
        System.out.println("Enter 3 positive numbers and get their average:");

        for (int i = 0; i < 3; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input > 0)
                numbers.add(input);
            else {
                numbers.clear();
                break;
            }
        }
    }

    private double calculateAverage() {
        if (numbers.isEmpty())
            return 0.0;

        double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }

        return sum / numbers.size();
    }
}
