//Exercise 6: Wrapper Classes and MIN/MAX Values
//6.	Task: Use the wrapper class for int (Integer) to print the minimum and maximum values.
//o	Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE.
//o	Expected Output:
//Min int value: -2147483648
//Max int value: 2147483647

public class Main {
    public static void main(String[] args) {
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Min int Value: " + intMinValue);
        System.out.println("Max int Value: " + intMaxValue);

    }
}