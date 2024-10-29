package Exercise06.uet;

public class Student {
    private int studentId;
    private String name;
    private double GPA;

    public Student( int studentId, String name, double GPA) {
        this.studentId = studentId;
        this.name = name;
        this.GPA = GPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }
}
