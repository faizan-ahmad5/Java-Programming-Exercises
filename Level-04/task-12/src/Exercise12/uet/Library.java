package Exercise12.uet;

import java.util.ArrayList;

public class Library {
    // This is a list that will hold the books in the library
    private ArrayList<Book> books;

    // Constructor to create a library with no books
    public Library() {
        // Initialize the books list as an empty ArrayList
        books = new ArrayList<>();
    }

    // Overloaded constructor to create a library with an initial list of books
    public Library(ArrayList<Book> initialBooks) {
        // Initialize the books list with the provided list of books
        books = initialBooks;
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        // Add the provided book to the list of books
        books.add(book);
    }

    // Method to display all the available books in the library
    public void viewBooks() {
        // Print a heading for the list of available books
        System.out.println("Available Books:");

        // Loop through each book in the list
        for (Book book : books) {
            // Print the string representation of the book
            // Here we call the toString method with true to show title and checked-out status
            System.out.println(book.toString(true));
        }
    }

    // Method to allow a user to check out a book by its title
    public void checkOutBook(String title) {
        // Loop through each book in the list to find the matching title
        for (Book book : books) {
            // Check if the book title matches the input title and if it is not already checked out
            if (book.toString().toLowerCase().contains(title.toLowerCase()) && !book.isCheckedOut()) {
                // If found, mark the book as checked out
                book.checkOut();
                // Print a message indicating the book has been checked out
                System.out.println("You have checked out \"" + book.toString() + "\".");
                return; // Exit the method after checking out the book
            }
        }
        // If no matching book is found, print an error message
        System.out.println("The book \"" + title + "\" is already checked out or does not exist.");
    }
}
