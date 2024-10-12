//Exercise 5: Writing a Simple Function
//Task:
//Write a function that takes two integer inputs, multiplies them, and returns the result.
// Call the function from the main method and print the result.
//Expected Output:
//The product of the two integers.


public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int returnedValue = multiply(num1, num2);
        System.out.println("The product of the two integers is " + returnedValue);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
