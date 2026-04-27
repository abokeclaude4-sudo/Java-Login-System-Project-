import java.util.Scanner;

public class LoginSystem {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "1234";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Login System ===");

        boolean loggedIn = login(scanner);

        if (loggedIn) {
            showDashboard();
        } else {
            System.out.println("Too many failed attempts. Account locked.");
        }

        scanner.close();
    }

    public static boolean login(Scanner scanner) {
        int attempts = MAX_ATTEMPTS;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful!");
                return true;
            } else {
                attempts--;
                System.out.println("Invalid username or password.");
                System.out.println("Attempts remaining: " + attempts);
            }
        }

        return false;
    }

    public static void showDashboard() {
        System.out.println("\n=== Dashboard ===");
        System.out.println("Welcome, admin!");
        System.out.println("You have successfully logged into the system.");
    }
}
