//Exercise 12: Using Method Overloading for Input Types
//Task:
//Create a method named printValue that is overloaded to handle different input types: integer, float, and double.
// This method should be used to print the details of various financial transactions. In the main method, call the printValue
// method for each data type with meaningful examples like a product price (float), a quantity (integer), and an account balance (double).
//Steps to Complete:
//1.Define the printValue method three times: once for integers, once for floats, and once for doubles.
//2.Each version of the method should print a formatted message describing what the value represents
// (e.g., "Quantity:", "Product Price:", "Account Balance:").
//3.In the main method, call each overloaded version of the printValue method with appropriate hardcoded values.
//4.Ensure the output is clear and informative.
//Expected Output:
//The program should output messages like:
// “Quantity: 10”
// “Product Price: 19.99”
// “Account Balance: 1500.75”

public class Main {
    public static void main(String[] args) {
        printValue(10);
        printValue(19.99f);
        printValue(1500.75);
    }

    public static void printValue(int quantity) {
        System.out.println("Quantity: " + quantity);
    }

    public static void printValue(float price) {
        System.out.println("Product Price: " + price);
    }

    public static void printValue(double balance) {
        System.out.println("Account Balance: " + balance);
    }
}
