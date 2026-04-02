package com.aboke;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] studentNames = new String[10];
        int[] studentIds = new int[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- SCHOOL MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                studentNames[count] = input.nextLine();

                System.out.print("Enter student ID: ");
                studentIds[count] = input.nextInt();
                input.nextLine();

                count++;
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + studentIds[i] + " | Name: " + studentNames[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting system...");
            } else {
                System.out.println("Invalid option.");
            }

        } while (choice != 3);

        input.close();
    }
    public static boolean login() {
        try (Scanner input = new Scanner(System.in)) {
			String correctUsername = "ClaudeAboke";
			String correctPassword = "Monday!1234";

			int attempts = 3;

			while (attempts > 0) {
			    System.out.print("Enter username: ");
			    String username = input.nextLine();

			    System.out.print("Enter password: ");
			    String password = input.nextLine();

			    if (username.equals(correctUsername) && password.equals(correctPassword)) {
			        System.out.println("Login successful!\n");
			        return true;
			    } else {
			        attempts--;
			        System.out.println("Wrong credentials. Attempts left: " + attempts);
			    }
			}
		}

        return false;
    }
}
