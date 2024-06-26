import java.util.Scanner;

public class Strings_ {
    public static void main(String[] args) {
        UserProfileManager client = new UserProfileManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name:");
        client.userName = scanner.nextLine();
        System.out.println("Enter your Email Id:");
        client.userEmail = scanner.nextLine();
        System.out.println("Enter your Personal Email Id:");
        client.personalEmailId = scanner.nextLine();
        System.out.println("Enter your Bio:");
        client.userBio = scanner.nextLine();

        client.printUserProfile();

        scanner.close();
    }
}

class UserProfileManager {
    String userName, userEmail, userBio, personalEmailId;

    void printUserProfile() {
        printNameLength();
        printInitialChar();
        printLastChar();
        printEmailIndex();
        printSubstring();
        printUpperCase();
        printLowerCase();
        printTrimmed();
        printEquality();
        printSplittingBio();
        printStringBuilderOperations();
    }

    void printNameLength() {
        System.out.println("--------------");
        System.out.println("Name length of \"" + userName + "\" is: " + userName.length());
        System.out.println("--------------");
    }

    void printInitialChar() {
        System.out.println("Initial char: " + userName.charAt(0));
        System.out.println("--------------");
    }

    void printLastChar() {
        System.out.println("Last char: " + userName.charAt(userName.length() - 1));
        System.out.println("--------------");
    }

    void printEmailIndex() {
        System.out.println("Index value for '@' in Email: " + userEmail.indexOf('@'));
        System.out.println("--------------");
    }

    void printSubstring() {
        String[] parts = userName.split(" ");
        if (parts.length == 2) {
            // If there are only two parts, the second part is considered as the last name
            System.out.println("Last name: " + parts[1]);
        } else if (parts.length >= 3) {
            // If there are three or more parts, the second part is considered as the middle name
            System.out.println("Middle name: " + parts[1]);
        } else {
            System.out.println("The name does not have a middle or last part.");
        }
        System.out.println("--------------");
    }

    void printUpperCase() {
        System.out.println("Uppercase Name: " + userName.toUpperCase());
        System.out.println("Uppercase Email: " + userEmail.toUpperCase());
        System.out.println("Uppercase Bio: " + userBio.toUpperCase());
        System.out.println("--------------");
    }

    void printLowerCase() {
        System.out.println("Lowercase Name: " + userName.toLowerCase());
        System.out.println("Lowercase Email: " + userEmail.toLowerCase());
        System.out.println("Lowercase Bio: " + userBio.toLowerCase());
        System.out.println("--------------");
    }

    void printTrimmed() {
        System.out.println("Trimmed Name: " + userName.trim());
        System.out.println("Trimmed Email: " + userEmail.trim());
        System.out.println("Trimmed Bio: " + userBio.trim());
        System.out.println("--------------");
    }

    void printEquality() {
        System.out.println("Email equals Personal Email Id: " + userEmail.equals(personalEmailId));
        System.out.println("Email equals Personal Email Id (Ignoring Case): " + userEmail.equalsIgnoreCase(personalEmailId));
        System.out.println("--------------");
    }

    void printSplittingBio() {
        String[] parts = userBio.split(" ");
        System.out.println("Bio split into words:");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("--------------");
    }

    void printStringBuilderOperations() {
        StringBuilder profileSummary = new StringBuilder();
        profileSummary.append("Name: ").append(userName).append("\n");
        profileSummary.append("Email: ").append(personalEmailId).append("\n");
        profileSummary.append("Bio: ").append(userBio).append("\n");
        System.out.println("Profile Summary:");
        System.out.println(profileSummary.toString());
        System.out.println("--------------");
    }
}
