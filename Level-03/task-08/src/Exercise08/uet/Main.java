//Exercise 8: Constructor Chaining
//Task:
//In the BankAccount class, implement constructor chaining. If only the accountNumber is provided, call the constructor
// that sets the default balance and accountHolder. Create objects using different constructors to demonstrate this feature.
//Expected Output:
//Account details printed, showing how constructors are called through chaining

package Exercise08.uet;

public class Main {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("F1112", 131.00, "Faizan Ahmad");
        BankAccount customer2 = new BankAccount("F2222");

        System.out.println("Account Number: " + customer1.getAccountNumber());
        System.out.println("Account Holder: " + customer1.getAccountHolder());
        System.out.println("Balance: " + customer1.getBalance());

        System.out.println("\nAccount Number: " + customer2.getAccountNumber());
        System.out.println("Account Holder: " + customer2.getAccountHolder());
        System.out.println("Balance: " + customer2.getBalance());
    }
}