//Exercise 11: Passing Arguments to Functions
//Task:
//Create a function named displayEmployeeInfo that accepts an employee's name (as a string) and their year of birth (as an integer)
// as input parameters. The function should calculate the employee's age based on the current year and print a formatted message
// that includes both the name and the calculated age. In the main method, call this function multiple times with different
// employee names and years of birth to demonstrate its functionality.
//Steps to Complete:
//1.Define the displayEmployeeInfo function that calculates the age based on the current year and the year of birth.
//2.In the main method, call the function with different employee names and years of birth.
//3.Ensure the output is well-structured and easy to read.
//Expected Output:
//The program should output messages like:
// “Employee Name: [name], Age: [calculated age]”
//For example:
//“Employee Name: John Doe, Age: 30” (if the current year is 2024 and the year of birth is 1994)
//“Employee Name: Jane Smith, Age: 25” (if the current year is 2024 and the year of birth is 1999)

public class Main {
    public static void main(String[] args) {
        displayEmployeeInfo("Faizan Ahmad Khan", 2004);
        displayEmployeeInfo("John Doe", 1994);
        displayEmployeeInfo("Jane Smith", 1999);
    }

    public static void displayEmployeeInfo(String name, int yearOfBirth) {
        int currentAge = 2024 - yearOfBirth;
        System.out.println("Employee Name: " + name + ", Age: " + currentAge);
    }
}
