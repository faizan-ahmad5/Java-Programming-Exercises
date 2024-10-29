//Exercise 4: Constructor Overloading
//Task:
//Create a class BankAccount with the following private attributes:
//•accountNumber (String)
//•balance (double)
//•accountHolder (String)
//Implement two constructors:
//•A constructor with all three attributes as parameters.
//•A constructor that only takes accountNumber and sets the default balance to 0 and accountHolder to "Unknown".
//Create objects using both constructors and print the account details.
//Expected Output:
//Account details printed for objects created with both constructors.

package Exercise04.uet;

public class Main {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("F1112", 1312.00, "Faizan Ahmad");
        BankAccount customer2 = new BankAccount("G2221");

        System.out.println("Account Details for Customer 1:");
        System.out.println("Account Number: " + customer1.getAccountNumber());
        System.out.println("Balance: " + customer1.getBalance());
        System.out.println("Account Holder: " + customer1.getAccountHolder());

        System.out.println("\nAccount Details for Customer 2:");
        System.out.println("Account Number: " + customer2.getAccountNumber());
        System.out.println("Balance: " + customer2.getBalance());
        System.out.println("Account Holder: " + customer2.getAccountHolder());
    }
}