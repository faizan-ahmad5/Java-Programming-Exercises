//Exercise 6: Function with Conditional Logic
//Task:
//Write a function that accepts an integer as an argument, checks if it's even or odd, and returns the corresponding message.
//Expected Output:
//The function will return a message indicating whether the number is even or odd.


public class Main {
    public static void main(String[] args) {
        int num = 1;
        String returnedValue = evenOrOdd(num);
        System.out.println(returnedValue);
    }

    public static String evenOrOdd(int a) {
        boolean even = (a % 2) == 0;
        if (even) {
           return "The number is even";
        }else  {
           return  "The number is odd";
        }
    }
}