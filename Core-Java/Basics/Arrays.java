public class Arrays {
    public static void main(String[] args) {
        // 1D Array: Store user IDs.
        int[] userIds = {101, 102, 103, 104, 105};

        // 2D Array: Store user information (ID, Name, Age, Balance).
        Object[][] userInfo = {
            {101, "PavanKumar Bingi", 24, 4500.00},
            {102, "VinayKumar Bingi", 24, 4500.00},
            {103, "Santosh twg", 24, 4500.00},
            {104, "Naveen frontend taicon", 24, 4500.00},
            {105, "Harsha realestate taicon", 24, 4500.00}
        };

        // 3D Array: Store user activity data for each hour over 2 days (0: inactive, 1: active)
        int[][][] userActivity = new int[5][2][24];
        for (int i = 0; i < userActivity.length; i++) {
            for (int j = 0; j < userActivity[i].length; j++) {
                for (int k = 0; k < userActivity[i][j].length; k++) {
                    userActivity[i][j][k] = (int) (Math.random() * 2); // randomly assign 0 or 1
                }
            }
        }

        // 1D Array: User IDs
        System.out.println("=============\n");
        System.out.println("User IDs: ");
        for (int id : userIds) {
            System.out.println(id);
        }
        System.out.println("=============\n");

        // 2D Array: User Information
        System.out.println("User Information:");
        for (Object[] user : userInfo) {
            System.out.printf("ID: %d, Name: %s, Age: %d, Balance: $%.2f%n", user[0], user[1], user[2], user[3]);
        }
        System.out.println("=============\n");

        // 3D Array: User Activity
        System.out.println("User Activity (Active Hours):");
        for (int i = 0; i < userActivity.length; i++) {
            System.out.println("User ID: " + userIds[i]);
            for (int j = 0; j < userActivity[i].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                for (int k = 0; k < userActivity[i][j].length; k++) {
                    if (userActivity[i][j][k] == 1) {
                        System.out.print(k + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("=============\n");
    }
}
