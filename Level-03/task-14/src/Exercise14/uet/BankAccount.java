package Exercise14.uet;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.setBalance(balance);
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber, double balance) {
        this(accountNumber, balance, "Default Account Holder"); // Default account holder name
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0, "Default Account Holder"); // Default balance and account holder
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance. Balance cannot be negative.");
            this.balance = 0;
        } else {
            this.balance = balance;
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

    public void printAccountDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

}
