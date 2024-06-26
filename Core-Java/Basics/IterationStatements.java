public class IterationStatements {
    public static void main(String[] args) {
        // User information 
        int[] userIds = {101, 102, 103, 104, 105};
        String[] userNames = {"pavankumarbingi", "vinaykumarbingi", "naveen", "Telsuko", "santosh"};
        int[] userAges = {22, 17, 59, 34, 45};
        boolean[] isActive = {true, true, false, false, true};
        char[] gender = {'M', 'M', 'M', 'M', 'M'};
        double[] balance = {15000.00, 234.00, 23412.00, -23452.04, -3454.00};

        // Using for loop to iterate through user details
        System.out.println("User Details using for loop:");
        for (int i = 0; i < userIds.length; i++) {
            System.out.println("User ID: " + userIds[i]);
            System.out.println("User Name: " + userNames[i]);
            System.out.println("User Age: " + userAges[i]);
            System.out.println("Active: " + (isActive[i] ? "Yes" : "No"));
            System.out.println("Gender: " + gender[i]);
            System.out.println("Balance: $" + balance[i]);
            System.out.println("-------------\n");
        }

        // Counting how many are active users using while loop
        System.out.println("Counting active users (Using while loop):");
        int i = 0;
        int activeCount = 0;
        while (i < isActive.length) {
            if (isActive[i]) { // if it is true then the count increments
                activeCount++;
            }
            i++;
        }
        System.out.println("Number of active users: " + activeCount);
        System.out.println("-------------------\n");

        // Finding users who are maintaining negative balance using do-while loop
        System.out.println("Finding users with negative balance (Using do-while loop):");
        i = 0;
        do {
            if (balance[i] < 0) {
                System.out.println("User with negative balance found:");
                System.out.println("User ID: " + userIds[i]);
                System.out.println("User Name: " + userNames[i]);
                System.out.println("User Balance: $" + balance[i]);
                System.out.println("-------------------\n");
            }
            i++;
        } while (i < balance.length);

        // Using break to find the first user eligible for health insurance (age <= 40)
        System.out.println("Finding the first user eligible for health insurance (age <= 40):");
        for (i = 0; i < userIds.length; i++) {
            if (userAges[i] <= 40) {
                System.out.println("User eligible for health insurance:");
                System.out.println("User ID: " + userIds[i]);
                System.out.println("User Name: " + userNames[i]);
                System.out.println("User Age: " + userAges[i]);
                System.out.println("==============\n");
                break; // Stop after finding the first eligible user
            }
        }

        // Using continue to skip active users and send messages to inactive users
        System.out.println("Sending messages to inactive users (Using continue to skip active members):");
        for (i = 0; i < userIds.length; i++) {
            if (isActive[i]) {
                continue; // Skip active accounts
            }
            // Send message to inactive members
            System.out.println("User ID: " + userIds[i]);
            System.out.println("Name: " + userNames[i]);
            System.out.println("Age: " + userAges[i]);
            System.out.println("Gender: " + gender[i]);
            System.out.println("Balance: $" + balance[i]);
            System.out.println("Hello " + userNames[i] + "! To make successful transactions, please activate your account.");
            System.out.println("-----------------------");
        }
    }
}
