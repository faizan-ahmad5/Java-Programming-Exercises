//Exercise 9: VIP Customer Class
//Task:
//Create a VIPCustomer class with the following attributes:
//•	name (String)
//•	creditLimit (double)
//•	email (String)
//Implement three overloaded constructors:
//1.A constructor that takes all three attributes.
//2.A constructor that takes two attributes (name and creditLimit) and sets a default email.
//3.A constructor that takes only the name and sets default values for the other two attributes.
//Create objects using each constructor and print their details.
//Expected Output:
//Details of VIP customers, demonstrating how different constructors initialize the objects.

package Exercise09.uet;

public class Main {
    public static void main(String[] args) {
        VIPCustomer threeArg = new VIPCustomer("Ahmad", 32.4, "ahmad@gmail.com");
        System.out.println("Constructor with three arguments:");
        System.out.println("Name: " + threeArg.getName() + ", Credit Limit: " + threeArg.getCreditLimit() + ", Email: " + threeArg.getEmail());

        VIPCustomer twoArg = new VIPCustomer("Sarah", 50.0);
        System.out.println("\nConstructor with two arguments:");
        System.out.println("Name: " + twoArg.getName() + ", Credit Limit: " + twoArg.getCreditLimit() + ", Email: " + twoArg.getEmail());

        VIPCustomer oneArg = new VIPCustomer("Faizan Ahmad");
        System.out.println("\nConstructor with one argument:");
        System.out.println("Name: " + oneArg.getName() + ", Credit Limit: " + oneArg.getCreditLimit() + ", Email: " + oneArg.getEmail());
    }
}

