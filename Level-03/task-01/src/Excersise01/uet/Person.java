package Excersise01.uet;

public class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        this.name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error: Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
