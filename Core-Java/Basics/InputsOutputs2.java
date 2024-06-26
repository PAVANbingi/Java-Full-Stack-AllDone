import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputsOutputs2 {

    private static final String FILE_PATH = "UserProfile.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        UserProfile user = getUserInput(scanner);

        // Display user information
        displayUserInfo(user);

        // Save user information to a file
        saveUserInfoToFile(user);

        // Read user information from the file
        readUserInfoFromFile();
    }

    private static UserProfile getUserInput(Scanner scanner) {
        System.out.println("Enter your userId:");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();

        System.out.println("Is the user active (true/false):");
        boolean isActive = scanner.nextBoolean();

        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter your current balance ($):");
        double currentBalance = scanner.nextDouble();

        return new UserProfile(userId, userName, userAge, isActive, gender, currentBalance);
    }

    private static void displayUserInfo(UserProfile user) {
        System.out.println("\nUser Information:");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Name: " + user.getUserName());
        System.out.println("Age: " + user.getUserAge());
        System.out.println("Active: " + (user.isActive() ? "Yes" : "No"));
        System.out.println("Gender: " + user.getGender());
        System.out.println("Balance: $" + user.getCurrentBalance());
        System.out.println("----------------------------\n");
    }

    private static void saveUserInfoToFile(UserProfile user) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            writer.println("User Information:");
            writer.println("User ID: " + user.getUserId());
            writer.println("Name: " + user.getUserName());
            writer.println("Age: " + user.getUserAge());
            writer.println("Active: " + (user.isActive() ? "Yes" : "No"));
            writer.println("Gender: " + user.getGender());
            writer.println("Balance: $" + user.getCurrentBalance());
            writer.println("----------------------------\n");
            System.out.println("User Information has been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readUserInfoFromFile() {
        System.out.println("Reading User Information from UserProfile.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        System.out.println("----------------------------\n");
    }
}

class UserProfile {
    private int userId;
    private String userName;
    private int userAge;
    private boolean isActive;
    private char gender;
    private double currentBalance;

    public UserProfile(int userId, String userName, int userAge, boolean isActive, char gender, double currentBalance) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.isActive = isActive;
        this.gender = gender;
        this.currentBalance = currentBalance;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public boolean isActive() {
        return isActive;
    }

    public char getGender() {
        return gender;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
