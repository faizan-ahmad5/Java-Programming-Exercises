package Exercise05.uet;

class Calculator {
    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + ": " + sum);
    }

    public void add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + ": " + sum);
    }

    public void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + ": " + sum);
    }


}