package Exercise13.uet;

public class Student {
    public double calculateGPA(int[] marks) {
        double totalMarks = 0.0;

        for (int mark : marks) {
            totalMarks += mark;
        }

        double averageMark = totalMarks / marks.length;
        double gpa = (averageMark / 100) * 4.0;
        return gpa;
    }
}