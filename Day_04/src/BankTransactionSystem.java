//Problem Statement:
//Develop a Bank Account System where:
//withdraw(double amount) method:
//Throws InsufficientBalanceException if withdrawal amount exceeds balance.
//Throws IllegalArgumentException if the amount is negative.
//Handle exceptions in main().

// Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        try {
            account.withdraw(6000); // Attempting to withdraw more than balance
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
