//Exercise 11: Implementing a Simple Class for Employee
//Task:
//Create an Employee class with attributes like name, ID, and salary. Implement getter and setter methods for each attribute
// and a method increaseSalary that increases the employee's salary by a certain percentage. Create an object of the Employee
// class and call the increaseSalary method. Print the employee details before and after the salary increase.
//Expected Output:
//Employee details before and after salary increase.
package Exercise10.uet;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setID(123);
        emp1.setName("Faizan Ahmad");
        emp1.setSalary(3121);

        System.out.println("Employee details before salary increase:");
        System.out.println("ID: " + emp1.getID());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());

        emp1.increaseSalary();

        System.out.println("\n" + "Employee details after salary increase:");
        System.out.println("ID: " + emp1.getID());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
    }
}