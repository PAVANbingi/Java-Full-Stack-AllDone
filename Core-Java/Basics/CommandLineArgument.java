class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Current balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length < 2) {
            printUsage();
            return;
        }

        double initialBalance;
        try {
            initialBalance = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid initial balance: " + args[0]);
            printUsage();
            return;
        }

        BankAccount account = new BankAccount(initialBalance);
        String operation = args[1];

        try {
            switch (operation) {
                case "deposit":
                    if (args.length < 3) {
                        System.out.println("Please provide the amount to deposit.");
                    } else {
                        double depositAmount = Double.parseDouble(args[2]);
                        account.deposit(depositAmount);
                    }
                    break;
                case "withdraw":
                    if (args.length < 3) {
                        System.out.println("Please provide the amount to withdraw.");
                    } else {
                        double withdrawAmount = Double.parseDouble(args[2]);
                        account.withdraw(withdrawAmount);
                    }
                    break;
                case "balance":
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                default:
                    System.out.println("Unknown operation: " + operation);
                    printUsage();
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our banking services.");
        }
    }

    private static void printUsage() {
        System.out.println("Usage: java CommandLineArgument <initialBalance> <operation> [amount]");
        System.out.println("Operations:");
        System.out.println("  deposit <amount>");
        System.out.println("  withdraw <amount>");
        System.out.println("  balance");
    }
}
