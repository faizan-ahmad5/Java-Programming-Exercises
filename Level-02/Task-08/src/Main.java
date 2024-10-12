//Exercise 8: Calculating Total Inventory Value Using Method Overloading
//Task:
//Write overloaded methods that calculate the total value of an inventory item, where:
//1.The first method calculates the total value based on the product count (integer) and price per unit (double).
//2.The second method calculates the total value based on the product count (integer) and price per unit (integer),
//  assuming both quantities are whole numbers (e.g., for bulk pricing).
//Use method overloading to handle both cases, ensuring that the correct method is called based on the data types passed in.
// After calculating the total value for each item, print the result.
//Example: Predefine the following:
//•Product A: count = 50, price per unit = 25.5 (uses int and double).
//•Product B: count = 200, price per unit = 20 (uses int and int).
//The function should:
//1.Multiply the count and price for each product.
//2.Print the total value of each product.
//Expected Output:
//Total value of Product A (50 units at $25.5 per unit): $1275.0
//Total value of Product B (200 units at $20 per unit): $4000

public class Main {
    public static void main(String[] args) {
        totalInventoryVal(50, 25.5);
        totalInventoryVal(200, 20);
    }

    public static void totalInventoryVal(int productCount, double pricePerUnit) {
        double totalValue = productCount * pricePerUnit;
        System.out.println("Total value of Product A (" +  productCount + " units at $"+pricePerUnit+ " per unit): " + "$" + totalValue);
    }

    public static void totalInventoryVal(int productCount, int pricePerUnit) {
        int totalValue = productCount * pricePerUnit;
        System.out.println("Total value of Product B (" +  productCount + " units at $"+pricePerUnit+ " per unit): " + "$" + totalValue);
    }
}