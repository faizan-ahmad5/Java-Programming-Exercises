package Exercise08.uet;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 100.0, "Default Holder");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Update the balance
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        } else if (amount > 0) {
            balance -= amount; // Update the balance
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}