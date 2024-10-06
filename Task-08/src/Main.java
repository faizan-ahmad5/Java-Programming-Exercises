//Exercise 8: Working with Long and Double
//8.	Task: Declare a long variable with the value 10000000000L and a double variable with a value of your choice.
// Print both values. Demonstrate why adding L is important for long data types.
//o	Expected Output:
//Long value: 10000000000
//Double value: [Your Double Value]

public class Main {
    public static void main(String[] args) {
        // Correct usage with L suffix
        long longVarWithL = 10000000000L; // This will work
        double doubleVar = 122312.232; // Example double value
        System.out.println("Long value with L: " + longVarWithL);
        System.out.println("Double value: " + doubleVar);
        // Demonstrating the incorrect way without L suffix
        // long longVarWithoutL = 10000000000; // This will cause a compilation error

        // To illustrate the error, let's just show it as a comment:
        System.out.println("If we try to do this without L:");
        System.out.println("long longVarWithoutL = 10000000000; // This causes a compilation error");
    }
}
