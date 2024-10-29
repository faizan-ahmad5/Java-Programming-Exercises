//Exercise 15: Constructor Validation
//Task:
//Modify the VIPCustomer class to validate the creditLimit in the constructor. If the credit limit is negative,
// set it to 0 and print a warning message. Create objects with different credit limits and demonstrate this validation.
//Expected Output:
//Credit limit validation messages, with details of the VIPCustomer objects.

package Exercise15.uet;

public class Main {
    public static void main(String[] args) {
        VIPCustomer customer1 = new VIPCustomer("Faizan", -500, "faizanahmad@gmail.com");
        customer1.printCustomerDetails();

        VIPCustomer customer2 = new VIPCustomer("Ahmad", 1000);
        customer2.printCustomerDetails();

        VIPCustomer customer3 = new VIPCustomer("khan");
        customer3.printCustomerDetails();
    }
}
