//Exercise 7: Account Management Application
//Task:
//Extend the BankAccount class from the previous exercises by adding methods for depositing and withdrawing funds:
//•	deposit(double amount)
//•	withdraw(double amount)
//Ensure the withdraw method checks if there are sufficient funds before making a withdrawal. Print a message if
// the withdrawal is successful or fails due to insufficient funds.
//Expected Output:
//Account balance after deposits and withdrawals, with a message if funds are insufficient.

package Exercise07.uet;
public class Main {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("F1112", 131.00, "Faizan Ahmad");
        System.out.println("Account Number: " + customer1.getAccountNumber());
        System.out.println("Account Holder: " + customer1.getAccountHolder());
        System.out.println("Initial Balance: " + customer1.getBalance());

        customer1.deposit(2000.0);
        System.out.println("Balance after deposit: " + customer1.getBalance());

        customer1.withdraw(500.0); // Successful withdrawal
        System.out.println("Balance after withdrawal: " + customer1.getBalance());
    }
}
