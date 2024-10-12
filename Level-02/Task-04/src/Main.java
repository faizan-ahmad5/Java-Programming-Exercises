//Modified Exercise 4: Grading Multiple Students and Class Average
//Task:
//Write a program that evaluates the scores of multiple students and assigns grades based on the following criteria:
//•	90 and above: Grade A
//•	80 and above: Grade B
//•	70 and above: Grade C
//•	60 and above: Grade D
//•	Below 60: Fail
//Additionally, after grading each student, the program should calculate the class average and display it.
//Example: The program should have a predefined list of student scores (e.g., 95, 82, 74, 61, 58). For each student:
//1.	Assign a grade based on the score.
//2.	After all students are graded, calculate and display the average score of the class.

//Expected Output:
//Student 1: Score = 95, Grade = A
//Student 2: Score = 82, Grade = B
//Student 3: Score = 74, Grade = C
//Student 4: Score = 61, Grade = D
//Student 5: Score = 58, Grade = Fail
//Class Average Score is = 74.0

public class Main {
    public static void main(String[] args) {
        int std1 = 95;
        int std2 = 82;
        int std3 = 74;
        int std4 = 61;
        int std5 = 58;

        printGrade(std1, 1);
        printGrade(std2, 2);
        printGrade(std3, 3);
        printGrade(std4, 4);
        printGrade(std5, 5);

        int average = (std1 + std2 + std3 + std4 + std5) / 5;
        System.out.println("Class Average Score is = " + average);
    }

    // Method to determine grade based on score
    private static void printGrade(int score, int studentNumber) {
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Student " + studentNumber + ": Score = " + score + ", Grade = " + grade);
    }
}
