package Exercise12.uet;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}
