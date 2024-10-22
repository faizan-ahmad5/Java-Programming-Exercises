# Java Programming Exercises

This repository contains a collection of Java programming exercises, structured into different difficulty levels along with a set of Mini Projects. These exercises cover essential programming concepts, providing a hands-on approach for mastering Java.

## Table of Contents
- [Level 1 Tasks](#level-1-tasks)
- [Level 2 Tasks](#level-2-tasks)
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
