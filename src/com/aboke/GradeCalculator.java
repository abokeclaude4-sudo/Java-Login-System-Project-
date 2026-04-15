package com.aboke;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            int score;

            // validation loop
            while (true) {
                System.out.print("Enter your score (0-100): ");
                
                if (input.hasNextInt()) {
                    score = input.nextInt();

                    if (score >= 0 && score <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid score. Must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); // clear wrong input
                }
            }

            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
            }

            System.out.print("Do you want to enter another score? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended.");
        input.close();
    }
}