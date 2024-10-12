//Exercise 10: Converting Pounds to Kilograms
//10.	Task: Write a program to convert pounds to kilograms (1 pound = 0.45359237 kg).
// Declare a double variable for pounds and calculate the equivalent kilograms. Print both values.
//o	Expected Output:
//Pounds: [Your Pounds Value]
//Kilograms: [Calculated Kilograms]

public class Main {
    public static void main(String[] args) {
        double pound = 12;
        double onePoundValue = 0.45359237;
        double kilogram = pound * onePoundValue;
        System.out.println("Pounds: " + pound);
        System.out.println("Kilograms: " + kilogram);
    }
}
