//Exercise 3: Method Overriding
// Task: Create a base class Shape with a method area(). Derive classes Circle and
//Rectangle from Shape and override the area() method to return the area of the
//respective shape. Demonstrate polymorphism using an array of Shape references.
// Output:
//Circle Area: 78.5
//Rectangle Area: 30.0

package Exercise03.uet;

public class Main {
    public static void main(String[] args) {
        // Array of Shape references
        Shape[] shapesArray = { new Circle(5), new Rectangle(5, 6) };

        // Loop through each shape and call calculateArea()
        for (Shape shape : shapesArray) {
            shape.calculateArea();
        }
    }
}
