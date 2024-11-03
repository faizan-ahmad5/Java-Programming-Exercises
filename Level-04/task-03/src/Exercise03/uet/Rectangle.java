package Exercise03.uet;

// Rectangle class extending Shape
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}