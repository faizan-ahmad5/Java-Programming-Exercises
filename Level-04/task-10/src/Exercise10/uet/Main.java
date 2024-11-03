//Exercise 10: Static Members
// Task: Implement a class Counter with a static variable count that increments every time
//an object is created. Create multiple Counter objects and display the total count.
// Output:
//Total Count of Objects: 5

package Exercise10.uet;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println("Total Count of Objects: " + Counter.getCount());
    }
}
