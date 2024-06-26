public class StringBuilders_ {
    public static void main(String[] args) {
        System.out.println("Let's understand how the StringBuilder is used for appending the summary, updating, etc.:");

        // Initialize user profile data
        String userName = "Balaji";
        String userEmail = "balaji@gmail.com";
        String userBio = "Hi, I am a Software Developer with 5 years of experience in Java full-stack development.";

        // Perform StringBuilder operations
        StringBuilder profileSummary = new StringBuilder();
        profileSummary.append("User Name: ").append(userName).append("\n");
        profileSummary.append("User Email: ").append(userEmail).append("\n");
        profileSummary.append("User Bio: ").append(userBio).append("\n");

        // Print appended profile summary
        System.out.println("Initial Profile Summary:");
        System.out.println(profileSummary.toString());

        // Insert additional information
        String userLocation = "Tirupati, AP";
        profileSummary.insert(profileSummary.indexOf("Bio:"), "Location: " + userLocation + "\n");

        System.out.println("\nProfile Summary after Insertion:");
        System.out.println(profileSummary.toString());

        // Replace email with an updated one
        int emailStart = profileSummary.indexOf("User Email: ") + "User Email: ".length();
        int emailEnd = profileSummary.indexOf("\n", emailStart);
        profileSummary.replace(emailStart, emailEnd, "venkateshwara@gmail.com");

        System.out.println("\nProfile Summary after Email Update:");
        System.out.println(profileSummary.toString());

        // Delete a part of the bio
        String bioToRemove = "5 years of experience in ";
        int bioStart = profileSummary.indexOf(bioToRemove);
        if (bioStart != -1) {
            int bioEnd = bioStart + bioToRemove.length();
            profileSummary.delete(bioStart, bioEnd);
        }

        System.out.println("\nProfile Summary after Deleting Part of Bio:");
        System.out.println(profileSummary.toString());

        // Reverse the profile summary
        profileSummary.reverse();

        System.out.println("\nProfile Summary after Reversing:");
        System.out.println(profileSummary.toString());
    }
}
