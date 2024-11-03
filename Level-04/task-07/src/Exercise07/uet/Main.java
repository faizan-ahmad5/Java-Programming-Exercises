//Exercise 7: Abstract Classes
// Task: Create an abstract class Appliance with an abstract method turnOn(). Derive
//classes WashingMachine and Refrigerator from Appliance and implement the
//turnOn() method. Demonstrate the functionality.
// Output:
//Washing Machine is now ON.
//Refrigerator is now ON.

package Exercise07.uet;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.turnOn();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.turnOn();
    }
}
