package com.aboke;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "ClaudeAboke";
        String correctPassword = "Monday!1234";

        int attempts = 3;
        boolean loggedIn = false;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("Login successful. Welcome to Aboke Digital, " + username + "!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password.");
                System.out.println("Attempts left: " + attempts);
            }
        }
     // 👇 OUTSIDE the loop
        if (loggedIn) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. View Profile");
            System.out.println("2. Logout");
            System.out.print("Choose option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("User: ClaudeAboke");
                System.out.println("Platform: Aboke Digital");
            } else if (choice == 2) {
                System.out.println("Logged out successfully.");
            } else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Account locked. Too many failed attempts.");
        }

        if (!loggedIn) {
            System.out.println("Account locked. Too many failed attempts.");
        }

        input.close();
    }
}