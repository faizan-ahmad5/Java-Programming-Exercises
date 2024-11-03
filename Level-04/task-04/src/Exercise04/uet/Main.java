//Exercise 4: Reference vs Object
// Task: Create a class Car with a model property. Instantiate a Car object and use a
//reference variable to access and display the car's model.
// Output:
//Car Model: Tesla Model 3

package Exercise04.uet;

public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car carObj = new Car();

        // Use a reference variable to point to the Car object
        Car refVariable = carObj;

        // Set the model of the car using the reference variable
        refVariable.setModel("Tesla Model 3");

        // Display the car model using the reference variable
        System.out.println("Car Model: " + refVariable.getModel());
    }
}
