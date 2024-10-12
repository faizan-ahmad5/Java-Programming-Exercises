//Exercise 9: Accessing Variables Within Code Blocks
//Task:
//Write a program that declares a variable inside an if block and attempts to access it outside the block.
// Analyze the result and explain the scope of the variable.
//Expected Output:
//The program should explain why the variable is inaccessible outside the block.


public class Main {
    public static void main(String[] args) {
        int num = 2;

        if (num > 0) {
            String message = "The number is greater than 0";
        }
        // Trying to access variable outside the if block
        // This will result in a compilation error because 'message' is not in scope here.
        System.out.println(message);  // Error: 'message' cannot be resolved to a variable
    }
}


//Why is the variable inaccessible?: The variable message is declared inside the if block, so it is not available outside of that block.
//This is because the scope of a variable declared within a block is limited to that block.