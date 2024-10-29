//Exercise 12: Handling Multiple Objects in a Loop
//Task:
//Create an array of Student objects in the main method. Use a loop to initialize the objects with different
// names and grades, then print their details.
//Expected Output:
//Details of all students, initialized and printed using a loop.

package Exercise12.uet;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        String[] names = {"Faizan", "Ahmad", "Ali", "Khan", "Azam"};
        int[] grades = {85, 90, 75, 88, 92};

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], grades[i]);
        }

        for (Student student : students) {
            student.displayDetails();
        }
    }
}
