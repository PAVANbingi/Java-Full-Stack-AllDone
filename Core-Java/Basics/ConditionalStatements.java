public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("In this program, we are performing various conditional statements:");

        UserProfile pavan = new UserProfile();
        // User Pavan:
        pavan.age = 22;
        pavan.userName = "PavanKumar";
        pavan.isActiveMember = true;
        pavan.gender = 'M';
        pavan.yearsAsMember = 2;

        pavan.mrMs();
        pavan.minorMajor();
        pavan.activeInactive();
        pavan.membership();
        System.out.println("Membership Status: " + pavan.membershipStatus());
    }
}

class UserProfile {
    int age;
    String userName;
    boolean isActiveMember;
    char gender;
    int yearsAsMember;

    // if statement to determine age category
    void minorMajor() {
        if (age >= 0 && age <= 12) {
            System.out.println("User is a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("User is a teenager.");
        } else if (age >= 20 && age <= 35) {
            System.out.println("User is a young adult.");
        } else if (age >= 36 && age <= 55) {
            System.out.println("User is an adult.");
        } else if (age >= 56) {
            System.out.println("User is a senior.");
        } else {
            System.out.println("Invalid age.");
        }
    }

    // if-else statement to check active member status
    void activeInactive() {
        if (isActiveMember) {
            System.out.println(userName + " is an active member.");
        } else {
            System.out.println(userName + " is not an active member.");
        }
    }

    // switch statement to greet based on gender
    void mrMs() {
        switch (gender) {
            case 'M':
                System.out.println("Hello, Mr. " + userName);
                break;
            case 'F':
                System.out.println("Hello, Ms. " + userName);
                break;
            default:
                System.out.println("Hello!");
                break;
        }
    }

    // ternary operator to get membership status
    String membershipStatus() {
        return isActiveMember ? "Active Member" : "Inactive Member";
    }

    // nested if statement to determine membership duration status
    void membership() {
        if (isActiveMember) {
            if (yearsAsMember >= 10) {
                System.out.println(userName + " is a veteran member.");
            } else if (yearsAsMember >= 5) {
                System.out.println(userName + " is a long-term member.");
            } else {
                System.out.println(userName + " is a new member.");
            }
        } else {
            System.out.println(userName + " is not a member of our firm.");
        }
    }
}
