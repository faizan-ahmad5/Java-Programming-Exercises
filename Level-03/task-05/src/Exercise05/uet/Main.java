//Exercise 5: Using ‘this’ Keyword
//Task:
//Modify the BankAccount class from Exercise 4 to include setter methods. Use the this keyword within the
// setters to assign values to the attributes. Add a condition to check that the balance is not negative
// when setting the value. Print the account details using getter methods.
//Expected Output:
//Account details printed with valid values using getter methods, with this keyword used in setters.

package Exercise05.uet;

public class Main {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount();

        customer.setAccountNumber("F2311");
        System.out.println("Account Number: " + customer.getAccountNumber());

        customer.setBalance(52312);
        System.out.println("Balance: " + customer.getBalance());

        customer.setAccountHolder("Faizan Ahmad");
        System.out.println("Account Holder: " + customer.getAccountHolder());

    }
}
