//Exercise 15: Conclusion and Cleanup
//15.	Task: Go through all your code, ensure it compiles and runs correctly,
// and print any final messages or observations you have made during the lab session.

public class Main {
    public static void main(String[] args) {

        // Exercise 5: Working with Primitive Data Types
        byte byteContainer = 102;
        short shortContainer = 21;
        int intContainer = 1;
        long longContainer = 2423234293848223423L;
        float floatContainer = 21.2f;
        double doubleContainer = 2.232;
        char charContainer = 'f';
        boolean booleanContainer = true;

        System.out.println("Byte value: " + byteContainer);
        System.out.println("Short value: " + shortContainer);
        System.out.println("Int value: " + intContainer);
        System.out.println("Long value: " + longContainer);
        System.out.println("Float value: " + floatContainer);
        System.out.println("Double value: " + doubleContainer);
        System.out.println("Char value: " + charContainer);
        System.out.println("Boolean value: " + booleanContainer);

        // Exercise 12: Basic Conditional Logic (if-else)
        int number = 5;
        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("Number is less than or equal to 10.");
        }

        // Exercise 13: Using Ternary Operator
        boolean isAvailable = false;
        boolean available = isAvailable ? true : false;
        System.out.println("Availability: " + available);

        // Exercise 14: Exploring Strings
        String originalMessage = "Hello";
        System.out.println("Initial String: " + originalMessage);
        String modifiedMessage = "World";
        System.out.println("Modified String: " + modifiedMessage);

        // Conclusion and Final Observations
        System.out.println("--- Final Observations ---");
        System.out.println("1. I have successfully demonstrated the use of different data types in Java.");
        System.out.println("2. The if-else statement works effectively for basic conditional logic.");
        System.out.println("3. The ternary operator provides a concise way to evaluate conditions.");
        System.out.println("4. I observed that strings in Java are immutable, as shown in the string exploration exercise.");
        System.out.println("5. Overall, the exercises reinforced my understanding of fundamental Java concepts.");
    }
}
