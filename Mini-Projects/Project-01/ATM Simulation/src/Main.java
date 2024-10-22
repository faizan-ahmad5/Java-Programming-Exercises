// ATM Simulation Program
// Objective:
// Write a Java program that simulates a basic ATM machine. The program should allow a user to
// perform banking operations such as checking their balance, depositing money, withdrawing
// money, and exiting the system. The program should make use of methods, method overloading,
// primitive data types, conditional logic, loops, and scanners for taking inputs.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;
        System.out.println("Welcome to the ATM System!");

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1, 2, 3, 4): ");

            // Validate user input for menu option
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        checkBalance(balance);
                        break;

                    case 2:
                        System.out.print("Enter the amount to deposit: ");
                        // Validate if input is int or double for deposit
                        if (scanner.hasNextDouble()) {
                            double depositAmount = scanner.nextDouble();
                            balance = depositMoney(depositAmount, balance);  // Deposit double
                        } else if (scanner.hasNextInt()) {
                            int depositAmount = scanner.nextInt();
                            balance = depositMoney(depositAmount, balance);  // Deposit int
                        } else {
                            System.out.println("Invalid input! Please enter a valid number.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        System.out.print("Enter the amount to withdraw: ");
                        // Validate if input is a double for withdrawal
                        if (scanner.hasNextDouble()) {
                            double withdrawAmount = scanner.nextDouble();
                            balance = withdrawMoney(withdrawAmount, balance);
                        } else {
                            System.out.println("Invalid input! Please enter a valid number.");
                            scanner.next();
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        scanner.close();
                        return;

                    default:
                        // Handle invalid menu option
                        System.out.println("Please choose a valid option!");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (1, 2, 3, or 4).");
                scanner.next();
            }
        }
    }
    // Method to display current balance
    public static void checkBalance(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit an integer amount (method overloading)
    public static double depositMoney(int amount, double balance) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Your new balance is: $" + balance);
        } else {
            System.out.println("Please enter a valid deposit amount!");
        }
        return balance;
    }

    // Method to deposit a double amount (method overloading)
    public static double depositMoney(double amount, double balance) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Your new balance is: $" + balance);
        } else {
            System.out.println("Please enter a valid deposit amount!");
        }
        return balance;
    }

    // Method to withdraw money
    public static double withdrawMoney(double amount, double balance) {
        if (amount <= 0) {
            System.out.println("Please enter a valid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Your new balance is: $" + balance);
        }
        return balance;
    }
}
