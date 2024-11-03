//Exercise 5: Method Overloading
// Task: Implement a class Calculator with overloaded methods for add(). Create
//methods to add two integers, three integers, and two doubles. Display the results of each
//method call.
// Output:
//Sum of 3 and 5: 8
//Sum of 3, 4, and 5: 12
//Sum of 2.5 and 3.5: 6.0

package Exercise05.uet;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(3,5);
        calculator.add(3,4,5);
        calculator.add(2.5,3.5);
    }
}
