//Exercise 1: Simple Encapsulation Example
//Task:
//Create a class Person with the following private attributes:
//• name (String)
//•	age (int)
//Write setter and getter methods to access and modify these attributes. Ensure that the age cannot be set to a negative
//number using validation logic in the setter method.
//In the main method, create a Person object, set the name and age using the setter methods, and then print the values
//using the getter methods.

package Excersise01.uet;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Faizan Ahmad Khan");
        System.out.println("Your name is " + person.getName());

        person.setAge(20);
        System.out.println("Your age is " + person.getAge());


    }
}
