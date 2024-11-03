package Exercise06.uet;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary); // Call the constructor of Employee
        this.department = department; // Initialize the department
    }

    public String getDepartment() {
        return department;
    }

}
