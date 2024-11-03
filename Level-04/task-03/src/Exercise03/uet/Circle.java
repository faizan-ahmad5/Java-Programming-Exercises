package Exercise03.uet;

// Circle class extending Shape
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

