//Exercise 10: Returning Values from Functions
//Task:
//Create a function named calculateRectangleArea that takes the length and width of a rectangle as parameters,
// computes the area, and returns the result. In the main method, call this function using predefined values for
// the length and width, and display the area in a user-friendly message.
//Steps to Complete:
// 1.Define the calculateRectangleArea function.
// 2.In the main method, set predefined values for the length and width of the rectangle.
//3.Call the calculateRectangleArea function with these values and store the returned result.
//4.Print a message displaying the area of the rectangle.
//Expected Output:
//The program should output a message like:
//“The area of the rectangle with length [length] and width [width] is [area].”

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int width = 2;
        int area = calculateRectangleArea(length, width);
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area + ".");
    }

    public static int calculateRectangleArea(int length, int width) {
        return length * width;
    }
}
