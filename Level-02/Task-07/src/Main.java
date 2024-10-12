//Exercise 7: Method Overloading – Adding Integers and Doubles
//Task:
//Overload a method named addValues that adds two integers in one version and two doubles in another.
// Call both versions and print the results.
//Expected Output:
//Two outputs: one with the sum of integers, and the other with the sum of doubles.


public class Main {
    public static void main(String[] args) {
       addValues(10,20);
       addValues(10.4,3.0);
    }

    public static void addValues(int a, int b) {
        int add = a + b;
        System.out.println("The sum of integers is = " + add);
    }

    public static void addValues(double a, double b) {
        double add = a + b;
        System.out.println("The sum of doubles is = " + add);
    }
}