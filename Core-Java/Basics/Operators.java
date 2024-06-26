import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program demonstrates how to use operators in Java.");
        System.out.println("Let's perform this on UserInfo:");

        // UserInformation - Pavan is User:
        // Creating an object for it and calling those properties to perform operations on it.
        UserInformation pavan = new UserInformation();
        pavan.userName = "BingiPavanKumar";
        pavan.age = 23;
        pavan.userId = 6603;
        pavan.yearJoined = 2017;
        pavan.currentYear = 2024;
        pavan.accountBalance = 100000000.00;
        pavan.lastTransaction = 95000.00;
        pavan.gender = 'M';
        pavan.isActiveMember = true;

        System.out.println(pavan.userName);

        // Let's perform all operations on it:
        System.out.println("User Information:");
        System.out.println("Age: " + pavan.age+"    Gender:"+pavan.gender+" -userId:    "+pavan.userId);
        System.out.println("Years as Member: " + pavan.yearsAsMember());
        System.out.println("User ID: " + pavan.userId);
        System.out.println("New Account Balance: $" + pavan.newBalance());
        System.out.println("Average Annual Transaction: $" + pavan.averageAnnualTransaction());
        System.out.println("Is Minor: " + pavan.isMinor());
        System.out.println("Has Positive Balance: " + pavan.hasPositiveBalance());
        System.out.println("Is Long Term Member: " + pavan.isLongTermMember());
        System.out.println("Is Eligible for Loan: " + pavan.isEligibleForLoan());
        System.out.println("Needs Attention: " + pavan.needsAttention());
        System.out.println("Membership Status: " + pavan.membershipStatus());
        System.out.println("Bitwise AND (userId & mask): " + pavan.bitwiseAnd());
        System.out.println("Bitwise OR (userId | mask): " + pavan.bitwiseOr());
        System.out.println("Bitwise XOR (userId ^ mask): " + pavan.bitwiseXor());
        System.out.println("Bitwise NOT (~userId): " + pavan.bitwiseNot());
        System.out.println("User is maintaing his account from the past "+pavan.userExperience()+" Years");
    }
}

class UserInformation {
    String userName;
    int age;
    int userId;
    int yearJoined;
    int currentYear;
    double accountBalance;
    double lastTransaction;
    char gender;
    boolean isActiveMember;

    // Arithmetic Operation:
    int userExperience(){
        return yearJoined-currentYear;
    }
    int yearsAsMember() {
        return currentYear - yearJoined;
    }

    double newBalance() {
        return accountBalance - lastTransaction;
    }

    double averageAnnualTransaction() {
        return newBalance() / yearsAsMember();
    }

    // Unary Operation
    boolean isMinor() {
        return age < 18;
    }

    // Assignment Operation
    boolean hasPositiveBalance() {
        return newBalance() > 0;
    }

    boolean isLongTermMember() {
        return yearsAsMember() >= 5;
    }

    // Logical Operation
    boolean isEligibleForLoan() {
        return hasPositiveBalance() && isLongTermMember();
    }

    boolean needsAttention() {
        return !isActiveMember || !hasPositiveBalance();
    }

    // Bitwise Operation (applied to binary representation of integers)
    int mask = 0x0f; // 00001111

    int bitwiseAnd() {
        return userId & mask;
    }

    int bitwiseOr() {
        return userId | mask;
    }

    int bitwiseXor() {
        return userId ^ mask;
    }

    int bitwiseNot() {
        return ~userId;
    }

    // Ternary Operation or Conditional Operation
    String membershipStatus() {
        return isActiveMember ? "Active" : "Inactive";
    }
}
