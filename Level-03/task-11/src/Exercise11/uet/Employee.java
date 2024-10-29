package Exercise10.uet;

public class Employee {

    private String name;
    private int ID;
    private double salary;

    public void increaseSalary() {
        salary = salary * 1.2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
