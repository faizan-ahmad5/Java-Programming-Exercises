//Exercise 16: Simple Calculator
//1.	Task: Write a program that acts as a basic calculator. It should take two integers and perform addition, subtraction, multiplication, and division on them. Use int data types for inputs and the result.
//o	Hint: You can hardcode the values for this exercise.
//o	Expected Output:
//Number 1: [Your First Number]
//Number 2: [Your Second Number]
//Addition: [Result of Addition]
//Subtraction: [Result of Subtraction]
//Multiplication: [Result of Multiplication]
//Division: [Result of Division]

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
    }
}
