//Exercise 6: Memory Concepts and Multiple Objects
//Task:
// Write a Java program that creates multiple Student objects from the Student class. Each object should have
// unique attributes such as name, studentID, and GPA. Demonstrate that each object occupies a unique place
// in memory by printing the memory address of each object.
//Expected Output:
//Details of each student object, along with their unique memory addresses.

package Exercise06.uet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1114, "Faizan Ahmad", 3.90);
        Student student2 = new Student(1115, "Muhammad Ali", 4.0);
        Student student3 = new Student(1116, "Soban", 3.89);

        System.out.println("Student ID: " + student1.getStudentId() + ", Name: " + student1.getName() + ", GPA: " + student1.getGPA() +
                ", Memory address: " + System.identityHashCode(student1));
        System.out.println("Student ID: " + student2.getStudentId() + ", Name: " + student2.getName() + ", GPA: " + student2.getGPA() +
                ", Memory address: " + System.identityHashCode(student2));
        System.out.println("Student ID: " + student3.getStudentId() + ", Name: " + student3.getName() + ", GPA: " + student3.getGPA() +
                ", Memory address: " + System.identityHashCode(student3));
    }


}
