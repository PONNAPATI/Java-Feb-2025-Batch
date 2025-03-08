package ClassAndMethods.LibraryManagement;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a book to library
    public void addBook(Book book){
        books.add(book);
        System.out.println(book + "Added to the library.");
    }
    //Method to display books
    public void showBooks(){
        System.out.println("Library Books: ");
        for (Book b : books){
            b.showBookDetails();
        }

    }
}
