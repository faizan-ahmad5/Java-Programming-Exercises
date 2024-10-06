//Exercise 20: Grade Calculator
//5.	Task: Write a program that takes a student's marks out of 100 and calculates the grade based on the following conditions:
//o	Marks >= 90: Grade A
//o	Marks >= 80: Grade B
//o	Marks >= 70: Grade C
//o	Marks >= 60: Grade D
//o	Marks < 60: Grade F
//o	Hint: Use if-else statements.
//o	Expected Output:
//Marks: [Your Marks]
//Grade: [Calculated Grade]

public class Main {
    public static void main(String[] args) {
        int studentMarks = 92;
        char grade;
        if (studentMarks >= 90) {
            grade = 'A';
        } else if (studentMarks >= 80) {
            grade = 'B';
        } else if (studentMarks >= 70) {
            grade = 'C';
        } else if (studentMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + grade);
    }
}