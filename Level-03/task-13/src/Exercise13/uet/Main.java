//Exercise 13: Creating a Method to Calculate GPA
//Task:
//Create a method calculateGPA in the Student class that takes an array of marks (integers) as input and calculates
// the GPA based on a given formula. Call this method from the main method to calculate and print the GPA for a student.
//Expected Output:
//The GPA for a student based on their marks.

package Exercise13.uet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        int[] marks = {85, 90, 78, 92, 88};

        double gpa = student.calculateGPA(marks);
        System.out.println("The GPA for the student is: " + gpa);
    }
}



