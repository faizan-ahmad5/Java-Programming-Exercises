//Exercise 9: Exception Handling
// Task: Create a method divide(int a, int b) that throws an ArithmeticException
//when dividing by zero. Implement a try-catch block to handle this exception and display
//an appropriate message.
// Output:
//Cannot divide by zero.

package Exercise09.uet;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException err) {
            System.out.println(err.getMessage());
        }
    }
}
