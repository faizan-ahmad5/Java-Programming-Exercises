//Exercise 6: Inheritance and Super Keyword
// Task: Create a class Employee with properties like name and salary. Derive a class
//Manager from Employee and add an additional property department. Use the super
//keyword to initialize inherited properties. Display the details of a manager.
// Output:
//Name: John Doe
//Salary: 60000
//Department: Sales

package Exercise06.uet;

public class Main {
    public static void main(String[] args) {
            Manager manager = new Manager("John Doe", 60000, "Sales");

            System.out.println("Name: " + manager.getName());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println("Department: " + manager.getDepartment());

        }
}
