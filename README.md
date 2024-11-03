# Java Programming Exercises

This repository contains a collection of Java programming exercises, structured into different difficulty levels along with a set of Mini Projects. These exercises cover essential programming concepts, providing a hands-on approach for mastering Java.

## Table of Contents
- [Level 1 Tasks](#level-1-tasks)
- [Level 2 Tasks](#level-2-tasks)
- [Level 3 Tasks](#level-3-tasks)
- [Level 4 Tasks](#level-4-tasks)
- [Mini Projects](#mini-projects)
  
## Level 1 Tasks

### Exercise 1: Setting Up Your First Java Program
- **Task**: Create a new project in IntelliJ, and write a Java program that prints “Hello, World!”.
- **Expected Output**:
  ```
  Hello, World!
  ```

### Exercise 2: Declaring a Class and Main Method
- **Task**: Declare a new class named `FirstClass` and within that, declare the main method as discussed in the lecture.
- **Expected Output**: No specific output required yet, but the code should compile without errors.

### Exercise 3: Understanding Code Blocks and Statements
- **Task**: Within the main method, write a statement that outputs your name to the console using `System.out.println()`.
- **Expected Output**:
  ```
  My name is [Your Name]
  ```

### Exercise 4: Declaring Variables and Printing Their Values
- **Task**: Declare an integer variable `age` and set its value to your age. Then, print it using `System.out.println()`.
- **Expected Output**:
  ```
  My age is: [Your Age]
  ```

### Exercise 5: Working with Primitive Data Types
- **Task**: Declare variables for different data types: byte, short, int, long, float, double, char, and boolean. Assign values to each and print them.
- **Expected Output**:
  ```
  Byte value: [Your Byte Value]
  Short value: [Your Short Value]
  Int value: [Your Int Value]
  Long value: [Your Long Value]
  Float value: [Your Float Value]
  Double value: [Your Double Value]
  Char value: [Your Char Value]
  Boolean value: [Your Boolean Value]
  ```

### Exercise 6: Wrapper Classes and MIN/MAX Values
- **Task**: Use the wrapper class for `int` (`Integer`) to print the minimum and maximum values.
- **Expected Output**:
  ```
  Min int value: -2147483648
  Max int value: 2147483647
  ```

### Exercise 7: Demonstrating Overflow and Underflow
- **Task**: Assign the value `2147483647` to an `int` variable and add `1`. Print the result to observe overflow. Repeat for a byte variable.
- **Expected Output**:
  ```
  Maximum value of int: [originally assigned value]
  Maximum value of byte: [originally assigned value]
  Overflow example with int: [Overflowed Value]
  Overflow example with byte: [Overflowed Value]
  Underflow example with int: [Underflowed Value]
  Underflow example with byte: [Underflowed Value]
  ```

### Exercise 8: Working with Long and Double
- **Task**: Declare a long variable with the value `10000000000L` and a double variable with a value of your choice. Print both values. Demonstrate why adding `L` is important for long data types.
- **Expected Output**:
  ```
  Long value: 10000000000
  Double value: [Your Double Value]
  ```

### Exercise 9: Conversion between Types (Casting)
- **Task**: Convert a double value (e.g., `5.99`) to an int and print the result.
- **Expected Output**:
  ```
  Double value: 5.99
  After casting to int: 5
  ```

### Exercise 10: Converting Pounds to Kilograms
- **Task**: Write a program to convert pounds to kilograms (1 pound = 0.45359237 kg). Declare a double variable for pounds and calculate the equivalent kilograms. Print both values.
- **Expected Output**:
  ```
  Pounds: [Your Pounds Value]
  Kilograms: [Calculated Kilograms]
  ```

### Exercise 11: Working with Char and Boolean
- **Task**: Declare a char variable and assign a Unicode character. Also, declare a boolean variable and assign it true. Print both values.
- **Expected Output**:
  ```
  Char value: [Your Unicode Character]
  Boolean value: true
  ```

### Exercise 12: Basic Conditional Logic (if-else)
- **Task**: Write an if-else statement that checks whether a number is greater than 10. If it is, print “Number is greater than 10”; otherwise, print “Number is less than or equal to 10.”
- **Expected Output**:
  ```
  Number is [Condition Result]
  ```

### Exercise 13: Using Ternary Operator
- **Task**: Use a ternary operator to check whether a boolean value `isAvailable` is true or false, and print the result.
- **Expected Output**:
  ```
  Availability: [true/false]
  ```

### Exercise 14: Exploring Strings
- **Task**: Declare a String variable and assign a value to it. Print the string, and then reassign a new value and print again to observe the immutability of strings.
- **Expected Output**:
  ```
  Initial String: [Your String]
  Modified String: [New String]
  ```

### Exercise 15: Conclusion and Cleanup
- **Task**: Go through all your code, ensure it compiles and runs correctly, and print any final messages or observations you have made during the lab session.

### Exercise 16: Simple Calculator
- **Task**: Write a program that acts as a basic calculator. It should take two integers and perform addition, subtraction, multiplication, and division on them.
- **Expected Output**:
  ```
  Number 1: [Your First Number]
  Number 2: [Your Second Number]
  Addition: [Result of Addition]
  Subtraction: [Result of Subtraction]
  Multiplication: [Result of Multiplication]
  Division: [Result of Division]
  ```

### Exercise 17: Area and Perimeter of a Rectangle
- **Task**: Write a program that calculates the area and perimeter of a rectangle.
- **Expected Output**:
  ```
  Length: [Your Length Value]
  Width: [Your Width Value]
  Area: [Calculated Area]
  Perimeter: [Calculated Perimeter]
  ```

### Exercise 18: Temperature Converter (Celsius to Fahrenheit)
- **Task**: Create a program that converts temperature from Celsius to Fahrenheit using the formula: `Fahrenheit = (Celsius * 9/5) + 32`.
- **Expected Output**:
  ```
  Celsius: [Your Celsius Value]
  Fahrenheit: [Calculated Fahrenheit]
  ```

### Exercise 19: Sum of Digits
- **Task**: Write a program that takes a three-digit number and calculates the sum of its digits.
- **Expected Output**:
  ```
  Input number: [Your Input Number]
  Sum of digits: [Calculated Sum]
  ```

### Exercise 20: Grade Calculator
- **Task**: Write a program that takes a student's marks out of 100 and calculates the grade based on predefined conditions.
- **Expected Output**:
  ```
  Marks: [Your Marks]
  Grade: [Calculated Grade]
  ```
  
## Level 2 Tasks

### Exercise 1: Identifying Java Keywords
- **Task**: Identify all the keywords used in the following Java program and explain the purpose of each keyword.
- **Expected Output**: A list of keywords with explanations of their function.

### Exercise 2: Writing and Evaluating Expressions
- **Task**: Write a program that declares four integer variables, performs an arithmetic operation (addition or multiplication), and prints the result.
- **Expected Output**: The result of the arithmetic operation.

### Exercise 3: Understanding Code Blocks and Indentation
- **Task**: Write a program where you include a simple if-else block to check whether a number is positive or negative. Ensure proper indentation for clarity.
- **Expected Output**: The program will print whether the number is positive or negative.

### Modified Exercise 4: Grading Multiple Students and Class Average
- **Task**: Write a program that evaluates the scores of multiple students and assigns grades based on the following criteria:
  - 90 and above: Grade A
  - 80 and above: Grade B
  - 70 and above: Grade C
  - 60 and above: Grade D
  - Below 60: Fail
  - Additionally, after grading each student, the program should calculate the class average and display it.
- **Expected Output**:
  ```
  Student 1: Score = 95, Grade = A 
  Student 2: Score = 82, Grade = B 
  Student 3: Score = 74, Grade = C 
  Student 4: Score = 61, Grade = D 
  Student 5: Score = 58, Grade = Fail 
  Class Average Score is = 74.0
  ```

### Exercise 5: Writing a Simple Function
- **Task**: Write a function that takes two integer inputs, multiplies them, and returns the result. Call the function from the main method and print the result.
- **Expected Output**: The product of the two integers.

### Exercise 6: Function with Conditional Logic
- **Task**: Write a function that accepts an integer as an argument, checks if it's even or odd, and returns the corresponding message.
- **Expected Output**: The function will return a message indicating whether the number is even or odd.

### Exercise 7: Method Overloading – Adding Integers and Doubles
- **Task**: Overload a method named `addValues` that adds two integers in one version and two doubles in another. Call both versions and print the results.
- **Expected Output**: Two outputs: one with the sum of integers, and the other with the sum of doubles.

### Modified Exercise 8: Calculating Total Inventory Value Using Method Overloading
- **Task**: Write overloaded methods that calculate the total value of an inventory item, where:
  1. The first method calculates the total value based on the product count (integer) and price per unit (double).
  2. The second method calculates the total value based on the product count (integer) and price per unit (integer), assuming both quantities are whole numbers (e.g., for bulk pricing).
- **Expected Output**:
  ```
  Total value of Product A (50 units at $25.5 per unit): $1275.0 
  Total value of Product B (200 units at $20 per unit): $4000
  ```

### Exercise 9: Accessing Variables Within Code Blocks
- **Task**: Write a program that declares a variable inside an if block and attempts to access it outside the block. Analyze the result and explain the scope of the variable.
- **Expected Output**: The program should explain why the variable is inaccessible outside the block.

### Exercise 10: Returning Values from Functions
- **Task**: Create a function named `calculateRectangleArea` that takes the length and width of a rectangle as parameters, computes the area, and returns the result. In the main method, call this function using predefined values for the length and width, and display the area in a user-friendly message.
- **Expected Output**:
  ```
  The area of the rectangle with length [length] and width [width] is [area].
  ```

### Exercise 11: Passing Arguments to Functions
- **Task**: Create a function named `displayEmployeeInfo` that accepts an employee's name (as a string) and their year of birth (as an integer) as input parameters. The function should calculate the employee's age based on the current year and print a formatted message that includes both the name and the calculated age. In the main method, call this function multiple times with different employee names and years of birth to demonstrate its functionality.
- **Expected Output**:
  ```
  Employee Name: [name], Age: [calculated age]
  ```

### Exercise 12: Using Method Overloading for Input Types

**Task**: Create a method named `printValue` that is overloaded to handle different input types: integer, float, and double. This method should be used to print the details of various financial transactions.

#### Steps to Complete:
1. Define the `printValue` method three times: once for integers, once for floats, and once for doubles.
2. Each version of the method should print a formatted message describing what the value represents (e.g., "Quantity:", "Product Price:", "Account Balance:").
3. In the main method, call each overloaded version of the `printValue` method with appropriate hardcoded values.
4. Ensure the output is clear and informative.


### Exercise 13: Combining Method Overloading with Conditional Logic

**Task**: Create a method named `calculateResult` that is overloaded to handle both integers and doubles. Each version of the method should perform different calculations based on the input type.
#### Steps to Complete:
1. Define the overloaded `calculateResult` method:
   - For the integer version, calculate and return both the sum of the integer with a predefined constant (e.g., 10) and the factorial of that integer.
   - For the double version, calculate and return both the total cost after applying a discount (e.g., a 10% discount on the original price) and the total tax (e.g., 5% tax) on that amount.
2. In the main method, call the integer version of `calculateResult` with a sample integer (e.g., 5) and print the results.
3. Call the double version of `calculateResult` with a sample double (e.g., 200.0) and print the results.
4. Ensure that the output is clear and well-structured, providing context for each result.
   
## Level 3 Tasks

Exercise 1: Simple Encapsulation Example
Task:
Create a class Person with the following private attributes:
•	name (String)
•	age (int)
Write setter and getter methods to access and modify these attributes. Ensure that the age cannot be set to a negative number using validation logic in the setter method.
In the main method, create a Person object, set the name and age using the setter methods, and then print the values using the getter methods.
Expected Output:
The details of the Person object, with validation ensuring the age is non-negative.

Exercise 2: Creating and Using Classes
Task:
Create a Car class with the following attributes:
•	model (String)
•	color (String)
•	speed (int)
In the main method, create three objects of the Car class representing different car models. Use the constructor to initialize the attributes. Print the details of each car.
Expected Output:
Details of each car (model, color, and speed).
________________________________________
Exercise 3: Implementing Setters and Getters
Task:
Modify the Car class from Exercise 2 to use private attributes and provide setter and getter methods for each. Use the setter method to validate that the speed cannot be negative. Print the car details using the getter methods.
Expected Output:
Car details printed using getter methods, with validation ensuring speed is non-negative.
________________________________________
Exercise 4: Constructor Overloading
Task:
Create a class BankAccount with the following private attributes:
•	accountNumber (String)
•	balance (double)
•	accountHolder (String)
Implement two constructors:
•	A constructor with all three attributes as parameters.
•	A constructor that only takes accountNumber and sets the default balance to 0 and accountHolder to "Unknown".
Create objects using both constructors and print the account details.
Expected Output:
Account details printed for objects created with both constructors.
________________________________________
Exercise 5: Using ‘this’ Keyword
Task:
Modify the BankAccount class from Exercise 4 to include setter methods. Use the this keyword within the setters to assign values to the attributes. Add a condition to check that the balance is not negative when setting the value. Print the account details using getter methods.
Expected Output:
Account details printed with valid values using getter methods, with this keyword used in setters.
________________________________________
Exercise 6: Memory Concepts and Multiple Objects
Task:
Write a Java program that creates multiple Student objects from the Student class. Each object should have unique attributes such as name, studentID, and GPA. Demonstrate that each object occupies a unique place in memory by printing the memory address of each object.
Expected Output:
Details of each student object, along with their unique memory addresses.
________________________________________
Exercise 7: Account Management Application
Task:
Extend the BankAccount class from the previous exercises by adding methods for depositing and withdrawing funds:
•	deposit(double amount)
•	withdraw(double amount)
Ensure the withdraw method checks if there are sufficient funds before making a withdrawal. Print a message if the withdrawal is successful or fails due to insufficient funds.
Expected Output:
Account balance after deposits and withdrawals, with a message if funds are insufficient.
________________________________________
Exercise 8: Constructor Chaining
Task:
In the BankAccount class, implement constructor chaining. If only the accountNumber is provided, call the constructor that sets the default balance and accountHolder. Create objects using different constructors to demonstrate this feature.
Expected Output:
Account details printed, showing how constructors are called through chaining.
________________________________________
Exercise 9: VIP Customer Class
Task:
Create a VIPCustomer class with the following attributes:
•	name (String)
•	creditLimit (double)
•	email (String)
Implement three overloaded constructors:
1.	A constructor that takes all three attributes.
2.	A constructor that takes two attributes (name and creditLimit) and sets a default email.
3.	A constructor that takes only the name and sets default values for the other two attributes.
Create objects using each constructor and print their details.
Expected Output:
Details of VIP customers, demonstrating how different constructors initialize the objects.
________________________________________
Exercise 10: Bank Application with Constructors
Task:
Create a Bank application where the user can create a BankAccount object using the constructor. The program should automatically generate an account number (use a random number generator for this), and the user should input the account holder's name and an initial deposit. Print the account details once the account is created.
Expected Output:
New bank account details with auto-generated account number and initial deposit.
________________________________________
Exercise 11: Implementing a Simple Class for Employee
Task:
Create an Employee class with attributes like name, ID, and salary. Implement getter and setter methods for each attribute and a method increaseSalary that increases the employee's salary by a certain percentage. Create an object of the Employee class and call the increaseSalary method. Print the employee details before and after the salary increase.
Expected Output:
Employee details before and after salary increase.
________________________________________
Exercise 12: Handling Multiple Objects in a Loop
Task:
Create an array of Student objects in the main method. Use a loop to initialize the objects with different names and grades, then print their details.
Expected Output:
Details of all students, initialized and printed using a loop.
________________________________________
Exercise 13: Creating a Method to Calculate GPA
Task:
Create a method calculateGPA in the Student class that takes an array of marks (integers) as input and calculates the GPA based on a given formula. Call this method from the main method to calculate and print the GPA for a student.
Expected Output:
The GPA for a student based on their marks.
________________________________________
Exercise 14: Validating Data with Setters
Task:
Modify the BankAccount class to validate the input data for balance. Ensure that the balance cannot be negative using the setter method. Print appropriate messages if invalid data is entered.
Expected Output:
Validation messages if invalid data is provided, with valid account details printed.
________________________________________
Exercise 15: Constructor Validation
Task:
Modify the VIPCustomer class to validate the creditLimit in the constructor. If the credit limit is negative, set it to 0 and print a warning message. Create objects with different credit limits and demonstrate this validation.
Expected Output:
Credit limit validation messages, with details of the VIPCustomer objects.
________________________________________
Exercise 16: Final Bank Application with All Features
Task:
Combine all features from the previous exercises into a single Bank application. The program should:
1.	Allow the user to create a BankAccount object with an auto-generated account number.
2.	Use constructors to initialize the account.
3.	Implement methods to deposit and withdraw funds.
4.	Validate the data entered for balance and withdrawals.
Expected Output:
A fully functional bank application with user interactions, account creation, deposits, withdrawals, and validation.

## Level 4 Tasks
Exercise 1: Constructor Overloading
•	Task: Create a class Book with two constructors: one that initializes only the title and another that initializes both the title and the author. Implement a method to display the book details.
•	Output:
Book Title: The Great Gatsby
Author: Unknown
Book Title: 1984
Author: George Orwell
________________________________________
Exercise 2: Constructor Chaining
•	Task: Implement a class Person with a constructor that initializes the name. Use constructor chaining to create another constructor that initializes both name and age. Display the person’s details.
•	Output:
Name: Alice
Age: 0
Name: Bob
Age: 25
________________________________________
Exercise 3: Method Overriding
•	Task: Create a base class Shape with a method area(). Derive classes Circle and Rectangle from Shape and override the area() method to return the area of the respective shape. Demonstrate polymorphism using an array of Shape references.
•	Output:
Circle Area: 78.5
Rectangle Area: 30.0
________________________________________
Exercise 4: Reference vs Object
•	Task: Create a class Car with a model property. Instantiate a Car object and use a reference variable to access and display the car's model.
•	Output:
Car Model: Tesla Model 3
________________________________________
Exercise 5: Method Overloading
•	Task: Implement a class Calculator with overloaded methods for add(). Create methods to add two integers, three integers, and two doubles. Display the results of each method call.
•	Output:
Sum of 3 and 5: 8
Sum of 3, 4, and 5: 12
Sum of 2.5 and 3.5: 6.0
________________________________________
Exercise 6: Inheritance and Super Keyword
•	Task: Create a class Employee with properties like name and salary. Derive a class Manager from Employee and add an additional property department. Use the super keyword to initialize inherited properties. Display the details of a manager.
•	Output:
Name: John Doe
Salary: 60000
Department: Sales
________________________________________
Exercise 7: Abstract Classes
•	Task: Create an abstract class Appliance with an abstract method turnOn(). Derive classes WashingMachine and Refrigerator from Appliance and implement the turnOn() method. Demonstrate the functionality.
•	Output:
Washing Machine is now ON.
Refrigerator is now ON.
________________________________________
Exercise 8: Interface Implementation
•	Task: Define an interface Playable with a method play(). Create classes Song and Video that implement this interface. Call the play() method for each.
•	Output:
Playing song: Shape of You
Playing video: Tutorial
________________________________________
Exercise 9: Exception Handling
•	Task: Create a method divide(int a, int b) that throws an ArithmeticException when dividing by zero. Implement a try-catch block to handle this exception and display an appropriate message.
•	Output:
Cannot divide by zero.
________________________________________
Exercise 10: Static Members
•	Task: Implement a class Counter with a static variable count that increments every time an object is created. Create multiple Counter objects and display the total count.
•	Output:
Total Count of Objects: 5
________________________________________

Exercise 11: Exploring Polymorphism with Method Overriding

Task: Create a base class named Shape with a method draw(). Then, create two subclasses, Circle and Square, each overriding the draw() method to display a specific message for the shape. Demonstrate polymorphism by creating a Shape reference that can point to objects of both Circle and Square.
Expected Output: 
When calling the draw() method on the Shape reference, it should output the specific messages for both shapes.

________________________________________
Exercise 12: Library Management System
Task: Create a simple Library Management System that allows users to add books, view the list of available books, and check out books. Use classes to represent Books and the Library.
Requirements:
1.	Book Class:
o	Attributes:
	title (String)
	author (String)
	isCheckedOut (boolean)
o	Methods:
	Constructor to initialize the attributes.
	toString() method to return a string representation of the book (title and author).
	Use Method Overloading: Create multiple toString() methods that provide different levels of detail (e.g., one for just the title and another for title and author).
2.	Library Class:
o	Attributes:
	books (ArrayList of Book)
o	Methods:
	addBook(Book book): Adds a book to the library.
	Use Constructor Overloading: Provide a constructor that allows initializing the Library with a list of books.
	viewBooks(): Displays all books in the library. Indicate if a book is checked out or available.
	Use Polymorphism: If you decide to create different types of books (e.g., EBook, AudioBook), this method can utilize polymorphism to display their details based on their specific classes.
	checkOutBook(String title): Allows a user to check out a book by title. If the book is not available, display an appropriate message.
3.	Main Class:
o	Create an instance of the Library.
o	Add at least 5 books to the library using the addBook method.
o	Display the list of books using the viewBooks method.
o	Implement a simple menu that allows users to check out a book by entering the book title.
Output:
The program should interactively allow users to perform the following actions:
•	Display the list of books with their availability.
•	Check out a book by title, updating its status.
•	Display an appropriate message if the book is already checked out.
Example Output:
Available Books:
1. The Great Gatsby by F. Scott Fitzgerald (Available)
2. 1984 by George Orwell (Available)
3. To Kill a Mockingbird by Harper Lee (Available)
4. The Catcher in the Rye by J.D. Salinger (Available)
5. Moby Dick by Herman Melville (Available)

Enter the title of the book you want to check out: 1984
You have checked out "1984" by George Orwell.

Available Books:
1. The Great Gatsby by F. Scott Fitzgerald (Available)
2. 1984 by George Orwell (Checked Out)
3. To Kill a Mockingbird by Harper Lee (Available)
4. The Catcher in the Rye by J.D. Salinger (Available)
5. Moby Dick by Herman Melville (Available)
Suggested Features and Their Usage:
•	Polymorphism: If you extend the Book class to create different types of books (like EBook or AudioBook), use polymorphism in the viewBooks method to call overridden methods from these subclasses, allowing for specific implementations of how each type of book is displayed.
•	Method Overloading: In the Book class, overload the toString() method to provide different string representations, enhancing the readability and usability of your class.
•	Constructor Overloading: Use constructor overloading in the Library class to allow for different ways of creating a library instance, such as initializing it with an empty list of books or with a predefined list.



## Mini Projects

### Mini-Project 1: ATM Simulation Program
#### Objective:
Write a Java program that simulates a basic ATM machine. The program allows users to perform the following banking operations:
- Check balance
- Deposit money
- Withdraw money
- Exit the system

## How to Run the Programs
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone this repository:
   ```bash
   git clone https://github.com/faizan-ahmad5/Java-Programming-Exercises.git
   ```
3. Navigate to the project directory and open any Java file in your preferred IDE or text editor.
4. Compile and run the programs using the following commands:
   ```bash
   javac TaskXX.java
   java TaskXX
   ```
