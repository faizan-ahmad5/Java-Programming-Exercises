//Exercise 19: Sum of Digits
//4.	Task: Write a program that takes a three-digit number and calculates the sum of its digits. For example, if the input is 123, the sum will be 1 + 2 + 3 = 6.
//o	Hint: Use arithmetic operators like division (/) and modulus (%) to extract digits.
//o	Expected Output:
//Input number: [Your Input Number]
//Sum of digits: [Calculated Sum]

public class Main {
    public static void main(String[] args) {
        int number = 123;

        int firstDigit = number / 100; // Extracts the first digit (1)
        int secondDigit = (number / 10) % 10; // Extracts the second digit (2)
        int thirdDigit = number % 10; // Extracts the third digit (3)

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("Input number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}
