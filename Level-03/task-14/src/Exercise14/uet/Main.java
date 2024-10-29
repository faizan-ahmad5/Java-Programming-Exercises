package Exercise14.uet;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345");
        account1.printAccountDetails();

        BankAccount account2 = new BankAccount("67890", 500);
        account2.printAccountDetails();

        BankAccount account3 = new BankAccount("54321", 1000, "Faizan");
        account3.printAccountDetails();
    }
}

