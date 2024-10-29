//Exercise 2: Creating and Using Classes
//Task:
//Create a Car class with the following attributes:
//•model (String)
//•color (String)
//•speed (int)
//In the main method, create three objects of the Car class representing different car models. Use the constructor to
// initialize the attributes. Print the details of each car.
//Expected Output:
//Details of each car (model, color, and speed).

package Exercise02.uet;
public class Main {
    public static void main(String[] args) {
        Car gWagon = new Car("G-Wagon", "red", 150);
        Car mercedes = new Car("Mercedes", "Silver", 180);
        Car vigo = new Car("Vigo", "black", 140);

        System.out.println("The first object of class Car is: Model: " + gWagon.model + ", Color: " + gWagon.color + "," +
                " Speed: " + gWagon.speed + "km/h");
        System.out.println("The second object of class Car is: Model: " + mercedes.model + ", Color: " + mercedes.color + ", " +
                "Speed: " + mercedes.speed + "km/h");
        System.out.println("The third object of class Car is: Model: " + vigo.model + ", Color: " + vigo.color + ", " +
                "Speed: " + vigo.speed + "km/h");
    }
}
