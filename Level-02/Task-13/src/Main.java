//Exercise 13: Combining Method Overloading with Conditional Logic
//Task:
//Create a method named calculateResult that is overloaded to handle both integers and doubles. Each version of the
// method should perform different calculations based on the input type. For integers, calculate the sum of the integer
// with a predefined constant and the factorial of that integer. For doubles, calculate the total cost after applying
// a discount and the total tax on that amount. In the main method, call the calculateResult method for each data type
// and print the results.
//Steps to Complete:
// 1.Define the overloaded calculateResult method:
//o	For the integer version, calculate and return both the sum of the integer with a predefined constant (e.g., 10)
// and the factorial of the integer.
//o	For the double version, calculate and return both the total cost after applying a discount (e.g., a 10% discount
// on the original price) and the total tax (e.g., 5% tax) on that amount.
//2.In the main method, call the integer version of calculateResult with a sample integer (e.g., 5) and print the results.
//3.Call the double version of calculateResult with a sample double (e.g., 200.0) and print the results.
//4.Ensure that the output is clear and well-structured, providing context for each result.
//Expected Output:
//The program should output messages like:
//“For integer 5: Sum with constant = 15, Factorial = 120”
//“For double 200.0: Total cost after discount = 180.0, Total tax = 9.0”

public class Main {
    public static void main(String[] args) {
        int num = 5;
        calculateResult(num);

        double price = 200.0;
        calculateResult(price);
    }

    public static void calculateResult(int a) {
        int constant = 10;
        int sum = constant + a;
        int fact = getFactorial(a);
        System.out.println("For integer " + a + ": Sum with constant = " + sum + ", Factorial = " + fact);
    }

    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void calculateResult(double originalPrice) {
        double discount = 0.10;
        double discountAmount = originalPrice * discount;
        double discountedPrice = originalPrice - discountAmount;
        double tax = 0.05;
        double totalTax = discountedPrice * tax;
        System.out.println("For double " + originalPrice + ": Total cost after discount = " + discountedPrice + ", Total tax = " + totalTax);
    }
}
