//Exercise 18: Temperature Converter (Celsius to Fahrenheit)
//3.	Task: Create a program that converts temperature from Celsius to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32.
//o	Hint: Use a double variable for the Celsius input and the Fahrenheit result.
//o	Expected Output:
//Celsius: [Your Celsius Value]
//Fahrenheit: [Calculated Fahrenheit]

public class Main {
    public static void main(String[] args) {

        double celsius = 37.70;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
