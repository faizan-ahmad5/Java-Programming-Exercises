//Exercise 2: Constructor Chaining
// Task: Implement a class Person with a constructor that initializes the name. Use
//constructor chaining to create another constructor that initializes both name and age.
//Display the person’s details.
// Output:
//Name: Alice
//Age: 0
//Name: Bob
//Age: 25
//

package Exercise02.uet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 25);

       person1.displayDetails();
       person2.displayDetails();
    }
}

