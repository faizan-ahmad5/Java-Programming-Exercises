//Exercise 9: Conversion between Types (Casting)
//9.	Task: Convert a double value (e.g., 5.99) to an int and print the result.
//o	Expected Output:
//Double value: 5.99
//After casting to int: 5

public class Main {
    public static void main(String[] args) {
        double doubleContainer = 5.99;
        int doubleToInt = (int)(doubleContainer);

        System.out.println("Double value:" + doubleContainer);
        System.out.println("After casting to int:" + doubleToInt);
    }
}
