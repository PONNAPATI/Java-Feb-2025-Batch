package ClassAndMethods.LibraryManagement;

public class LibraryApp {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        //Adding books to library
        myLibrary.addBook(new Book("Harry Potter", "J.K. Rowling"));
        myLibrary.addBook(new Book("The Hobbit", "J.R.R Tolkien"));

        //Display available books
        myLibrary.showBooks();
    }
}
