// Abstract base class
abstract class BankAccount {
    protected double balance;

    // Public constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Abstract withdraw method
    public abstract void withdraw(double amount);

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Withdraw only if balance remains at least $100
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Savings withdrawal: $" + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 required.");
        }
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    // Withdraw with $1 transaction fee
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + 1; // $1 fee
        if (balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println("Checking withdrawal: $" + amount + " (Fee: $1)");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(500);
        CheckingAccount checking = new CheckingAccount(300);

        // Savings Account operations
        savings.deposit(100);
        savings.withdraw(450); // should fail
        savings.withdraw(300); // should succeed
        System.out.println("Savings Balance: $" + savings.getBalance());

        System.out.println();

        // Checking Account operations
        checking.deposit(50);
        checking.withdraw(100);
        System.out.println("Checking Balance: $" + checking.getBalance());
    }
}