//Exercise 3: Implementing Setters and Getters
//Task:
//Modify the Car class from Exercise 2 to use private attributes and provide setter and getter methods for each.
//Use the setter method to validate that the speed cannot be negative. Print the car details using the getter methods.
//Expected Output:
//Car details printed using getter methods, with validation ensuring speed is non-negative.

package Exercise03.uet;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("G-Wagon");
        System.out.println("Car Model: " + car.getModel());

        car.setColor("Black");
        System.out.println("Car Color: " + car.getColor());

        car.setSpeed(180);
        System.out.println("Car Speed: " + car.getSpeed() + " km/h");

    }
}

