//Exercise 11: Exploring Polymorphism with Method Overriding
//Task: Create a base class named Shape with a method draw(). Then, create two subclasses,
//Circle and Square, each overriding the draw() method to display a specific message for the
//shape. Demonstrate polymorphism by creating a Shape reference that can point to objects of both
//Circle and Square.
//Expected Output:
//When calling the draw() method on the Shape reference, it should output the specific messages
//for both shapes.

package Exercise11.uet;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Reference to Circle
        Shape square = new Square(); // Reference to Square

        circle.draw();
        square.draw();
    }
}

