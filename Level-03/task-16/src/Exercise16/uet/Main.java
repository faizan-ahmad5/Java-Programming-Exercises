//Exercise 16: Final Bank Application with All Features
//        Task:
//        Combine all features from the previous exercises into a single Bank application. The program should:
//        1.	Allow the user to create a BankAccount object with an auto-generated account number.
//        2.	Use constructors to initialize the account.
//        3.	Implement methods to deposit and withdraw funds.
//        4.	Validate the data entered for balance and withdrawals.
//        Expected Output:
//        A fully functional bank application with user interactions, account creation, deposits, withdrawals, and validation.

package Exercise16.uet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String generatedAccountNumber = BankAccount.generateAccountNumber();

        // Get account holder's name and initial deposit from user
        System.out.print("Enter the account holder's name: ");
        String accountHolderName = scanner.nextLine();

        double initialDeposit = 0;
        boolean validDeposit = false;

        // Loop until a valid deposit amount is entered
        while (!validDeposit) {
            System.out.print("Enter the initial deposit amount: ");
            if (scanner.hasNextDouble()) {
                initialDeposit = scanner.nextDouble();
                if (initialDeposit >= 0) {
                    validDeposit = true;
                } else {
                    System.out.println("Invalid amount. Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }

        // Create a new BankAccount with the generated account number
        BankAccount account = new BankAccount(generatedAccountNumber, initialDeposit, accountHolderName);

        // Print account details
        System.out.println("\nAccount created successfully!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        // Interactive loop for deposits and withdrawals
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = 0;

            // Validate menu choice
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        break; // Valid choice, exit loop
                    } else {
                        System.out.println("Invalid choice. Please select a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input
                }
            }

            switch (choice) {
                case 1:
                    double depositAmount = 0;
                    // Loop until a valid deposit amount is entered
                    while (true) {
                        System.out.print("Enter the amount to deposit: ");
                        if (scanner.hasNextDouble()) {
                            depositAmount = scanner.nextDouble();
                            if (depositAmount > 0) {
                                account.deposit(depositAmount);
                                break; // Valid deposit, exit loop
                            } else {
                                System.out.println("Invalid deposit amount. Must be greater than 0.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a numeric value.");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;
                case 2:
                    double withdrawAmount = 0;
                    // Loop until a valid withdrawal amount is entered
                    while (true) {
                        System.out.print("Enter the amount to withdraw: ");
                        if (scanner.hasNextDouble()) {
                            withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount > 0) {
                                account.withdraw(withdrawAmount);
                                break; // Valid withdrawal, exit loop
                            } else {
                                System.out.println("Invalid withdrawal amount. Must be greater than 0.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a numeric value.");
                            scanner.next(); // Clear invalid input
                        }
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }

        System.out.println("Thank you for using the banking application!");
        scanner.close();
    }
}
