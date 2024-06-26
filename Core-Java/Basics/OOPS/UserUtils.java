package OOPS;

public class UserUtils {
    public static void printWelcomeMessage(User user) {
        System.out.println("Welcome, " + user.getUserNmae() + "!");
    }

    public static void printFarewellMessage(User user) {
        System.out.println("Goodbye, " + user.getUserNmae() + "!");
    }
}
