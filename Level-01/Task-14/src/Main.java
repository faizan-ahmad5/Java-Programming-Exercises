//Exercise 14: Exploring Strings
//14.	Task: Declare a String variable and assign a value to it.
// Print the string, and then reassign a new value and print again to observe the immutability of strings.
//o	Expected Output:
//Initial String: [Your String]
//Modified String: [New String]

public class Main {

    public static void main(String[] args) {
        String originalMessage = "Hello";
        System.out.println("Initial String: " + originalMessage);
        // Reassigning a new value to a different variable to show immutability
        String modifiedMessage = originalMessage + ", World!";
        System.out.println("Modified String: " + modifiedMessage);
        System.out.println("Original String after modification: " + originalMessage);
    }
}

