//Exercise 1: Constructor Overloading
// Task: Create a class Book with two constructors: one that initializes only the title and
//another that initializes both the title and the author. Implement a method to display the
//book details.
//  Output:
//Book Title: The Great Gatsby
//Author: Unknown
//Book Title: 1984
//Author: George Orwell

package Exercise01.com;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984", "George Orwell");

        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Book Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
    }
}

