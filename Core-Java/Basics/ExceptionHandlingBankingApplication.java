// Custom exception class to handle insufficient funds scenarios
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

// Class representing a bank account
class BankAccount {
    private double balance;

    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient funds for withdrawal: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }
}

// Main class to demonstrate exception handling in a banking application
public class ExceptionHandlingBankingApplication {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance of $500
        BankAccount account = new BankAccount(500.00);
        
        try {
            System.out.println("Initial Balance: $" + account.getBalance());

            // Deposit money into the account
            account.deposit(234.00);
            System.out.println("Balance after deposit: $" + account.getBalance());

            // Withdraw money from the account
            account.withdraw(23.00);
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            // Attempt to withdraw more money than available in the account
            account.withdraw(2343.00);

        } catch (InsufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // The finally block always executes, regardless of whether an exception was thrown
            System.out.println("Thank you for using our banking services.");
        }
    }
}
