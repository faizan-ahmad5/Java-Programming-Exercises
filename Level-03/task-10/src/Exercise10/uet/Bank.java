package Exercise10.uet;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    private int accountNumber;
    private String accountHolder;
    private int initialDeposit;

    public Bank() {
        generateAccountNumber();
        inputAccountDetails();
        displayAccountDetails();
    }

    private void generateAccountNumber() {
        Random rand = new Random();
        accountNumber = rand.nextInt(1000);
    }

    private void inputAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account holder's name: ");
        accountHolder = scanner.nextLine();

        System.out.print("Enter the initial deposit: ");
        initialDeposit = scanner.nextInt();
    }

    private void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Initial Deposit: $" + initialDeposit);
    }
}
