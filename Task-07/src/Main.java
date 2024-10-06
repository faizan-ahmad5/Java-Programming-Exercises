//Exercise 7: Demonstrating Overflow and Underflow
//7.	Task: Assign the value 2147483647 to an int variable and add 1. Print the result to observe overflow. Repeat for a byte variable.
//o	Expected Output:
//Maximum value of int: [originally assigned value]
//Maximum value of byte: [originally assigned value]
//Overflow example with int: [Overflowed Value]
//Overflow example with byte: [Overflowed Value]
//Underflow example with int: [Underflow Value]
//Underflow example with byte: [Underflow Value]

public class Main {
    public static void main(String[] args) {

        int intMaxValue = 2147483647;
        byte byteMaxValue = Byte.MAX_VALUE;

        int intMinValue = -2147483648;
        byte byteMinValue = Byte.MIN_VALUE;

        System.out.println("Maximum value of int: " + intMaxValue);
        System.out.println("Maximum value of byte: " + byteMaxValue);

        System.out.println("Overflow example with int: " + (intMaxValue + 1));
        System.out.println("Overflow example with byte: " + (byte)(byteMaxValue + 1));

        System.out.println("Minimum value of int: " + intMinValue);
        System.out.println("Minimum value of byte: " + byteMinValue);

        System.out.println("Underflow example with int: " + (intMinValue - 1));
        System.out.println("Underflow example with byte: " + (byte)(byteMinValue - 1));
    }
}
