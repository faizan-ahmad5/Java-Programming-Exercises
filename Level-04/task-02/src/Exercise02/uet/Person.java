package Exercise02.uet;

public class Person {
    private  String name;
    private  int age;

    // Constructor that initializes only the name
    public Person(String name) {
        this.name = name;
    }

    // Constructor that initializes both name and age, using constructor chaining
    public Person(String name, int age) {
        this(name);  // Calls the single-argument constructor to initialize name
        this.age = age;  // Sets age to the value passed as an argument
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
