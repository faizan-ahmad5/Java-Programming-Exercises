//Task: Create a simple Library Management System that allows users to add books, view the list
//of available books, and check out books. Use classes to represent Books and the Library.

package Exercise12.uet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("Moby Dick", "Herman Melville"));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            library.viewBooks();
            System.out.println("Enter the title of the book you want to check out (or type 'exit' to quit):");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                exit = true;  // If the user typed 'exit' (in any case), set exit to true
            } else {
                library.checkOutBook(userInput); // Check out the book
            }
            System.out.println();
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
