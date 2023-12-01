package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LowestNumber {
    public void lowestOfFiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers and get the lowest:");

        while(numbers.size() < 5) {
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                numbers.add(input);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        int lowest = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < lowest)
                lowest = numbers.get(i);
        }

        System.out.println("The lowest number given " + lowest);
    }
}
