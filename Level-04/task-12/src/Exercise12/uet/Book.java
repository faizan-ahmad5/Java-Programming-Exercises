package Exercise12.uet;

public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    // Constructor to initialize the attributes
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false; // Initially, the book is not checked out
    }

    // Method to return a string representation of the book (title and author)
    public String toString() {
        return title + " by " + author;
    }

    // Overloaded toString() methods
    public String toString(boolean showCheckedOutStatus) {
        if (showCheckedOutStatus) {
            return title + " by " + author + (isCheckedOut ? " (Checked Out)" : " (Available)");
        }
        return title; // Just the title
    }

    // Method to check out the book
    public void checkOut() {
        isCheckedOut = true;
    }

    // Method to check if the book is checked out
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}
