//Exercise 17: Area and Perimeter of a Rectangle
//2.	Task: Write a program that calculates the area and perimeter of a rectangle.
// Use two int variables for length and width, and calculate the area (length * width) and perimeter (2 * (length + width)).
//o	Expected Output:
//Length: [Your Length Value]
//Width: [Your Width Value]
//Area: [Calculated Area]
//Perimeter: [Calculated Perimeter]

public class Main {
    public static void main(String[] args) {

        int length = 20;
        int width = 50;

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
